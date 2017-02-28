package it.unibg.ebnfwb.exporter.latex;

import com.google.inject.Inject;
import it.unibg.ebnfwb.exporter.latex.EbnfLangLatexGenerator;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.tests.EbnfLangInjectorProvider;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.function.BiConsumer;
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
  private EbnfLangLatexGenerator underTest;
  
  @Inject
  private ParseHelper<EbnfGrammar> parseHelper;
  
  @Test
  public void test() {
    try {
      final FileInputStream fis = new FileInputStream("examples/numbers/numbers.ebnf");
      final FileChannel fc = fis.getChannel();
      final MappedByteBuffer bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
      final CharBuffer cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
      final EbnfGrammar grammar = this.parseHelper.parse(cbuf);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.underTest.setFileName("numbers");
      this.underTest.doGenerate(grammar.eResource(), fsa);
      final BiConsumer<String, CharSequence> _function = (String filename, CharSequence fileContent) -> {
        try {
          InputOutput.<String>println((("writing " + filename) + fileContent));
          final FileWriter file = new FileWriter(("examples/numbers/" + filename));
          file.write(fileContent.toString());
          file.close();
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      fsa.getTextFiles().forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void test2() {
    try {
      final String pathfile = "examples/ProgettoLinguaggi/";
      final String fileebnf = "esempio2";
      final FileInputStream fis = new FileInputStream(((pathfile + fileebnf) + ".ebnf"));
      final FileChannel fc = fis.getChannel();
      final MappedByteBuffer bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
      final CharBuffer cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
      final EbnfGrammar grammar = this.parseHelper.parse(cbuf);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.underTest.setFileName(fileebnf);
      this.underTest.doGenerate(grammar.eResource(), fsa);
      final BiConsumer<String, CharSequence> _function = (String filename, CharSequence fileContent) -> {
        try {
          InputOutput.<String>println((("writing " + filename) + fileContent));
          final FileWriter file = new FileWriter((pathfile + filename));
          file.write(fileContent.toString());
          file.close();
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      fsa.getTextFiles().forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
