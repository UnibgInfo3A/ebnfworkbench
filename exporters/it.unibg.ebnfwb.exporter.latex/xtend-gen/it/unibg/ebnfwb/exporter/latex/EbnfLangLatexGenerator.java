package it.unibg.ebnfwb.exporter.latex;

import com.google.common.collect.Iterables;
import it.unibg.ebnfwb.exporter.latex.ToString;
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar;
import it.unibg.ebnfwb.lang.ebnfLang.Expression;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Group;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence;
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol;
import it.unibg.ebnfwb.lang.ebnfLang.Line;
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
    _builder.append("    ");
    _builder.append("\\end{grammar}");
    _builder.newLine();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Line line) {
    CharSequence _xifexpression = null;
    if ((line instanceof ProductionRule)) {
      _xifexpression = this.compile(((ProductionRule) line));
    } else {
      ToString _toString = new ToString();
      String _caseLine = _toString.caseLine(line);
      _xifexpression = InputOutput.<String>println(_caseLine);
    }
    return _xifexpression;
  }
  
  public CharSequence compile(final ProductionRule rule) {
    CharSequence _xblockexpression = null;
    {
      String _name = rule.getName();
      String _plus = ("<" + _name);
      String _plus_1 = (_plus + ">");
      String _plus_2 = (_plus_1 + " =");
      Expression _expr = rule.getExpr();
      String _compile = this.compile(_expr);
      String s = (_plus_2 + _compile);
      String r = s.replaceAll("[\r\n]+", "");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(r, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String compile(final Expression expr) {
    if ((expr instanceof Expression_Alternative)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append(" \t");
      ToString _toString = new ToString();
      String _doSwitch = _toString.doSwitch(expr);
      _builder.append(_doSwitch, " \t");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      return _builder.toString();
    }
    if ((expr instanceof Expression_Concatenation)) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      _builder_1.append(" \t");
      ToString _toString_1 = new ToString();
      String _doSwitch_1 = _toString_1.doSwitch(expr);
      _builder_1.append(_doSwitch_1, " \t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.newLine();
      return _builder_1.toString();
    }
    if ((expr instanceof Expression_Exception)) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.newLine();
      _builder_2.append(" \t");
      ToString _toString_2 = new ToString();
      String _doSwitch_2 = _toString_2.doSwitch(expr);
      _builder_2.append(_doSwitch_2, " \t");
      _builder_2.newLineIfNotEmpty();
      _builder_2.newLine();
      return _builder_2.toString();
    }
    if ((expr instanceof Expression_Group)) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.newLine();
      _builder_3.append(" \t");
      ToString _toString_3 = new ToString();
      String _doSwitch_3 = _toString_3.doSwitch(expr);
      _builder_3.append(_doSwitch_3, " \t");
      _builder_3.newLineIfNotEmpty();
      _builder_3.newLine();
      return _builder_3.toString();
    }
    if ((expr instanceof Expression_Optional_Group)) {
      StringConcatenation _builder_4 = new StringConcatenation();
      _builder_4.newLine();
      _builder_4.append(" \t");
      ToString _toString_4 = new ToString();
      String _doSwitch_4 = _toString_4.doSwitch(expr);
      _builder_4.append(_doSwitch_4, " \t");
      _builder_4.newLineIfNotEmpty();
      _builder_4.newLine();
      return _builder_4.toString();
    }
    if ((expr instanceof Expression_Repetition)) {
      StringConcatenation _builder_5 = new StringConcatenation();
      _builder_5.newLine();
      _builder_5.append(" \t");
      ToString _toString_5 = new ToString();
      String _doSwitch_5 = _toString_5.doSwitch(expr);
      _builder_5.append(_doSwitch_5, " \t");
      _builder_5.newLineIfNotEmpty();
      _builder_5.newLine();
      return _builder_5.toString();
    }
    if ((expr instanceof Expression_Repetition_Group)) {
      StringConcatenation _builder_6 = new StringConcatenation();
      _builder_6.newLine();
      _builder_6.append(" \t");
      ToString _toString_6 = new ToString();
      String _doSwitch_6 = _toString_6.doSwitch(expr);
      _builder_6.append(_doSwitch_6, " \t");
      _builder_6.newLineIfNotEmpty();
      _builder_6.newLine();
      return _builder_6.toString();
    }
    if ((expr instanceof Expression_Rule_Reference)) {
      StringConcatenation _builder_7 = new StringConcatenation();
      _builder_7.newLine();
      _builder_7.append(" \t");
      ToString _toString_7 = new ToString();
      String _doSwitch_7 = _toString_7.doSwitch(expr);
      _builder_7.append(_doSwitch_7, " \t");
      _builder_7.newLineIfNotEmpty();
      _builder_7.newLine();
      return _builder_7.toString();
    }
    if ((expr instanceof Expression_Special_Sequence)) {
      StringConcatenation _builder_8 = new StringConcatenation();
      _builder_8.newLine();
      _builder_8.append(" \t");
      ToString _toString_8 = new ToString();
      String _doSwitch_8 = _toString_8.doSwitch(expr);
      _builder_8.append(_doSwitch_8, " \t");
      _builder_8.newLineIfNotEmpty();
      _builder_8.newLine();
      return _builder_8.toString();
    }
    if ((expr instanceof Expression_Terminal_Symbol)) {
      StringConcatenation _builder_9 = new StringConcatenation();
      _builder_9.newLine();
      _builder_9.append(" \t");
      ToString _toString_9 = new ToString();
      String _doSwitch_9 = _toString_9.doSwitch(expr);
      _builder_9.append(_doSwitch_9, " \t");
      _builder_9.newLineIfNotEmpty();
      _builder_9.newLine();
      return _builder_9.toString();
    }
    if ((expr instanceof Expression_Terminal_Symbol)) {
      StringConcatenation _builder_10 = new StringConcatenation();
      _builder_10.newLine();
      _builder_10.append(" \t");
      ToString _toString_10 = new ToString();
      String _doSwitch_10 = _toString_10.doSwitch(expr);
      _builder_10.append(_doSwitch_10, " \t");
      _builder_10.newLineIfNotEmpty();
      _builder_10.newLine();
      return _builder_10.toString();
    }
    return null;
  }
  
  private String fileName;
  
  public String setFileName(final String pn) {
    return this.fileName = pn;
  }
}
