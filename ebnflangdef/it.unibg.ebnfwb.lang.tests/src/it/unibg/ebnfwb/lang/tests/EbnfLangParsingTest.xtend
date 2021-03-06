/*
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.tests

import com.google.inject.Inject
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(EbnfLangInjectorProvider)
class EbnfLangParsingTest{

	@Inject
	ParseHelper<EbnfGrammar> parseHelper

	// https://www.ics.uci.edu/~pattis/ICS-33/lectures/ebnf.pdf
	@Test 
	def void loadModel() {
		val EbnfGrammar result = parseHelper.parse('''
			sign = +|-
			digit = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
			integer = [sign]digit{digit}
		''')
		Assert.assertNotNull(result)
		System.out.println(result.lines.size)
	}

	@Test 
	def void loadModelRepetition() {
		val EbnfGrammar result = parseHelper.parse('''
			Header  =  {UseDirective}, {ImportDirective},  {ExportDirective}
		''')
		Assert.assertNotNull(result)
		System.out.println(result.lines.size)
		println(result.lines.get(0))
	}
	@Test 
	def void loadModelComment() {
		val EbnfGrammar result = parseHelper.parse('''
			// comment in C
			(* ebnf comment *)
			Header  =  {UseDirective}, {ImportDirective},  {ExportDirective}
		''')
		Assert.assertNotNull(result)
		System.out.println(result.lines.size)
		println(result.lines.get(0).toString())
	}
	
	
	

}
