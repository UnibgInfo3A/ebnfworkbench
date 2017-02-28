package it.unibg.ebnfwb.exporter.latex;

import com.google.common.collect.Iterables;
import it.unibg.ebnfwb.exporter.latex.ToString;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.ebnfLang.Expression;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative;
import it.unibg.ebnfwb.lang.ebnfLang.Line;
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.InputOutput;
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
  private int i;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    Iterable<EbnfGrammar> _filter = Iterables.<EbnfGrammar>filter(IteratorExtensions.<EObject>toIterable(input.getAllContents()), EbnfGrammar.class);
    for (final EbnfGrammar e : _filter) {
      String _firstUpper = StringExtensions.toFirstUpper(this.fileName);
      String _plus = (_firstUpper + ".tex");
      fsa.generateFile(_plus, this.compile(e));
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
    {
      EList<Line> _lines = e.getLines();
      for(final Line f : _lines) {
        _builder.append("    ");
        CharSequence _compile = this.compile(f);
        _builder.append(_compile, "    ");
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Line line) {
    CharSequence _xifexpression = null;
    if ((line instanceof ProductionRule)) {
      _xifexpression = this.compile(((ProductionRule) line));
    } else {
      _xifexpression = InputOutput.<String>println(line.toString());
    }
    return _xifexpression;
  }
  
  public CharSequence compile(final ProductionRule rule) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\begin{grammar}");
    _builder.newLine();
    _builder.append("\t");
    String _name = rule.getName();
    _builder.append(_name, "\t");
    _builder.append(" =");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _compile = this.compile(rule.getExpr());
    _builder.append(_compile, "\t");
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{grammar}");
    _builder.newLine();
    return _builder;
  }
  
  public String compile(final Expression expr) {
    if ((expr instanceof Expression_Alternative)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append(" \t");
      String _doSwitch = new ToString().doSwitch(expr);
      _builder.append(_doSwitch, " \t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      return _builder.toString();
    }
    return null;
  }
  
  private String fileName;
  
  private String expression;
  
  public String setFileName(final String pn) {
    return this.fileName = pn;
  }
}
