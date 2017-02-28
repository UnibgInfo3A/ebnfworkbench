package it.unibg.ebnfwb.exporter.jparsec;

import com.google.common.collect.Iterables;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.ebnfLang.Line;
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule;
import org.eclipse.emf.common.util.EList;
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
    Iterable<EbnfGrammar> _filter = Iterables.<EbnfGrammar>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), EbnfGrammar.class);
    for (final EbnfGrammar e : _filter) {
      String _firstUpper = StringExtensions.toFirstUpper(this.packageName);
      String _plus = (_firstUpper + ".java");
      fsa.generateFile(_plus, this.compile(e));
    }
  }
  
  public CharSequence compile(final EbnfGrammar e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(this.packageName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(this.packageName);
    _builder.append(_firstUpper);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<Line> _lines = e.getLines();
      for(final Line f : _lines) {
        _builder.append("\t        ");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "\t        ");
        _builder.newLineIfNotEmpty();
      }
    }
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
    _builder.append("// production rule ");
    String _name = rule.getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private String packageName;
  
  public String setPackageName(final String pn) {
    return this.packageName = pn;
  }
}
