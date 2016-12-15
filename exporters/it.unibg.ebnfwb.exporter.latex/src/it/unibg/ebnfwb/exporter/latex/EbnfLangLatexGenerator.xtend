package it.unibg.ebnfwb.exporter.latex

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule

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
			fsa.generateFile(fileName.toFirstUpper +".tex", e.compile)
		}
	}

	def compile(EbnfGrammar e) '''
	\documentclass{article}
	\usepackage{syntax}
	
	\begin{document}
	\begin{grammar}
	
    «FOR f:e.rules»
         «f.compile»
    «ENDFOR»
	\end{grammar}
	\end{document}
	'''
	def compile(ProductionRule rule)'''
		% production rule «rule.name» 
	'''
	
	// the document name (for the tex file)	
	String fileName
	def setFileName(String pn) {
		fileName = pn;
	}
	
}
