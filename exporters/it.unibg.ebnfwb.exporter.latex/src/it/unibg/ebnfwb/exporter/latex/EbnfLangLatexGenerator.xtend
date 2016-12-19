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
	\usepackage{syntax}
	
	\begin{document}
    «FOR f:e.lines»
    	«f.compile»	
    «ENDFOR»    
	\end{document}
	'''

	def compile(Line line) {
    	if (line instanceof ProductionRule)
    		(line as ProductionRule).compile	
    	else
    		println(line.toString())		
	}

	def compile(ProductionRule rule) '''
	\begin{grammar}
		«rule.name»
		«rule.expr.compile»
	\end{grammar}
	'''

	def compile(Expression expr) '''
		
	'''

	// the document name (for the tex file)	
	String fileName

	def setFileName(String pn) {
		fileName = pn;
	}

}
