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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_NUMBER", "RULE_SPECIAL_SEQUENCE", "RULE_TERMINAL_SYMBOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "';'", "'|'", "','", "'-'", "'*'", "'{'", "'}'", "'['", "']'", "'('", "')'"
    };
    public static final int RULE_TERMINAL_SYMBOL=7;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_SPECIAL_SEQUENCE=6;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=8;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=5;
    public static final int T__26=26;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
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


    // $ANTLR start "entryRuleProductionRule"
    // InternalEbnfLang.g:78:1: entryRuleProductionRule : ruleProductionRule EOF ;
    public final void entryRuleProductionRule() throws RecognitionException {
        try {
            // InternalEbnfLang.g:79:1: ( ruleProductionRule EOF )
            // InternalEbnfLang.g:80:1: ruleProductionRule EOF
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
    // InternalEbnfLang.g:87:1: ruleProductionRule : ( ( rule__ProductionRule__Group__0 ) ) ;
    public final void ruleProductionRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:91:2: ( ( ( rule__ProductionRule__Group__0 ) ) )
            // InternalEbnfLang.g:92:2: ( ( rule__ProductionRule__Group__0 ) )
            {
            // InternalEbnfLang.g:92:2: ( ( rule__ProductionRule__Group__0 ) )
            // InternalEbnfLang.g:93:3: ( rule__ProductionRule__Group__0 )
            {
             before(grammarAccess.getProductionRuleAccess().getGroup()); 
            // InternalEbnfLang.g:94:3: ( rule__ProductionRule__Group__0 )
            // InternalEbnfLang.g:94:4: rule__ProductionRule__Group__0
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
    // InternalEbnfLang.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalEbnfLang.g:104:1: ( ruleExpression EOF )
            // InternalEbnfLang.g:105:1: ruleExpression EOF
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
    // InternalEbnfLang.g:112:1: ruleExpression : ( ruleExpression_Alternative ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:116:2: ( ( ruleExpression_Alternative ) )
            // InternalEbnfLang.g:117:2: ( ruleExpression_Alternative )
            {
            // InternalEbnfLang.g:117:2: ( ruleExpression_Alternative )
            // InternalEbnfLang.g:118:3: ruleExpression_Alternative
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
    // InternalEbnfLang.g:128:1: entryRuleExpression_Alternative : ruleExpression_Alternative EOF ;
    public final void entryRuleExpression_Alternative() throws RecognitionException {
        try {
            // InternalEbnfLang.g:129:1: ( ruleExpression_Alternative EOF )
            // InternalEbnfLang.g:130:1: ruleExpression_Alternative EOF
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
    // InternalEbnfLang.g:137:1: ruleExpression_Alternative : ( ( rule__Expression_Alternative__Group__0 ) ) ;
    public final void ruleExpression_Alternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:141:2: ( ( ( rule__Expression_Alternative__Group__0 ) ) )
            // InternalEbnfLang.g:142:2: ( ( rule__Expression_Alternative__Group__0 ) )
            {
            // InternalEbnfLang.g:142:2: ( ( rule__Expression_Alternative__Group__0 ) )
            // InternalEbnfLang.g:143:3: ( rule__Expression_Alternative__Group__0 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup()); 
            // InternalEbnfLang.g:144:3: ( rule__Expression_Alternative__Group__0 )
            // InternalEbnfLang.g:144:4: rule__Expression_Alternative__Group__0
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
    // InternalEbnfLang.g:153:1: entryRuleExpression_Concatenation : ruleExpression_Concatenation EOF ;
    public final void entryRuleExpression_Concatenation() throws RecognitionException {
        try {
            // InternalEbnfLang.g:154:1: ( ruleExpression_Concatenation EOF )
            // InternalEbnfLang.g:155:1: ruleExpression_Concatenation EOF
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
    // InternalEbnfLang.g:162:1: ruleExpression_Concatenation : ( ( rule__Expression_Concatenation__Group__0 ) ) ;
    public final void ruleExpression_Concatenation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:166:2: ( ( ( rule__Expression_Concatenation__Group__0 ) ) )
            // InternalEbnfLang.g:167:2: ( ( rule__Expression_Concatenation__Group__0 ) )
            {
            // InternalEbnfLang.g:167:2: ( ( rule__Expression_Concatenation__Group__0 ) )
            // InternalEbnfLang.g:168:3: ( rule__Expression_Concatenation__Group__0 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup()); 
            // InternalEbnfLang.g:169:3: ( rule__Expression_Concatenation__Group__0 )
            // InternalEbnfLang.g:169:4: rule__Expression_Concatenation__Group__0
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
    // InternalEbnfLang.g:178:1: entryRuleExpression_Exception : ruleExpression_Exception EOF ;
    public final void entryRuleExpression_Exception() throws RecognitionException {
        try {
            // InternalEbnfLang.g:179:1: ( ruleExpression_Exception EOF )
            // InternalEbnfLang.g:180:1: ruleExpression_Exception EOF
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
    // InternalEbnfLang.g:187:1: ruleExpression_Exception : ( ( rule__Expression_Exception__Group__0 ) ) ;
    public final void ruleExpression_Exception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:191:2: ( ( ( rule__Expression_Exception__Group__0 ) ) )
            // InternalEbnfLang.g:192:2: ( ( rule__Expression_Exception__Group__0 ) )
            {
            // InternalEbnfLang.g:192:2: ( ( rule__Expression_Exception__Group__0 ) )
            // InternalEbnfLang.g:193:3: ( rule__Expression_Exception__Group__0 )
            {
             before(grammarAccess.getExpression_ExceptionAccess().getGroup()); 
            // InternalEbnfLang.g:194:3: ( rule__Expression_Exception__Group__0 )
            // InternalEbnfLang.g:194:4: rule__Expression_Exception__Group__0
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
    // InternalEbnfLang.g:203:1: entryRuleExpression_Repetition : ruleExpression_Repetition EOF ;
    public final void entryRuleExpression_Repetition() throws RecognitionException {
        try {
            // InternalEbnfLang.g:204:1: ( ruleExpression_Repetition EOF )
            // InternalEbnfLang.g:205:1: ruleExpression_Repetition EOF
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
    // InternalEbnfLang.g:212:1: ruleExpression_Repetition : ( ( rule__Expression_Repetition__Alternatives ) ) ;
    public final void ruleExpression_Repetition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:216:2: ( ( ( rule__Expression_Repetition__Alternatives ) ) )
            // InternalEbnfLang.g:217:2: ( ( rule__Expression_Repetition__Alternatives ) )
            {
            // InternalEbnfLang.g:217:2: ( ( rule__Expression_Repetition__Alternatives ) )
            // InternalEbnfLang.g:218:3: ( rule__Expression_Repetition__Alternatives )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getAlternatives()); 
            // InternalEbnfLang.g:219:3: ( rule__Expression_Repetition__Alternatives )
            // InternalEbnfLang.g:219:4: rule__Expression_Repetition__Alternatives
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
    // InternalEbnfLang.g:228:1: entryRuleExpression_Terminal : ruleExpression_Terminal EOF ;
    public final void entryRuleExpression_Terminal() throws RecognitionException {
        try {
            // InternalEbnfLang.g:229:1: ( ruleExpression_Terminal EOF )
            // InternalEbnfLang.g:230:1: ruleExpression_Terminal EOF
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
    // InternalEbnfLang.g:237:1: ruleExpression_Terminal : ( ( rule__Expression_Terminal__Alternatives ) ) ;
    public final void ruleExpression_Terminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:241:2: ( ( ( rule__Expression_Terminal__Alternatives ) ) )
            // InternalEbnfLang.g:242:2: ( ( rule__Expression_Terminal__Alternatives ) )
            {
            // InternalEbnfLang.g:242:2: ( ( rule__Expression_Terminal__Alternatives ) )
            // InternalEbnfLang.g:243:3: ( rule__Expression_Terminal__Alternatives )
            {
             before(grammarAccess.getExpression_TerminalAccess().getAlternatives()); 
            // InternalEbnfLang.g:244:3: ( rule__Expression_Terminal__Alternatives )
            // InternalEbnfLang.g:244:4: rule__Expression_Terminal__Alternatives
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
    // InternalEbnfLang.g:253:1: entryRuleExpression_Rule_Reference : ruleExpression_Rule_Reference EOF ;
    public final void entryRuleExpression_Rule_Reference() throws RecognitionException {
        try {
            // InternalEbnfLang.g:254:1: ( ruleExpression_Rule_Reference EOF )
            // InternalEbnfLang.g:255:1: ruleExpression_Rule_Reference EOF
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
    // InternalEbnfLang.g:262:1: ruleExpression_Rule_Reference : ( ( rule__Expression_Rule_Reference__Group__0 ) ) ;
    public final void ruleExpression_Rule_Reference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:266:2: ( ( ( rule__Expression_Rule_Reference__Group__0 ) ) )
            // InternalEbnfLang.g:267:2: ( ( rule__Expression_Rule_Reference__Group__0 ) )
            {
            // InternalEbnfLang.g:267:2: ( ( rule__Expression_Rule_Reference__Group__0 ) )
            // InternalEbnfLang.g:268:3: ( rule__Expression_Rule_Reference__Group__0 )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getGroup()); 
            // InternalEbnfLang.g:269:3: ( rule__Expression_Rule_Reference__Group__0 )
            // InternalEbnfLang.g:269:4: rule__Expression_Rule_Reference__Group__0
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
    // InternalEbnfLang.g:278:1: entryRuleExpression_Special_Sequence : ruleExpression_Special_Sequence EOF ;
    public final void entryRuleExpression_Special_Sequence() throws RecognitionException {
        try {
            // InternalEbnfLang.g:279:1: ( ruleExpression_Special_Sequence EOF )
            // InternalEbnfLang.g:280:1: ruleExpression_Special_Sequence EOF
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
    // InternalEbnfLang.g:287:1: ruleExpression_Special_Sequence : ( ( rule__Expression_Special_Sequence__Group__0 ) ) ;
    public final void ruleExpression_Special_Sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:291:2: ( ( ( rule__Expression_Special_Sequence__Group__0 ) ) )
            // InternalEbnfLang.g:292:2: ( ( rule__Expression_Special_Sequence__Group__0 ) )
            {
            // InternalEbnfLang.g:292:2: ( ( rule__Expression_Special_Sequence__Group__0 ) )
            // InternalEbnfLang.g:293:3: ( rule__Expression_Special_Sequence__Group__0 )
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getGroup()); 
            // InternalEbnfLang.g:294:3: ( rule__Expression_Special_Sequence__Group__0 )
            // InternalEbnfLang.g:294:4: rule__Expression_Special_Sequence__Group__0
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
    // InternalEbnfLang.g:303:1: entryRuleExpression_Terminal_Symbol : ruleExpression_Terminal_Symbol EOF ;
    public final void entryRuleExpression_Terminal_Symbol() throws RecognitionException {
        try {
            // InternalEbnfLang.g:304:1: ( ruleExpression_Terminal_Symbol EOF )
            // InternalEbnfLang.g:305:1: ruleExpression_Terminal_Symbol EOF
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
    // InternalEbnfLang.g:312:1: ruleExpression_Terminal_Symbol : ( ( rule__Expression_Terminal_Symbol__Group__0 ) ) ;
    public final void ruleExpression_Terminal_Symbol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:316:2: ( ( ( rule__Expression_Terminal_Symbol__Group__0 ) ) )
            // InternalEbnfLang.g:317:2: ( ( rule__Expression_Terminal_Symbol__Group__0 ) )
            {
            // InternalEbnfLang.g:317:2: ( ( rule__Expression_Terminal_Symbol__Group__0 ) )
            // InternalEbnfLang.g:318:3: ( rule__Expression_Terminal_Symbol__Group__0 )
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getGroup()); 
            // InternalEbnfLang.g:319:3: ( rule__Expression_Terminal_Symbol__Group__0 )
            // InternalEbnfLang.g:319:4: rule__Expression_Terminal_Symbol__Group__0
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
    // InternalEbnfLang.g:328:1: entryRuleExpression_Repetition_Group : ruleExpression_Repetition_Group EOF ;
    public final void entryRuleExpression_Repetition_Group() throws RecognitionException {
        try {
            // InternalEbnfLang.g:329:1: ( ruleExpression_Repetition_Group EOF )
            // InternalEbnfLang.g:330:1: ruleExpression_Repetition_Group EOF
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
    // InternalEbnfLang.g:337:1: ruleExpression_Repetition_Group : ( ( rule__Expression_Repetition_Group__Group__0 ) ) ;
    public final void ruleExpression_Repetition_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:341:2: ( ( ( rule__Expression_Repetition_Group__Group__0 ) ) )
            // InternalEbnfLang.g:342:2: ( ( rule__Expression_Repetition_Group__Group__0 ) )
            {
            // InternalEbnfLang.g:342:2: ( ( rule__Expression_Repetition_Group__Group__0 ) )
            // InternalEbnfLang.g:343:3: ( rule__Expression_Repetition_Group__Group__0 )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getGroup()); 
            // InternalEbnfLang.g:344:3: ( rule__Expression_Repetition_Group__Group__0 )
            // InternalEbnfLang.g:344:4: rule__Expression_Repetition_Group__Group__0
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
    // InternalEbnfLang.g:353:1: entryRuleExpression_Optional_Group : ruleExpression_Optional_Group EOF ;
    public final void entryRuleExpression_Optional_Group() throws RecognitionException {
        try {
            // InternalEbnfLang.g:354:1: ( ruleExpression_Optional_Group EOF )
            // InternalEbnfLang.g:355:1: ruleExpression_Optional_Group EOF
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
    // InternalEbnfLang.g:362:1: ruleExpression_Optional_Group : ( ( rule__Expression_Optional_Group__Group__0 ) ) ;
    public final void ruleExpression_Optional_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:366:2: ( ( ( rule__Expression_Optional_Group__Group__0 ) ) )
            // InternalEbnfLang.g:367:2: ( ( rule__Expression_Optional_Group__Group__0 ) )
            {
            // InternalEbnfLang.g:367:2: ( ( rule__Expression_Optional_Group__Group__0 ) )
            // InternalEbnfLang.g:368:3: ( rule__Expression_Optional_Group__Group__0 )
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getGroup()); 
            // InternalEbnfLang.g:369:3: ( rule__Expression_Optional_Group__Group__0 )
            // InternalEbnfLang.g:369:4: rule__Expression_Optional_Group__Group__0
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
    // InternalEbnfLang.g:378:1: entryRuleExpression_Group : ruleExpression_Group EOF ;
    public final void entryRuleExpression_Group() throws RecognitionException {
        try {
            // InternalEbnfLang.g:379:1: ( ruleExpression_Group EOF )
            // InternalEbnfLang.g:380:1: ruleExpression_Group EOF
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
    // InternalEbnfLang.g:387:1: ruleExpression_Group : ( ( rule__Expression_Group__Group__0 ) ) ;
    public final void ruleExpression_Group() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:391:2: ( ( ( rule__Expression_Group__Group__0 ) ) )
            // InternalEbnfLang.g:392:2: ( ( rule__Expression_Group__Group__0 ) )
            {
            // InternalEbnfLang.g:392:2: ( ( rule__Expression_Group__Group__0 ) )
            // InternalEbnfLang.g:393:3: ( rule__Expression_Group__Group__0 )
            {
             before(grammarAccess.getExpression_GroupAccess().getGroup()); 
            // InternalEbnfLang.g:394:3: ( rule__Expression_Group__Group__0 )
            // InternalEbnfLang.g:394:4: rule__Expression_Group__Group__0
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


    // $ANTLR start "rule__Expression_Repetition__Alternatives"
    // InternalEbnfLang.g:402:1: rule__Expression_Repetition__Alternatives : ( ( ruleExpression_Terminal ) | ( ( rule__Expression_Repetition__Group_1__0 ) ) );
    public final void rule__Expression_Repetition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:406:1: ( ( ruleExpression_Terminal ) | ( ( rule__Expression_Repetition__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NAME||(LA1_0>=RULE_SPECIAL_SEQUENCE && LA1_0<=RULE_TERMINAL_SYMBOL)||LA1_0==21||LA1_0==23||LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_NUMBER) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEbnfLang.g:407:2: ( ruleExpression_Terminal )
                    {
                    // InternalEbnfLang.g:407:2: ( ruleExpression_Terminal )
                    // InternalEbnfLang.g:408:3: ruleExpression_Terminal
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
                    // InternalEbnfLang.g:413:2: ( ( rule__Expression_Repetition__Group_1__0 ) )
                    {
                    // InternalEbnfLang.g:413:2: ( ( rule__Expression_Repetition__Group_1__0 ) )
                    // InternalEbnfLang.g:414:3: ( rule__Expression_Repetition__Group_1__0 )
                    {
                     before(grammarAccess.getExpression_RepetitionAccess().getGroup_1()); 
                    // InternalEbnfLang.g:415:3: ( rule__Expression_Repetition__Group_1__0 )
                    // InternalEbnfLang.g:415:4: rule__Expression_Repetition__Group_1__0
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
    // InternalEbnfLang.g:423:1: rule__Expression_Terminal__Alternatives : ( ( ruleExpression_Rule_Reference ) | ( ruleExpression_Terminal_Symbol ) | ( ruleExpression_Repetition_Group ) | ( ruleExpression_Optional_Group ) | ( ruleExpression_Group ) | ( ruleExpression_Special_Sequence ) );
    public final void rule__Expression_Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:427:1: ( ( ruleExpression_Rule_Reference ) | ( ruleExpression_Terminal_Symbol ) | ( ruleExpression_Repetition_Group ) | ( ruleExpression_Optional_Group ) | ( ruleExpression_Group ) | ( ruleExpression_Special_Sequence ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt2=1;
                }
                break;
            case RULE_TERMINAL_SYMBOL:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 23:
                {
                alt2=4;
                }
                break;
            case 25:
                {
                alt2=5;
                }
                break;
            case RULE_SPECIAL_SEQUENCE:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEbnfLang.g:428:2: ( ruleExpression_Rule_Reference )
                    {
                    // InternalEbnfLang.g:428:2: ( ruleExpression_Rule_Reference )
                    // InternalEbnfLang.g:429:3: ruleExpression_Rule_Reference
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
                    // InternalEbnfLang.g:434:2: ( ruleExpression_Terminal_Symbol )
                    {
                    // InternalEbnfLang.g:434:2: ( ruleExpression_Terminal_Symbol )
                    // InternalEbnfLang.g:435:3: ruleExpression_Terminal_Symbol
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
                    // InternalEbnfLang.g:440:2: ( ruleExpression_Repetition_Group )
                    {
                    // InternalEbnfLang.g:440:2: ( ruleExpression_Repetition_Group )
                    // InternalEbnfLang.g:441:3: ruleExpression_Repetition_Group
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
                    // InternalEbnfLang.g:446:2: ( ruleExpression_Optional_Group )
                    {
                    // InternalEbnfLang.g:446:2: ( ruleExpression_Optional_Group )
                    // InternalEbnfLang.g:447:3: ruleExpression_Optional_Group
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
                    // InternalEbnfLang.g:452:2: ( ruleExpression_Group )
                    {
                    // InternalEbnfLang.g:452:2: ( ruleExpression_Group )
                    // InternalEbnfLang.g:453:3: ruleExpression_Group
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
                    // InternalEbnfLang.g:458:2: ( ruleExpression_Special_Sequence )
                    {
                    // InternalEbnfLang.g:458:2: ( ruleExpression_Special_Sequence )
                    // InternalEbnfLang.g:459:3: ruleExpression_Special_Sequence
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
    // InternalEbnfLang.g:468:1: rule__EbnfGrammar__Group__0 : rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1 ;
    public final void rule__EbnfGrammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:472:1: ( rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1 )
            // InternalEbnfLang.g:473:2: rule__EbnfGrammar__Group__0__Impl rule__EbnfGrammar__Group__1
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
    // InternalEbnfLang.g:480:1: rule__EbnfGrammar__Group__0__Impl : ( () ) ;
    public final void rule__EbnfGrammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:484:1: ( ( () ) )
            // InternalEbnfLang.g:485:1: ( () )
            {
            // InternalEbnfLang.g:485:1: ( () )
            // InternalEbnfLang.g:486:2: ()
            {
             before(grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0()); 
            // InternalEbnfLang.g:487:2: ()
            // InternalEbnfLang.g:487:3: 
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
    // InternalEbnfLang.g:495:1: rule__EbnfGrammar__Group__1 : rule__EbnfGrammar__Group__1__Impl ;
    public final void rule__EbnfGrammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:499:1: ( rule__EbnfGrammar__Group__1__Impl )
            // InternalEbnfLang.g:500:2: rule__EbnfGrammar__Group__1__Impl
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
    // InternalEbnfLang.g:506:1: rule__EbnfGrammar__Group__1__Impl : ( ( rule__EbnfGrammar__RulesAssignment_1 )* ) ;
    public final void rule__EbnfGrammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:510:1: ( ( ( rule__EbnfGrammar__RulesAssignment_1 )* ) )
            // InternalEbnfLang.g:511:1: ( ( rule__EbnfGrammar__RulesAssignment_1 )* )
            {
            // InternalEbnfLang.g:511:1: ( ( rule__EbnfGrammar__RulesAssignment_1 )* )
            // InternalEbnfLang.g:512:2: ( rule__EbnfGrammar__RulesAssignment_1 )*
            {
             before(grammarAccess.getEbnfGrammarAccess().getRulesAssignment_1()); 
            // InternalEbnfLang.g:513:2: ( rule__EbnfGrammar__RulesAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NAME) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEbnfLang.g:513:3: rule__EbnfGrammar__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EbnfGrammar__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEbnfGrammarAccess().getRulesAssignment_1()); 

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
    // InternalEbnfLang.g:522:1: rule__ProductionRule__Group__0 : rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1 ;
    public final void rule__ProductionRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:526:1: ( rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1 )
            // InternalEbnfLang.g:527:2: rule__ProductionRule__Group__0__Impl rule__ProductionRule__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalEbnfLang.g:534:1: rule__ProductionRule__Group__0__Impl : ( ( rule__ProductionRule__NameAssignment_0 ) ) ;
    public final void rule__ProductionRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:538:1: ( ( ( rule__ProductionRule__NameAssignment_0 ) ) )
            // InternalEbnfLang.g:539:1: ( ( rule__ProductionRule__NameAssignment_0 ) )
            {
            // InternalEbnfLang.g:539:1: ( ( rule__ProductionRule__NameAssignment_0 ) )
            // InternalEbnfLang.g:540:2: ( rule__ProductionRule__NameAssignment_0 )
            {
             before(grammarAccess.getProductionRuleAccess().getNameAssignment_0()); 
            // InternalEbnfLang.g:541:2: ( rule__ProductionRule__NameAssignment_0 )
            // InternalEbnfLang.g:541:3: rule__ProductionRule__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProductionRuleAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ProductionRule__Group__0__Impl"


    // $ANTLR start "rule__ProductionRule__Group__1"
    // InternalEbnfLang.g:549:1: rule__ProductionRule__Group__1 : rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2 ;
    public final void rule__ProductionRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:553:1: ( rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2 )
            // InternalEbnfLang.g:554:2: rule__ProductionRule__Group__1__Impl rule__ProductionRule__Group__2
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
    // InternalEbnfLang.g:561:1: rule__ProductionRule__Group__1__Impl : ( '=' ) ;
    public final void rule__ProductionRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:565:1: ( ( '=' ) )
            // InternalEbnfLang.g:566:1: ( '=' )
            {
            // InternalEbnfLang.g:566:1: ( '=' )
            // InternalEbnfLang.g:567:2: '='
            {
             before(grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_1()); 

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
    // InternalEbnfLang.g:576:1: rule__ProductionRule__Group__2 : rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3 ;
    public final void rule__ProductionRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:580:1: ( rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3 )
            // InternalEbnfLang.g:581:2: rule__ProductionRule__Group__2__Impl rule__ProductionRule__Group__3
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
    // InternalEbnfLang.g:588:1: rule__ProductionRule__Group__2__Impl : ( ( rule__ProductionRule__ExprAssignment_2 ) ) ;
    public final void rule__ProductionRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:592:1: ( ( ( rule__ProductionRule__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:593:1: ( ( rule__ProductionRule__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:593:1: ( ( rule__ProductionRule__ExprAssignment_2 ) )
            // InternalEbnfLang.g:594:2: ( rule__ProductionRule__ExprAssignment_2 )
            {
             before(grammarAccess.getProductionRuleAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:595:2: ( rule__ProductionRule__ExprAssignment_2 )
            // InternalEbnfLang.g:595:3: rule__ProductionRule__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProductionRuleAccess().getExprAssignment_2()); 

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
    // InternalEbnfLang.g:603:1: rule__ProductionRule__Group__3 : rule__ProductionRule__Group__3__Impl ;
    public final void rule__ProductionRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:607:1: ( rule__ProductionRule__Group__3__Impl )
            // InternalEbnfLang.g:608:2: rule__ProductionRule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProductionRule__Group__3__Impl();

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
    // InternalEbnfLang.g:614:1: rule__ProductionRule__Group__3__Impl : ( ';' ) ;
    public final void rule__ProductionRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:618:1: ( ( ';' ) )
            // InternalEbnfLang.g:619:1: ( ';' )
            {
            // InternalEbnfLang.g:619:1: ( ';' )
            // InternalEbnfLang.g:620:2: ';'
            {
             before(grammarAccess.getProductionRuleAccess().getSemicolonKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getSemicolonKeyword_3()); 

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


    // $ANTLR start "rule__Expression_Alternative__Group__0"
    // InternalEbnfLang.g:630:1: rule__Expression_Alternative__Group__0 : rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1 ;
    public final void rule__Expression_Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:634:1: ( rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1 )
            // InternalEbnfLang.g:635:2: rule__Expression_Alternative__Group__0__Impl rule__Expression_Alternative__Group__1
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
    // InternalEbnfLang.g:642:1: rule__Expression_Alternative__Group__0__Impl : ( ruleExpression_Concatenation ) ;
    public final void rule__Expression_Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:646:1: ( ( ruleExpression_Concatenation ) )
            // InternalEbnfLang.g:647:1: ( ruleExpression_Concatenation )
            {
            // InternalEbnfLang.g:647:1: ( ruleExpression_Concatenation )
            // InternalEbnfLang.g:648:2: ruleExpression_Concatenation
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
    // InternalEbnfLang.g:657:1: rule__Expression_Alternative__Group__1 : rule__Expression_Alternative__Group__1__Impl ;
    public final void rule__Expression_Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:661:1: ( rule__Expression_Alternative__Group__1__Impl )
            // InternalEbnfLang.g:662:2: rule__Expression_Alternative__Group__1__Impl
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
    // InternalEbnfLang.g:668:1: rule__Expression_Alternative__Group__1__Impl : ( ( rule__Expression_Alternative__Group_1__0 )? ) ;
    public final void rule__Expression_Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:672:1: ( ( ( rule__Expression_Alternative__Group_1__0 )? ) )
            // InternalEbnfLang.g:673:1: ( ( rule__Expression_Alternative__Group_1__0 )? )
            {
            // InternalEbnfLang.g:673:1: ( ( rule__Expression_Alternative__Group_1__0 )? )
            // InternalEbnfLang.g:674:2: ( rule__Expression_Alternative__Group_1__0 )?
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1()); 
            // InternalEbnfLang.g:675:2: ( rule__Expression_Alternative__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEbnfLang.g:675:3: rule__Expression_Alternative__Group_1__0
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
    // InternalEbnfLang.g:684:1: rule__Expression_Alternative__Group_1__0 : rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1 ;
    public final void rule__Expression_Alternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:688:1: ( rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1 )
            // InternalEbnfLang.g:689:2: rule__Expression_Alternative__Group_1__0__Impl rule__Expression_Alternative__Group_1__1
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
    // InternalEbnfLang.g:696:1: rule__Expression_Alternative__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Alternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:700:1: ( ( () ) )
            // InternalEbnfLang.g:701:1: ( () )
            {
            // InternalEbnfLang.g:701:1: ( () )
            // InternalEbnfLang.g:702:2: ()
            {
             before(grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0()); 
            // InternalEbnfLang.g:703:2: ()
            // InternalEbnfLang.g:703:3: 
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
    // InternalEbnfLang.g:711:1: rule__Expression_Alternative__Group_1__1 : rule__Expression_Alternative__Group_1__1__Impl ;
    public final void rule__Expression_Alternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:715:1: ( rule__Expression_Alternative__Group_1__1__Impl )
            // InternalEbnfLang.g:716:2: rule__Expression_Alternative__Group_1__1__Impl
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
    // InternalEbnfLang.g:722:1: rule__Expression_Alternative__Group_1__1__Impl : ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) ) ;
    public final void rule__Expression_Alternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:726:1: ( ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) ) )
            // InternalEbnfLang.g:727:1: ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) )
            {
            // InternalEbnfLang.g:727:1: ( ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* ) )
            // InternalEbnfLang.g:728:2: ( ( rule__Expression_Alternative__Group_1_1__0 ) ) ( ( rule__Expression_Alternative__Group_1_1__0 )* )
            {
            // InternalEbnfLang.g:728:2: ( ( rule__Expression_Alternative__Group_1_1__0 ) )
            // InternalEbnfLang.g:729:3: ( rule__Expression_Alternative__Group_1_1__0 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:730:3: ( rule__Expression_Alternative__Group_1_1__0 )
            // InternalEbnfLang.g:730:4: rule__Expression_Alternative__Group_1_1__0
            {
            pushFollow(FOLLOW_9);
            rule__Expression_Alternative__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 

            }

            // InternalEbnfLang.g:733:2: ( ( rule__Expression_Alternative__Group_1_1__0 )* )
            // InternalEbnfLang.g:734:3: ( rule__Expression_Alternative__Group_1_1__0 )*
            {
             before(grammarAccess.getExpression_AlternativeAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:735:3: ( rule__Expression_Alternative__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEbnfLang.g:735:4: rule__Expression_Alternative__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Expression_Alternative__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalEbnfLang.g:745:1: rule__Expression_Alternative__Group_1_1__0 : rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1 ;
    public final void rule__Expression_Alternative__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:749:1: ( rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1 )
            // InternalEbnfLang.g:750:2: rule__Expression_Alternative__Group_1_1__0__Impl rule__Expression_Alternative__Group_1_1__1
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
    // InternalEbnfLang.g:757:1: rule__Expression_Alternative__Group_1_1__0__Impl : ( '|' ) ;
    public final void rule__Expression_Alternative__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:761:1: ( ( '|' ) )
            // InternalEbnfLang.g:762:1: ( '|' )
            {
            // InternalEbnfLang.g:762:1: ( '|' )
            // InternalEbnfLang.g:763:2: '|'
            {
             before(grammarAccess.getExpression_AlternativeAccess().getVerticalLineKeyword_1_1_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalEbnfLang.g:772:1: rule__Expression_Alternative__Group_1_1__1 : rule__Expression_Alternative__Group_1_1__1__Impl ;
    public final void rule__Expression_Alternative__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:776:1: ( rule__Expression_Alternative__Group_1_1__1__Impl )
            // InternalEbnfLang.g:777:2: rule__Expression_Alternative__Group_1_1__1__Impl
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
    // InternalEbnfLang.g:783:1: rule__Expression_Alternative__Group_1_1__1__Impl : ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Expression_Alternative__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:787:1: ( ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) ) )
            // InternalEbnfLang.g:788:1: ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) )
            {
            // InternalEbnfLang.g:788:1: ( ( rule__Expression_Alternative__ElementsAssignment_1_1_1 ) )
            // InternalEbnfLang.g:789:2: ( rule__Expression_Alternative__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getExpression_AlternativeAccess().getElementsAssignment_1_1_1()); 
            // InternalEbnfLang.g:790:2: ( rule__Expression_Alternative__ElementsAssignment_1_1_1 )
            // InternalEbnfLang.g:790:3: rule__Expression_Alternative__ElementsAssignment_1_1_1
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
    // InternalEbnfLang.g:799:1: rule__Expression_Concatenation__Group__0 : rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1 ;
    public final void rule__Expression_Concatenation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:803:1: ( rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1 )
            // InternalEbnfLang.g:804:2: rule__Expression_Concatenation__Group__0__Impl rule__Expression_Concatenation__Group__1
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
    // InternalEbnfLang.g:811:1: rule__Expression_Concatenation__Group__0__Impl : ( ruleExpression_Exception ) ;
    public final void rule__Expression_Concatenation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:815:1: ( ( ruleExpression_Exception ) )
            // InternalEbnfLang.g:816:1: ( ruleExpression_Exception )
            {
            // InternalEbnfLang.g:816:1: ( ruleExpression_Exception )
            // InternalEbnfLang.g:817:2: ruleExpression_Exception
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
    // InternalEbnfLang.g:826:1: rule__Expression_Concatenation__Group__1 : rule__Expression_Concatenation__Group__1__Impl ;
    public final void rule__Expression_Concatenation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:830:1: ( rule__Expression_Concatenation__Group__1__Impl )
            // InternalEbnfLang.g:831:2: rule__Expression_Concatenation__Group__1__Impl
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
    // InternalEbnfLang.g:837:1: rule__Expression_Concatenation__Group__1__Impl : ( ( rule__Expression_Concatenation__Group_1__0 )? ) ;
    public final void rule__Expression_Concatenation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:841:1: ( ( ( rule__Expression_Concatenation__Group_1__0 )? ) )
            // InternalEbnfLang.g:842:1: ( ( rule__Expression_Concatenation__Group_1__0 )? )
            {
            // InternalEbnfLang.g:842:1: ( ( rule__Expression_Concatenation__Group_1__0 )? )
            // InternalEbnfLang.g:843:2: ( rule__Expression_Concatenation__Group_1__0 )?
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1()); 
            // InternalEbnfLang.g:844:2: ( rule__Expression_Concatenation__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEbnfLang.g:844:3: rule__Expression_Concatenation__Group_1__0
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
    // InternalEbnfLang.g:853:1: rule__Expression_Concatenation__Group_1__0 : rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1 ;
    public final void rule__Expression_Concatenation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:857:1: ( rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1 )
            // InternalEbnfLang.g:858:2: rule__Expression_Concatenation__Group_1__0__Impl rule__Expression_Concatenation__Group_1__1
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
    // InternalEbnfLang.g:865:1: rule__Expression_Concatenation__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Concatenation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:869:1: ( ( () ) )
            // InternalEbnfLang.g:870:1: ( () )
            {
            // InternalEbnfLang.g:870:1: ( () )
            // InternalEbnfLang.g:871:2: ()
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0()); 
            // InternalEbnfLang.g:872:2: ()
            // InternalEbnfLang.g:872:3: 
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
    // InternalEbnfLang.g:880:1: rule__Expression_Concatenation__Group_1__1 : rule__Expression_Concatenation__Group_1__1__Impl ;
    public final void rule__Expression_Concatenation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:884:1: ( rule__Expression_Concatenation__Group_1__1__Impl )
            // InternalEbnfLang.g:885:2: rule__Expression_Concatenation__Group_1__1__Impl
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
    // InternalEbnfLang.g:891:1: rule__Expression_Concatenation__Group_1__1__Impl : ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) ) ;
    public final void rule__Expression_Concatenation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:895:1: ( ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) ) )
            // InternalEbnfLang.g:896:1: ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) )
            {
            // InternalEbnfLang.g:896:1: ( ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* ) )
            // InternalEbnfLang.g:897:2: ( ( rule__Expression_Concatenation__Group_1_1__0 ) ) ( ( rule__Expression_Concatenation__Group_1_1__0 )* )
            {
            // InternalEbnfLang.g:897:2: ( ( rule__Expression_Concatenation__Group_1_1__0 ) )
            // InternalEbnfLang.g:898:3: ( rule__Expression_Concatenation__Group_1_1__0 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:899:3: ( rule__Expression_Concatenation__Group_1_1__0 )
            // InternalEbnfLang.g:899:4: rule__Expression_Concatenation__Group_1_1__0
            {
            pushFollow(FOLLOW_11);
            rule__Expression_Concatenation__Group_1_1__0();

            state._fsp--;


            }

             after(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 

            }

            // InternalEbnfLang.g:902:2: ( ( rule__Expression_Concatenation__Group_1_1__0 )* )
            // InternalEbnfLang.g:903:3: ( rule__Expression_Concatenation__Group_1_1__0 )*
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getGroup_1_1()); 
            // InternalEbnfLang.g:904:3: ( rule__Expression_Concatenation__Group_1_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEbnfLang.g:904:4: rule__Expression_Concatenation__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Expression_Concatenation__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalEbnfLang.g:914:1: rule__Expression_Concatenation__Group_1_1__0 : rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1 ;
    public final void rule__Expression_Concatenation__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:918:1: ( rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1 )
            // InternalEbnfLang.g:919:2: rule__Expression_Concatenation__Group_1_1__0__Impl rule__Expression_Concatenation__Group_1_1__1
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
    // InternalEbnfLang.g:926:1: rule__Expression_Concatenation__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__Expression_Concatenation__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:930:1: ( ( ',' ) )
            // InternalEbnfLang.g:931:1: ( ',' )
            {
            // InternalEbnfLang.g:931:1: ( ',' )
            // InternalEbnfLang.g:932:2: ','
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getCommaKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalEbnfLang.g:941:1: rule__Expression_Concatenation__Group_1_1__1 : rule__Expression_Concatenation__Group_1_1__1__Impl ;
    public final void rule__Expression_Concatenation__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:945:1: ( rule__Expression_Concatenation__Group_1_1__1__Impl )
            // InternalEbnfLang.g:946:2: rule__Expression_Concatenation__Group_1_1__1__Impl
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
    // InternalEbnfLang.g:952:1: rule__Expression_Concatenation__Group_1_1__1__Impl : ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__Expression_Concatenation__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:956:1: ( ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) ) )
            // InternalEbnfLang.g:957:1: ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) )
            {
            // InternalEbnfLang.g:957:1: ( ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 ) )
            // InternalEbnfLang.g:958:2: ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getExpression_ConcatenationAccess().getElementsAssignment_1_1_1()); 
            // InternalEbnfLang.g:959:2: ( rule__Expression_Concatenation__ElementsAssignment_1_1_1 )
            // InternalEbnfLang.g:959:3: rule__Expression_Concatenation__ElementsAssignment_1_1_1
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
    // InternalEbnfLang.g:968:1: rule__Expression_Exception__Group__0 : rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1 ;
    public final void rule__Expression_Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:972:1: ( rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1 )
            // InternalEbnfLang.g:973:2: rule__Expression_Exception__Group__0__Impl rule__Expression_Exception__Group__1
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
    // InternalEbnfLang.g:980:1: rule__Expression_Exception__Group__0__Impl : ( ruleExpression_Repetition ) ;
    public final void rule__Expression_Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:984:1: ( ( ruleExpression_Repetition ) )
            // InternalEbnfLang.g:985:1: ( ruleExpression_Repetition )
            {
            // InternalEbnfLang.g:985:1: ( ruleExpression_Repetition )
            // InternalEbnfLang.g:986:2: ruleExpression_Repetition
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
    // InternalEbnfLang.g:995:1: rule__Expression_Exception__Group__1 : rule__Expression_Exception__Group__1__Impl ;
    public final void rule__Expression_Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:999:1: ( rule__Expression_Exception__Group__1__Impl )
            // InternalEbnfLang.g:1000:2: rule__Expression_Exception__Group__1__Impl
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
    // InternalEbnfLang.g:1006:1: rule__Expression_Exception__Group__1__Impl : ( ( rule__Expression_Exception__Group_1__0 )* ) ;
    public final void rule__Expression_Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1010:1: ( ( ( rule__Expression_Exception__Group_1__0 )* ) )
            // InternalEbnfLang.g:1011:1: ( ( rule__Expression_Exception__Group_1__0 )* )
            {
            // InternalEbnfLang.g:1011:1: ( ( rule__Expression_Exception__Group_1__0 )* )
            // InternalEbnfLang.g:1012:2: ( rule__Expression_Exception__Group_1__0 )*
            {
             before(grammarAccess.getExpression_ExceptionAccess().getGroup_1()); 
            // InternalEbnfLang.g:1013:2: ( rule__Expression_Exception__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEbnfLang.g:1013:3: rule__Expression_Exception__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Expression_Exception__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalEbnfLang.g:1022:1: rule__Expression_Exception__Group_1__0 : rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1 ;
    public final void rule__Expression_Exception__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1026:1: ( rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1 )
            // InternalEbnfLang.g:1027:2: rule__Expression_Exception__Group_1__0__Impl rule__Expression_Exception__Group_1__1
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
    // InternalEbnfLang.g:1034:1: rule__Expression_Exception__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Exception__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1038:1: ( ( () ) )
            // InternalEbnfLang.g:1039:1: ( () )
            {
            // InternalEbnfLang.g:1039:1: ( () )
            // InternalEbnfLang.g:1040:2: ()
            {
             before(grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0()); 
            // InternalEbnfLang.g:1041:2: ()
            // InternalEbnfLang.g:1041:3: 
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
    // InternalEbnfLang.g:1049:1: rule__Expression_Exception__Group_1__1 : rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2 ;
    public final void rule__Expression_Exception__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1053:1: ( rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2 )
            // InternalEbnfLang.g:1054:2: rule__Expression_Exception__Group_1__1__Impl rule__Expression_Exception__Group_1__2
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
    // InternalEbnfLang.g:1061:1: rule__Expression_Exception__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Expression_Exception__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1065:1: ( ( '-' ) )
            // InternalEbnfLang.g:1066:1: ( '-' )
            {
            // InternalEbnfLang.g:1066:1: ( '-' )
            // InternalEbnfLang.g:1067:2: '-'
            {
             before(grammarAccess.getExpression_ExceptionAccess().getHyphenMinusKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEbnfLang.g:1076:1: rule__Expression_Exception__Group_1__2 : rule__Expression_Exception__Group_1__2__Impl ;
    public final void rule__Expression_Exception__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1080:1: ( rule__Expression_Exception__Group_1__2__Impl )
            // InternalEbnfLang.g:1081:2: rule__Expression_Exception__Group_1__2__Impl
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
    // InternalEbnfLang.g:1087:1: rule__Expression_Exception__Group_1__2__Impl : ( ( rule__Expression_Exception__RightAssignment_1_2 ) ) ;
    public final void rule__Expression_Exception__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1091:1: ( ( ( rule__Expression_Exception__RightAssignment_1_2 ) ) )
            // InternalEbnfLang.g:1092:1: ( ( rule__Expression_Exception__RightAssignment_1_2 ) )
            {
            // InternalEbnfLang.g:1092:1: ( ( rule__Expression_Exception__RightAssignment_1_2 ) )
            // InternalEbnfLang.g:1093:2: ( rule__Expression_Exception__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpression_ExceptionAccess().getRightAssignment_1_2()); 
            // InternalEbnfLang.g:1094:2: ( rule__Expression_Exception__RightAssignment_1_2 )
            // InternalEbnfLang.g:1094:3: rule__Expression_Exception__RightAssignment_1_2
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
    // InternalEbnfLang.g:1103:1: rule__Expression_Repetition__Group_1__0 : rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1 ;
    public final void rule__Expression_Repetition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1107:1: ( rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1 )
            // InternalEbnfLang.g:1108:2: rule__Expression_Repetition__Group_1__0__Impl rule__Expression_Repetition__Group_1__1
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
    // InternalEbnfLang.g:1115:1: rule__Expression_Repetition__Group_1__0__Impl : ( () ) ;
    public final void rule__Expression_Repetition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1119:1: ( ( () ) )
            // InternalEbnfLang.g:1120:1: ( () )
            {
            // InternalEbnfLang.g:1120:1: ( () )
            // InternalEbnfLang.g:1121:2: ()
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0()); 
            // InternalEbnfLang.g:1122:2: ()
            // InternalEbnfLang.g:1122:3: 
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
    // InternalEbnfLang.g:1130:1: rule__Expression_Repetition__Group_1__1 : rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2 ;
    public final void rule__Expression_Repetition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1134:1: ( rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2 )
            // InternalEbnfLang.g:1135:2: rule__Expression_Repetition__Group_1__1__Impl rule__Expression_Repetition__Group_1__2
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
    // InternalEbnfLang.g:1142:1: rule__Expression_Repetition__Group_1__1__Impl : ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) ) ;
    public final void rule__Expression_Repetition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1146:1: ( ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) ) )
            // InternalEbnfLang.g:1147:1: ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) )
            {
            // InternalEbnfLang.g:1147:1: ( ( rule__Expression_Repetition__RepetitionsAssignment_1_1 ) )
            // InternalEbnfLang.g:1148:2: ( rule__Expression_Repetition__RepetitionsAssignment_1_1 )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getRepetitionsAssignment_1_1()); 
            // InternalEbnfLang.g:1149:2: ( rule__Expression_Repetition__RepetitionsAssignment_1_1 )
            // InternalEbnfLang.g:1149:3: rule__Expression_Repetition__RepetitionsAssignment_1_1
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
    // InternalEbnfLang.g:1157:1: rule__Expression_Repetition__Group_1__2 : rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3 ;
    public final void rule__Expression_Repetition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1161:1: ( rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3 )
            // InternalEbnfLang.g:1162:2: rule__Expression_Repetition__Group_1__2__Impl rule__Expression_Repetition__Group_1__3
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
    // InternalEbnfLang.g:1169:1: rule__Expression_Repetition__Group_1__2__Impl : ( '*' ) ;
    public final void rule__Expression_Repetition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1173:1: ( ( '*' ) )
            // InternalEbnfLang.g:1174:1: ( '*' )
            {
            // InternalEbnfLang.g:1174:1: ( '*' )
            // InternalEbnfLang.g:1175:2: '*'
            {
             before(grammarAccess.getExpression_RepetitionAccess().getAsteriskKeyword_1_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalEbnfLang.g:1184:1: rule__Expression_Repetition__Group_1__3 : rule__Expression_Repetition__Group_1__3__Impl ;
    public final void rule__Expression_Repetition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1188:1: ( rule__Expression_Repetition__Group_1__3__Impl )
            // InternalEbnfLang.g:1189:2: rule__Expression_Repetition__Group_1__3__Impl
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
    // InternalEbnfLang.g:1195:1: rule__Expression_Repetition__Group_1__3__Impl : ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) ) ;
    public final void rule__Expression_Repetition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1199:1: ( ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) ) )
            // InternalEbnfLang.g:1200:1: ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) )
            {
            // InternalEbnfLang.g:1200:1: ( ( rule__Expression_Repetition__ExprAssignment_1_3 ) )
            // InternalEbnfLang.g:1201:2: ( rule__Expression_Repetition__ExprAssignment_1_3 )
            {
             before(grammarAccess.getExpression_RepetitionAccess().getExprAssignment_1_3()); 
            // InternalEbnfLang.g:1202:2: ( rule__Expression_Repetition__ExprAssignment_1_3 )
            // InternalEbnfLang.g:1202:3: rule__Expression_Repetition__ExprAssignment_1_3
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
    // InternalEbnfLang.g:1211:1: rule__Expression_Rule_Reference__Group__0 : rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1 ;
    public final void rule__Expression_Rule_Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1215:1: ( rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1 )
            // InternalEbnfLang.g:1216:2: rule__Expression_Rule_Reference__Group__0__Impl rule__Expression_Rule_Reference__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalEbnfLang.g:1223:1: rule__Expression_Rule_Reference__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Rule_Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1227:1: ( ( () ) )
            // InternalEbnfLang.g:1228:1: ( () )
            {
            // InternalEbnfLang.g:1228:1: ( () )
            // InternalEbnfLang.g:1229:2: ()
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0()); 
            // InternalEbnfLang.g:1230:2: ()
            // InternalEbnfLang.g:1230:3: 
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
    // InternalEbnfLang.g:1238:1: rule__Expression_Rule_Reference__Group__1 : rule__Expression_Rule_Reference__Group__1__Impl ;
    public final void rule__Expression_Rule_Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1242:1: ( rule__Expression_Rule_Reference__Group__1__Impl )
            // InternalEbnfLang.g:1243:2: rule__Expression_Rule_Reference__Group__1__Impl
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
    // InternalEbnfLang.g:1249:1: rule__Expression_Rule_Reference__Group__1__Impl : ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) ) ;
    public final void rule__Expression_Rule_Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1253:1: ( ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) ) )
            // InternalEbnfLang.g:1254:1: ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) )
            {
            // InternalEbnfLang.g:1254:1: ( ( rule__Expression_Rule_Reference__RuleAssignment_1 ) )
            // InternalEbnfLang.g:1255:2: ( rule__Expression_Rule_Reference__RuleAssignment_1 )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleAssignment_1()); 
            // InternalEbnfLang.g:1256:2: ( rule__Expression_Rule_Reference__RuleAssignment_1 )
            // InternalEbnfLang.g:1256:3: rule__Expression_Rule_Reference__RuleAssignment_1
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
    // InternalEbnfLang.g:1265:1: rule__Expression_Special_Sequence__Group__0 : rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1 ;
    public final void rule__Expression_Special_Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1269:1: ( rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1 )
            // InternalEbnfLang.g:1270:2: rule__Expression_Special_Sequence__Group__0__Impl rule__Expression_Special_Sequence__Group__1
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
    // InternalEbnfLang.g:1277:1: rule__Expression_Special_Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Special_Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1281:1: ( ( () ) )
            // InternalEbnfLang.g:1282:1: ( () )
            {
            // InternalEbnfLang.g:1282:1: ( () )
            // InternalEbnfLang.g:1283:2: ()
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0()); 
            // InternalEbnfLang.g:1284:2: ()
            // InternalEbnfLang.g:1284:3: 
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
    // InternalEbnfLang.g:1292:1: rule__Expression_Special_Sequence__Group__1 : rule__Expression_Special_Sequence__Group__1__Impl ;
    public final void rule__Expression_Special_Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1296:1: ( rule__Expression_Special_Sequence__Group__1__Impl )
            // InternalEbnfLang.g:1297:2: rule__Expression_Special_Sequence__Group__1__Impl
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
    // InternalEbnfLang.g:1303:1: rule__Expression_Special_Sequence__Group__1__Impl : ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) ) ;
    public final void rule__Expression_Special_Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1307:1: ( ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) ) )
            // InternalEbnfLang.g:1308:1: ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) )
            {
            // InternalEbnfLang.g:1308:1: ( ( rule__Expression_Special_Sequence__TextAssignment_1 ) )
            // InternalEbnfLang.g:1309:2: ( rule__Expression_Special_Sequence__TextAssignment_1 )
            {
             before(grammarAccess.getExpression_Special_SequenceAccess().getTextAssignment_1()); 
            // InternalEbnfLang.g:1310:2: ( rule__Expression_Special_Sequence__TextAssignment_1 )
            // InternalEbnfLang.g:1310:3: rule__Expression_Special_Sequence__TextAssignment_1
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
    // InternalEbnfLang.g:1319:1: rule__Expression_Terminal_Symbol__Group__0 : rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1 ;
    public final void rule__Expression_Terminal_Symbol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1323:1: ( rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1 )
            // InternalEbnfLang.g:1324:2: rule__Expression_Terminal_Symbol__Group__0__Impl rule__Expression_Terminal_Symbol__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalEbnfLang.g:1331:1: rule__Expression_Terminal_Symbol__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Terminal_Symbol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1335:1: ( ( () ) )
            // InternalEbnfLang.g:1336:1: ( () )
            {
            // InternalEbnfLang.g:1336:1: ( () )
            // InternalEbnfLang.g:1337:2: ()
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0()); 
            // InternalEbnfLang.g:1338:2: ()
            // InternalEbnfLang.g:1338:3: 
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
    // InternalEbnfLang.g:1346:1: rule__Expression_Terminal_Symbol__Group__1 : rule__Expression_Terminal_Symbol__Group__1__Impl ;
    public final void rule__Expression_Terminal_Symbol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1350:1: ( rule__Expression_Terminal_Symbol__Group__1__Impl )
            // InternalEbnfLang.g:1351:2: rule__Expression_Terminal_Symbol__Group__1__Impl
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
    // InternalEbnfLang.g:1357:1: rule__Expression_Terminal_Symbol__Group__1__Impl : ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) ) ;
    public final void rule__Expression_Terminal_Symbol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1361:1: ( ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) ) )
            // InternalEbnfLang.g:1362:1: ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) )
            {
            // InternalEbnfLang.g:1362:1: ( ( rule__Expression_Terminal_Symbol__TextAssignment_1 ) )
            // InternalEbnfLang.g:1363:2: ( rule__Expression_Terminal_Symbol__TextAssignment_1 )
            {
             before(grammarAccess.getExpression_Terminal_SymbolAccess().getTextAssignment_1()); 
            // InternalEbnfLang.g:1364:2: ( rule__Expression_Terminal_Symbol__TextAssignment_1 )
            // InternalEbnfLang.g:1364:3: rule__Expression_Terminal_Symbol__TextAssignment_1
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
    // InternalEbnfLang.g:1373:1: rule__Expression_Repetition_Group__Group__0 : rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1 ;
    public final void rule__Expression_Repetition_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1377:1: ( rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1 )
            // InternalEbnfLang.g:1378:2: rule__Expression_Repetition_Group__Group__0__Impl rule__Expression_Repetition_Group__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalEbnfLang.g:1385:1: rule__Expression_Repetition_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Repetition_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1389:1: ( ( () ) )
            // InternalEbnfLang.g:1390:1: ( () )
            {
            // InternalEbnfLang.g:1390:1: ( () )
            // InternalEbnfLang.g:1391:2: ()
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0()); 
            // InternalEbnfLang.g:1392:2: ()
            // InternalEbnfLang.g:1392:3: 
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
    // InternalEbnfLang.g:1400:1: rule__Expression_Repetition_Group__Group__1 : rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2 ;
    public final void rule__Expression_Repetition_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1404:1: ( rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2 )
            // InternalEbnfLang.g:1405:2: rule__Expression_Repetition_Group__Group__1__Impl rule__Expression_Repetition_Group__Group__2
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
    // InternalEbnfLang.g:1412:1: rule__Expression_Repetition_Group__Group__1__Impl : ( '{' ) ;
    public final void rule__Expression_Repetition_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1416:1: ( ( '{' ) )
            // InternalEbnfLang.g:1417:1: ( '{' )
            {
            // InternalEbnfLang.g:1417:1: ( '{' )
            // InternalEbnfLang.g:1418:2: '{'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEbnfLang.g:1427:1: rule__Expression_Repetition_Group__Group__2 : rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3 ;
    public final void rule__Expression_Repetition_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1431:1: ( rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3 )
            // InternalEbnfLang.g:1432:2: rule__Expression_Repetition_Group__Group__2__Impl rule__Expression_Repetition_Group__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalEbnfLang.g:1439:1: rule__Expression_Repetition_Group__Group__2__Impl : ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Repetition_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1443:1: ( ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1444:1: ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1444:1: ( ( rule__Expression_Repetition_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1445:2: ( rule__Expression_Repetition_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1446:2: ( rule__Expression_Repetition_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1446:3: rule__Expression_Repetition_Group__ExprAssignment_2
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
    // InternalEbnfLang.g:1454:1: rule__Expression_Repetition_Group__Group__3 : rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4 ;
    public final void rule__Expression_Repetition_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1458:1: ( rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4 )
            // InternalEbnfLang.g:1459:2: rule__Expression_Repetition_Group__Group__3__Impl rule__Expression_Repetition_Group__Group__4
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
    // InternalEbnfLang.g:1466:1: rule__Expression_Repetition_Group__Group__3__Impl : ( '}' ) ;
    public final void rule__Expression_Repetition_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1470:1: ( ( '}' ) )
            // InternalEbnfLang.g:1471:1: ( '}' )
            {
            // InternalEbnfLang.g:1471:1: ( '}' )
            // InternalEbnfLang.g:1472:2: '}'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getRightCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEbnfLang.g:1481:1: rule__Expression_Repetition_Group__Group__4 : rule__Expression_Repetition_Group__Group__4__Impl ;
    public final void rule__Expression_Repetition_Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1485:1: ( rule__Expression_Repetition_Group__Group__4__Impl )
            // InternalEbnfLang.g:1486:2: rule__Expression_Repetition_Group__Group__4__Impl
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
    // InternalEbnfLang.g:1492:1: rule__Expression_Repetition_Group__Group__4__Impl : ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? ) ;
    public final void rule__Expression_Repetition_Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1496:1: ( ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? ) )
            // InternalEbnfLang.g:1497:1: ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? )
            {
            // InternalEbnfLang.g:1497:1: ( ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )? )
            // InternalEbnfLang.g:1498:2: ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )?
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneAssignment_4()); 
            // InternalEbnfLang.g:1499:2: ( rule__Expression_Repetition_Group__AtLeastOneAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=16 && LA9_1<=19)||LA9_1==22||LA9_1==24||LA9_1==26) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalEbnfLang.g:1499:3: rule__Expression_Repetition_Group__AtLeastOneAssignment_4
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
    // InternalEbnfLang.g:1508:1: rule__Expression_Optional_Group__Group__0 : rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1 ;
    public final void rule__Expression_Optional_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1512:1: ( rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1 )
            // InternalEbnfLang.g:1513:2: rule__Expression_Optional_Group__Group__0__Impl rule__Expression_Optional_Group__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalEbnfLang.g:1520:1: rule__Expression_Optional_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Optional_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1524:1: ( ( () ) )
            // InternalEbnfLang.g:1525:1: ( () )
            {
            // InternalEbnfLang.g:1525:1: ( () )
            // InternalEbnfLang.g:1526:2: ()
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0()); 
            // InternalEbnfLang.g:1527:2: ()
            // InternalEbnfLang.g:1527:3: 
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
    // InternalEbnfLang.g:1535:1: rule__Expression_Optional_Group__Group__1 : rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2 ;
    public final void rule__Expression_Optional_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1539:1: ( rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2 )
            // InternalEbnfLang.g:1540:2: rule__Expression_Optional_Group__Group__1__Impl rule__Expression_Optional_Group__Group__2
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
    // InternalEbnfLang.g:1547:1: rule__Expression_Optional_Group__Group__1__Impl : ( '[' ) ;
    public final void rule__Expression_Optional_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1551:1: ( ( '[' ) )
            // InternalEbnfLang.g:1552:1: ( '[' )
            {
            // InternalEbnfLang.g:1552:1: ( '[' )
            // InternalEbnfLang.g:1553:2: '['
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getLeftSquareBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEbnfLang.g:1562:1: rule__Expression_Optional_Group__Group__2 : rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3 ;
    public final void rule__Expression_Optional_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1566:1: ( rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3 )
            // InternalEbnfLang.g:1567:2: rule__Expression_Optional_Group__Group__2__Impl rule__Expression_Optional_Group__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalEbnfLang.g:1574:1: rule__Expression_Optional_Group__Group__2__Impl : ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Optional_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1578:1: ( ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1579:1: ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1579:1: ( ( rule__Expression_Optional_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1580:2: ( rule__Expression_Optional_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1581:2: ( rule__Expression_Optional_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1581:3: rule__Expression_Optional_Group__ExprAssignment_2
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
    // InternalEbnfLang.g:1589:1: rule__Expression_Optional_Group__Group__3 : rule__Expression_Optional_Group__Group__3__Impl ;
    public final void rule__Expression_Optional_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1593:1: ( rule__Expression_Optional_Group__Group__3__Impl )
            // InternalEbnfLang.g:1594:2: rule__Expression_Optional_Group__Group__3__Impl
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
    // InternalEbnfLang.g:1600:1: rule__Expression_Optional_Group__Group__3__Impl : ( ']' ) ;
    public final void rule__Expression_Optional_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1604:1: ( ( ']' ) )
            // InternalEbnfLang.g:1605:1: ( ']' )
            {
            // InternalEbnfLang.g:1605:1: ( ']' )
            // InternalEbnfLang.g:1606:2: ']'
            {
             before(grammarAccess.getExpression_Optional_GroupAccess().getRightSquareBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalEbnfLang.g:1616:1: rule__Expression_Group__Group__0 : rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1 ;
    public final void rule__Expression_Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1620:1: ( rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1 )
            // InternalEbnfLang.g:1621:2: rule__Expression_Group__Group__0__Impl rule__Expression_Group__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalEbnfLang.g:1628:1: rule__Expression_Group__Group__0__Impl : ( () ) ;
    public final void rule__Expression_Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1632:1: ( ( () ) )
            // InternalEbnfLang.g:1633:1: ( () )
            {
            // InternalEbnfLang.g:1633:1: ( () )
            // InternalEbnfLang.g:1634:2: ()
            {
             before(grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0()); 
            // InternalEbnfLang.g:1635:2: ()
            // InternalEbnfLang.g:1635:3: 
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
    // InternalEbnfLang.g:1643:1: rule__Expression_Group__Group__1 : rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2 ;
    public final void rule__Expression_Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1647:1: ( rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2 )
            // InternalEbnfLang.g:1648:2: rule__Expression_Group__Group__1__Impl rule__Expression_Group__Group__2
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
    // InternalEbnfLang.g:1655:1: rule__Expression_Group__Group__1__Impl : ( '(' ) ;
    public final void rule__Expression_Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1659:1: ( ( '(' ) )
            // InternalEbnfLang.g:1660:1: ( '(' )
            {
            // InternalEbnfLang.g:1660:1: ( '(' )
            // InternalEbnfLang.g:1661:2: '('
            {
             before(grammarAccess.getExpression_GroupAccess().getLeftParenthesisKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalEbnfLang.g:1670:1: rule__Expression_Group__Group__2 : rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3 ;
    public final void rule__Expression_Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1674:1: ( rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3 )
            // InternalEbnfLang.g:1675:2: rule__Expression_Group__Group__2__Impl rule__Expression_Group__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalEbnfLang.g:1682:1: rule__Expression_Group__Group__2__Impl : ( ( rule__Expression_Group__ExprAssignment_2 ) ) ;
    public final void rule__Expression_Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1686:1: ( ( ( rule__Expression_Group__ExprAssignment_2 ) ) )
            // InternalEbnfLang.g:1687:1: ( ( rule__Expression_Group__ExprAssignment_2 ) )
            {
            // InternalEbnfLang.g:1687:1: ( ( rule__Expression_Group__ExprAssignment_2 ) )
            // InternalEbnfLang.g:1688:2: ( rule__Expression_Group__ExprAssignment_2 )
            {
             before(grammarAccess.getExpression_GroupAccess().getExprAssignment_2()); 
            // InternalEbnfLang.g:1689:2: ( rule__Expression_Group__ExprAssignment_2 )
            // InternalEbnfLang.g:1689:3: rule__Expression_Group__ExprAssignment_2
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
    // InternalEbnfLang.g:1697:1: rule__Expression_Group__Group__3 : rule__Expression_Group__Group__3__Impl ;
    public final void rule__Expression_Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1701:1: ( rule__Expression_Group__Group__3__Impl )
            // InternalEbnfLang.g:1702:2: rule__Expression_Group__Group__3__Impl
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
    // InternalEbnfLang.g:1708:1: rule__Expression_Group__Group__3__Impl : ( ')' ) ;
    public final void rule__Expression_Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1712:1: ( ( ')' ) )
            // InternalEbnfLang.g:1713:1: ( ')' )
            {
            // InternalEbnfLang.g:1713:1: ( ')' )
            // InternalEbnfLang.g:1714:2: ')'
            {
             before(grammarAccess.getExpression_GroupAccess().getRightParenthesisKeyword_3()); 
            match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__EbnfGrammar__RulesAssignment_1"
    // InternalEbnfLang.g:1724:1: rule__EbnfGrammar__RulesAssignment_1 : ( ruleProductionRule ) ;
    public final void rule__EbnfGrammar__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1728:1: ( ( ruleProductionRule ) )
            // InternalEbnfLang.g:1729:2: ( ruleProductionRule )
            {
            // InternalEbnfLang.g:1729:2: ( ruleProductionRule )
            // InternalEbnfLang.g:1730:3: ruleProductionRule
            {
             before(grammarAccess.getEbnfGrammarAccess().getRulesProductionRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProductionRule();

            state._fsp--;

             after(grammarAccess.getEbnfGrammarAccess().getRulesProductionRuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EbnfGrammar__RulesAssignment_1"


    // $ANTLR start "rule__ProductionRule__NameAssignment_0"
    // InternalEbnfLang.g:1739:1: rule__ProductionRule__NameAssignment_0 : ( RULE_NAME ) ;
    public final void rule__ProductionRule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1743:1: ( ( RULE_NAME ) )
            // InternalEbnfLang.g:1744:2: ( RULE_NAME )
            {
            // InternalEbnfLang.g:1744:2: ( RULE_NAME )
            // InternalEbnfLang.g:1745:3: RULE_NAME
            {
             before(grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_0_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ProductionRule__NameAssignment_0"


    // $ANTLR start "rule__ProductionRule__ExprAssignment_2"
    // InternalEbnfLang.g:1754:1: rule__ProductionRule__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__ProductionRule__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1758:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:1759:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:1759:2: ( ruleExpression )
            // InternalEbnfLang.g:1760:3: ruleExpression
            {
             before(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ProductionRule__ExprAssignment_2"


    // $ANTLR start "rule__Expression_Alternative__ElementsAssignment_1_1_1"
    // InternalEbnfLang.g:1769:1: rule__Expression_Alternative__ElementsAssignment_1_1_1 : ( ruleExpression_Concatenation ) ;
    public final void rule__Expression_Alternative__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1773:1: ( ( ruleExpression_Concatenation ) )
            // InternalEbnfLang.g:1774:2: ( ruleExpression_Concatenation )
            {
            // InternalEbnfLang.g:1774:2: ( ruleExpression_Concatenation )
            // InternalEbnfLang.g:1775:3: ruleExpression_Concatenation
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
    // InternalEbnfLang.g:1784:1: rule__Expression_Concatenation__ElementsAssignment_1_1_1 : ( ruleExpression_Exception ) ;
    public final void rule__Expression_Concatenation__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1788:1: ( ( ruleExpression_Exception ) )
            // InternalEbnfLang.g:1789:2: ( ruleExpression_Exception )
            {
            // InternalEbnfLang.g:1789:2: ( ruleExpression_Exception )
            // InternalEbnfLang.g:1790:3: ruleExpression_Exception
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
    // InternalEbnfLang.g:1799:1: rule__Expression_Exception__RightAssignment_1_2 : ( ruleExpression_Repetition ) ;
    public final void rule__Expression_Exception__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1803:1: ( ( ruleExpression_Repetition ) )
            // InternalEbnfLang.g:1804:2: ( ruleExpression_Repetition )
            {
            // InternalEbnfLang.g:1804:2: ( ruleExpression_Repetition )
            // InternalEbnfLang.g:1805:3: ruleExpression_Repetition
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
    // InternalEbnfLang.g:1814:1: rule__Expression_Repetition__RepetitionsAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__Expression_Repetition__RepetitionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1818:1: ( ( RULE_NUMBER ) )
            // InternalEbnfLang.g:1819:2: ( RULE_NUMBER )
            {
            // InternalEbnfLang.g:1819:2: ( RULE_NUMBER )
            // InternalEbnfLang.g:1820:3: RULE_NUMBER
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
    // InternalEbnfLang.g:1829:1: rule__Expression_Repetition__ExprAssignment_1_3 : ( ruleExpression_Terminal ) ;
    public final void rule__Expression_Repetition__ExprAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1833:1: ( ( ruleExpression_Terminal ) )
            // InternalEbnfLang.g:1834:2: ( ruleExpression_Terminal )
            {
            // InternalEbnfLang.g:1834:2: ( ruleExpression_Terminal )
            // InternalEbnfLang.g:1835:3: ruleExpression_Terminal
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
    // InternalEbnfLang.g:1844:1: rule__Expression_Rule_Reference__RuleAssignment_1 : ( ( RULE_NAME ) ) ;
    public final void rule__Expression_Rule_Reference__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1848:1: ( ( ( RULE_NAME ) ) )
            // InternalEbnfLang.g:1849:2: ( ( RULE_NAME ) )
            {
            // InternalEbnfLang.g:1849:2: ( ( RULE_NAME ) )
            // InternalEbnfLang.g:1850:3: ( RULE_NAME )
            {
             before(grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0()); 
            // InternalEbnfLang.g:1851:3: ( RULE_NAME )
            // InternalEbnfLang.g:1852:4: RULE_NAME
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
    // InternalEbnfLang.g:1863:1: rule__Expression_Special_Sequence__TextAssignment_1 : ( RULE_SPECIAL_SEQUENCE ) ;
    public final void rule__Expression_Special_Sequence__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1867:1: ( ( RULE_SPECIAL_SEQUENCE ) )
            // InternalEbnfLang.g:1868:2: ( RULE_SPECIAL_SEQUENCE )
            {
            // InternalEbnfLang.g:1868:2: ( RULE_SPECIAL_SEQUENCE )
            // InternalEbnfLang.g:1869:3: RULE_SPECIAL_SEQUENCE
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
    // InternalEbnfLang.g:1878:1: rule__Expression_Terminal_Symbol__TextAssignment_1 : ( RULE_TERMINAL_SYMBOL ) ;
    public final void rule__Expression_Terminal_Symbol__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1882:1: ( ( RULE_TERMINAL_SYMBOL ) )
            // InternalEbnfLang.g:1883:2: ( RULE_TERMINAL_SYMBOL )
            {
            // InternalEbnfLang.g:1883:2: ( RULE_TERMINAL_SYMBOL )
            // InternalEbnfLang.g:1884:3: RULE_TERMINAL_SYMBOL
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
    // InternalEbnfLang.g:1893:1: rule__Expression_Repetition_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Repetition_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1897:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:1898:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:1898:2: ( ruleExpression )
            // InternalEbnfLang.g:1899:3: ruleExpression
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
    // InternalEbnfLang.g:1908:1: rule__Expression_Repetition_Group__AtLeastOneAssignment_4 : ( ( '-' ) ) ;
    public final void rule__Expression_Repetition_Group__AtLeastOneAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1912:1: ( ( ( '-' ) ) )
            // InternalEbnfLang.g:1913:2: ( ( '-' ) )
            {
            // InternalEbnfLang.g:1913:2: ( ( '-' ) )
            // InternalEbnfLang.g:1914:3: ( '-' )
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 
            // InternalEbnfLang.g:1915:3: ( '-' )
            // InternalEbnfLang.g:1916:4: '-'
            {
             before(grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalEbnfLang.g:1927:1: rule__Expression_Optional_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Optional_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1931:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:1932:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:1932:2: ( ruleExpression )
            // InternalEbnfLang.g:1933:3: ruleExpression
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
    // InternalEbnfLang.g:1942:1: rule__Expression_Group__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__Expression_Group__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEbnfLang.g:1946:1: ( ( ruleExpression ) )
            // InternalEbnfLang.g:1947:2: ( ruleExpression )
            {
            // InternalEbnfLang.g:1947:2: ( ruleExpression )
            // InternalEbnfLang.g:1948:3: ruleExpression
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002A000F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002A000D0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});

}