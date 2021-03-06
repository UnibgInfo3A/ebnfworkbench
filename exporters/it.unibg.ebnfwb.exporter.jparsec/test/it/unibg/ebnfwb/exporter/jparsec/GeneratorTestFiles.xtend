package it.unibg.ebnfwb.exporter.jparsec

import com.google.inject.Inject
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import it.unibg.ebnfwb.lang.tests.EbnfLangInjectorProvider
import java.io.FileReader
import java.nio.CharBuffer
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(EbnfLangInjectorProvider)

class GeneratorTestFiles {
     
    @Inject EbnfLangJParsecGenerator underTest
    @Inject ParseHelper<EbnfGrammar> parseHelper 
     
    @Test
    def void test() {
		val CharBuffer target = CharBuffer.allocate(1000);
    	val nread = new FileReader('examples/numbers/numbers.ebnf').read(target)
    	print(target);
    	// check nread
		val EbnfGrammar grammar = parseHelper.parse(target)
        val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess()
        //
        underTest.packageName = "numbers"
        //
        underTest.doGenerate(grammar.eResource, fsa)
        //
        fsa.textFiles.forEach[filename, fileContent|
        	println("writing " + filename + fileContent)
        	//val file = new FileWriter('examples/numbers/'+filename)
        	//file.write(fileContent.toString)
        	//file.close
        ]
    }
	     
}