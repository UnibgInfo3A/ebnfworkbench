package it.unibg.ebnfwb.exporter.latex

import com.google.inject.Inject
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import it.unibg.ebnfwb.lang.tests.EbnfLangInjectorProvider
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.junit.runner.RunWith
import org.junit.runner.Runner

@RunWith(XtextRunner)
@InjectWith(EbnfLangInjectorProvider)
class GeneratorTest {

	@Inject EbnfLangLatexGenerator underTest
	@Inject ParseHelper<EbnfGrammar> parseHelper

	@Test
	def void test() {
		val EbnfGrammar grammar = parseHelper.parse('''
			sign = +|-
			digit = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
			integer = [sign]digit{digit}
		''')
		val fsa = new InMemoryFileSystemAccess()
		underTest.doGenerate(grammar.eResource, fsa)
		println(fsa.allFiles)
	}

	@Test
	def void testComments() {
		val EbnfGrammar grammar = parseHelper.parse('''
			// comments
			(* my comments*)
			sign = +|-
		''')
		val fsa = new InMemoryFileSystemAccess()
		underTest.doGenerate(grammar.eResource, fsa)
		println(fsa.allFiles)
	}

}
