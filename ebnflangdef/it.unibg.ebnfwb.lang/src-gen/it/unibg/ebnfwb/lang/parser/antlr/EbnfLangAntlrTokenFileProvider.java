/*
 * generated by Xtext 2.10.0
 */
package it.unibg.ebnfwb.lang.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EbnfLangAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("it/unibg/ebnfwb/lang/parser/antlr/internal/InternalEbnfLang.tokens");
	}
}