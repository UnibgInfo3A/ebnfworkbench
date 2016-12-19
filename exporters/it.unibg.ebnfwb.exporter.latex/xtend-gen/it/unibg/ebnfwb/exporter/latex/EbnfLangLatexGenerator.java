package it.unibg.ebnfwb.exporter.latex;

import com.google.common.collect.Iterables;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.ebnfLang.Expression;
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates latex from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 * 
 * http://tex.stackexchange.com/questions/24886/which-package-can-be-used-to-write-bnf-grammars
 */
@SuppressWarnings("all")
public class EbnfLangLatexGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<EbnfGrammar> _filter = Iterables.<EbnfGrammar>filter(_iterable, EbnfGrammar.class);
    for (final EbnfGrammar e : _filter) {
      String _firstUpper = StringExtensions.toFirstUpper(this.fileName);
      String _plus = (_firstUpper + ".tex");
      CharSequence _compile = this.compile(e);
      fsa.generateFile(_plus, _compile);
    }
  }
  
  /**
   * Accedere ai commenti
   * e«if (*****(value) instanceof Comment) {
   * 
   * }»
   */
  public CharSequence compile(final EbnfGrammar e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass{article}");
    _builder.newLine();
    _builder.append("\\usepackage{syntax}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{document}");
    _builder.newLine();
    _builder.append("\\begin{grammar}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<ProductionRule> _rules = e.getRules();
      for(final ProductionRule f : _rules) {
        _builder.append("    ");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\\end{grammar}");
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final ProductionRule rule) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = rule.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    Expression _expr = rule.getExpr();
    CharSequence _compile = this.compile(_expr);
    _builder.append(_compile, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Expression expr) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.newLine();
    return _builder;
  }
  
  private String fileName;
  
  public String setFileName(final String pn) {
    return this.fileName = pn;
  }
}
