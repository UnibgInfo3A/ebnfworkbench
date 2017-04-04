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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_NUMBER", "RULE_SPECIAL_SEQUENCE", "RULE_TERMINAL_SYMBOL", "RULE_EBNF_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "';'", "'|'", "','", "'-'", "'*'", "'{'", "'}'", "'['", "']'", "'('", "')'"
    };
    public static final int RULE_TERMINAL_SYMBOL=7;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_SPECIAL_SEQUENCE=6;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=14;
    public static final int RULE_EBNF_COMMENT=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_NUMBER=5;
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


    // $ANTLR start "entryRuleCommentEBNF"
    // InternalEbnfLang.g:428:1: entryRuleCommentEBNF : ruleCommentEBNF EOF ;
    public final void entryRuleCommentEBNF() throws RecognitionException {
        try {
            // InternalEbnfLang.g:429:1: ( ruleCommentEBNF EOF )
            // InternalEbnfLang.g:430:1: ruleCommentEBNF EOF
            {
             before(grammarAccess.getCommentEBNFRule()); 
            pushFollow(FOLLOW_1);
            ruleCommentEBNF();

            state._fsp--;

             after(grammarAccess.getCommentEBNFRule()); 
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
    // $ANTLR end "entryRuleCommentEBNF"


    // $ANTLR start "ruleCommentEBNF"
    // InternalEbnfLang.g:437:1: ruleCommentEBNF : ( ( rule__CommentEBNF__ContentCommentAssignment ) ) ;
    public final void ruleCommentEBNF() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:441:2: ( ( ( rule__CommentEBNF__ContentCommentAssignment ) ) )
            // InternalEbnfLang.g:442:2: ( ( rule__CommentEBNF__ContentCommentAssignment ) )
            {
            // InternalEbnfLang.g:442:2: ( ( rule__CommentEBNF__ContentCommentAssignment ) )
            // InternalEbnfLang.g:443:3: ( rule__CommentEBNF__ContentCommentAssignment )
            {
             before(grammarAccess.getCommentEBNFAccess().getContentCommentAssignment()); 
            // InternalEbnfLang.g:444:3: ( rule__CommentEBNF__ContentCommentAssignment )
            // InternalEbnfLang.g:444:4: rule__CommentEBNF__ContentCommentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CommentEBNF__ContentCommentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommentEBNFAccess().getContentCommentAssignment()); 

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
    // $ANTLR end "ruleCommentEBNF"


    // $ANTLR start "rule__Line__Alternatives"
    // InternalEbnfLang.g:452:1: rule__Line__Alternatives : ( ( ruleCommentEBNF ) | ( ruleProductionRule ) );
    public final void rule__Line__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:456:1: ( ( ruleCommentEBNF ) | ( ruleProductionRule ) )
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
                    // InternalEbnfLang.g:457:2: ( ruleCommentEBNF )
                    {
                    // InternalEbnfLang.g:457:2: ( ruleCommentEBNF )
                    // InternalEbnfLang.g:458:3: ruleCommentEBNF
                    {
                     before(grammarAccess.getLineAccess().getCommentEBNFParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommentEBNF();

                    state._fsp--;

                     after(grammarAccess.getLineAccess().getCommentEBNFParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:463:2: ( ruleProductionRule )
                    {
                    // InternalEbnfLang.g:463:2: ( ruleProductionRule )
                    // InternalEbnfLang.g:464:3: ruleProductionRule
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
    // InternalEbnfLang.g:473:1: rule__Expression_Repetition__Alternatives : ( ( ruleExpression_Terminal ) | ( ( rule__Expression_Repetition__Group_1__0 ) ) );
    public final void rule__Expression_Repetition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:477:1: ( ( ruleExpression_Terminal ) | ( ( rule__Expression_Repetition__Group_1__0 ) ) )
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
                    // InternalEbnfLang.g:478:2: ( ruleExpression_Terminal )
                    {
                    // InternalEbnfLang.g:478:2: ( ruleExpression_Terminal )
                    // InternalEbnfLang.g:479:3: ruleExpression_Terminal
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
                    // InternalEbnfLang.g:484:2: ( ( rule__Expression_Repetition__Group_1__0 ) )
                    {
                    // InternalEbnfLang.g:484:2: ( ( rule__Expression_Repetition__Group_1__0 ) )
                    // InternalEbnfLang.g:485:3: ( rule__Expression_Repetition__Group_1__0 )
                    {
                     before(grammarAccess.getExpression_RepetitionAccess().getGroup_1()); 
                    // InternalEbnfLang.g:486:3: ( rule__Expression_Repetition__Group_1__0 )
                    // InternalEbnfLang.g:486:4: rule__Expression_Repetition__Group_1__0
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
    // InternalEbnfLang.g:494:1: rule__Expression_Terminal__Alternatives : ( ( ruleExpression_Rule_Reference ) | ( ruleExpression_Terminal_Symbol ) | ( ruleExpression_Repetition_Group ) | ( ruleExpression_Optional_Group ) | ( ruleExpression_Group ) | ( ruleExpression_Special_Sequence ) );
    public final void rule__Expression_Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:498:1: ( ( ruleExpression_Rule_Reference ) | ( ruleExpression_Terminal_Symbol ) | ( ruleExpression_Repetition_Group ) | ( ruleExpression_Optional_Group ) | ( ruleExpression_Group ) | ( ruleExpression_Special_Sequence ) )
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
                    // InternalEbnfLang.g:499:2: ( ruleExpression_Rule_Reference )
                    {
                    // InternalEbnfLang.g:499:2: ( ruleExpression_Rule_Reference )
                    // InternalEbnfLang.g:500:3: ruleExpression_Rule_Reference
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
                    // InternalEbnfLang.g:505:2: ( ruleExpression_Terminal_Symbol )
                    {
                    // InternalEbnfLang.g:505:2: ( ruleExpression_Terminal_Symbol )
                    // InternalEbnfLang.g:506:3: ruleExpression_Terminal_Symbol
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
                    // InternalEbnfLang.g:511:2: ( ruleExpression_Repetition_Group )
                    {
                    // InternalEbnfLang.g:511:2: ( ruleExpression_Repetition_Group )
                    // InternalEbnfLang.g:512:3: ruleExpression_Repetition_Group
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
                    // InternalEbnfLang.g:517:2: ( ruleExpression_Optional_Group )
                    {
                    // InternalEbnfLang.g:517:2: ( ruleExpression_Optional_Group )
                    // InternalEbnfLang.g:518:3: ruleExpression_Optional_Group
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
                    // InternalEbnfLang.g:523:2: ( ruleExpression_Group )
                    {
                    // InternalEbnfLang.g:523:2: ( ruleExpression_Group )
                    // InternalEbnfLang.g:524:3: ruleExpression_Group
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
                    // InternalEbnfLang.g:529:2: ( ruleExpression_Special_Sequence )
                    {
                    // InternalEbnfLang.g:529:2: ( ruleExpression_Special_Sequence )
                    // InternalEbnfLang.g:530:3: ruleExpression_Special_Sequence
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
    // InternalEbnfLang.g:539:1: rule__EbnfGrammar__Group__0 : rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1 ;
    public final void rule__EbnfGrammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:543:1: ( rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1 )
            // InternalEbnfLang.g:544:2: rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1
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
    // InternalEbnfLang.g:551:1: rule__EbnfGrammar__Group__0__Impl : ( () ) ;
    public final void rule__EbnfGrammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:555:1: ( ( () ) )
            // InternalEbnfLang.g:556:1: ( () )
            {
            // InternalEbnfLang.g:556:1: ( () )
            // InternalEbnfLang.g:557:2: ()
            {
             before(grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0()); 
            // InternalEbnfLang.g:558:2: ()
            // InternalEbnfLang.g:558:3: 
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
    // InternalEbnfLang.g:566:1: rule__EbnfGrammar__Group__1 : rule__EbnfGrammar__Group__1__Impl ;
    public final void rule__EbnfGrammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:570:1: ( rule__EbnfGrammar__Group__1__Impl )
            // InternalEbnfLang.g:571:2: rule__EbnfGrammar__Group__1__Impl
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
    // InternalEbnfLang.g:577:1: rule__EbnfGrammar__Group__1__Impl : ( ( rule__EbnfGrammar__LinesAssignment_1 )* ) ;
    public final void rule__EbnfGrammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:581:1: ( ( ( rule__EbnfGrammar__LinesAssignment_1 )* ) )
            // InternalEbnfLang.g:582:1: ( ( rule__EbnfGrammar__LinesAssignment_1 )* )
            {
            // InternalEbnfLang.g:582:1: ( ( rule__EbnfGrammar__LinesAssignment_1 )* )
            // InternalEbnfLang.g:583:2: ( rule__EbnfGrammar__LinesAssignment_1 )*
            {
             before(grammarAccess.getEbnfGrammarAccess().getLinesAssignment_1()); 
            // InternalEbnfLang.g:584:2: ( rule__EbnfGrammar__LinesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_NAME||LA4_0==RULE_EBNF_COMMENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEbnfLang.g:584:3: rule__EbnfGrammar__LinesAssignment_1
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


    // $ANTLR start "rule__ProductionRule__Group__0"
    // InternalEbnfLang.g:593:1: rule__ProductionRule__Group__0 : rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1 ;
    public final void rule__ProductionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:597:1: ( rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1 )
            // InternalEbnfLang.g:598:2: rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1
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
    // InternalEbnfLang.g:605:1: rule__ProductionRule__Group__0__Impl : ( () ) ;
    public final void rule__ProductionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:609:1: ( ( () ) )
            // InternalEbnfLang.g:610:1: ( () )
            {
            // InternalEbnfLang.g:610:1: ( () )
            // InternalEbnfLang.g:611:2: ()
            {
             before(grammarAccess.getProductionRuleAccess().getProductionRuleAction_0()); 
            // InternalEbnfLang.g:612:2: ()
            // InternalEbnfLang.g:612:3: 
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
    // InternalEbnfLang.g:620:1: rule__ProductionRule__Group__1 : rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2 ;
    public final void rule__ProductionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:624:1: ( rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2 )
            // InternalEbnfLang.g:625:2: rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalEbnfLang.g:632:1: rule__ProductionRule__Group__1__Impl : ( ( rule__ProductionRule__NameAssignment_1 ) ) ;
    public final void rule__ProductionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:636:1: ( ( ( rule__ProductionRule__NameAssignment_1 ) ) )
            // InternalEbnfLang.g:637:1: ( ( rule__ProductionRule__NameAssignment_1 ) )
            {
            // InternalEbnfLang.g:637:1: ( ( rule__ProductionRule__NameAssignment_1 ) )
            // InternalEbnfLang.g:638:2: ( rule__ProductionRule__NameAssignment_1 )
            {
             before(grammarAccess.getProductionRuleAccess().getNameAssignment_1()); 
            // InternalEbnfLang.g:639:2: ( rule__ProductionRule__NameAssignment_1 )
            // InternalEbnfLang.g:639:3: rule__ProductionRule__NameAssignment_1
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
    // InternalEbnfLang.g:647:1: rule__ProductionRule__Group__2 : rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3 ;
    public final void rule__ProductionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:651:1: ( rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3 )
            // InternalEbnfLang.g:652:2: rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalEbnfLang.g:659:1: rule__ProductionRule__Group__2__Impl : ( '=' ) ;
    public final void rule__ProductionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:663:1: ( ( '=' ) )
            // InternalEbnfLang.g:664:1: ( '=' )
            {
            // InternalEbnfLang.g:664:1: ( '=' )
            // InternalEbnfLang.g:665:2: '='
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
    // InternalEbnfLang.g:674:1: rule__ProductionRule__Group__3 : rule__ProductionRule__Group__3__Impl rule__ProductionRule__Group__4 ;
    public final void rule__ProductionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:678:1: ( rule__ProductionRule__Group__3__Impl rule__ProductionRule__Group__4 )
            // InternalEbnfLang.g:679:2: rule__ProductionRule__Group__3__Impl rule__ProductionRule__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalEbnfLang.g:686:1: rule__ProductionRule__Group__3__Impl : ( ( rule__ProductionRule__ExprAssignment_3 ) ) ;
    public final void rule__ProductionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:690:1: ( ( ( rule__ProductionRule__ExprAssignment_3 ) ) )
            // InternalEbnfLang.g:691:1: ( ( rule__ProductionRule__ExprAssignment_3 ) )
            {
            // InternalEbnfLang.g:691:1: ( ( rule__ProductionRule__ExprAssignment_3 ) )
            // InternalEbnfLang.g:692:2: ( rule__ProductionRule__ExprAssignment_3 )
            {
             before(grammarAccess.getProductionRuleAccess().getExprAssignment_3()); 
            // InternalEbnfLang.g:693:2: ( rule__ProductionRule__ExprAssignment_3 )
            // InternalEbnfLang.g:693:3: rule__ProductionRule__ExprAssignment_3
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
    // InternalEbnfLang.g:701:1: rule__ProductionRule__Group__4 : rule__ProductionRule__Group__4__Impl ;
    public final void rule__ProductionRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:705:1: ( rule__ProductionRule__Group__4__Impl )
            // InternalEbnfLang.g:706:2: rule__ProductionRule__Group__4__Impl
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
    // InternalEbnfLang.g:712:1: rule__ProductionRule__Group__4__Impl : ( ';' ) ;
    public final void rule__ProductionRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:716:1: ( ( ';' ) )
            // InternalEbnfLang.g:717:1: ( ';' )
            {
            // InternalEbnfLang.g:717:1: ( ';' )
            // InternalEbnfLang.g:718:2: ';'
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
    // InternalEbnfLang.g:728:1: rule__Expression_Alternative__Group__0 : rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1 ;
    public final void rule__Expression_Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:732:1: ( rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1 )
            // InternalEbnfLang.g:733:2: rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalEbnfLang.g:740:1: rule__Expression_Alternative__Group__0__Impl : ( ruleExpression_Concatenation ) ;
    public final void rule__Expression_Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:744:1: ( ( ruleExpression_Concatenation ) )
            // InternalEbnfLang.g:745:1: ( ruleExpression_Concatenation )
            {
            // InternalEbnfLang.g:745:1: ( ruleExpression_Concatenation )
            // InternalEbnfLang.g:746:2: ruleExpression_Concatenation
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
    // InternalEbnfLang.g:755:1: rule__Expression_Alternative__Group__1 : rule__Expression_Alternative__Group__1__Impl ;
    public final void rule__Expression_Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:759:1: ( rule__Expression_Alternative__Group__1__Impl )
            // InternalEbnfLang.g:760:2: rule__Expression_Alternative__Group__1__Impl
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
    // InternalEbnfLang.g:766:1: rule__Expression_Alternative__Group__1__Impl : ( ( rule__Expression_Alternative__Group_1__0 )? ) ;
    public final void rule__Expression_Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:770:1: ( ( ( rule__Expression_Alternative__Group_1__0 )? ) )
            // InternalEbnfLang.g:771:1: ( ( rule__Expression_Alternative__Group_1__0 )? )
            {
            // InternalEbnfLang.g:771:1: ( ( rule__Expression_Alternative__Group_1__0 )? )
            // InternalEbnfLang.g:772:2: ( rule__Expression_Alternative__Group_1__0 )?
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1()); 
            // InternalEbnfLang.g:773:2: ( rule__Expression_Alternative__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEbnfLang.g:773:3: rule__Expression_Alternative__Group_1__0
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
    // InternalEbnfLang.g:782:1: rule__Expression_Alternative__Group_1__0 : rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1 ;
    public final void rule__Expression_Alternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:786:1: ( rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1 )
            // InternalEbnfLang.g:787:2: rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalEbnfLang.g:794:1: rule__Expression_Alternative__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Alternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:798:1: ( ( () ) )
            // InternalEbnfLang.g:799:1: ( () )
            {
            // InternalEbnfLang.g:799:1: ( () )
            // InternalEbnfLang.g:800:2: ()
            {
             before(grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0()); 
            // InternalEbnfLang.g:801:2: ()
            // InternalEbnfLang.g:801:3: 
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
    // InternalEbnfLang.g:809:1: rule__Expression_Alternative__Group_1__1 : rule__Expression_Alternative__Group_1__1__Impl ;
    public final void rule__Expression_Alternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:813:1: ( rule__Expression_Alternative__Group_1__1__Impl )
            // InternalEbnfLang.g:814:2: rule__Expression_Alternative__Group_1__1__Impl
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
    // InternalEbnfLang.g:820:1: rule__Expression_Alternative__Group_1__1__Impl : ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) ) ;
    public final void rule__Expression_Alternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:824:1: ( ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) ) )
            // InternalEbnfLang.g:825:1: ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) )
            {
            // InternalEbnfLang.g:825:1: ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) )
            // InternalEbnfLang.g:826:2: ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* )
            {
            // InternalEbnfLang.g:826:2: ( ( rule__Expression_Alternative__Group_1_1__0 ) )
            // InternalEbnfLang.g:827:3: ( rule__Expression_Alternative__Group_1_1__0 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:828:3: ( rule__Expression_Alternative__Group_1_1__0 )
            // InternalEbnfLang.g:828:4: rule__Expression_Alternative__Group_1_1__0
            {
            pushFollow(FOLLOW_9);
            rule__Expression_Alternative__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 

            }

            // InternalEbnfLang.g:831:2: ( ( rule__Expression_Alternative__Group_1_1__0 )* )
            // InternalEbnfLang.g:832:3: ( rule__Expression_Alternative__Group_1_1__0 )*
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:833:3: ( rule__Expression_Alternative__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEbnfLang.g:833:4: rule__Expression_Alternative__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalEbnfLang.g:843:1: rule__Expression_Alternative__Group_1_1__0 : rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1 ;
    public final void rule__Expression_Alternative__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:847:1: ( rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1 )
            // InternalEbnfLang.g:848:2: rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalEbnfLang.g:855:1: rule__Expression_Alternative__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__Expression_Alternative__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:859:1: ( ( '|' ) )
            // InternalEbnfLang.g:860:1: ( '|' )
            {
            // InternalEbnfLang.g:860:1: ( '|' )
            // InternalEbnfLang.g:861:2: '|'
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
    // InternalEbnfLang.g:870:1: rule__Expression_Alternative__Group_1_1__1 : rule__Expression_Alternative__Group_1_1__1__Impl ;
    public final void rule__Expression_Alternative__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:874:1: ( rule__Expression_Alternative__Group_1_1__1__Impl )
            // InternalEbnfLang.g:875:2: rule__Expression_Alternative__Group_1_1__1__Impl
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
    // InternalEbnfLang.g:881:1: rule__Expression_Alternative__Group_1_1__1__Impl : ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Expression_Alternative__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:885:1: ( ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) ) )
            // InternalEbnfLang.g:886:1: ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) )
            {
            // InternalEbnfLang.g:886:1: ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) )
            // InternalEbnfLang.g:887:2: ( rule__Expression_Alternative__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getElementsAssignment_1_1_1()); 
            // InternalEbnfLang.g:888:2: ( rule__Expression_Alternative__ElementsAssignment_1_1_1 )
            // InternalEbnfLang.g:888:3: rule__Expression_Alternative__ElementsAssignment_1_1_1
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
    // InternalEbnfLang.g:897:1: rule__Expression_Concatenation__Group__0 : rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1 ;
    public final void rule__Expression_Concatenation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:901:1: ( rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1 )
            // InternalEbnfLang.g:902:2: rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalEbnfLang.g:909:1: rule__Expression_Concatenation__Group__0__Impl : ( ruleExpression_Exception ) ;
    public final void rule__Expression_Concatenation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:913:1: ( ( ruleExpression_Exception ) )
            // InternalEbnfLang.g:914:1: ( ruleExpression_Exception )
            {
            // InternalEbnfLang.g:914:1: ( ruleExpression_Exception )
            // InternalEbnfLang.g:915:2: ruleExpression_Exception
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
    // InternalEbnfLang.g:924:1: rule__Expression_Concatenation__Group__1 : rule__Expression_Concatenation__Group__1__Impl ;
    public final void rule__Expression_Concatenation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:928:1: ( rule__Expression_Concatenation__Group__1__Impl )
            // InternalEbnfLang.g:929:2: rule__Expression_Concatenation__Group__1__Impl
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
    // InternalEbnfLang.g:935:1: rule__Expression_Concatenation__Group__1__Impl : ( ( rule__Expression_Concatenation__Group_1__0 )? ) ;
    public final void rule__Expression_Concatenation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:939:1: ( ( ( rule__Expression_Concatenation__Group_1__0 )? ) )
            // InternalEbnfLang.g:940:1: ( ( rule__Expression_Concatenation__Group_1__0 )? )
            {
            // InternalEbnfLang.g:940:1: ( ( rule__Expression_Concatenation__Group_1__0 )? )
            // InternalEbnfLang.g:941:2: ( rule__Expression_Concatenation__Group_1__0 )?
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1()); 
            // InternalEbnfLang.g:942:2: ( rule__Expression_Concatenation__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEbnfLang.g:942:3: rule__Expression_Concatenation__Group_1__0
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
    // InternalEbnfLang.g:951:1: rule__Expression_Concatenation__Group_1__0 : rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1 ;
    public final void rule__Expression_Concatenation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:955:1: ( rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1 )
            // InternalEbnfLang.g:956:2: rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalEbnfLang.g:963:1: rule__Expression_Concatenation__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Concatenation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:967:1: ( ( () ) )
            // InternalEbnfLang.g:968:1: ( () )
            {
            // InternalEbnfLang.g:968:1: ( () )
            // InternalEbnfLang.g:969:2: ()
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0()); 
            // InternalEbnfLang.g:970:2: ()
            // InternalEbnfLang.g:970:3: 
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
    // InternalEbnfLang.g:978:1: rule__Expression_Concatenation__Group_1__1 : rule__Expression_Concatenation__Group_1__1__Impl ;
    public final void rule__Expression_Concatenation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:982:1: ( rule__Expression_Concatenation__Group_1__1__Impl )
            // InternalEbnfLang.g:983:2: rule__Expression_Concatenation__Group_1__1__Impl
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
    // InternalEbnfLang.g:989:1: rule__Expression_Concatenation__Group_1__1__Impl : ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) ) ;
    public final void rule__Expression_Concatenation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:993:1: ( ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) ) )
            // InternalEbnfLang.g:994:1: ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) )
            {
            // InternalEbnfLang.g:994:1: ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) )
            // InternalEbnfLang.g:995:2: ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* )
            {
            // InternalEbnfLang.g:995:2: ( ( rule__Expression_Concatenation__Group_1_1__0 ) )
            // InternalEbnfLang.g:996:3: ( rule__Expression_Concatenation__Group_1_1__0 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:997:3: ( rule__Expression_Concatenation__Group_1_1__0 )
            // InternalEbnfLang.g:997:4: rule__Expression_Concatenation__Group_1_1__0
            {
            pushFollow(FOLLOW_11);
            rule__Expression_Concatenation__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 

            }

            // InternalEbnfLang.g:1000:2: ( ( rule__Expression_Concatenation__Group_1_1__0 )* )
            // InternalEbnfLang.g:1001:3: ( rule__Expression_Concatenation__Group_1_1__0 )*
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:1002:3: ( rule__Expression_Concatenation__Group_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEbnfLang.g:1002:4: rule__Expression_Concatenation__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalEbnfLang.g:1012:1: rule__Expression_Concatenation__Group_1_1__0 : rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1 ;
    public final void rule__Expression_Concatenation__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1016:1: ( rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1 )
            // InternalEbnfLang.g:1017:2: rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalEbnfLang.g:1024:1: rule__Expression_Concatenation__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_Concatenation__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1028:1: ( ( ',' ) )
            // InternalEbnfLang.g:1029:1: ( ',' )
            {
            // InternalEbnfLang.g:1029:1: ( ',' )
            // InternalEbnfLang.g:1030:2: ','
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
    // InternalEbnfLang.g:1039:1: rule__Expression_Concatenation__Group_1_1__1 : rule__Expression_Concatenation__Group_1_1__1__Impl ;
    public final void rule__Expression_Concatenation__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1043:1: ( rule__Expression_Concatenation__Group_1_1__1__Impl )
            // InternalEbnfLang.g:1044:2: rule__Expression_Concatenation__Group_1_1__1__Impl
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
    // InternalEbnfLang.g:1050:1: rule__Expression_Concatenation__Group_1_1__1__Impl : ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Expression_Concatenation__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1054:1: ( ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) ) )
            // InternalEbnfLang.g:1055:1: ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) )
            {
            // InternalEbnfLang.g:1055:1: ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) )
            // InternalEbnfLang.g:1056:2: ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getElementsAssignment_1_1_1()); 
            // InternalEbnfLang.g:1057:2: ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 )
            // InternalEbnfLang.g:1057:3: rule__Expression_Concatenation__ElementsAssignment_1_1_1
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
    // InternalEbnfLang.g:1066:1: rule__Expression_Exception__Group__0 : rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1 ;
    public final void rule__Expression_Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1070:1: ( rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1 )
            // InternalEbnfLang.g:1071:2: rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalEbnfLang.g:1078:1: rule__Expression_Exception__Group__0__Impl : ( ruleExpression_Repetition ) ;
    public final void rule__Expression_Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1082:1: ( ( ruleExpression_Repetition ) )
            // InternalEbnfLang.g:1083:1: ( ruleExpression_Repetition )
            {
            // InternalEbnfLang.g:1083:1: ( ruleExpression_Repetition )
            // InternalEbnfLang.g:1084:2: ruleExpression_Repetition
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
    // InternalEbnfLang.g:1093:1: rule__Expression_Exception__Group__1 : rule__Expression_Exception__Group__1__Impl ;
    public final void rule__Expression_Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1097:1: ( rule__Expression_Exception__Group__1__Impl )
            // InternalEbnfLang.g:1098:2: rule__Expression_Exception__Group__1__Impl
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
    // InternalEbnfLang.g:1104:1: rule__Expression_Exception__Group__1__Impl : ( ( rule__Expression_Exception__Group_1__0 )* ) ;
    public final void rule__Expression_Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1108:1: ( ( ( rule__Expression_Exception__Group_1__0 )* ) )
            // InternalEbnfLang.g:1109:1: ( ( rule__Expression_Exception__Group_1__0 )* )
            {
            // InternalEbnfLang.g:1109:1: ( ( rule__Expression_Exception__Group_1__0 )* )
            // InternalEbnfLang.g:1110:2: ( rule__Expression_Exception__Group_1__0 )*
            {
             before(grammarAccess.getExpression_ExceptionAccess().getGroup_1()); 
            // InternalEbnfLang.g:1111:2: ( rule__Expression_Exception__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEbnfLang.g:1111:3: rule__Expression_Exception__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
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
    // InternalEbnfLang.g:1120:1: rule__Expression_Exception__Group_1__0 : rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1 ;
    public final void rule__Expression_Exception__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1124:1: ( rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1 )
            // InternalEbnfLang.g:1125:2: rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalEbnfLang.g:1132:1: rule__Expression_Exception__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Exception__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1136:1: ( ( () ) )
            // InternalEbnfLang.g:1137:1: ( () )
            {
            // InternalEbnfLang.g:1137:1: ( () )
            // InternalEbnfLang.g:1138:2: ()
            {
             before(grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0()); 
            // InternalEbnfLang.g:1139:2: ()
            // InternalEbnfLang.g:1139:3: 
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
    // InternalEbnfLang.g:1147:1: rule__Expression_Exception__Group_1__1 : rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2 ;
    public final void rule__Expression_Exception__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1151:1: ( rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2 )
            // InternalEbnfLang.g:1152:2: rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalEbnfLang.g:1159:1: rule__Expression_Exception__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Expression_Exception__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1163:1: ( ( '-' ) )
            // InternalEbnfLang.g:1164:1: ( '-' )
            {
            // InternalEbnfLang.g:1164:1: ( '-' )
            // InternalEbnfLang.g:1165:2: '-'
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
    // InternalEbnfLang.g:1174:1: rule__Expression_Exception__Group_1__2 : rule__Expression_Exception__Group_1__2__Impl ;
    public final void rule__Expression_Exception__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1178:1: ( rule__Expression_Exception__Group_1__2__Impl )
            // InternalEbnfLang.g:1179:2: rule__Expression_Exception__Group_1__2__Impl
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
    // InternalEbnfLang.g:1185:1: rule__Expression_Exception__Group_1__2__Impl : ( ( rule__Expression_Exception__RightAssignment_1_2 ) ) ;
    public final void rule__Expression_Exception__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1189:1: ( ( ( rule__Expression_Exception__RightAssignment_1_2 ) ) )
            // InternalEbnfLang.g:1190:1: ( ( rule__Expression_Exception__RightAssignment_1_2 ) )
            {
            // InternalEbnfLang.g:1190:1: ( ( rule__Expression_Exception__RightAssignment_1_2 ) )
            // InternalEbnfLang.g:1191:2: ( rule__Expression_Exception__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression_ExceptionAccess().getRightAssignment_1_2()); 
            // InternalEbnfLang.g:1192:2: ( rule__Expression_Exception__RightAssignment_1_2 )
            // InternalEbnfLang.g:1192:3: rule__Expression_Exception__RightAssignment_1_2
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
    // InternalEbnfLang.g:1201:1: rule__Expression_Repetition__Group_1__0 : rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1 ;
    public final void rule__Expression_Repetition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1205:1: ( rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1 )
            // InternalEbnfLang.g:1206:2: rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalEbnfLang.g:1213:1: rule__Expression_Repetition__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Repetition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1217:1: ( ( () ) )
            // InternalEbnfLang.g:1218:1: ( () )
            {
            // InternalEbnfLang.g:1218:1: ( () )
            // InternalEbnfLang.g:1219:2: ()
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0()); 
            // InternalEbnfLang.g:1220:2: ()
            // InternalEbnfLang.g:1220:3: 
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
    // InternalEbnfLang.g:1228:1: rule__Expression_Repetition__Group_1__1 : rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2 ;
    public final void rule__Expression_Repetition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1232:1: ( rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2 )
            // InternalEbnfLang.g:1233:2: rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalEbnfLang.g:1240:1: rule__Expression_Repetition__Group_1__1__Impl : ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) ) ;
    public final void rule__Expression_Repetition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1244:1: ( ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) ) )
            // InternalEbnfLang.g:1245:1: ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) )
            {
            // InternalEbnfLang.g:1245:1: ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) )
            // InternalEbnfLang.g:1246:2: ( rule__Expression_Repetition__RepetitionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getRepetitionsAssignment_1_1()); 
            // InternalEbnfLang.g:1247:2: ( rule__Expression_Repetition__RepetitionsAssignment_1_1 )
            // InternalEbnfLang.g:1247:3: rule__Expression_Repetition__RepetitionsAssignment_1_1
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
    // InternalEbnfLang.g:1255:1: rule__Expression_Repetition__Group_1__2 : rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3 ;
    public final void rule__Expression_Repetition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1259:1: ( rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3 )
            // InternalEbnfLang.g:1260:2: rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalEbnfLang.g:1267:1: rule__Expression_Repetition__Group_1__2__Impl : ( '*' ) ;
    public final void rule__Expression_Repetition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1271:1: ( ( '*' ) )
            // InternalEbnfLang.g:1272:1: ( '*' )
            {
            // InternalEbnfLang.g:1272:1: ( '*' )
            // InternalEbnfLang.g:1273:2: '*'
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
    // InternalEbnfLang.g:1282:1: rule__Expression_Repetition__Group_1__3 : rule__Expression_Repetition__Group_1__3__Impl ;
    public final void rule__Expression_Repetition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1286:1: ( rule__Expression_Repetition__Group_1__3__Impl )
            // InternalEbnfLang.g:1287:2: rule__Expression_Repetition__Group_1__3__Impl
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
    // InternalEbnfLang.g:1293:1: rule__Expression_Repetition__Group_1__3__Impl : ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) ) ;
    public final void rule__Expression_Repetition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1297:1: ( ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) ) )
            // InternalEbnfLang.g:1298:1: ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) )
            {
            // InternalEbnfLang.g:1298:1: ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) )
            // InternalEbnfLang.g:1299:2: ( rule__Expression_Repetition__ExprAssignment_1_3 )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExprAssignment_1_3()); 
            // InternalEbnfLang.g:1300:2: ( rule__Expression_Repetition__ExprAssignment_1_3 )
            // InternalEbnfLang.g:1300:3: rule__Expression_Repetition__ExprAssignment_1_3
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
    // InternalEbnfLang.g:1309:1: rule__Expression_Rule_Reference__Group__0 : rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1 ;
    public final void rule__Expression_Rule_Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1313:1: ( rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1 )
            // InternalEbnfLang.g:1314:2: rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalEbnfLang.g:1321:1: rule__Expression_Rule_Reference__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Rule_Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1325:1: ( ( () ) )
            // InternalEbnfLang.g:1326:1: ( () )
            {
            // InternalEbnfLang.g:1326:1: ( () )
            // InternalEbnfLang.g:1327:2: ()
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0()); 
            // InternalEbnfLang.g:1328:2: ()
            // InternalEbnfLang.g:1328:3: 
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
    // InternalEbnfLang.g:1336:1: rule__Expression_Rule_Reference__Group__1 : rule__Expression_Rule_Reference__Group__1__Impl ;
    public final void rule__Expression_Rule_Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1340:1: ( rule__Expression_Rule_Reference__Group__1__Impl )
            // InternalEbnfLang.g:1341:2: rule__Expression_Rule_Reference__Group__1__Impl
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
    // InternalEbnfLang.g:1347:1: rule__Expression_Rule_Reference__Group__1__Impl : ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) ) ;
    public final void rule__Expression_Rule_Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1351:1: ( ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) ) )
            // InternalEbnfLang.g:1352:1: ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) )
            {
            // InternalEbnfLang.g:1352:1: ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) )
            // InternalEbnfLang.g:1353:2: ( rule__Expression_Rule_Reference__RuleAssignment_1 )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleAssignment_1()); 
            // InternalEbnfLang.g:1354:2: ( rule__Expression_Rule_Reference__RuleAssignment_1 )
            // InternalEbnfLang.g:1354:3: rule__Expression_Rule_Reference__RuleAssignment_1
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
    // InternalEbnfLang.g:1363:1: rule__Expression_Special_Sequence__Group__0 : rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1 ;
    public final void rule__Expression_Special_Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1367:1: ( rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1 )
            // InternalEbnfLang.g:1368:2: rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalEbnfLang.g:1375:1: rule__Expression_Special_Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Special_Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1379:1: ( ( () ) )
            // InternalEbnfLang.g:1380:1: ( () )
            {
            // InternalEbnfLang.g:1380:1: ( () )
            // InternalEbnfLang.g:1381:2: ()
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0()); 
            // InternalEbnfLang.g:1382:2: ()
            // InternalEbnfLang.g:1382:3: 
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
    // InternalEbnfLang.g:1390:1: rule__Expression_Special_Sequence__Group__1 : rule__Expression_Special_Sequence__Group__1__Impl ;
    public final void rule__Expression_Special_Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1394:1: ( rule__Expression_Special_Sequence__Group__1__Impl )
            // InternalEbnfLang.g:1395:2: rule__Expression_Special_Sequence__Group__1__Impl
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
    // InternalEbnfLang.g:1401:1: rule__Expression_Special_Sequence__Group__1__Impl : ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) ) ;
    public final void rule__Expression_Special_Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1405:1: ( ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) ) )
            // InternalEbnfLang.g:1406:1: ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) )
            {
            // InternalEbnfLang.g:1406:1: ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) )
            // InternalEbnfLang.g:1407:2: ( rule__Expression_Special_Sequence__TextAssignment_1 )
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getTextAssignment_1()); 
            // InternalEbnfLang.g:1408:2: ( rule__Expression_Special_Sequence__TextAssignment_1 )
            // InternalEbnfLang.g:1408:3: rule__Expression_Special_Sequence__TextAssignment_1
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
    // InternalEbnfLang.g:1417:1: rule__Expression_Terminal_Symbol__Group__0 : rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1 ;
    public final void rule__Expression_Terminal_Symbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1421:1: ( rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1 )
            // InternalEbnfLang.g:1422:2: rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalEbnfLang.g:1429:1: rule__Expression_Terminal_Symbol__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Terminal_Symbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1433:1: ( ( () ) )
            // InternalEbnfLang.g:1434:1: ( () )
            {
            // InternalEbnfLang.g:1434:1: ( () )
            // InternalEbnfLang.g:1435:2: ()
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0()); 
            // InternalEbnfLang.g:1436:2: ()
            // InternalEbnfLang.g:1436:3: 
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
    // InternalEbnfLang.g:1444:1: rule__Expression_Terminal_Symbol__Group__1 : rule__Expression_Terminal_Symbol__Group__1__Impl ;
    public final void rule__Expression_Terminal_Symbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1448:1: ( rule__Expression_Terminal_Symbol__Group__1__Impl )
            // InternalEbnfLang.g:1449:2: rule__Expression_Terminal_Symbol__Group__1__Impl
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
    // InternalEbnfLang.g:1455:1: rule__Expression_Terminal_Symbol__Group__1__Impl : ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) ) ;
    public final void rule__Expression_Terminal_Symbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1459:1: ( ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) ) )
            // InternalEbnfLang.g:1460:1: ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) )
            {
            // InternalEbnfLang.g:1460:1: ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) )
            // InternalEbnfLang.g:1461:2: ( rule__Expression_Terminal_Symbol__TextAssignment_1 )
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getTextAssignment_1()); 
            // InternalEbnfLang.g:1462:2: ( rule__Expression_Terminal_Symbol__TextAssignment_1 )
            // InternalEbnfLang.g:1462:3: rule__Expression_Terminal_Symbol__TextAssignment_1
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
    // InternalEbnfLang.g:1471:1: rule__Expression_Repetition_Group__Group__0 : rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1 ;
    public final void rule__Expression_Repetition_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1475:1: ( rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1 )
            // InternalEbnfLang.g:1476:2: rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalEbnfLang.g:1483:1: rule__Expression_Repetition_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Repetition_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1487:1: ( ( () ) )
            // InternalEbnfLang.g:1488:1: ( () )
            {
            // InternalEbnfLang.g:1488:1: ( () )
            // InternalEbnfLang.g:1489:2: ()
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0()); 
            // InternalEbnfLang.g:1490:2: ()
            // InternalEbnfLang.g:1490:3: 
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
    // InternalEbnfLang.g:1498:1: rule__Expression_Repetition_Group__Group__1 : rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2 ;
    public final void rule__Expression_Repetition_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1502:1: ( rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2 )
            // InternalEbnfLang.g:1503:2: rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalEbnfLang.g:1510:1: rule__Expression_Repetition_Group__Group__1__Impl : ( '{' ) ;
    public final void rule__Expression_Repetition_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1514:1: ( ( '{' ) )
            // InternalEbnfLang.g:1515:1: ( '{' )
            {
            // InternalEbnfLang.g:1515:1: ( '{' )
            // InternalEbnfLang.g:1516:2: '{'
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
    // InternalEbnfLang.g:1525:1: rule__Expression_Repetition_Group__Group__2 : rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3 ;
    public final void rule__Expression_Repetition_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1529:1: ( rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3 )
            // InternalEbnfLang.g:1530:2: rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalEbnfLang.g:1537:1: rule__Expression_Repetition_Group__Group__2__Impl : ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Repetition_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1541:1: ( ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1542:1: ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1542:1: ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1543:2: ( rule__Expression_Repetition_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1544:2: ( rule__Expression_Repetition_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1544:3: rule__Expression_Repetition_Group__ExprAssignment_2
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
    // InternalEbnfLang.g:1552:1: rule__Expression_Repetition_Group__Group__3 : rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4 ;
    public final void rule__Expression_Repetition_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1556:1: ( rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4 )
            // InternalEbnfLang.g:1557:2: rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalEbnfLang.g:1564:1: rule__Expression_Repetition_Group__Group__3__Impl : ( '}' ) ;
    public final void rule__Expression_Repetition_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1568:1: ( ( '}' ) )
            // InternalEbnfLang.g:1569:1: ( '}' )
            {
            // InternalEbnfLang.g:1569:1: ( '}' )
            // InternalEbnfLang.g:1570:2: '}'
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
    // InternalEbnfLang.g:1579:1: rule__Expression_Repetition_Group__Group__4 : rule__Expression_Repetition_Group__Group__4__Impl ;
    public final void rule__Expression_Repetition_Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1583:1: ( rule__Expression_Repetition_Group__Group__4__Impl )
            // InternalEbnfLang.g:1584:2: rule__Expression_Repetition_Group__Group__4__Impl
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
    // InternalEbnfLang.g:1590:1: rule__Expression_Repetition_Group__Group__4__Impl : ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? ) ;
    public final void rule__Expression_Repetition_Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1594:1: ( ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? ) )
            // InternalEbnfLang.g:1595:1: ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? )
            {
            // InternalEbnfLang.g:1595:1: ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? )
            // InternalEbnfLang.g:1596:2: ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )?
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneAssignment_4()); 
            // InternalEbnfLang.g:1597:2: ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )?
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
                    // InternalEbnfLang.g:1597:3: rule__Expression_Repetition_Group__AtLeastOneAssignment_4
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
    // InternalEbnfLang.g:1606:1: rule__Expression_Optional_Group__Group__0 : rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1 ;
    public final void rule__Expression_Optional_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1610:1: ( rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1 )
            // InternalEbnfLang.g:1611:2: rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalEbnfLang.g:1618:1: rule__Expression_Optional_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Optional_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1622:1: ( ( () ) )
            // InternalEbnfLang.g:1623:1: ( () )
            {
            // InternalEbnfLang.g:1623:1: ( () )
            // InternalEbnfLang.g:1624:2: ()
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0()); 
            // InternalEbnfLang.g:1625:2: ()
            // InternalEbnfLang.g:1625:3: 
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
    // InternalEbnfLang.g:1633:1: rule__Expression_Optional_Group__Group__1 : rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2 ;
    public final void rule__Expression_Optional_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1637:1: ( rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2 )
            // InternalEbnfLang.g:1638:2: rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalEbnfLang.g:1645:1: rule__Expression_Optional_Group__Group__1__Impl : ( '[' ) ;
    public final void rule__Expression_Optional_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1649:1: ( ( '[' ) )
            // InternalEbnfLang.g:1650:1: ( '[' )
            {
            // InternalEbnfLang.g:1650:1: ( '[' )
            // InternalEbnfLang.g:1651:2: '['
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
    // InternalEbnfLang.g:1660:1: rule__Expression_Optional_Group__Group__2 : rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3 ;
    public final void rule__Expression_Optional_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1664:1: ( rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3 )
            // InternalEbnfLang.g:1665:2: rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalEbnfLang.g:1672:1: rule__Expression_Optional_Group__Group__2__Impl : ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Optional_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1676:1: ( ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1677:1: ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1677:1: ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1678:2: ( rule__Expression_Optional_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1679:2: ( rule__Expression_Optional_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1679:3: rule__Expression_Optional_Group__ExprAssignment_2
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
    // InternalEbnfLang.g:1687:1: rule__Expression_Optional_Group__Group__3 : rule__Expression_Optional_Group__Group__3__Impl ;
    public final void rule__Expression_Optional_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1691:1: ( rule__Expression_Optional_Group__Group__3__Impl )
            // InternalEbnfLang.g:1692:2: rule__Expression_Optional_Group__Group__3__Impl
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
    // InternalEbnfLang.g:1698:1: rule__Expression_Optional_Group__Group__3__Impl : ( ']' ) ;
    public final void rule__Expression_Optional_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1702:1: ( ( ']' ) )
            // InternalEbnfLang.g:1703:1: ( ']' )
            {
            // InternalEbnfLang.g:1703:1: ( ']' )
            // InternalEbnfLang.g:1704:2: ']'
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
    // InternalEbnfLang.g:1714:1: rule__Expression_Group__Group__0 : rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1 ;
    public final void rule__Expression_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1718:1: ( rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1 )
            // InternalEbnfLang.g:1719:2: rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalEbnfLang.g:1726:1: rule__Expression_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1730:1: ( ( () ) )
            // InternalEbnfLang.g:1731:1: ( () )
            {
            // InternalEbnfLang.g:1731:1: ( () )
            // InternalEbnfLang.g:1732:2: ()
            {
             before(grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0()); 
            // InternalEbnfLang.g:1733:2: ()
            // InternalEbnfLang.g:1733:3: 
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
    // InternalEbnfLang.g:1741:1: rule__Expression_Group__Group__1 : rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2 ;
    public final void rule__Expression_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1745:1: ( rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2 )
            // InternalEbnfLang.g:1746:2: rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalEbnfLang.g:1753:1: rule__Expression_Group__Group__1__Impl : ( '(' ) ;
    public final void rule__Expression_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1757:1: ( ( '(' ) )
            // InternalEbnfLang.g:1758:1: ( '(' )
            {
            // InternalEbnfLang.g:1758:1: ( '(' )
            // InternalEbnfLang.g:1759:2: '('
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
    // InternalEbnfLang.g:1768:1: rule__Expression_Group__Group__2 : rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3 ;
    public final void rule__Expression_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1772:1: ( rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3 )
            // InternalEbnfLang.g:1773:2: rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalEbnfLang.g:1780:1: rule__Expression_Group__Group__2__Impl : ( ( rule__Expression_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1784:1: ( ( ( rule__Expression_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1785:1: ( ( rule__Expression_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1785:1: ( ( rule__Expression_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1786:2: ( rule__Expression_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1787:2: ( rule__Expression_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1787:3: rule__Expression_Group__ExprAssignment_2
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
    // InternalEbnfLang.g:1795:1: rule__Expression_Group__Group__3 : rule__Expression_Group__Group__3__Impl ;
    public final void rule__Expression_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1799:1: ( rule__Expression_Group__Group__3__Impl )
            // InternalEbnfLang.g:1800:2: rule__Expression_Group__Group__3__Impl
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
    // InternalEbnfLang.g:1806:1: rule__Expression_Group__Group__3__Impl : ( ')' ) ;
    public final void rule__Expression_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1810:1: ( ( ')' ) )
            // InternalEbnfLang.g:1811:1: ( ')' )
            {
            // InternalEbnfLang.g:1811:1: ( ')' )
            // InternalEbnfLang.g:1812:2: ')'
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
    // InternalEbnfLang.g:1822:1: rule__EbnfGrammar__LinesAssignment_1 : ( ruleLine ) ;
    public final void rule__EbnfGrammar__LinesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1826:1: ( ( ruleLine ) )
            // InternalEbnfLang.g:1827:2: ( ruleLine )
            {
            // InternalEbnfLang.g:1827:2: ( ruleLine )
            // InternalEbnfLang.g:1828:3: ruleLine
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
    // InternalEbnfLang.g:1837:1: rule__ProductionRule__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__ProductionRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1841:1: ( ( RULE_NAME ) )
            // InternalEbnfLang.g:1842:2: ( RULE_NAME )
            {
            // InternalEbnfLang.g:1842:2: ( RULE_NAME )
            // InternalEbnfLang.g:1843:3: RULE_NAME
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
    // InternalEbnfLang.g:1852:1: rule__ProductionRule__ExprAssignment_3 : ( ruleExpression ) ;
    public final void rule__ProductionRule__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1856:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:1857:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:1857:2: ( ruleExpression )
            // InternalEbnfLang.g:1858:3: ruleExpression
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
    // InternalEbnfLang.g:1867:1: rule__Expression_Alternative__ElementsAssignment_1_1_1 : ( ruleExpression_Concatenation ) ;
    public final void rule__Expression_Alternative__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1871:1: ( ( ruleExpression_Concatenation ) )
            // InternalEbnfLang.g:1872:2: ( ruleExpression_Concatenation )
            {
            // InternalEbnfLang.g:1872:2: ( ruleExpression_Concatenation )
            // InternalEbnfLang.g:1873:3: ruleExpression_Concatenation
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
    // InternalEbnfLang.g:1882:1: rule__Expression_Concatenation__ElementsAssignment_1_1_1 : ( ruleExpression_Exception ) ;
    public final void rule__Expression_Concatenation__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1886:1: ( ( ruleExpression_Exception ) )
            // InternalEbnfLang.g:1887:2: ( ruleExpression_Exception )
            {
            // InternalEbnfLang.g:1887:2: ( ruleExpression_Exception )
            // InternalEbnfLang.g:1888:3: ruleExpression_Exception
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
    // InternalEbnfLang.g:1897:1: rule__Expression_Exception__RightAssignment_1_2 : ( ruleExpression_Repetition ) ;
    public final void rule__Expression_Exception__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1901:1: ( ( ruleExpression_Repetition ) )
            // InternalEbnfLang.g:1902:2: ( ruleExpression_Repetition )
            {
            // InternalEbnfLang.g:1902:2: ( ruleExpression_Repetition )
            // InternalEbnfLang.g:1903:3: ruleExpression_Repetition
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
    // InternalEbnfLang.g:1912:1: rule__Expression_Repetition__RepetitionsAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Expression_Repetition__RepetitionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1916:1: ( ( RULE_NUMBER ) )
            // InternalEbnfLang.g:1917:2: ( RULE_NUMBER )
            {
            // InternalEbnfLang.g:1917:2: ( RULE_NUMBER )
            // InternalEbnfLang.g:1918:3: RULE_NUMBER
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
    // InternalEbnfLang.g:1927:1: rule__Expression_Repetition__ExprAssignment_1_3 : ( ruleExpression_Terminal ) ;
    public final void rule__Expression_Repetition__ExprAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1931:1: ( ( ruleExpression_Terminal ) )
            // InternalEbnfLang.g:1932:2: ( ruleExpression_Terminal )
            {
            // InternalEbnfLang.g:1932:2: ( ruleExpression_Terminal )
            // InternalEbnfLang.g:1933:3: ruleExpression_Terminal
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
    // InternalEbnfLang.g:1942:1: rule__Expression_Rule_Reference__RuleAssignment_1 : ( ( RULE_NAME ) ) ;
    public final void rule__Expression_Rule_Reference__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1946:1: ( ( ( RULE_NAME ) ) )
            // InternalEbnfLang.g:1947:2: ( ( RULE_NAME ) )
            {
            // InternalEbnfLang.g:1947:2: ( ( RULE_NAME ) )
            // InternalEbnfLang.g:1948:3: ( RULE_NAME )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0()); 
            // InternalEbnfLang.g:1949:3: ( RULE_NAME )
            // InternalEbnfLang.g:1950:4: RULE_NAME
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
    // InternalEbnfLang.g:1961:1: rule__Expression_Special_Sequence__TextAssignment_1 : ( RULE_SPECIAL_SEQUENCE ) ;
    public final void rule__Expression_Special_Sequence__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1965:1: ( ( RULE_SPECIAL_SEQUENCE ) )
            // InternalEbnfLang.g:1966:2: ( RULE_SPECIAL_SEQUENCE )
            {
            // InternalEbnfLang.g:1966:2: ( RULE_SPECIAL_SEQUENCE )
            // InternalEbnfLang.g:1967:3: RULE_SPECIAL_SEQUENCE
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
    // InternalEbnfLang.g:1976:1: rule__Expression_Terminal_Symbol__TextAssignment_1 : ( RULE_TERMINAL_SYMBOL ) ;
    public final void rule__Expression_Terminal_Symbol__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1980:1: ( ( RULE_TERMINAL_SYMBOL ) )
            // InternalEbnfLang.g:1981:2: ( RULE_TERMINAL_SYMBOL )
            {
            // InternalEbnfLang.g:1981:2: ( RULE_TERMINAL_SYMBOL )
            // InternalEbnfLang.g:1982:3: RULE_TERMINAL_SYMBOL
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
    // InternalEbnfLang.g:1991:1: rule__Expression_Repetition_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Repetition_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1995:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:1996:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:1996:2: ( ruleExpression )
            // InternalEbnfLang.g:1997:3: ruleExpression
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
    // InternalEbnfLang.g:2006:1: rule__Expression_Repetition_Group__AtLeastOneAssignment_4 : ( ( '-' ) ) ;
    public final void rule__Expression_Repetition_Group__AtLeastOneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2010:1: ( ( ( '-' ) ) )
            // InternalEbnfLang.g:2011:2: ( ( '-' ) )
            {
            // InternalEbnfLang.g:2011:2: ( ( '-' ) )
            // InternalEbnfLang.g:2012:3: ( '-' )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 
            // InternalEbnfLang.g:2013:3: ( '-' )
            // InternalEbnfLang.g:2014:4: '-'
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
    // InternalEbnfLang.g:2025:1: rule__Expression_Optional_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Optional_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2029:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:2030:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:2030:2: ( ruleExpression )
            // InternalEbnfLang.g:2031:3: ruleExpression
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
    // InternalEbnfLang.g:2040:1: rule__Expression_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2044:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:2045:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:2045:2: ( ruleExpression )
            // InternalEbnfLang.g:2046:3: ruleExpression
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


    // $ANTLR start "rule__CommentEBNF__ContentCommentAssignment"
    // InternalEbnfLang.g:2055:1: rule__CommentEBNF__ContentCommentAssignment : ( RULE_EBNF_COMMENT ) ;
    public final void rule__CommentEBNF__ContentCommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:2059:1: ( ( RULE_EBNF_COMMENT ) )
            // InternalEbnfLang.g:2060:2: ( RULE_EBNF_COMMENT )
            {
            // InternalEbnfLang.g:2060:2: ( RULE_EBNF_COMMENT )
            // InternalEbnfLang.g:2061:3: RULE_EBNF_COMMENT
            {
             before(grammarAccess.getCommentEBNFAccess().getContentCommentEBNF_COMMENTTerminalRuleCall_0()); 
            match(input,RULE_EBNF_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCommentEBNFAccess().getContentCommentEBNF_COMMENTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__CommentEBNF__ContentCommentAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000054000F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000054000D0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});

}