package it.unibg.ebnfwb.exporter.latex;

import com.google.common.collect.Iterables;
import it.unibg.ebnfwb.exporter.latex.SpecialCharMarnager;
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
import it.unibg.ebnfwb.lang.ebnfLang.UserComment;
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
    _builder.append("\\usepackage{color}");
    _builder.newLine();
    _builder.append("\\definecolor{isabelline}{rgb}{0.96, 0.94, 0.93}");
    _builder.newLine();
    _builder.append("\\pagecolor{isabelline}");
    _builder.newLine();
    _builder.append("\\usepackage{listings}");
    _builder.newLine();
    _builder.append("\\lstset{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("basicstyle=\\ttfamily,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("columns=flexible,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("breaklines=false,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("extendedchars= true");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
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
      ProductionRule _println = InputOutput.<ProductionRule>println(((ProductionRule) line));
      _xifexpression = this.compile(_println);
    } else {
      String _xifexpression_1 = null;
      if ((line instanceof UserComment)) {
        UserComment _println_1 = InputOutput.<UserComment>println(((UserComment) line));
        _xifexpression_1 = this.compile(_println_1);
      } else {
        String _string = line.toString();
        _xifexpression_1 = InputOutput.<String>println(_string);
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence compile(final ProductionRule rule) {
    CharSequence _xblockexpression = null;
    {
      Expression _expr = rule.getExpr();
      String r = this.compile(_expr);
      String s = "";
      String sf = "";
      SpecialCharMarnager mngr = new SpecialCharMarnager(r);
      String _name = rule.getName();
      String _plus = (_name + "=");
      String _plus_1 = (_plus + r);
      String _plus_2 = (_plus_1 + ";");
      s = _plus_2;
      String _stringManager = mngr.stringManager(s);
      s = _stringManager;
      String _replace = s.replace("\'âª  (U+222A)\'", "$\\cap$");
      s = _replace;
      String _replace_1 = s.replace("\'â©  (U+2229)\'", "$\\cup$");
      s = _replace_1;
      String _replace_2 = s.replace("\'\\  (U+2216)\'", "$\\setminus$");
      s = _replace_2;
      String _replace_3 = s.replace("\'=Â Â (U+2260)\'", "$\\neq$");
      s = _replace_3;
      String _replace_4 = s.replace("\'Â¬  (U+00AC)\'", "$\\lnot$");
      s = _replace_4;
      String _replace_5 = s.replace("\'â§  (U+2227)\'", "$\\wedge$");
      s = _replace_5;
      String _replace_6 = s.replace("\'â¨Â Â (U+2228)\'", "$\\vee$");
      s = _replace_6;
      String _replace_7 = s.replace("\'Â Â (U+22BB)\'", "$\\oplus$");
      s = _replace_7;
      String _replace_8 = s.replace("\'â  (U+2192)\'", "$\\rightarrow$");
      s = _replace_8;
      String _replace_9 = s.replace("\'â (U+2192)´", "$\\rightarrow$");
      s = _replace_9;
      String _replace_10 = s.replace("\'âÂ Â (U+21D2)\'", "$\\Rightarrow$");
      s = _replace_10;
      String _replace_11 = s.replace("\'âÂ Â (U+2194)\'", "$\\leftrightarrow$");
      s = _replace_11;
      String _replace_12 = s.replace("\'â  (U+21D4)\'", "$\\Leftrightarrow$");
      s = _replace_12;
      String _replace_13 = s.replace("\'â¤Â (U+2264)\'", "$\\leq$");
      s = _replace_13;
      String _replace_14 = s.replace("\'â¥Â (U+2265)\'", "$\\geq$");
      s = _replace_14;
      String _replace_15 = s.replace("\'â\'", "$\\in$");
      s = _replace_15;
      String _replace_16 = s.replace("\'â\'", "$\\notin$");
      s = _replace_16;
      String _replace_17 = s.replace("\'â  (U+2282)\'", "$\\subset$");
      s = _replace_17;
      String _replace_18 = s.replace("\'â  (U+2286)\'", "$\\subseteq$");
      s = _replace_18;
      String _replaceAll = s.replaceAll("[\r\n]+", "");
      sf = _replaceAll;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\\begin{flushleft}");
      _builder.newLine();
      _builder.append("\\begin{lstlisting}[mathescape=true, breaklines=true]");
      _builder.newLine();
      _builder.append(" ");
      _builder.append(sf, " ");
      _builder.newLineIfNotEmpty();
      _builder.append("\\end{lstlisting}");
      _builder.newLine();
      _builder.append("\\end{flushleft}");
      _builder.newLine();
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
  
  public String compile(final UserComment comment) {
    String _contentComment = comment.getContentComment();
    String _contentComment_1 = comment.getContentComment();
    int _length = _contentComment_1.length();
    int _minus = (_length - 2);
    String s = _contentComment.substring(2, _minus);
    String _contentComment_2 = comment.getContentComment();
    int regex = _contentComment_2.indexOf(" ", 2);
    String _contentComment_3 = comment.getContentComment();
    String com = _contentComment_3.substring(2, regex);
    String _substring = s.substring((regex - 1));
    SpecialCharMarnager mngr = new SpecialCharMarnager(_substring);
    boolean _equalsIgnoreCase = com.equalsIgnoreCase("SECTION");
    if (_equalsIgnoreCase) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("\\section{");
      _builder.append(com, "");
      _builder.append("}");
      _builder.newLineIfNotEmpty();
      _builder.append("  \t\t ");
      _builder.newLine();
      String _substitute = mngr.substitute();
      _builder.append(_substitute, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      return _builder.toString();
    } else {
      boolean _equalsIgnoreCase_1 = com.equalsIgnoreCase("SUBSECTION");
      if (_equalsIgnoreCase_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.newLine();
        _builder_1.append("\\subsection{");
        _builder_1.append(com, "");
        _builder_1.append("}");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        String _substitute_1 = mngr.substitute();
        _builder_1.append(_substitute_1, "");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        return _builder_1.toString();
      } else {
        boolean _equalsIgnoreCase_2 = com.equalsIgnoreCase("SUBSUBSECTION");
        if (_equalsIgnoreCase_2) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.newLine();
          _builder_2.append("\\subsubsection{");
          _builder_2.append(com, "");
          _builder_2.append("}");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("  \t\t ");
          _builder_2.newLine();
          String _substitute_2 = mngr.substitute();
          _builder_2.append(_substitute_2, "");
          _builder_2.newLineIfNotEmpty();
          _builder_2.newLine();
          return _builder_2.toString();
        } else {
          boolean _equalsIgnoreCase_3 = com.equalsIgnoreCase("PARAGRAPH");
          if (_equalsIgnoreCase_3) {
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.newLine();
            _builder_3.append("\\paragraph{}");
            _builder_3.newLine();
            _builder_3.newLine();
            String _substitute_3 = mngr.substitute();
            _builder_3.append(_substitute_3, "");
            _builder_3.newLineIfNotEmpty();
            _builder_3.newLine();
            return _builder_3.toString();
          } else {
            boolean _equalsIgnoreCase_4 = com.equalsIgnoreCase("SUBPARAGRAPH");
            if (_equalsIgnoreCase_4) {
              StringConcatenation _builder_4 = new StringConcatenation();
              _builder_4.newLine();
              _builder_4.append("\\subparagraph{}");
              _builder_4.newLine();
              _builder_4.newLine();
              String _substitute_4 = mngr.substitute();
              _builder_4.append(_substitute_4, "");
              _builder_4.newLineIfNotEmpty();
              _builder_4.newLine();
              return _builder_4.toString();
            }
          }
        }
      }
    }
    return null;
  }
  
  private String fileName;
  
  public String setFileName(final String pn) {
    return this.fileName = pn;
  }
}
