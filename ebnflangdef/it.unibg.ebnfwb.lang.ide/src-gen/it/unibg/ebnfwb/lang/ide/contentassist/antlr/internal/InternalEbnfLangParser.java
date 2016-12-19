package it.unibg.ebnfwb.lang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.unibg.ebnfwb.lang.services.EbnfLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEbnfLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EBNF_COMMENT", "RULE_NAME", "RULE_NUMBER", "RULE_SPECIAL_SEQUENCE", "RULE_TERMINAL_SYMBOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "';'", "'|'", "','", "'-'", "'*'", "'{'", "'}'", "'['", "']'", "'('", "')'"
    };
    public static final int RULE_TERMINAL_SYMBOL=8;
    public static final int RULE_NAME=5;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_SPECIAL_SEQUENCE=7;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=14;
    public static final int RULE_EBNF_COMMENT=4;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=10;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEbnfLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEbnfLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEbnfLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEbnfLang.g"; }


    	private EbnfLangGrammarAccess grammarAccess;

    	public void setGrammarAccess(EbnfLangGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleEbnfGrammar"
    // InternalEbnfLang.g:53:1: entryRuleEbnfGrammar : ruleEbnfGrammar EOF ;
    public final void entryRuleEbnfGrammar() throws RecognitionException {
        try {
            // InternalEbnfLang.g:54:1: ( ruleEbnfGrammar EOF )
            // InternalEbnfLang.g:55:1: ruleEbnfGrammar EOF
            {
             before(grammarAccess.getEbnfGrammarRule()); 
            pushFollow(FOLLOW_1);
            ruleEbnfGrammar();

            state._fsp--;

             after(grammarAccess.getEbnfGrammarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEbnfGrammar"


    // $ANTLR start "ruleEbnfGrammar"
    // InternalEbnfLang.g:62:1: ruleEbnfGrammar : ( ( rule__EbnfGrammar__Group__0 ) ) ;
    public final void ruleEbnfGrammar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:66:2: ( ( ( rule__EbnfGrammar__Group__0 ) ) )
            // InternalEbnfLang.g:67:2: ( ( rule__EbnfGrammar__Group__0 ) )
            {
            // InternalEbnfLang.g:67:2: ( ( rule__EbnfGrammar__Group__0 ) )
            // InternalEbnfLang.g:68:3: ( rule__EbnfGrammar__Group__0 )
            {
             before(grammarAccess.getEbnfGrammarAccess().getGroup()); 
            // InternalEbnfLang.g:69:3: ( rule__EbnfGrammar__Group__0 )
            // InternalEbnfLang.g:69:4: rule__EbnfGrammar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EbnfGrammar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEbnfGrammarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEbnfGrammar"


    // $ANTLR start "entryRuleLine"
    // InternalEbnfLang.g:78:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalEbnfLang.g:79:1: ( ruleLine EOF )
            // InternalEbnfLang.g:80:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalEbnfLang.g:87:1: ruleLine : ( ( rule__Line__Alternatives ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:91:2: ( ( ( rule__Line__Alternatives ) ) )
            // InternalEbnfLang.g:92:2: ( ( rule__Line__Alternatives ) )
            {
            // InternalEbnfLang.g:92:2: ( ( rule__Line__Alternatives ) )
            // InternalEbnfLang.g:93:3: ( rule__Line__Alternatives )
            {
             before(grammarAccess.getLineAccess().getAlternatives()); 
            // InternalEbnfLang.g:94:3: ( rule__Line__Alternatives )
            // InternalEbnfLang.g:94:4: rule__Line__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Line__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleProductionRule"
    // InternalEbnfLang.g:103:1: entryRuleProductionRule : ruleProductionRule EOF ;
    public final void entryRuleProductionRule() throws RecognitionException {
        try {
            // InternalEbnfLang.g:104:1: ( ruleProductionRule EOF )
            // InternalEbnfLang.g:105:1: ruleProductionRule EOF
            {
             before(grammarAccess.getProductionRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleProductionRule();

            state._fsp--;

             after(grammarAccess.getProductionRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProductionRule"


    // $ANTLR start "ruleProductionRule"
    // InternalEbnfLang.g:112:1: ruleProductionRule : ( ( rule__ProductionRule__Group__0 ) ) ;
    public final void ruleProductionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:116:2: ( ( ( rule__ProductionRule__Group__0 ) ) )
            // InternalEbnfLang.g:117:2: ( ( rule__ProductionRule__Group__0 ) )
            {
            // InternalEbnfLang.g:117:2: ( ( rule__ProductionRule__Group__0 ) )
            // InternalEbnfLang.g:118:3: ( rule__ProductionRule__Group__0 )
            {
             before(grammarAccess.getProductionRuleAccess().getGroup()); 
            // InternalEbnfLang.g:119:3: ( rule__ProductionRule__Group__0 )
            // InternalEbnfLang.g:119:4: rule__ProductionRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProductionRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductionRule"


    // $ANTLR start "entryRuleExpression"
    // InternalEbnfLang.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalEbnfLang.g:129:1: ( ruleExpression EOF )
            // InternalEbnfLang.g:130:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEbnfLang.g:137:1: ruleExpression : ( ruleExpression_Alternative ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:141:2: ( ( ruleExpression_Alternative ) )
            // InternalEbnfLang.g:142:2: ( ruleExpression_Alternative )
            {
            // InternalEbnfLang.g:142:2: ( ruleExpression_Alternative )
            // InternalEbnfLang.g:143:3: ruleExpression_Alternative
            {
             before(grammarAccess.getExpressionAccess().getExpression_AlternativeParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Alternative();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getExpression_AlternativeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_Alternative"
    // InternalEbnfLang.g:153:1: entryRuleExpression_Alternative : ruleExpression_Alternative EOF ;
    public final void entryRuleExpression_Alternative() throws RecognitionException {
        try {
            // InternalEbnfLang.g:154:1: ( ruleExpression_Alternative EOF )
            // InternalEbnfLang.g:155:1: ruleExpression_Alternative EOF
            {
             before(grammarAccess.getExpression_AlternativeRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Alternative();

            state._fsp--;

             after(grammarAccess.getExpression_AlternativeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Alternative"


    // $ANTLR start "ruleExpression_Alternative"
    // InternalEbnfLang.g:162:1: ruleExpression_Alternative : ( ( rule__Expression_Alternative__Group__0 ) ) ;
    public final void ruleExpression_Alternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:166:2: ( ( ( rule__Expression_Alternative__Group__0 ) ) )
            // InternalEbnfLang.g:167:2: ( ( rule__Expression_Alternative__Group__0 ) )
            {
            // InternalEbnfLang.g:167:2: ( ( rule__Expression_Alternative__Group__0 ) )
            // InternalEbnfLang.g:168:3: ( rule__Expression_Alternative__Group__0 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup()); 
            // InternalEbnfLang.g:169:3: ( rule__Expression_Alternative__Group__0 )
            // InternalEbnfLang.g:169:4: rule__Expression_Alternative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_AlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Alternative"


    // $ANTLR start "entryRuleExpression_Concatenation"
    // InternalEbnfLang.g:178:1: entryRuleExpression_Concatenation : ruleExpression_Concatenation EOF ;
    public final void entryRuleExpression_Concatenation() throws RecognitionException {
        try {
            // InternalEbnfLang.g:179:1: ( ruleExpression_Concatenation EOF )
            // InternalEbnfLang.g:180:1: ruleExpression_Concatenation EOF
            {
             before(grammarAccess.getExpression_ConcatenationRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Concatenation();

            state._fsp--;

             after(grammarAccess.getExpression_ConcatenationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Concatenation"


    // $ANTLR start "ruleExpression_Concatenation"
    // InternalEbnfLang.g:187:1: ruleExpression_Concatenation : ( ( rule__Expression_Concatenation__Group__0 ) ) ;
    public final void ruleExpression_Concatenation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:191:2: ( ( ( rule__Expression_Concatenation__Group__0 ) ) )
            // InternalEbnfLang.g:192:2: ( ( rule__Expression_Concatenation__Group__0 ) )
            {
            // InternalEbnfLang.g:192:2: ( ( rule__Expression_Concatenation__Group__0 ) )
            // InternalEbnfLang.g:193:3: ( rule__Expression_Concatenation__Group__0 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup()); 
            // InternalEbnfLang.g:194:3: ( rule__Expression_Concatenation__Group__0 )
            // InternalEbnfLang.g:194:4: rule__Expression_Concatenation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Concatenation"


    // $ANTLR start "entryRuleExpression_Exception"
    // InternalEbnfLang.g:203:1: entryRuleExpression_Exception : ruleExpression_Exception EOF ;
    public final void entryRuleExpression_Exception() throws RecognitionException {
        try {
            // InternalEbnfLang.g:204:1: ( ruleExpression_Exception EOF )
            // InternalEbnfLang.g:205:1: ruleExpression_Exception EOF
            {
             before(grammarAccess.getExpression_ExceptionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Exception();

            state._fsp--;

             after(grammarAccess.getExpression_ExceptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Exception"


    // $ANTLR start "ruleExpression_Exception"
    // InternalEbnfLang.g:212:1: ruleExpression_Exception : ( ( rule__Expression_Exception__Group__0 ) ) ;
    public final void ruleExpression_Exception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:216:2: ( ( ( rule__Expression_Exception__Group__0 ) ) )
            // InternalEbnfLang.g:217:2: ( ( rule__Expression_Exception__Group__0 ) )
            {
            // InternalEbnfLang.g:217:2: ( ( rule__Expression_Exception__Group__0 ) )
            // InternalEbnfLang.g:218:3: ( rule__Expression_Exception__Group__0 )
            {
             before(grammarAccess.getExpression_ExceptionAccess().getGroup()); 
            // InternalEbnfLang.g:219:3: ( rule__Expression_Exception__Group__0 )
            // InternalEbnfLang.g:219:4: rule__Expression_Exception__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ExceptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Exception"


    // $ANTLR start "entryRuleExpression_Repetition"
    // InternalEbnfLang.g:228:1: entryRuleExpression_Repetition : ruleExpression_Repetition EOF ;
    public final void entryRuleExpression_Repetition() throws RecognitionException {
        try {
            // InternalEbnfLang.g:229:1: ( ruleExpression_Repetition EOF )
            // InternalEbnfLang.g:230:1: ruleExpression_Repetition EOF
            {
             before(grammarAccess.getExpression_RepetitionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Repetition();

            state._fsp--;

             after(grammarAccess.getExpression_RepetitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Repetition"


    // $ANTLR start "ruleExpression_Repetition"
    // InternalEbnfLang.g:237:1: ruleExpression_Repetition : ( ( rule__Expression_Repetition__Alternatives ) ) ;
    public final void ruleExpression_Repetition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:241:2: ( ( ( rule__Expression_Repetition__Alternatives ) ) )
            // InternalEbnfLang.g:242:2: ( ( rule__Expression_Repetition__Alternatives ) )
            {
            // InternalEbnfLang.g:242:2: ( ( rule__Expression_Repetition__Alternatives ) )
            // InternalEbnfLang.g:243:3: ( rule__Expression_Repetition__Alternatives )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getAlternatives()); 
            // InternalEbnfLang.g:244:3: ( rule__Expression_Repetition__Alternatives )
            // InternalEbnfLang.g:244:4: rule__Expression_Repetition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression_RepetitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Repetition"


    // $ANTLR start "entryRuleExpression_Terminal"
    // InternalEbnfLang.g:253:1: entryRuleExpression_Terminal : ruleExpression_Terminal EOF ;
    public final void entryRuleExpression_Terminal() throws RecognitionException {
        try {
            // InternalEbnfLang.g:254:1: ( ruleExpression_Terminal EOF )
            // InternalEbnfLang.g:255:1: ruleExpression_Terminal EOF
            {
             before(grammarAccess.getExpression_TerminalRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Terminal();

            state._fsp--;

             after(grammarAccess.getExpression_TerminalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Terminal"


    // $ANTLR start "ruleExpression_Terminal"
    // InternalEbnfLang.g:262:1: ruleExpression_Terminal : ( ( rule__Expression_Terminal__Alternatives ) ) ;
    public final void ruleExpression_Terminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:266:2: ( ( ( rule__Expression_Terminal__Alternatives ) ) )
            // InternalEbnfLang.g:267:2: ( ( rule__Expression_Terminal__Alternatives ) )
            {
            // InternalEbnfLang.g:267:2: ( ( rule__Expression_Terminal__Alternatives ) )
            // InternalEbnfLang.g:268:3: ( rule__Expression_Terminal__Alternatives )
            {
             before(grammarAccess.getExpression_TerminalAccess().getAlternatives()); 
            // InternalEbnfLang.g:269:3: ( rule__Expression_Terminal__Alternatives )
            // InternalEbnfLang.g:269:4: rule__Expression_Terminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Terminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpression_TerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Terminal"


    // $ANTLR start "entryRuleExpression_Rule_Reference"
    // InternalEbnfLang.g:278:1: entryRuleExpression_Rule_Reference : ruleExpression_Rule_Reference EOF ;
    public final void entryRuleExpression_Rule_Reference() throws RecognitionException {
        try {
            // InternalEbnfLang.g:279:1: ( ruleExpression_Rule_Reference EOF )
            // InternalEbnfLang.g:280:1: ruleExpression_Rule_Reference EOF
            {
             before(grammarAccess.getExpression_Rule_ReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Rule_Reference();

            state._fsp--;

             after(grammarAccess.getExpression_Rule_ReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Rule_Reference"


    // $ANTLR start "ruleExpression_Rule_Reference"
    // InternalEbnfLang.g:287:1: ruleExpression_Rule_Reference : ( ( rule__Expression_Rule_Reference__Group__0 ) ) ;
    public final void ruleExpression_Rule_Reference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:291:2: ( ( ( rule__Expression_Rule_Reference__Group__0 ) ) )
            // InternalEbnfLang.g:292:2: ( ( rule__Expression_Rule_Reference__Group__0 ) )
            {
            // InternalEbnfLang.g:292:2: ( ( rule__Expression_Rule_Reference__Group__0 ) )
            // InternalEbnfLang.g:293:3: ( rule__Expression_Rule_Reference__Group__0 )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getGroup()); 
            // InternalEbnfLang.g:294:3: ( rule__Expression_Rule_Reference__Group__0 )
            // InternalEbnfLang.g:294:4: rule__Expression_Rule_Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Rule_Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Rule_ReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Rule_Reference"


    // $ANTLR start "entryRuleExpression_Special_Sequence"
    // InternalEbnfLang.g:303:1: entryRuleExpression_Special_Sequence : ruleExpression_Special_Sequence EOF ;
    public final void entryRuleExpression_Special_Sequence() throws RecognitionException {
        try {
            // InternalEbnfLang.g:304:1: ( ruleExpression_Special_Sequence EOF )
            // InternalEbnfLang.g:305:1: ruleExpression_Special_Sequence EOF
            {
             before(grammarAccess.getExpression_Special_SequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Special_Sequence();

            state._fsp--;

             after(grammarAccess.getExpression_Special_SequenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Special_Sequence"


    // $ANTLR start "ruleExpression_Special_Sequence"
    // InternalEbnfLang.g:312:1: ruleExpression_Special_Sequence : ( ( rule__Expression_Special_Sequence__Group__0 ) ) ;
    public final void ruleExpression_Special_Sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:316:2: ( ( ( rule__Expression_Special_Sequence__Group__0 ) ) )
            // InternalEbnfLang.g:317:2: ( ( rule__Expression_Special_Sequence__Group__0 ) )
            {
            // InternalEbnfLang.g:317:2: ( ( rule__Expression_Special_Sequence__Group__0 ) )
            // InternalEbnfLang.g:318:3: ( rule__Expression_Special_Sequence__Group__0 )
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getGroup()); 
            // InternalEbnfLang.g:319:3: ( rule__Expression_Special_Sequence__Group__0 )
            // InternalEbnfLang.g:319:4: rule__Expression_Special_Sequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Special_Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Special_SequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Special_Sequence"


    // $ANTLR start "entryRuleExpression_Terminal_Symbol"
    // InternalEbnfLang.g:328:1: entryRuleExpression_Terminal_Symbol : ruleExpression_Terminal_Symbol EOF ;
    public final void entryRuleExpression_Terminal_Symbol() throws RecognitionException {
        try {
            // InternalEbnfLang.g:329:1: ( ruleExpression_Terminal_Symbol EOF )
            // InternalEbnfLang.g:330:1: ruleExpression_Terminal_Symbol EOF
            {
             before(grammarAccess.getExpression_Terminal_SymbolRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Terminal_Symbol();

            state._fsp--;

             after(grammarAccess.getExpression_Terminal_SymbolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Terminal_Symbol"


    // $ANTLR start "ruleExpression_Terminal_Symbol"
    // InternalEbnfLang.g:337:1: ruleExpression_Terminal_Symbol : ( ( rule__Expression_Terminal_Symbol__Group__0 ) ) ;
    public final void ruleExpression_Terminal_Symbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:341:2: ( ( ( rule__Expression_Terminal_Symbol__Group__0 ) ) )
            // InternalEbnfLang.g:342:2: ( ( rule__Expression_Terminal_Symbol__Group__0 ) )
            {
            // InternalEbnfLang.g:342:2: ( ( rule__Expression_Terminal_Symbol__Group__0 ) )
            // InternalEbnfLang.g:343:3: ( rule__Expression_Terminal_Symbol__Group__0 )
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getGroup()); 
            // InternalEbnfLang.g:344:3: ( rule__Expression_Terminal_Symbol__Group__0 )
            // InternalEbnfLang.g:344:4: rule__Expression_Terminal_Symbol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Terminal_Symbol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Terminal_SymbolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Terminal_Symbol"


    // $ANTLR start "entryRuleExpression_Repetition_Group"
    // InternalEbnfLang.g:353:1: entryRuleExpression_Repetition_Group : ruleExpression_Repetition_Group EOF ;
    public final void entryRuleExpression_Repetition_Group() throws RecognitionException {
        try {
            // InternalEbnfLang.g:354:1: ( ruleExpression_Repetition_Group EOF )
            // InternalEbnfLang.g:355:1: ruleExpression_Repetition_Group EOF
            {
             before(grammarAccess.getExpression_Repetition_GroupRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Repetition_Group();

            state._fsp--;

             after(grammarAccess.getExpression_Repetition_GroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Repetition_Group"


    // $ANTLR start "ruleExpression_Repetition_Group"
    // InternalEbnfLang.g:362:1: ruleExpression_Repetition_Group : ( ( rule__Expression_Repetition_Group__Group__0 ) ) ;
    public final void ruleExpression_Repetition_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:366:2: ( ( ( rule__Expression_Repetition_Group__Group__0 ) ) )
            // InternalEbnfLang.g:367:2: ( ( rule__Expression_Repetition_Group__Group__0 ) )
            {
            // InternalEbnfLang.g:367:2: ( ( rule__Expression_Repetition_Group__Group__0 ) )
            // InternalEbnfLang.g:368:3: ( rule__Expression_Repetition_Group__Group__0 )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getGroup()); 
            // InternalEbnfLang.g:369:3: ( rule__Expression_Repetition_Group__Group__0 )
            // InternalEbnfLang.g:369:4: rule__Expression_Repetition_Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Repetition_Group"


    // $ANTLR start "entryRuleExpression_Optional_Group"
    // InternalEbnfLang.g:378:1: entryRuleExpression_Optional_Group : ruleExpression_Optional_Group EOF ;
    public final void entryRuleExpression_Optional_Group() throws RecognitionException {
        try {
            // InternalEbnfLang.g:379:1: ( ruleExpression_Optional_Group EOF )
            // InternalEbnfLang.g:380:1: ruleExpression_Optional_Group EOF
            {
             before(grammarAccess.getExpression_Optional_GroupRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Optional_Group();

            state._fsp--;

             after(grammarAccess.getExpression_Optional_GroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Optional_Group"


    // $ANTLR start "ruleExpression_Optional_Group"
    // InternalEbnfLang.g:387:1: ruleExpression_Optional_Group : ( ( rule__Expression_Optional_Group__Group__0 ) ) ;
    public final void ruleExpression_Optional_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:391:2: ( ( ( rule__Expression_Optional_Group__Group__0 ) ) )
            // InternalEbnfLang.g:392:2: ( ( rule__Expression_Optional_Group__Group__0 ) )
            {
            // InternalEbnfLang.g:392:2: ( ( rule__Expression_Optional_Group__Group__0 ) )
            // InternalEbnfLang.g:393:3: ( rule__Expression_Optional_Group__Group__0 )
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getGroup()); 
            // InternalEbnfLang.g:394:3: ( rule__Expression_Optional_Group__Group__0 )
            // InternalEbnfLang.g:394:4: rule__Expression_Optional_Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Optional_GroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Optional_Group"


    // $ANTLR start "entryRuleExpression_Group"
    // InternalEbnfLang.g:403:1: entryRuleExpression_Group : ruleExpression_Group EOF ;
    public final void entryRuleExpression_Group() throws RecognitionException {
        try {
            // InternalEbnfLang.g:404:1: ( ruleExpression_Group EOF )
            // InternalEbnfLang.g:405:1: ruleExpression_Group EOF
            {
             before(grammarAccess.getExpression_GroupRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression_Group();

            state._fsp--;

             after(grammarAccess.getExpression_GroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression_Group"


    // $ANTLR start "ruleExpression_Group"
    // InternalEbnfLang.g:412:1: ruleExpression_Group : ( ( rule__Expression_Group__Group__0 ) ) ;
    public final void ruleExpression_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:416:2: ( ( ( rule__Expression_Group__Group__0 ) ) )
            // InternalEbnfLang.g:417:2: ( ( rule__Expression_Group__Group__0 ) )
            {
            // InternalEbnfLang.g:417:2: ( ( rule__Expression_Group__Group__0 ) )
            // InternalEbnfLang.g:418:3: ( rule__Expression_Group__Group__0 )
            {
             before(grammarAccess.getExpression_GroupAccess().getGroup()); 
            // InternalEbnfLang.g:419:3: ( rule__Expression_Group__Group__0 )
            // InternalEbnfLang.g:419:4: rule__Expression_Group__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_GroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression_Group"


    // $ANTLR start "rule__Line__Alternatives"
    // InternalEbnfLang.g:427:1: rule__Line__Alternatives : ( ( ( rule__Line__Group_0__0 ) ) | ( ruleProductionRule ) );
    public final void rule__Line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:431:1: ( ( ( rule__Line__Group_0__0 ) ) | ( ruleProductionRule ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_EBNF_COMMENT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_NAME) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEbnfLang.g:432:2: ( ( rule__Line__Group_0__0 ) )
                    {
                    // InternalEbnfLang.g:432:2: ( ( rule__Line__Group_0__0 ) )
                    // InternalEbnfLang.g:433:3: ( rule__Line__Group_0__0 )
                    {
                     before(grammarAccess.getLineAccess().getGroup_0()); 
                    // InternalEbnfLang.g:434:3: ( rule__Line__Group_0__0 )
                    // InternalEbnfLang.g:434:4: rule__Line__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Line__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLineAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:438:2: ( ruleProductionRule )
                    {
                    // InternalEbnfLang.g:438:2: ( ruleProductionRule )
                    // InternalEbnfLang.g:439:3: ruleProductionRule
                    {
                     before(grammarAccess.getLineAccess().getProductionRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProductionRule();

                    state._fsp--;

                     after(grammarAccess.getLineAccess().getProductionRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Alternatives"


    // $ANTLR start "rule__Expression_Repetition__Alternatives"
    // InternalEbnfLang.g:448:1: rule__Expression_Repetition__Alternatives : ( ( ruleExpression_Terminal ) | ( ( rule__Expression_Repetition__Group_1__0 ) ) );
    public final void rule__Expression_Repetition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:452:1: ( ( ruleExpression_Terminal ) | ( ( rule__Expression_Repetition__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NAME||(LA2_0>=RULE_SPECIAL_SEQUENCE && LA2_0<=RULE_TERMINAL_SYMBOL)||LA2_0==22||LA2_0==24||LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_NUMBER) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEbnfLang.g:453:2: ( ruleExpression_Terminal )
                    {
                    // InternalEbnfLang.g:453:2: ( ruleExpression_Terminal )
                    // InternalEbnfLang.g:454:3: ruleExpression_Terminal
                    {
                     before(grammarAccess.getExpression_RepetitionAccess().getExpression_TerminalParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Terminal();

                    state._fsp--;

                     after(grammarAccess.getExpression_RepetitionAccess().getExpression_TerminalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:459:2: ( ( rule__Expression_Repetition__Group_1__0 ) )
                    {
                    // InternalEbnfLang.g:459:2: ( ( rule__Expression_Repetition__Group_1__0 ) )
                    // InternalEbnfLang.g:460:3: ( rule__Expression_Repetition__Group_1__0 )
                    {
                     before(grammarAccess.getExpression_RepetitionAccess().getGroup_1()); 
                    // InternalEbnfLang.g:461:3: ( rule__Expression_Repetition__Group_1__0 )
                    // InternalEbnfLang.g:461:4: rule__Expression_Repetition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression_Repetition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpression_RepetitionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Alternatives"


    // $ANTLR start "rule__Expression_Terminal__Alternatives"
    // InternalEbnfLang.g:469:1: rule__Expression_Terminal__Alternatives : ( ( ruleExpression_Rule_Reference ) | ( ruleExpression_Terminal_Symbol ) | ( ruleExpression_Repetition_Group ) | ( ruleExpression_Optional_Group ) | ( ruleExpression_Group ) | ( ruleExpression_Special_Sequence ) );
    public final void rule__Expression_Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:473:1: ( ( ruleExpression_Rule_Reference ) | ( ruleExpression_Terminal_Symbol ) | ( ruleExpression_Repetition_Group ) | ( ruleExpression_Optional_Group ) | ( ruleExpression_Group ) | ( ruleExpression_Special_Sequence ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt3=1;
                }
                break;
            case RULE_TERMINAL_SYMBOL:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 26:
                {
                alt3=5;
                }
                break;
            case RULE_SPECIAL_SEQUENCE:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEbnfLang.g:474:2: ( ruleExpression_Rule_Reference )
                    {
                    // InternalEbnfLang.g:474:2: ( ruleExpression_Rule_Reference )
                    // InternalEbnfLang.g:475:3: ruleExpression_Rule_Reference
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Rule_ReferenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Rule_Reference();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Rule_ReferenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:480:2: ( ruleExpression_Terminal_Symbol )
                    {
                    // InternalEbnfLang.g:480:2: ( ruleExpression_Terminal_Symbol )
                    // InternalEbnfLang.g:481:3: ruleExpression_Terminal_Symbol
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Terminal_SymbolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Terminal_Symbol();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Terminal_SymbolParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEbnfLang.g:486:2: ( ruleExpression_Repetition_Group )
                    {
                    // InternalEbnfLang.g:486:2: ( ruleExpression_Repetition_Group )
                    // InternalEbnfLang.g:487:3: ruleExpression_Repetition_Group
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Repetition_GroupParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Repetition_Group();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Repetition_GroupParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEbnfLang.g:492:2: ( ruleExpression_Optional_Group )
                    {
                    // InternalEbnfLang.g:492:2: ( ruleExpression_Optional_Group )
                    // InternalEbnfLang.g:493:3: ruleExpression_Optional_Group
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Optional_GroupParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Optional_Group();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Optional_GroupParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEbnfLang.g:498:2: ( ruleExpression_Group )
                    {
                    // InternalEbnfLang.g:498:2: ( ruleExpression_Group )
                    // InternalEbnfLang.g:499:3: ruleExpression_Group
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_GroupParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Group();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_GroupParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEbnfLang.g:504:2: ( ruleExpression_Special_Sequence )
                    {
                    // InternalEbnfLang.g:504:2: ( ruleExpression_Special_Sequence )
                    // InternalEbnfLang.g:505:3: ruleExpression_Special_Sequence
                    {
                     before(grammarAccess.getExpression_TerminalAccess().getExpression_Special_SequenceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleExpression_Special_Sequence();

                    state._fsp--;

                     after(grammarAccess.getExpression_TerminalAccess().getExpression_Special_SequenceParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal__Alternatives"


    // $ANTLR start "rule__EbnfGrammar__Group__0"
    // InternalEbnfLang.g:514:1: rule__EbnfGrammar__Group__0 : rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1 ;
    public final void rule__EbnfGrammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:518:1: ( rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1 )
            // InternalEbnfLang.g:519:2: rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EbnfGrammar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EbnfGrammar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__Group__0"


    // $ANTLR start "rule__EbnfGrammar__Group__0__Impl"
    // InternalEbnfLang.g:526:1: rule__EbnfGrammar__Group__0__Impl : ( () ) ;
    public final void rule__EbnfGrammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:530:1: ( ( () ) )
            // InternalEbnfLang.g:531:1: ( () )
            {
            // InternalEbnfLang.g:531:1: ( () )
            // InternalEbnfLang.g:532:2: ()
            {
             before(grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0()); 
            // InternalEbnfLang.g:533:2: ()
            // InternalEbnfLang.g:533:3: 
            {
            }

             after(grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__Group__0__Impl"


    // $ANTLR start "rule__EbnfGrammar__Group__1"
    // InternalEbnfLang.g:541:1: rule__EbnfGrammar__Group__1 : rule__EbnfGrammar__Group__1__Impl ;
    public final void rule__EbnfGrammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:545:1: ( rule__EbnfGrammar__Group__1__Impl )
            // InternalEbnfLang.g:546:2: rule__EbnfGrammar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EbnfGrammar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__Group__1"


    // $ANTLR start "rule__EbnfGrammar__Group__1__Impl"
    // InternalEbnfLang.g:552:1: rule__EbnfGrammar__Group__1__Impl : ( ( rule__EbnfGrammar__LinesAssignment_1 )* ) ;
    public final void rule__EbnfGrammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:556:1: ( ( ( rule__EbnfGrammar__LinesAssignment_1 )* ) )
            // InternalEbnfLang.g:557:1: ( ( rule__EbnfGrammar__LinesAssignment_1 )* )
            {
            // InternalEbnfLang.g:557:1: ( ( rule__EbnfGrammar__LinesAssignment_1 )* )
            // InternalEbnfLang.g:558:2: ( rule__EbnfGrammar__LinesAssignment_1 )*
            {
             before(grammarAccess.getEbnfGrammarAccess().getLinesAssignment_1()); 
            // InternalEbnfLang.g:559:2: ( rule__EbnfGrammar__LinesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_EBNF_COMMENT && LA4_0<=RULE_NAME)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEbnfLang.g:559:3: rule__EbnfGrammar__LinesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EbnfGrammar__LinesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getEbnfGrammarAccess().getLinesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__Group__1__Impl"


    // $ANTLR start "rule__Line__Group_0__0"
    // InternalEbnfLang.g:568:1: rule__Line__Group_0__0 : rule__Line__Group_0__0__Impl rule__Line__Group_0__1 ;
    public final void rule__Line__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:572:1: ( rule__Line__Group_0__0__Impl rule__Line__Group_0__1 )
            // InternalEbnfLang.g:573:2: rule__Line__Group_0__0__Impl rule__Line__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Line__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_0__0"


    // $ANTLR start "rule__Line__Group_0__0__Impl"
    // InternalEbnfLang.g:580:1: rule__Line__Group_0__0__Impl : ( () ) ;
    public final void rule__Line__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:584:1: ( ( () ) )
            // InternalEbnfLang.g:585:1: ( () )
            {
            // InternalEbnfLang.g:585:1: ( () )
            // InternalEbnfLang.g:586:2: ()
            {
             before(grammarAccess.getLineAccess().getLineAction_0_0()); 
            // InternalEbnfLang.g:587:2: ()
            // InternalEbnfLang.g:587:3: 
            {
            }

             after(grammarAccess.getLineAccess().getLineAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_0__0__Impl"


    // $ANTLR start "rule__Line__Group_0__1"
    // InternalEbnfLang.g:595:1: rule__Line__Group_0__1 : rule__Line__Group_0__1__Impl ;
    public final void rule__Line__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:599:1: ( rule__Line__Group_0__1__Impl )
            // InternalEbnfLang.g:600:2: rule__Line__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_0__1"


    // $ANTLR start "rule__Line__Group_0__1__Impl"
    // InternalEbnfLang.g:606:1: rule__Line__Group_0__1__Impl : ( RULE_EBNF_COMMENT ) ;
    public final void rule__Line__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:610:1: ( ( RULE_EBNF_COMMENT ) )
            // InternalEbnfLang.g:611:1: ( RULE_EBNF_COMMENT )
            {
            // InternalEbnfLang.g:611:1: ( RULE_EBNF_COMMENT )
            // InternalEbnfLang.g:612:2: RULE_EBNF_COMMENT
            {
             before(grammarAccess.getLineAccess().getEBNF_COMMENTTerminalRuleCall_0_1()); 
            match(input,RULE_EBNF_COMMENT,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getEBNF_COMMENTTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group_0__1__Impl"


    // $ANTLR start "rule__ProductionRule__Group__0"
    // InternalEbnfLang.g:622:1: rule__ProductionRule__Group__0 : rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1 ;
    public final void rule__ProductionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:626:1: ( rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1 )
            // InternalEbnfLang.g:627:2: rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProductionRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__0"


    // $ANTLR start "rule__ProductionRule__Group__0__Impl"
    // InternalEbnfLang.g:634:1: rule__ProductionRule__Group__0__Impl : ( () ) ;
    public final void rule__ProductionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:638:1: ( ( () ) )
            // InternalEbnfLang.g:639:1: ( () )
            {
            // InternalEbnfLang.g:639:1: ( () )
            // InternalEbnfLang.g:640:2: ()
            {
             before(grammarAccess.getProductionRuleAccess().getProductionRuleAction_0()); 
            // InternalEbnfLang.g:641:2: ()
            // InternalEbnfLang.g:641:3: 
            {
            }

             after(grammarAccess.getProductionRuleAccess().getProductionRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__0__Impl"


    // $ANTLR start "rule__ProductionRule__Group__1"
    // InternalEbnfLang.g:649:1: rule__ProductionRule__Group__1 : rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2 ;
    public final void rule__ProductionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:653:1: ( rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2 )
            // InternalEbnfLang.g:654:2: rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ProductionRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__1"


    // $ANTLR start "rule__ProductionRule__Group__1__Impl"
    // InternalEbnfLang.g:661:1: rule__ProductionRule__Group__1__Impl : ( ( rule__ProductionRule__NameAssignment_1 ) ) ;
    public final void rule__ProductionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:665:1: ( ( ( rule__ProductionRule__NameAssignment_1 ) ) )
            // InternalEbnfLang.g:666:1: ( ( rule__ProductionRule__NameAssignment_1 ) )
            {
            // InternalEbnfLang.g:666:1: ( ( rule__ProductionRule__NameAssignment_1 ) )
            // InternalEbnfLang.g:667:2: ( rule__ProductionRule__NameAssignment_1 )
            {
             before(grammarAccess.getProductionRuleAccess().getNameAssignment_1()); 
            // InternalEbnfLang.g:668:2: ( rule__ProductionRule__NameAssignment_1 )
            // InternalEbnfLang.g:668:3: rule__ProductionRule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProductionRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__1__Impl"


    // $ANTLR start "rule__ProductionRule__Group__2"
    // InternalEbnfLang.g:676:1: rule__ProductionRule__Group__2 : rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3 ;
    public final void rule__ProductionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:680:1: ( rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3 )
            // InternalEbnfLang.g:681:2: rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ProductionRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__2"


    // $ANTLR start "rule__ProductionRule__Group__2__Impl"
    // InternalEbnfLang.g:688:1: rule__ProductionRule__Group__2__Impl : ( '=' ) ;
    public final void rule__ProductionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:692:1: ( ( '=' ) )
            // InternalEbnfLang.g:693:1: ( '=' )
            {
            // InternalEbnfLang.g:693:1: ( '=' )
            // InternalEbnfLang.g:694:2: '='
            {
             before(grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__2__Impl"


    // $ANTLR start "rule__ProductionRule__Group__3"
    // InternalEbnfLang.g:703:1: rule__ProductionRule__Group__3 : rule__ProductionRule__Group__3__Impl rule__ProductionRule__Group__4 ;
    public final void rule__ProductionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:707:1: ( rule__ProductionRule__Group__3__Impl rule__ProductionRule__Group__4 )
            // InternalEbnfLang.g:708:2: rule__ProductionRule__Group__3__Impl rule__ProductionRule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ProductionRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__3"


    // $ANTLR start "rule__ProductionRule__Group__3__Impl"
    // InternalEbnfLang.g:715:1: rule__ProductionRule__Group__3__Impl : ( ( rule__ProductionRule__ExprAssignment_3 ) ) ;
    public final void rule__ProductionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:719:1: ( ( ( rule__ProductionRule__ExprAssignment_3 ) ) )
            // InternalEbnfLang.g:720:1: ( ( rule__ProductionRule__ExprAssignment_3 ) )
            {
            // InternalEbnfLang.g:720:1: ( ( rule__ProductionRule__ExprAssignment_3 ) )
            // InternalEbnfLang.g:721:2: ( rule__ProductionRule__ExprAssignment_3 )
            {
             before(grammarAccess.getProductionRuleAccess().getExprAssignment_3()); 
            // InternalEbnfLang.g:722:2: ( rule__ProductionRule__ExprAssignment_3 )
            // InternalEbnfLang.g:722:3: rule__ProductionRule__ExprAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProductionRuleAccess().getExprAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__3__Impl"


    // $ANTLR start "rule__ProductionRule__Group__4"
    // InternalEbnfLang.g:730:1: rule__ProductionRule__Group__4 : rule__ProductionRule__Group__4__Impl ;
    public final void rule__ProductionRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:734:1: ( rule__ProductionRule__Group__4__Impl )
            // InternalEbnfLang.g:735:2: rule__ProductionRule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__4"


    // $ANTLR start "rule__ProductionRule__Group__4__Impl"
    // InternalEbnfLang.g:741:1: rule__ProductionRule__Group__4__Impl : ( ';' ) ;
    public final void rule__ProductionRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:745:1: ( ( ';' ) )
            // InternalEbnfLang.g:746:1: ( ';' )
            {
            // InternalEbnfLang.g:746:1: ( ';' )
            // InternalEbnfLang.g:747:2: ';'
            {
             before(grammarAccess.getProductionRuleAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__Group__4__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group__0"
    // InternalEbnfLang.g:757:1: rule__Expression_Alternative__Group__0 : rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1 ;
    public final void rule__Expression_Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:761:1: ( rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1 )
            // InternalEbnfLang.g:762:2: rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression_Alternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group__0"


    // $ANTLR start "rule__Expression_Alternative__Group__0__Impl"
    // InternalEbnfLang.g:769:1: rule__Expression_Alternative__Group__0__Impl : ( ruleExpression_Concatenation ) ;
    public final void rule__Expression_Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:773:1: ( ( ruleExpression_Concatenation ) )
            // InternalEbnfLang.g:774:1: ( ruleExpression_Concatenation )
            {
            // InternalEbnfLang.g:774:1: ( ruleExpression_Concatenation )
            // InternalEbnfLang.g:775:2: ruleExpression_Concatenation
            {
             before(grammarAccess.getExpression_AlternativeAccess().getExpression_ConcatenationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Concatenation();

            state._fsp--;

             after(grammarAccess.getExpression_AlternativeAccess().getExpression_ConcatenationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group__0__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group__1"
    // InternalEbnfLang.g:784:1: rule__Expression_Alternative__Group__1 : rule__Expression_Alternative__Group__1__Impl ;
    public final void rule__Expression_Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:788:1: ( rule__Expression_Alternative__Group__1__Impl )
            // InternalEbnfLang.g:789:2: rule__Expression_Alternative__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group__1"


    // $ANTLR start "rule__Expression_Alternative__Group__1__Impl"
    // InternalEbnfLang.g:795:1: rule__Expression_Alternative__Group__1__Impl : ( ( rule__Expression_Alternative__Group_1__0 )? ) ;
    public final void rule__Expression_Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:799:1: ( ( ( rule__Expression_Alternative__Group_1__0 )? ) )
            // InternalEbnfLang.g:800:1: ( ( rule__Expression_Alternative__Group_1__0 )? )
            {
            // InternalEbnfLang.g:800:1: ( ( rule__Expression_Alternative__Group_1__0 )? )
            // InternalEbnfLang.g:801:2: ( rule__Expression_Alternative__Group_1__0 )?
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1()); 
            // InternalEbnfLang.g:802:2: ( rule__Expression_Alternative__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEbnfLang.g:802:3: rule__Expression_Alternative__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression_Alternative__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpression_AlternativeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group__1__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group_1__0"
    // InternalEbnfLang.g:811:1: rule__Expression_Alternative__Group_1__0 : rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1 ;
    public final void rule__Expression_Alternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:815:1: ( rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1 )
            // InternalEbnfLang.g:816:2: rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression_Alternative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1__0"


    // $ANTLR start "rule__Expression_Alternative__Group_1__0__Impl"
    // InternalEbnfLang.g:823:1: rule__Expression_Alternative__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Alternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:827:1: ( ( () ) )
            // InternalEbnfLang.g:828:1: ( () )
            {
            // InternalEbnfLang.g:828:1: ( () )
            // InternalEbnfLang.g:829:2: ()
            {
             before(grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0()); 
            // InternalEbnfLang.g:830:2: ()
            // InternalEbnfLang.g:830:3: 
            {
            }

             after(grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group_1__1"
    // InternalEbnfLang.g:838:1: rule__Expression_Alternative__Group_1__1 : rule__Expression_Alternative__Group_1__1__Impl ;
    public final void rule__Expression_Alternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:842:1: ( rule__Expression_Alternative__Group_1__1__Impl )
            // InternalEbnfLang.g:843:2: rule__Expression_Alternative__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1__1"


    // $ANTLR start "rule__Expression_Alternative__Group_1__1__Impl"
    // InternalEbnfLang.g:849:1: rule__Expression_Alternative__Group_1__1__Impl : ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) ) ;
    public final void rule__Expression_Alternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:853:1: ( ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) ) )
            // InternalEbnfLang.g:854:1: ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) )
            {
            // InternalEbnfLang.g:854:1: ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) )
            // InternalEbnfLang.g:855:2: ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* )
            {
            // InternalEbnfLang.g:855:2: ( ( rule__Expression_Alternative__Group_1_1__0 ) )
            // InternalEbnfLang.g:856:3: ( rule__Expression_Alternative__Group_1_1__0 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:857:3: ( rule__Expression_Alternative__Group_1_1__0 )
            // InternalEbnfLang.g:857:4: rule__Expression_Alternative__Group_1_1__0
            {
            pushFollow(FOLLOW_10);
            rule__Expression_Alternative__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 

            }

            // InternalEbnfLang.g:860:2: ( ( rule__Expression_Alternative__Group_1_1__0 )* )
            // InternalEbnfLang.g:861:3: ( rule__Expression_Alternative__Group_1_1__0 )*
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:862:3: ( rule__Expression_Alternative__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEbnfLang.g:862:4: rule__Expression_Alternative__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Expression_Alternative__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1__1__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group_1_1__0"
    // InternalEbnfLang.g:872:1: rule__Expression_Alternative__Group_1_1__0 : rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1 ;
    public final void rule__Expression_Alternative__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:876:1: ( rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1 )
            // InternalEbnfLang.g:877:2: rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression_Alternative__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1_1__0"


    // $ANTLR start "rule__Expression_Alternative__Group_1_1__0__Impl"
    // InternalEbnfLang.g:884:1: rule__Expression_Alternative__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__Expression_Alternative__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:888:1: ( ( '|' ) )
            // InternalEbnfLang.g:889:1: ( '|' )
            {
            // InternalEbnfLang.g:889:1: ( '|' )
            // InternalEbnfLang.g:890:2: '|'
            {
             before(grammarAccess.getExpression_AlternativeAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpression_AlternativeAccess().getVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression_Alternative__Group_1_1__1"
    // InternalEbnfLang.g:899:1: rule__Expression_Alternative__Group_1_1__1 : rule__Expression_Alternative__Group_1_1__1__Impl ;
    public final void rule__Expression_Alternative__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:903:1: ( rule__Expression_Alternative__Group_1_1__1__Impl )
            // InternalEbnfLang.g:904:2: rule__Expression_Alternative__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1_1__1"


    // $ANTLR start "rule__Expression_Alternative__Group_1_1__1__Impl"
    // InternalEbnfLang.g:910:1: rule__Expression_Alternative__Group_1_1__1__Impl : ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Expression_Alternative__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:914:1: ( ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) ) )
            // InternalEbnfLang.g:915:1: ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) )
            {
            // InternalEbnfLang.g:915:1: ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) )
            // InternalEbnfLang.g:916:2: ( rule__Expression_Alternative__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getElementsAssignment_1_1_1()); 
            // InternalEbnfLang.g:917:2: ( rule__Expression_Alternative__ElementsAssignment_1_1_1 )
            // InternalEbnfLang.g:917:3: rule__Expression_Alternative__ElementsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Alternative__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_AlternativeAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group__0"
    // InternalEbnfLang.g:926:1: rule__Expression_Concatenation__Group__0 : rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1 ;
    public final void rule__Expression_Concatenation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:930:1: ( rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1 )
            // InternalEbnfLang.g:931:2: rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Expression_Concatenation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group__0"


    // $ANTLR start "rule__Expression_Concatenation__Group__0__Impl"
    // InternalEbnfLang.g:938:1: rule__Expression_Concatenation__Group__0__Impl : ( ruleExpression_Exception ) ;
    public final void rule__Expression_Concatenation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:942:1: ( ( ruleExpression_Exception ) )
            // InternalEbnfLang.g:943:1: ( ruleExpression_Exception )
            {
            // InternalEbnfLang.g:943:1: ( ruleExpression_Exception )
            // InternalEbnfLang.g:944:2: ruleExpression_Exception
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getExpression_ExceptionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Exception();

            state._fsp--;

             after(grammarAccess.getExpression_ConcatenationAccess().getExpression_ExceptionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group__0__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group__1"
    // InternalEbnfLang.g:953:1: rule__Expression_Concatenation__Group__1 : rule__Expression_Concatenation__Group__1__Impl ;
    public final void rule__Expression_Concatenation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:957:1: ( rule__Expression_Concatenation__Group__1__Impl )
            // InternalEbnfLang.g:958:2: rule__Expression_Concatenation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group__1"


    // $ANTLR start "rule__Expression_Concatenation__Group__1__Impl"
    // InternalEbnfLang.g:964:1: rule__Expression_Concatenation__Group__1__Impl : ( ( rule__Expression_Concatenation__Group_1__0 )? ) ;
    public final void rule__Expression_Concatenation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:968:1: ( ( ( rule__Expression_Concatenation__Group_1__0 )? ) )
            // InternalEbnfLang.g:969:1: ( ( rule__Expression_Concatenation__Group_1__0 )? )
            {
            // InternalEbnfLang.g:969:1: ( ( rule__Expression_Concatenation__Group_1__0 )? )
            // InternalEbnfLang.g:970:2: ( rule__Expression_Concatenation__Group_1__0 )?
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1()); 
            // InternalEbnfLang.g:971:2: ( rule__Expression_Concatenation__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEbnfLang.g:971:3: rule__Expression_Concatenation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression_Concatenation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group__1__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group_1__0"
    // InternalEbnfLang.g:980:1: rule__Expression_Concatenation__Group_1__0 : rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1 ;
    public final void rule__Expression_Concatenation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:984:1: ( rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1 )
            // InternalEbnfLang.g:985:2: rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Expression_Concatenation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1__0"


    // $ANTLR start "rule__Expression_Concatenation__Group_1__0__Impl"
    // InternalEbnfLang.g:992:1: rule__Expression_Concatenation__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Concatenation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:996:1: ( ( () ) )
            // InternalEbnfLang.g:997:1: ( () )
            {
            // InternalEbnfLang.g:997:1: ( () )
            // InternalEbnfLang.g:998:2: ()
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0()); 
            // InternalEbnfLang.g:999:2: ()
            // InternalEbnfLang.g:999:3: 
            {
            }

             after(grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group_1__1"
    // InternalEbnfLang.g:1007:1: rule__Expression_Concatenation__Group_1__1 : rule__Expression_Concatenation__Group_1__1__Impl ;
    public final void rule__Expression_Concatenation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1011:1: ( rule__Expression_Concatenation__Group_1__1__Impl )
            // InternalEbnfLang.g:1012:2: rule__Expression_Concatenation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1__1"


    // $ANTLR start "rule__Expression_Concatenation__Group_1__1__Impl"
    // InternalEbnfLang.g:1018:1: rule__Expression_Concatenation__Group_1__1__Impl : ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) ) ;
    public final void rule__Expression_Concatenation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1022:1: ( ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) ) )
            // InternalEbnfLang.g:1023:1: ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) )
            {
            // InternalEbnfLang.g:1023:1: ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) )
            // InternalEbnfLang.g:1024:2: ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* )
            {
            // InternalEbnfLang.g:1024:2: ( ( rule__Expression_Concatenation__Group_1_1__0 ) )
            // InternalEbnfLang.g:1025:3: ( rule__Expression_Concatenation__Group_1_1__0 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:1026:3: ( rule__Expression_Concatenation__Group_1_1__0 )
            // InternalEbnfLang.g:1026:4: rule__Expression_Concatenation__Group_1_1__0
            {
            pushFollow(FOLLOW_12);
            rule__Expression_Concatenation__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 

            }

            // InternalEbnfLang.g:1029:2: ( ( rule__Expression_Concatenation__Group_1_1__0 )* )
            // InternalEbnfLang.g:1030:3: ( rule__Expression_Concatenation__Group_1_1__0 )*
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:1031:3: ( rule__Expression_Concatenation__Group_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEbnfLang.g:1031:4: rule__Expression_Concatenation__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Expression_Concatenation__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1__1__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group_1_1__0"
    // InternalEbnfLang.g:1041:1: rule__Expression_Concatenation__Group_1_1__0 : rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1 ;
    public final void rule__Expression_Concatenation__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1045:1: ( rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1 )
            // InternalEbnfLang.g:1046:2: rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression_Concatenation__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1_1__0"


    // $ANTLR start "rule__Expression_Concatenation__Group_1_1__0__Impl"
    // InternalEbnfLang.g:1053:1: rule__Expression_Concatenation__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_Concatenation__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1057:1: ( ( ',' ) )
            // InternalEbnfLang.g:1058:1: ( ',' )
            {
            // InternalEbnfLang.g:1058:1: ( ',' )
            // InternalEbnfLang.g:1059:2: ','
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getCommaKeyword_1_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpression_ConcatenationAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1_1__0__Impl"


    // $ANTLR start "rule__Expression_Concatenation__Group_1_1__1"
    // InternalEbnfLang.g:1068:1: rule__Expression_Concatenation__Group_1_1__1 : rule__Expression_Concatenation__Group_1_1__1__Impl ;
    public final void rule__Expression_Concatenation__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1072:1: ( rule__Expression_Concatenation__Group_1_1__1__Impl )
            // InternalEbnfLang.g:1073:2: rule__Expression_Concatenation__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1_1__1"


    // $ANTLR start "rule__Expression_Concatenation__Group_1_1__1__Impl"
    // InternalEbnfLang.g:1079:1: rule__Expression_Concatenation__Group_1_1__1__Impl : ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Expression_Concatenation__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1083:1: ( ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) ) )
            // InternalEbnfLang.g:1084:1: ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) )
            {
            // InternalEbnfLang.g:1084:1: ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) )
            // InternalEbnfLang.g:1085:2: ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getElementsAssignment_1_1_1()); 
            // InternalEbnfLang.g:1086:2: ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 )
            // InternalEbnfLang.g:1086:3: rule__Expression_Concatenation__ElementsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Concatenation__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ConcatenationAccess().getElementsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__Group_1_1__1__Impl"


    // $ANTLR start "rule__Expression_Exception__Group__0"
    // InternalEbnfLang.g:1095:1: rule__Expression_Exception__Group__0 : rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1 ;
    public final void rule__Expression_Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1099:1: ( rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1 )
            // InternalEbnfLang.g:1100:2: rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression_Exception__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group__0"


    // $ANTLR start "rule__Expression_Exception__Group__0__Impl"
    // InternalEbnfLang.g:1107:1: rule__Expression_Exception__Group__0__Impl : ( ruleExpression_Repetition ) ;
    public final void rule__Expression_Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1111:1: ( ( ruleExpression_Repetition ) )
            // InternalEbnfLang.g:1112:1: ( ruleExpression_Repetition )
            {
            // InternalEbnfLang.g:1112:1: ( ruleExpression_Repetition )
            // InternalEbnfLang.g:1113:2: ruleExpression_Repetition
            {
             before(grammarAccess.getExpression_ExceptionAccess().getExpression_RepetitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Repetition();

            state._fsp--;

             after(grammarAccess.getExpression_ExceptionAccess().getExpression_RepetitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group__0__Impl"


    // $ANTLR start "rule__Expression_Exception__Group__1"
    // InternalEbnfLang.g:1122:1: rule__Expression_Exception__Group__1 : rule__Expression_Exception__Group__1__Impl ;
    public final void rule__Expression_Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1126:1: ( rule__Expression_Exception__Group__1__Impl )
            // InternalEbnfLang.g:1127:2: rule__Expression_Exception__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group__1"


    // $ANTLR start "rule__Expression_Exception__Group__1__Impl"
    // InternalEbnfLang.g:1133:1: rule__Expression_Exception__Group__1__Impl : ( ( rule__Expression_Exception__Group_1__0 )* ) ;
    public final void rule__Expression_Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1137:1: ( ( ( rule__Expression_Exception__Group_1__0 )* ) )
            // InternalEbnfLang.g:1138:1: ( ( rule__Expression_Exception__Group_1__0 )* )
            {
            // InternalEbnfLang.g:1138:1: ( ( rule__Expression_Exception__Group_1__0 )* )
            // InternalEbnfLang.g:1139:2: ( rule__Expression_Exception__Group_1__0 )*
            {
             before(grammarAccess.getExpression_ExceptionAccess().getGroup_1()); 
            // InternalEbnfLang.g:1140:2: ( rule__Expression_Exception__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEbnfLang.g:1140:3: rule__Expression_Exception__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Expression_Exception__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getExpression_ExceptionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group__1__Impl"


    // $ANTLR start "rule__Expression_Exception__Group_1__0"
    // InternalEbnfLang.g:1149:1: rule__Expression_Exception__Group_1__0 : rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1 ;
    public final void rule__Expression_Exception__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1153:1: ( rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1 )
            // InternalEbnfLang.g:1154:2: rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Expression_Exception__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__0"


    // $ANTLR start "rule__Expression_Exception__Group_1__0__Impl"
    // InternalEbnfLang.g:1161:1: rule__Expression_Exception__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Exception__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1165:1: ( ( () ) )
            // InternalEbnfLang.g:1166:1: ( () )
            {
            // InternalEbnfLang.g:1166:1: ( () )
            // InternalEbnfLang.g:1167:2: ()
            {
             before(grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0()); 
            // InternalEbnfLang.g:1168:2: ()
            // InternalEbnfLang.g:1168:3: 
            {
            }

             after(grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_Exception__Group_1__1"
    // InternalEbnfLang.g:1176:1: rule__Expression_Exception__Group_1__1 : rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2 ;
    public final void rule__Expression_Exception__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1180:1: ( rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2 )
            // InternalEbnfLang.g:1181:2: rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression_Exception__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__1"


    // $ANTLR start "rule__Expression_Exception__Group_1__1__Impl"
    // InternalEbnfLang.g:1188:1: rule__Expression_Exception__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Expression_Exception__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1192:1: ( ( '-' ) )
            // InternalEbnfLang.g:1193:1: ( '-' )
            {
            // InternalEbnfLang.g:1193:1: ( '-' )
            // InternalEbnfLang.g:1194:2: '-'
            {
             before(grammarAccess.getExpression_ExceptionAccess().getHyphenMinusKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpression_ExceptionAccess().getHyphenMinusKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__1__Impl"


    // $ANTLR start "rule__Expression_Exception__Group_1__2"
    // InternalEbnfLang.g:1203:1: rule__Expression_Exception__Group_1__2 : rule__Expression_Exception__Group_1__2__Impl ;
    public final void rule__Expression_Exception__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1207:1: ( rule__Expression_Exception__Group_1__2__Impl )
            // InternalEbnfLang.g:1208:2: rule__Expression_Exception__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Exception__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__2"


    // $ANTLR start "rule__Expression_Exception__Group_1__2__Impl"
    // InternalEbnfLang.g:1214:1: rule__Expression_Exception__Group_1__2__Impl : ( ( rule__Expression_Exception__RightAssignment_1_2 ) ) ;
    public final void rule__Expression_Exception__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1218:1: ( ( ( rule__Expression_Exception__RightAssignment_1_2 ) ) )
            // InternalEbnfLang.g:1219:1: ( ( rule__Expression_Exception__RightAssignment_1_2 ) )
            {
            // InternalEbnfLang.g:1219:1: ( ( rule__Expression_Exception__RightAssignment_1_2 ) )
            // InternalEbnfLang.g:1220:2: ( rule__Expression_Exception__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression_ExceptionAccess().getRightAssignment_1_2()); 
            // InternalEbnfLang.g:1221:2: ( rule__Expression_Exception__RightAssignment_1_2 )
            // InternalEbnfLang.g:1221:3: rule__Expression_Exception__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Exception__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ExceptionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__Group_1__2__Impl"


    // $ANTLR start "rule__Expression_Repetition__Group_1__0"
    // InternalEbnfLang.g:1230:1: rule__Expression_Repetition__Group_1__0 : rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1 ;
    public final void rule__Expression_Repetition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1234:1: ( rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1 )
            // InternalEbnfLang.g:1235:2: rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression_Repetition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__0"


    // $ANTLR start "rule__Expression_Repetition__Group_1__0__Impl"
    // InternalEbnfLang.g:1242:1: rule__Expression_Repetition__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Repetition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1246:1: ( ( () ) )
            // InternalEbnfLang.g:1247:1: ( () )
            {
            // InternalEbnfLang.g:1247:1: ( () )
            // InternalEbnfLang.g:1248:2: ()
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0()); 
            // InternalEbnfLang.g:1249:2: ()
            // InternalEbnfLang.g:1249:3: 
            {
            }

             after(grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__0__Impl"


    // $ANTLR start "rule__Expression_Repetition__Group_1__1"
    // InternalEbnfLang.g:1257:1: rule__Expression_Repetition__Group_1__1 : rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2 ;
    public final void rule__Expression_Repetition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1261:1: ( rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2 )
            // InternalEbnfLang.g:1262:2: rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Expression_Repetition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__1"


    // $ANTLR start "rule__Expression_Repetition__Group_1__1__Impl"
    // InternalEbnfLang.g:1269:1: rule__Expression_Repetition__Group_1__1__Impl : ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) ) ;
    public final void rule__Expression_Repetition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1273:1: ( ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) ) )
            // InternalEbnfLang.g:1274:1: ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) )
            {
            // InternalEbnfLang.g:1274:1: ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) )
            // InternalEbnfLang.g:1275:2: ( rule__Expression_Repetition__RepetitionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getRepetitionsAssignment_1_1()); 
            // InternalEbnfLang.g:1276:2: ( rule__Expression_Repetition__RepetitionsAssignment_1_1 )
            // InternalEbnfLang.g:1276:3: rule__Expression_Repetition__RepetitionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__RepetitionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_RepetitionAccess().getRepetitionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__1__Impl"


    // $ANTLR start "rule__Expression_Repetition__Group_1__2"
    // InternalEbnfLang.g:1284:1: rule__Expression_Repetition__Group_1__2 : rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3 ;
    public final void rule__Expression_Repetition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1288:1: ( rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3 )
            // InternalEbnfLang.g:1289:2: rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3
            {
            pushFollow(FOLLOW_16);
            rule__Expression_Repetition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__2"


    // $ANTLR start "rule__Expression_Repetition__Group_1__2__Impl"
    // InternalEbnfLang.g:1296:1: rule__Expression_Repetition__Group_1__2__Impl : ( '*' ) ;
    public final void rule__Expression_Repetition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1300:1: ( ( '*' ) )
            // InternalEbnfLang.g:1301:1: ( '*' )
            {
            // InternalEbnfLang.g:1301:1: ( '*' )
            // InternalEbnfLang.g:1302:2: '*'
            {
             before(grammarAccess.getExpression_RepetitionAccess().getAsteriskKeyword_1_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpression_RepetitionAccess().getAsteriskKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__2__Impl"


    // $ANTLR start "rule__Expression_Repetition__Group_1__3"
    // InternalEbnfLang.g:1311:1: rule__Expression_Repetition__Group_1__3 : rule__Expression_Repetition__Group_1__3__Impl ;
    public final void rule__Expression_Repetition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1315:1: ( rule__Expression_Repetition__Group_1__3__Impl )
            // InternalEbnfLang.g:1316:2: rule__Expression_Repetition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__3"


    // $ANTLR start "rule__Expression_Repetition__Group_1__3__Impl"
    // InternalEbnfLang.g:1322:1: rule__Expression_Repetition__Group_1__3__Impl : ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) ) ;
    public final void rule__Expression_Repetition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1326:1: ( ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) ) )
            // InternalEbnfLang.g:1327:1: ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) )
            {
            // InternalEbnfLang.g:1327:1: ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) )
            // InternalEbnfLang.g:1328:2: ( rule__Expression_Repetition__ExprAssignment_1_3 )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExprAssignment_1_3()); 
            // InternalEbnfLang.g:1329:2: ( rule__Expression_Repetition__ExprAssignment_1_3 )
            // InternalEbnfLang.g:1329:3: rule__Expression_Repetition__ExprAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition__ExprAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getExpression_RepetitionAccess().getExprAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__Group_1__3__Impl"


    // $ANTLR start "rule__Expression_Rule_Reference__Group__0"
    // InternalEbnfLang.g:1338:1: rule__Expression_Rule_Reference__Group__0 : rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1 ;
    public final void rule__Expression_Rule_Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1342:1: ( rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1 )
            // InternalEbnfLang.g:1343:2: rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Expression_Rule_Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Rule_Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__Group__0"


    // $ANTLR start "rule__Expression_Rule_Reference__Group__0__Impl"
    // InternalEbnfLang.g:1350:1: rule__Expression_Rule_Reference__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Rule_Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1354:1: ( ( () ) )
            // InternalEbnfLang.g:1355:1: ( () )
            {
            // InternalEbnfLang.g:1355:1: ( () )
            // InternalEbnfLang.g:1356:2: ()
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0()); 
            // InternalEbnfLang.g:1357:2: ()
            // InternalEbnfLang.g:1357:3: 
            {
            }

             after(grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__Group__0__Impl"


    // $ANTLR start "rule__Expression_Rule_Reference__Group__1"
    // InternalEbnfLang.g:1365:1: rule__Expression_Rule_Reference__Group__1 : rule__Expression_Rule_Reference__Group__1__Impl ;
    public final void rule__Expression_Rule_Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1369:1: ( rule__Expression_Rule_Reference__Group__1__Impl )
            // InternalEbnfLang.g:1370:2: rule__Expression_Rule_Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Rule_Reference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__Group__1"


    // $ANTLR start "rule__Expression_Rule_Reference__Group__1__Impl"
    // InternalEbnfLang.g:1376:1: rule__Expression_Rule_Reference__Group__1__Impl : ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) ) ;
    public final void rule__Expression_Rule_Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1380:1: ( ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) ) )
            // InternalEbnfLang.g:1381:1: ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) )
            {
            // InternalEbnfLang.g:1381:1: ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) )
            // InternalEbnfLang.g:1382:2: ( rule__Expression_Rule_Reference__RuleAssignment_1 )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleAssignment_1()); 
            // InternalEbnfLang.g:1383:2: ( rule__Expression_Rule_Reference__RuleAssignment_1 )
            // InternalEbnfLang.g:1383:3: rule__Expression_Rule_Reference__RuleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Rule_Reference__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__Group__1__Impl"


    // $ANTLR start "rule__Expression_Special_Sequence__Group__0"
    // InternalEbnfLang.g:1392:1: rule__Expression_Special_Sequence__Group__0 : rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1 ;
    public final void rule__Expression_Special_Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1396:1: ( rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1 )
            // InternalEbnfLang.g:1397:2: rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Expression_Special_Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Special_Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__Group__0"


    // $ANTLR start "rule__Expression_Special_Sequence__Group__0__Impl"
    // InternalEbnfLang.g:1404:1: rule__Expression_Special_Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Special_Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1408:1: ( ( () ) )
            // InternalEbnfLang.g:1409:1: ( () )
            {
            // InternalEbnfLang.g:1409:1: ( () )
            // InternalEbnfLang.g:1410:2: ()
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0()); 
            // InternalEbnfLang.g:1411:2: ()
            // InternalEbnfLang.g:1411:3: 
            {
            }

             after(grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__Group__0__Impl"


    // $ANTLR start "rule__Expression_Special_Sequence__Group__1"
    // InternalEbnfLang.g:1419:1: rule__Expression_Special_Sequence__Group__1 : rule__Expression_Special_Sequence__Group__1__Impl ;
    public final void rule__Expression_Special_Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1423:1: ( rule__Expression_Special_Sequence__Group__1__Impl )
            // InternalEbnfLang.g:1424:2: rule__Expression_Special_Sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Special_Sequence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__Group__1"


    // $ANTLR start "rule__Expression_Special_Sequence__Group__1__Impl"
    // InternalEbnfLang.g:1430:1: rule__Expression_Special_Sequence__Group__1__Impl : ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) ) ;
    public final void rule__Expression_Special_Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1434:1: ( ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) ) )
            // InternalEbnfLang.g:1435:1: ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) )
            {
            // InternalEbnfLang.g:1435:1: ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) )
            // InternalEbnfLang.g:1436:2: ( rule__Expression_Special_Sequence__TextAssignment_1 )
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getTextAssignment_1()); 
            // InternalEbnfLang.g:1437:2: ( rule__Expression_Special_Sequence__TextAssignment_1 )
            // InternalEbnfLang.g:1437:3: rule__Expression_Special_Sequence__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Special_Sequence__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Special_SequenceAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__Group__1__Impl"


    // $ANTLR start "rule__Expression_Terminal_Symbol__Group__0"
    // InternalEbnfLang.g:1446:1: rule__Expression_Terminal_Symbol__Group__0 : rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1 ;
    public final void rule__Expression_Terminal_Symbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1450:1: ( rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1 )
            // InternalEbnfLang.g:1451:2: rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Expression_Terminal_Symbol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Terminal_Symbol__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__Group__0"


    // $ANTLR start "rule__Expression_Terminal_Symbol__Group__0__Impl"
    // InternalEbnfLang.g:1458:1: rule__Expression_Terminal_Symbol__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Terminal_Symbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1462:1: ( ( () ) )
            // InternalEbnfLang.g:1463:1: ( () )
            {
            // InternalEbnfLang.g:1463:1: ( () )
            // InternalEbnfLang.g:1464:2: ()
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0()); 
            // InternalEbnfLang.g:1465:2: ()
            // InternalEbnfLang.g:1465:3: 
            {
            }

             after(grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__Group__0__Impl"


    // $ANTLR start "rule__Expression_Terminal_Symbol__Group__1"
    // InternalEbnfLang.g:1473:1: rule__Expression_Terminal_Symbol__Group__1 : rule__Expression_Terminal_Symbol__Group__1__Impl ;
    public final void rule__Expression_Terminal_Symbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1477:1: ( rule__Expression_Terminal_Symbol__Group__1__Impl )
            // InternalEbnfLang.g:1478:2: rule__Expression_Terminal_Symbol__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Terminal_Symbol__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__Group__1"


    // $ANTLR start "rule__Expression_Terminal_Symbol__Group__1__Impl"
    // InternalEbnfLang.g:1484:1: rule__Expression_Terminal_Symbol__Group__1__Impl : ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) ) ;
    public final void rule__Expression_Terminal_Symbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1488:1: ( ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) ) )
            // InternalEbnfLang.g:1489:1: ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) )
            {
            // InternalEbnfLang.g:1489:1: ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) )
            // InternalEbnfLang.g:1490:2: ( rule__Expression_Terminal_Symbol__TextAssignment_1 )
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getTextAssignment_1()); 
            // InternalEbnfLang.g:1491:2: ( rule__Expression_Terminal_Symbol__TextAssignment_1 )
            // InternalEbnfLang.g:1491:3: rule__Expression_Terminal_Symbol__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Terminal_Symbol__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Terminal_SymbolAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__Group__1__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__0"
    // InternalEbnfLang.g:1500:1: rule__Expression_Repetition_Group__Group__0 : rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1 ;
    public final void rule__Expression_Repetition_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1504:1: ( rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1 )
            // InternalEbnfLang.g:1505:2: rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Expression_Repetition_Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__0"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__0__Impl"
    // InternalEbnfLang.g:1512:1: rule__Expression_Repetition_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Repetition_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1516:1: ( ( () ) )
            // InternalEbnfLang.g:1517:1: ( () )
            {
            // InternalEbnfLang.g:1517:1: ( () )
            // InternalEbnfLang.g:1518:2: ()
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0()); 
            // InternalEbnfLang.g:1519:2: ()
            // InternalEbnfLang.g:1519:3: 
            {
            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__0__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__1"
    // InternalEbnfLang.g:1527:1: rule__Expression_Repetition_Group__Group__1 : rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2 ;
    public final void rule__Expression_Repetition_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1531:1: ( rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2 )
            // InternalEbnfLang.g:1532:2: rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression_Repetition_Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__1"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__1__Impl"
    // InternalEbnfLang.g:1539:1: rule__Expression_Repetition_Group__Group__1__Impl : ( '{' ) ;
    public final void rule__Expression_Repetition_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1543:1: ( ( '{' ) )
            // InternalEbnfLang.g:1544:1: ( '{' )
            {
            // InternalEbnfLang.g:1544:1: ( '{' )
            // InternalEbnfLang.g:1545:2: '{'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpression_Repetition_GroupAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__1__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__2"
    // InternalEbnfLang.g:1554:1: rule__Expression_Repetition_Group__Group__2 : rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3 ;
    public final void rule__Expression_Repetition_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1558:1: ( rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3 )
            // InternalEbnfLang.g:1559:2: rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Expression_Repetition_Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__2"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__2__Impl"
    // InternalEbnfLang.g:1566:1: rule__Expression_Repetition_Group__Group__2__Impl : ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Repetition_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1570:1: ( ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1571:1: ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1571:1: ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1572:2: ( rule__Expression_Repetition_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1573:2: ( rule__Expression_Repetition_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1573:3: rule__Expression_Repetition_Group__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__2__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__3"
    // InternalEbnfLang.g:1581:1: rule__Expression_Repetition_Group__Group__3 : rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4 ;
    public final void rule__Expression_Repetition_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1585:1: ( rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4 )
            // InternalEbnfLang.g:1586:2: rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Expression_Repetition_Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__3"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__3__Impl"
    // InternalEbnfLang.g:1593:1: rule__Expression_Repetition_Group__Group__3__Impl : ( '}' ) ;
    public final void rule__Expression_Repetition_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1597:1: ( ( '}' ) )
            // InternalEbnfLang.g:1598:1: ( '}' )
            {
            // InternalEbnfLang.g:1598:1: ( '}' )
            // InternalEbnfLang.g:1599:2: '}'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpression_Repetition_GroupAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__3__Impl"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__4"
    // InternalEbnfLang.g:1608:1: rule__Expression_Repetition_Group__Group__4 : rule__Expression_Repetition_Group__Group__4__Impl ;
    public final void rule__Expression_Repetition_Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1612:1: ( rule__Expression_Repetition_Group__Group__4__Impl )
            // InternalEbnfLang.g:1613:2: rule__Expression_Repetition_Group__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Repetition_Group__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__4"


    // $ANTLR start "rule__Expression_Repetition_Group__Group__4__Impl"
    // InternalEbnfLang.g:1619:1: rule__Expression_Repetition_Group__Group__4__Impl : ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? ) ;
    public final void rule__Expression_Repetition_Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1623:1: ( ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? ) )
            // InternalEbnfLang.g:1624:1: ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? )
            {
            // InternalEbnfLang.g:1624:1: ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? )
            // InternalEbnfLang.g:1625:2: ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )?
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneAssignment_4()); 
            // InternalEbnfLang.g:1626:2: ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||(LA10_1>=17 && LA10_1<=20)||LA10_1==23||LA10_1==25||LA10_1==27) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalEbnfLang.g:1626:3: rule__Expression_Repetition_Group__AtLeastOneAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression_Repetition_Group__AtLeastOneAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__Group__4__Impl"


    // $ANTLR start "rule__Expression_Optional_Group__Group__0"
    // InternalEbnfLang.g:1635:1: rule__Expression_Optional_Group__Group__0 : rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1 ;
    public final void rule__Expression_Optional_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1639:1: ( rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1 )
            // InternalEbnfLang.g:1640:2: rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Expression_Optional_Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__0"


    // $ANTLR start "rule__Expression_Optional_Group__Group__0__Impl"
    // InternalEbnfLang.g:1647:1: rule__Expression_Optional_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Optional_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1651:1: ( ( () ) )
            // InternalEbnfLang.g:1652:1: ( () )
            {
            // InternalEbnfLang.g:1652:1: ( () )
            // InternalEbnfLang.g:1653:2: ()
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0()); 
            // InternalEbnfLang.g:1654:2: ()
            // InternalEbnfLang.g:1654:3: 
            {
            }

             after(grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__0__Impl"


    // $ANTLR start "rule__Expression_Optional_Group__Group__1"
    // InternalEbnfLang.g:1662:1: rule__Expression_Optional_Group__Group__1 : rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2 ;
    public final void rule__Expression_Optional_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1666:1: ( rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2 )
            // InternalEbnfLang.g:1667:2: rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression_Optional_Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__1"


    // $ANTLR start "rule__Expression_Optional_Group__Group__1__Impl"
    // InternalEbnfLang.g:1674:1: rule__Expression_Optional_Group__Group__1__Impl : ( '[' ) ;
    public final void rule__Expression_Optional_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1678:1: ( ( '[' ) )
            // InternalEbnfLang.g:1679:1: ( '[' )
            {
            // InternalEbnfLang.g:1679:1: ( '[' )
            // InternalEbnfLang.g:1680:2: '['
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getLeftSquareBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpression_Optional_GroupAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__1__Impl"


    // $ANTLR start "rule__Expression_Optional_Group__Group__2"
    // InternalEbnfLang.g:1689:1: rule__Expression_Optional_Group__Group__2 : rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3 ;
    public final void rule__Expression_Optional_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1693:1: ( rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3 )
            // InternalEbnfLang.g:1694:2: rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Expression_Optional_Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__2"


    // $ANTLR start "rule__Expression_Optional_Group__Group__2__Impl"
    // InternalEbnfLang.g:1701:1: rule__Expression_Optional_Group__Group__2__Impl : ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Optional_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1705:1: ( ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1706:1: ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1706:1: ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1707:2: ( rule__Expression_Optional_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1708:2: ( rule__Expression_Optional_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1708:3: rule__Expression_Optional_Group__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression_Optional_GroupAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__2__Impl"


    // $ANTLR start "rule__Expression_Optional_Group__Group__3"
    // InternalEbnfLang.g:1716:1: rule__Expression_Optional_Group__Group__3 : rule__Expression_Optional_Group__Group__3__Impl ;
    public final void rule__Expression_Optional_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1720:1: ( rule__Expression_Optional_Group__Group__3__Impl )
            // InternalEbnfLang.g:1721:2: rule__Expression_Optional_Group__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Optional_Group__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__3"


    // $ANTLR start "rule__Expression_Optional_Group__Group__3__Impl"
    // InternalEbnfLang.g:1727:1: rule__Expression_Optional_Group__Group__3__Impl : ( ']' ) ;
    public final void rule__Expression_Optional_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1731:1: ( ( ']' ) )
            // InternalEbnfLang.g:1732:1: ( ']' )
            {
            // InternalEbnfLang.g:1732:1: ( ']' )
            // InternalEbnfLang.g:1733:2: ']'
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getRightSquareBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getExpression_Optional_GroupAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__Group__3__Impl"


    // $ANTLR start "rule__Expression_Group__Group__0"
    // InternalEbnfLang.g:1743:1: rule__Expression_Group__Group__0 : rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1 ;
    public final void rule__Expression_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1747:1: ( rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1 )
            // InternalEbnfLang.g:1748:2: rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Expression_Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__0"


    // $ANTLR start "rule__Expression_Group__Group__0__Impl"
    // InternalEbnfLang.g:1755:1: rule__Expression_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1759:1: ( ( () ) )
            // InternalEbnfLang.g:1760:1: ( () )
            {
            // InternalEbnfLang.g:1760:1: ( () )
            // InternalEbnfLang.g:1761:2: ()
            {
             before(grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0()); 
            // InternalEbnfLang.g:1762:2: ()
            // InternalEbnfLang.g:1762:3: 
            {
            }

             after(grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__0__Impl"


    // $ANTLR start "rule__Expression_Group__Group__1"
    // InternalEbnfLang.g:1770:1: rule__Expression_Group__Group__1 : rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2 ;
    public final void rule__Expression_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1774:1: ( rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2 )
            // InternalEbnfLang.g:1775:2: rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Expression_Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__1"


    // $ANTLR start "rule__Expression_Group__Group__1__Impl"
    // InternalEbnfLang.g:1782:1: rule__Expression_Group__Group__1__Impl : ( '(' ) ;
    public final void rule__Expression_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1786:1: ( ( '(' ) )
            // InternalEbnfLang.g:1787:1: ( '(' )
            {
            // InternalEbnfLang.g:1787:1: ( '(' )
            // InternalEbnfLang.g:1788:2: '('
            {
             before(grammarAccess.getExpression_GroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getExpression_GroupAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__1__Impl"


    // $ANTLR start "rule__Expression_Group__Group__2"
    // InternalEbnfLang.g:1797:1: rule__Expression_Group__Group__2 : rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3 ;
    public final void rule__Expression_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1801:1: ( rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3 )
            // InternalEbnfLang.g:1802:2: rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Expression_Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__2"


    // $ANTLR start "rule__Expression_Group__Group__2__Impl"
    // InternalEbnfLang.g:1809:1: rule__Expression_Group__Group__2__Impl : ( ( rule__Expression_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1813:1: ( ( ( rule__Expression_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1814:1: ( ( rule__Expression_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1814:1: ( ( rule__Expression_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1815:2: ( rule__Expression_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1816:2: ( rule__Expression_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1816:3: rule__Expression_Group__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Group__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExpression_GroupAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__2__Impl"


    // $ANTLR start "rule__Expression_Group__Group__3"
    // InternalEbnfLang.g:1824:1: rule__Expression_Group__Group__3 : rule__Expression_Group__Group__3__Impl ;
    public final void rule__Expression_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1828:1: ( rule__Expression_Group__Group__3__Impl )
            // InternalEbnfLang.g:1829:2: rule__Expression_Group__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression_Group__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__3"


    // $ANTLR start "rule__Expression_Group__Group__3__Impl"
    // InternalEbnfLang.g:1835:1: rule__Expression_Group__Group__3__Impl : ( ')' ) ;
    public final void rule__Expression_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1839:1: ( ( ')' ) )
            // InternalEbnfLang.g:1840:1: ( ')' )
            {
            // InternalEbnfLang.g:1840:1: ( ')' )
            // InternalEbnfLang.g:1841:2: ')'
            {
             before(grammarAccess.getExpression_GroupAccess().getRightParenthesisKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getExpression_GroupAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__Group__3__Impl"


    // $ANTLR start "rule__EbnfGrammar__LinesAssignment_1"
    // InternalEbnfLang.g:1851:1: rule__EbnfGrammar__LinesAssignment_1 : ( ruleLine ) ;
    public final void rule__EbnfGrammar__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1855:1: ( ( ruleLine ) )
            // InternalEbnfLang.g:1856:2: ( ruleLine )
            {
            // InternalEbnfLang.g:1856:2: ( ruleLine )
            // InternalEbnfLang.g:1857:3: ruleLine
            {
             before(grammarAccess.getEbnfGrammarAccess().getLinesLineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getEbnfGrammarAccess().getLinesLineParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EbnfGrammar__LinesAssignment_1"


    // $ANTLR start "rule__ProductionRule__NameAssignment_1"
    // InternalEbnfLang.g:1866:1: rule__ProductionRule__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__ProductionRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1870:1: ( ( RULE_NAME ) )
            // InternalEbnfLang.g:1871:2: ( RULE_NAME )
            {
            // InternalEbnfLang.g:1871:2: ( RULE_NAME )
            // InternalEbnfLang.g:1872:3: RULE_NAME
            {
             before(grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__NameAssignment_1"


    // $ANTLR start "rule__ProductionRule__ExprAssignment_3"
    // InternalEbnfLang.g:1881:1: rule__ProductionRule__ExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__ProductionRule__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1885:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:1886:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:1886:2: ( ruleExpression )
            // InternalEbnfLang.g:1887:3: ruleExpression
            {
             before(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductionRule__ExprAssignment_3"


    // $ANTLR start "rule__Expression_Alternative__ElementsAssignment_1_1_1"
    // InternalEbnfLang.g:1896:1: rule__Expression_Alternative__ElementsAssignment_1_1_1 : ( ruleExpression_Concatenation ) ;
    public final void rule__Expression_Alternative__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1900:1: ( ( ruleExpression_Concatenation ) )
            // InternalEbnfLang.g:1901:2: ( ruleExpression_Concatenation )
            {
            // InternalEbnfLang.g:1901:2: ( ruleExpression_Concatenation )
            // InternalEbnfLang.g:1902:3: ruleExpression_Concatenation
            {
             before(grammarAccess.getExpression_AlternativeAccess().getElementsExpression_ConcatenationParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Concatenation();

            state._fsp--;

             after(grammarAccess.getExpression_AlternativeAccess().getElementsExpression_ConcatenationParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Alternative__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__Expression_Concatenation__ElementsAssignment_1_1_1"
    // InternalEbnfLang.g:1911:1: rule__Expression_Concatenation__ElementsAssignment_1_1_1 : ( ruleExpression_Exception ) ;
    public final void rule__Expression_Concatenation__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1915:1: ( ( ruleExpression_Exception ) )
            // InternalEbnfLang.g:1916:2: ( ruleExpression_Exception )
            {
            // InternalEbnfLang.g:1916:2: ( ruleExpression_Exception )
            // InternalEbnfLang.g:1917:3: ruleExpression_Exception
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getElementsExpression_ExceptionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Exception();

            state._fsp--;

             after(grammarAccess.getExpression_ConcatenationAccess().getElementsExpression_ExceptionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Concatenation__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__Expression_Exception__RightAssignment_1_2"
    // InternalEbnfLang.g:1926:1: rule__Expression_Exception__RightAssignment_1_2 : ( ruleExpression_Repetition ) ;
    public final void rule__Expression_Exception__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1930:1: ( ( ruleExpression_Repetition ) )
            // InternalEbnfLang.g:1931:2: ( ruleExpression_Repetition )
            {
            // InternalEbnfLang.g:1931:2: ( ruleExpression_Repetition )
            // InternalEbnfLang.g:1932:3: ruleExpression_Repetition
            {
             before(grammarAccess.getExpression_ExceptionAccess().getRightExpression_RepetitionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Repetition();

            state._fsp--;

             after(grammarAccess.getExpression_ExceptionAccess().getRightExpression_RepetitionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Exception__RightAssignment_1_2"


    // $ANTLR start "rule__Expression_Repetition__RepetitionsAssignment_1_1"
    // InternalEbnfLang.g:1941:1: rule__Expression_Repetition__RepetitionsAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Expression_Repetition__RepetitionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1945:1: ( ( RULE_NUMBER ) )
            // InternalEbnfLang.g:1946:2: ( RULE_NUMBER )
            {
            // InternalEbnfLang.g:1946:2: ( RULE_NUMBER )
            // InternalEbnfLang.g:1947:3: RULE_NUMBER
            {
             before(grammarAccess.getExpression_RepetitionAccess().getRepetitionsNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getExpression_RepetitionAccess().getRepetitionsNUMBERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__RepetitionsAssignment_1_1"


    // $ANTLR start "rule__Expression_Repetition__ExprAssignment_1_3"
    // InternalEbnfLang.g:1956:1: rule__Expression_Repetition__ExprAssignment_1_3 : ( ruleExpression_Terminal ) ;
    public final void rule__Expression_Repetition__ExprAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1960:1: ( ( ruleExpression_Terminal ) )
            // InternalEbnfLang.g:1961:2: ( ruleExpression_Terminal )
            {
            // InternalEbnfLang.g:1961:2: ( ruleExpression_Terminal )
            // InternalEbnfLang.g:1962:3: ruleExpression_Terminal
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExprExpression_TerminalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression_Terminal();

            state._fsp--;

             after(grammarAccess.getExpression_RepetitionAccess().getExprExpression_TerminalParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition__ExprAssignment_1_3"


    // $ANTLR start "rule__Expression_Rule_Reference__RuleAssignment_1"
    // InternalEbnfLang.g:1971:1: rule__Expression_Rule_Reference__RuleAssignment_1 : ( ( RULE_NAME ) ) ;
    public final void rule__Expression_Rule_Reference__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1975:1: ( ( ( RULE_NAME ) ) )
            // InternalEbnfLang.g:1976:2: ( ( RULE_NAME ) )
            {
            // InternalEbnfLang.g:1976:2: ( ( RULE_NAME ) )
            // InternalEbnfLang.g:1977:3: ( RULE_NAME )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0()); 
            // InternalEbnfLang.g:1978:3: ( RULE_NAME )
            // InternalEbnfLang.g:1979:4: RULE_NAME
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleNAMETerminalRuleCall_1_0_1()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleNAMETerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Rule_Reference__RuleAssignment_1"


    // $ANTLR start "rule__Expression_Special_Sequence__TextAssignment_1"
    // InternalEbnfLang.g:1990:1: rule__Expression_Special_Sequence__TextAssignment_1 : ( RULE_SPECIAL_SEQUENCE ) ;
    public final void rule__Expression_Special_Sequence__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1994:1: ( ( RULE_SPECIAL_SEQUENCE ) )
            // InternalEbnfLang.g:1995:2: ( RULE_SPECIAL_SEQUENCE )
            {
            // InternalEbnfLang.g:1995:2: ( RULE_SPECIAL_SEQUENCE )
            // InternalEbnfLang.g:1996:3: RULE_SPECIAL_SEQUENCE
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getTextSPECIAL_SEQUENCETerminalRuleCall_1_0()); 
            match(input,RULE_SPECIAL_SEQUENCE,FOLLOW_2); 
             after(grammarAccess.getExpression_Special_SequenceAccess().getTextSPECIAL_SEQUENCETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Special_Sequence__TextAssignment_1"


    // $ANTLR start "rule__Expression_Terminal_Symbol__TextAssignment_1"
    // InternalEbnfLang.g:2005:1: rule__Expression_Terminal_Symbol__TextAssignment_1 : ( RULE_TERMINAL_SYMBOL ) ;
    public final void rule__Expression_Terminal_Symbol__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2009:1: ( ( RULE_TERMINAL_SYMBOL ) )
            // InternalEbnfLang.g:2010:2: ( RULE_TERMINAL_SYMBOL )
            {
            // InternalEbnfLang.g:2010:2: ( RULE_TERMINAL_SYMBOL )
            // InternalEbnfLang.g:2011:3: RULE_TERMINAL_SYMBOL
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getTextTERMINAL_SYMBOLTerminalRuleCall_1_0()); 
            match(input,RULE_TERMINAL_SYMBOL,FOLLOW_2); 
             after(grammarAccess.getExpression_Terminal_SymbolAccess().getTextTERMINAL_SYMBOLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Terminal_Symbol__TextAssignment_1"


    // $ANTLR start "rule__Expression_Repetition_Group__ExprAssignment_2"
    // InternalEbnfLang.g:2020:1: rule__Expression_Repetition_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Repetition_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2024:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:2025:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:2025:2: ( ruleExpression )
            // InternalEbnfLang.g:2026:3: ruleExpression
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression_Repetition_GroupAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__ExprAssignment_2"


    // $ANTLR start "rule__Expression_Repetition_Group__AtLeastOneAssignment_4"
    // InternalEbnfLang.g:2035:1: rule__Expression_Repetition_Group__AtLeastOneAssignment_4 : ( ( '-' ) ) ;
    public final void rule__Expression_Repetition_Group__AtLeastOneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2039:1: ( ( ( '-' ) ) )
            // InternalEbnfLang.g:2040:2: ( ( '-' ) )
            {
            // InternalEbnfLang.g:2040:2: ( ( '-' ) )
            // InternalEbnfLang.g:2041:3: ( '-' )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 
            // InternalEbnfLang.g:2042:3: ( '-' )
            // InternalEbnfLang.g:2043:4: '-'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 

            }

             after(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Repetition_Group__AtLeastOneAssignment_4"


    // $ANTLR start "rule__Expression_Optional_Group__ExprAssignment_2"
    // InternalEbnfLang.g:2054:1: rule__Expression_Optional_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Optional_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2058:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:2059:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:2059:2: ( ruleExpression )
            // InternalEbnfLang.g:2060:3: ruleExpression
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression_Optional_GroupAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Optional_Group__ExprAssignment_2"


    // $ANTLR start "rule__Expression_Group__ExprAssignment_2"
    // InternalEbnfLang.g:2069:1: rule__Expression_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2073:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:2074:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:2074:2: ( ruleExpression )
            // InternalEbnfLang.g:2075:3: ruleExpression
            {
             before(grammarAccess.getExpression_GroupAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpression_GroupAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression_Group__ExprAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000054001E0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000054001A0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});

}