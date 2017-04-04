package it.unibg.ebnfwb.exporter.jparsec;

import com.google.common.collect.Iterables;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.ebnfLang.Line;
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EbnfLangJParsecGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<EbnfGrammar> _filter = Iterables.<EbnfGrammar>filter(_iterable, EbnfGrammar.class);
    for (final EbnfGrammar e : _filter) {
      String _firstUpper = StringExtensions.toFirstUpper(this.packageName);
      String _plus = (_firstUpper + ".java");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus, _compile);
    }
  }
  
  public CharSequence compile(final EbnfGrammar e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package �packageName�;");
    _builder.newLine();
    _builder.append("public class �packageName.toFirstUpper�{");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("�FOR f:e.lines�");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("�f.compile�");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Line rule) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence compile(final ProductionRule rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// production rule �rule.name� ");
    _builder.newLine();
    return _builder;
  }
  
  private String packageName;
  
  public String setPackageName(final String pn) {
    return this.packageName = pn;
  }
}
