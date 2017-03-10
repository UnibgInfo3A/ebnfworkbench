package it.unibg.ebnfwb.exporter.latex

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule
import org.w3c.dom.Comment
import it.unibg.ebnfwb.lang.ebnfLang.Expression
import java.io.File
import it.unibg.ebnfwb.lang.services.EbnfLangGrammarAccess.Expression_AlternativeElements
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
	
	int i
	
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
	\usepackage{syntax}
	
	\begin{document}
	\begin{grammar}
    «FOR f:e.lines»
    	«f.compile»	
    «ENDFOR»    
    \end{grammar}
	\end{document}
	'''

	def compile(Line line) {
    	if (line instanceof ProductionRule)
    		(line as ProductionRule).compile	
    	else
    		println(new ToString().caseLine(line))		
	}

	def compile(ProductionRule rule) {
		
		var s = '<'+rule.name+'>' + ' ='+rule.expr.compile
		
		var r =s.replaceAll("[\r\n]+", "")
		
	'''
	 «r»
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
  		 
  		
  		
  
	
	// the document name (for the tex file)	
	String fileName
	
//	String expression

	def setFileName(String pn) {
		fileName = pn;
	}

}
	
