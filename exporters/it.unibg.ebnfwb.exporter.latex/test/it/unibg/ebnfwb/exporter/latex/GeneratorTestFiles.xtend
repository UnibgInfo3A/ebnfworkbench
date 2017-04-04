package it.unibg.ebnfwb.exporter.latex

import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import static org.junit.Assert.*
import org.eclipse.xtext.generator.IFileSystemAccess
import java.io.FileReader
import java.nio.CharBuffer
import java.io.FileWriter
import it.unibg.ebnfwb.lang.tests.EbnfLangInjectorProvider
import it.unibg.ebnfwb.lang.ebnfLang.EbnfGrammar
import java.io.FileInputStream
import java.nio.charset.Charset
import java.nio.channels.FileChannel
import java.nio.ByteBuffer

@RunWith(XtextRunner)
@InjectWith(EbnfLangInjectorProvider)

class GeneratorTestFiles {
     
    @Inject EbnfLangLatexGenerator underTest
    @Inject ParseHelper<EbnfGrammar> parseHelper 
     
    @Test
   def void test() {
    	val fis = new FileInputStream('examples/numbers/numbers.ebnf');
		val fc = fis.getChannel();
		val bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
		val cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
		val EbnfGrammar grammar = parseHelper.parse(cbuf)
        val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess()
        underTest.fileName = "numbers"
        underTest.doGenerate(grammar.eResource, fsa)
        fsa.textFiles.forEach[filename, fileContent|
        	println("writing " + filename + fileContent)
        	val file = new FileWriter('examples/numbers/'+filename)
        	file.write(fileContent.toString)
        	file.close
        ]
    }
    
    @Test
   def void test1() {
    	val fis = new FileInputStream('examples/numbers2/numbers.ebnf');
		val fc = fis.getChannel();
		val bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
		val cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
		val EbnfGrammar grammar = parseHelper.parse(cbuf)
        val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess()
        underTest.fileName = "numbers"
        underTest.doGenerate(grammar.eResource, fsa)
        fsa.textFiles.forEach[filename, fileContent|
        	println("writing " + filename + fileContent)
        	val file = new FileWriter('examples/numbers2/'+filename)
        	file.write(fileContent.toString)
        	file.close
        ]
    }

    
    
    @Test
    def void test2() {
    	val fis = new FileInputStream('examples/UASMExample/UASM_ebnf_iso.ebnf');
		val fc = fis.getChannel();
		val bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
		val cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
		val EbnfGrammar grammar = parseHelper.parse(cbuf)
        val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess()
        underTest.fileName = "UASM_ebnf_iso"
        underTest.doGenerate(grammar.eResource, fsa)
        fsa.textFiles.forEach[filename, fileContent|
        	println("writing " + filename + fileContent)
        	val file = new FileWriter('examples/UASMExample/'+filename)
        	file.write(fileContent.toString)
        	file.close
        ]
    }
      
      @Test
    def void test3() {
    	val fis = new FileInputStream('examples/PascalLikeLanguage/esempio2.ebnf');
		val fc = fis.getChannel();
		val bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
		val cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
		val EbnfGrammar grammar = parseHelper.parse(cbuf)
        val InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess()
        underTest.fileName = "esempio2"
        underTest.doGenerate(grammar.eResource, fsa)
        fsa.textFiles.forEach[filename, fileContent|
        	println("writing " + filename + fileContent)
        	val file = new FileWriter('examples/PascalLikeLanguage/'+filename)
        	file.write(fileContent.toString)
        	file.close
        ]
    }
}