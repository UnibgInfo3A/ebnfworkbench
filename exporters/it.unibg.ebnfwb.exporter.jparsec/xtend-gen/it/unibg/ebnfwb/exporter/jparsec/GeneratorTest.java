package it.unibg.ebnfwb.exporter.jparsec;

import com.google.inject.Inject;
import it.unibg.ebnfwb.exporter.jparsec.EbnfLangJParsecGenerator;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.tests.EbnfLangInjectorProvider;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
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
public class GeneratorTest {
  @Inject
  private EbnfLangJParsecGenerator underTest;
  
  @Inject
  private ParseHelper<EbnfGrammar> parseHelper;
  
  @Test
  public void test() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("sign = +|-");
      _builder.newLine();
      _builder.append("digit = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9");
      _builder.newLine();
      _builder.append("integer = [sign]digit{digit}");
      _builder.newLine();
      final EbnfGrammar grammar = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = grammar.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, Object> _allFiles = fsa.getAllFiles();
      InputOutput.<Map<String, Object>>println(_allFiles);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
