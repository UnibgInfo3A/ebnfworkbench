package it.unibg.ebnfwb.exporter.latex

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule
import it.unibg.ebnfwb.lang.ebnfLang.Expression
import it.unibg.ebnfwb.lang.ebnfLang.Line
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Alternative
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Concatenation
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Exception
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Group
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Optional_Group
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Repetition_Group
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Rule_Reference
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Special_Sequence
import it.unibg.ebnfwb.lang.ebnfLang.Expression_Terminal_Symbol
import it.unibg.ebnfwb.lang.ebnfLang.UserComment
import java.util.ArrayList

/**
 * Generates latex from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 * 
 * http://tex.stackexchange.com/questions/24886/which-package-can-be-used-to-write-bnf-grammars
 * 
 */
class EbnfLangLatexGenerator implements IGenerator { //extends AbstractGenerator {
//	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	
	
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {

		for (e : input.allContents.toIterable.filter(EbnfGrammar)) {
				
			fsa.generateFile(fileName.toFirstUpper + ".tex", e.compile)
		}
	}

	/*	Accedere ai commenti
	 * e«if (*****(value) instanceof Comment) {
	 * 		
	 }»*/
	def compile(EbnfGrammar e) '''
	\documentclass{article}
	\usepackage{color}
	\definecolor{isabelline}{rgb}{0.96, 0.94, 0.93}
	\pagecolor{isabelline}
	\usepackage{listings}
	\usepackage{textcomp}
	\usepackage{upquote}
	\usepackage[a4paper,top=1cm,bottom=1cm,left=0.5cm,right=0.2cm]{geometry}
	\lstset{
		basicstyle=\ttfamily,
		columns=flexible,
		extendedchars= true
	}
	
	
	\begin{document}
    «FOR f:e.lines»
    	«f.compile»	
    «ENDFOR»    
	\end{document}
	'''
	
	def compile(Line line) {
    	if (line instanceof ProductionRule)
    		println(line as ProductionRule).compile	
    	else if (line instanceof UserComment)
    		println(line as UserComment).compile	
    	else
    		println(line.toString)		
}
//
//	def compile(Line line) {
//    	if (line instanceof ProductionRule)
//    		(line as ProductionRule).compile	
//    	else
//    		println(new ToString().caseLine(line))		
//	}

	def compile(ProductionRule rule) {
		
		var r = rule.expr.compile
	   
	    var s = ""
	    var sf = ""
	    
	    
	    var SpecialCharMarnager mngr = new SpecialCharMarnager(r)
	  
	 	s = rule.name+ '='+ r + ';'
	  
	  
		s = s.replace("'âª  (U+222A)'","$\\cap$");
  		s = s.replace("'â©  (U+2229)'","$\\cup$");
	    s = s.replace("'\\  (U+2216)'","$\\setminus$");
	    s = s.replace("'=Â Â (U+2260)'","$\\neq$");
	    s = s.replace("'Â¬  (U+00AC)'","$\\lnot$");
	    s = s.replace("'â§  (U+2227)'","$\\wedge$");
	    s = s.replace("'â¨Â Â (U+2228)'","$\\vee$");
	    s = s.replace("'Â Â (U+22BB)'","$\\oplus$");
	    s = s.replace("'â  (U+2192)'","$\\rightarrow$");
	    s = s.replace("'â (U+2192)'", "$\\rightarrow$");
	    s = s.replace("'âÂ Â (U+21D2)'","$\\Rightarrow$");
	    s = s.replace("'âÂ Â (U+2194)'","$\\leftrightarrow$");
	    s = s.replace("'â  (U+21D4)'","$\\Leftrightarrow$");
	    s = s.replace("'â¤Â (U+2264)'","$\\leq$");
	    s = s.replace("'â¥Â (U+2265)'","$\\geq$");
	    s = s.replace("'â'", "$\\in$");
	    s = s.replace("'â'", "$\\notin$");
	    s = s.replace("'â  (U+2282)'","$\\subset$");
	    s = s.replace("'â  (U+2286)'","$\\subseteq$");
	    s = s.replace("'â (U+2208)'","$\\in$")
	    s = s.replace("'â (U+2209)'","$\\notin$")
	    s = s.replace("'â²'", "'′'")
	      
	    //evita di spezzare una regola dopo il segno di uguaglianza
	    sf = s.replaceAll("[\r\n]+", "")

	'''
	\begin{flushleft}
	\begin{lstlisting}[mathescape=true, breaklines=true]
	 «sf»
	\end{lstlisting}
	\end{flushleft}
	'''
	
	}
	
  	def compile (Expression expr) {
  		
  		if (expr instanceof Expression_Alternative)
  		
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		if (expr instanceof Expression_Concatenation) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		
  		if (expr instanceof Expression_Exception) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		
  		if (expr instanceof Expression_Group) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		if (expr instanceof Expression_Optional_Group) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		
  		if (expr instanceof Expression_Repetition) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		
  		if (expr instanceof Expression_Repetition_Group) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		
  		if (expr instanceof Expression_Rule_Reference) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		
  		if (expr instanceof Expression_Special_Sequence) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		
  		if (expr instanceof Expression_Terminal_Symbol) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		
  		if (expr instanceof Expression_Terminal_Symbol) 
  		
  		return '''
  		
  		 	«new ToString().doSwitch(expr)»
  		
  		'''		
  		 }
  		 
  		 def compile(UserComment comment){
  		 	//Per non far stampare i simboli (**)in latex
  		 	var String s = comment.contentComment.substring(2,comment.contentComment.length-2)
  		 	
  		 	var int regex = comment.contentComment.indexOf(" ",2)
  		 	var String com = comment.contentComment.substring(2,regex)
  		 	var SpecialCharMarnager mngr = new SpecialCharMarnager(s.substring(regex-1))
  		 	
  		 		if(com.equalsIgnoreCase("SECTION")) {
  		 			
  		 			return
  		 	'''
  		 	
  		 	\section{«com»}
  		 
  		 	«mngr.substitute()»
  		 	
  		 	'''
  		 		}else if(com.equalsIgnoreCase("SUBSECTION")) {
  		 			
  		 			return
  		 	'''
  		 	
  		 	\subsection{«com»}
  		 	
  		 	«mngr.substitute()»
  		 	
  		 	'''
  		 		}else if(com.equalsIgnoreCase("SUBSUBSECTION")) {
  		 			
  		 			return
  		 	'''
  		 	
  		 	\subsubsection{«com»}
  		 
  		 	«mngr.substitute()»
  		 	
  		 	'''
  		 		}else if(com.equalsIgnoreCase("PARAGRAPH")) {
  		 			
  		 			return
  		 	'''
  		 	
  		 	\paragraph{}
  		 	
  		 	«mngr.substitute()»
  		 	
  		 	'''
  		 		}else if(com.equalsIgnoreCase("SUBPARAGRAPH")) {
  		 			
  		 			return
  		 	'''
  		 	
  		 	\subparagraph{}
  		 	
  		 	«mngr.substitute()»
  		 	
  		 	'''
  		 		}
  		 		
  		 		}
  		 
  		 
	// the document name (for the tex file)	
	String fileName 
	

   def setFileName(String pn) {
		fileName = pn;
	}

}
	
