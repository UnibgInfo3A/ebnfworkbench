package it.unibg.ebnfwb.exporter.jparsec;

import com.google.inject.Inject;
import it.unibg.ebnfwb.exporter.jparsec.EbnfLangJParsecGenerator;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.tests.EbnfLangInjectorProvider;
import java.io.FileReader;
import java.nio.CharBuffer;
import java.util.Map;
import java.util.function.BiConsumer;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(EbnfLangInjectorProvider.class)
@SuppressWarnings("all")
public class GeneratorTestFiles {
  @Inject
  private EbnfLangJParsecGenerator underTest;
  
  @Inject
  private ParseHelper<EbnfGrammar> parseHelper;
  
  @Test
  public void test() {
    try {
      final CharBuffer target = CharBuffer.allocate(1000);
      FileReader _fileReader = new FileReader("examples/numbers/numbers.ebnf");
      final int nread = _fileReader.read(target);
      InputOutput.<CharBuffer>print(target);
      final EbnfGrammar grammar = this.parseHelper.parse(target);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.underTest.setPackageName("numbers");
      Resource _eResource = grammar.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _textFiles = fsa.getTextFiles();
      final BiConsumer<String, CharSequence> _function = (String filename, CharSequence fileContent) -> {
        InputOutput.<String>println((("writing " + filename) + fileContent));
      };
      _textFiles.forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
