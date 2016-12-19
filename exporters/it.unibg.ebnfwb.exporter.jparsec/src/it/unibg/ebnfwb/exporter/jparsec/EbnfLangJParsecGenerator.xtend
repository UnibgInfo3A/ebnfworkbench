package it.unibg.ebnfwb.exporter.jparsec

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import it.unibg.ebnfwb.lang.ebnfLang.ProductionRule
import it.unibg.ebnfwb.lang.ebnfLang.Line

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EbnfLangJParsecGenerator implements IGenerator { //extends AbstractGenerator {
//	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		for (e : input.allContents.toIterable.filter(EbnfGrammar)) {
			fsa.generateFile(packageName.toFirstUpper +".java", e.compile)
		}
	}

	def compile(EbnfGrammar e) '''
		package «packageName»;
		public class «packageName.toFirstUpper»{
			        «FOR f:e.lines»
			            «f.compile»
			        «ENDFOR»
			
		}
	'''
	def compile(Line rule)'''
	'''

	def compile(ProductionRule rule)'''
		// production rule «rule.name» 
	'''
	
	String packageName
	def setPackageName(String pn) {
		packageName = pn;
	}
	
}
