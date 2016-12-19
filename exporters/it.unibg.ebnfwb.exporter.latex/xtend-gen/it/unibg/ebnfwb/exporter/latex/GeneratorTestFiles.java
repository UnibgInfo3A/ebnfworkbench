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
import java.nio.charset.CharsetDecoder;
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
  private EbnfLangLatexGenerator underTest;
  
  @Inject
  private ParseHelper<EbnfGrammar> parseHelper;
  
  @Test
  public void test() {
    try {
      final FileInputStream fis = new FileInputStream("examples/numbers/numbers.ebnf");
      final FileChannel fc = fis.getChannel();
      long _size = fc.size();
      final MappedByteBuffer bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, _size);
      Charset _forName = Charset.forName("8859_1");
      CharsetDecoder _newDecoder = _forName.newDecoder();
      final CharBuffer cbuf = _newDecoder.decode(bbuf);
      final EbnfGrammar grammar = this.parseHelper.parse(cbuf);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.underTest.setFileName("numbers");
      Resource _eResource = grammar.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _textFiles = fsa.getTextFiles();
      final BiConsumer<String, CharSequence> _function = (String filename, CharSequence fileContent) -> {
        try {
          InputOutput.<String>println((("writing " + filename) + fileContent));
          final FileWriter file = new FileWriter(("examples/numbers/" + filename));
          String _string = fileContent.toString();
          file.write(_string);
          file.close();
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _textFiles.forEach(_function);
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
      long _size = fc.size();
      final MappedByteBuffer bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, _size);
      Charset _forName = Charset.forName("8859_1");
      CharsetDecoder _newDecoder = _forName.newDecoder();
      final CharBuffer cbuf = _newDecoder.decode(bbuf);
      final EbnfGrammar grammar = this.parseHelper.parse(cbuf);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.underTest.setFileName(fileebnf);
      Resource _eResource = grammar.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _textFiles = fsa.getTextFiles();
      final BiConsumer<String, CharSequence> _function = (String filename, CharSequence fileContent) -> {
        try {
          InputOutput.<String>println((("writing " + filename) + fileContent));
          final FileWriter file = new FileWriter((pathfile + filename));
          String _string = fileContent.toString();
          file.write(_string);
          file.close();
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      _textFiles.forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
