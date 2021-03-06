package it.unibg.ebnfwb.exporter.jparsec

import com.google.inject.Inject
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import it.unibg.ebnfwb.lang.tests.EbnfLangInjectorProvider
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(EbnfLangInjectorProvider)
class GeneratorTest {
     
    @Inject EbnfLangJParsecGenerator underTest
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
     
}