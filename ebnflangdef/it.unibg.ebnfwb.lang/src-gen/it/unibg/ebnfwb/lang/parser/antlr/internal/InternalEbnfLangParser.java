package it.unibg.ebnfwb.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibg.ebnfwb.lang.services.EbnfLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEbnfLangParser extends AbstractInternalAntlrParser {
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

        public InternalEbnfLangParser(TokenStream input, EbnfLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EbnfGrammar";
       	}

       	@Override
       	protected EbnfLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEbnfGrammar"
    // InternalEbnfLang.g:64:1: entryRuleEbnfGrammar returns [EObject current=null] : iv_ruleEbnfGrammar= ruleEbnfGrammar EOF ;
    public final EObject entryRuleEbnfGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEbnfGrammar = null;


        try {
            // InternalEbnfLang.g:64:52: (iv_ruleEbnfGrammar= ruleEbnfGrammar EOF )
            // InternalEbnfLang.g:65:2: iv_ruleEbnfGrammar= ruleEbnfGrammar EOF
            {
             newCompositeNode(grammarAccess.getEbnfGrammarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEbnfGrammar=ruleEbnfGrammar();

            state._fsp--;

             current =iv_ruleEbnfGrammar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEbnfGrammar"


    // $ANTLR start "ruleEbnfGrammar"
    // InternalEbnfLang.g:71:1: ruleEbnfGrammar returns [EObject current=null] : ( () ( (lv_lines_1_0= ruleLine ) )* ) ;
    public final EObject ruleEbnfGrammar() throws RecognitionException {
        EObject current = null;

        EObject lv_lines_1_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:77:2: ( ( () ( (lv_lines_1_0= ruleLine ) )* ) )
            // InternalEbnfLang.g:78:2: ( () ( (lv_lines_1_0= ruleLine ) )* )
            {
            // InternalEbnfLang.g:78:2: ( () ( (lv_lines_1_0= ruleLine ) )* )
            // InternalEbnfLang.g:79:3: () ( (lv_lines_1_0= ruleLine ) )*
            {
            // InternalEbnfLang.g:79:3: ()
            // InternalEbnfLang.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEbnfGrammarAccess().getEbnfGrammarAction_0(),
            					current);
            			

            }

            // InternalEbnfLang.g:86:3: ( (lv_lines_1_0= ruleLine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NAME||LA1_0==RULE_EBNF_COMMENT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEbnfLang.g:87:4: (lv_lines_1_0= ruleLine )
            	    {
            	    // InternalEbnfLang.g:87:4: (lv_lines_1_0= ruleLine )
            	    // InternalEbnfLang.g:88:5: lv_lines_1_0= ruleLine
            	    {

            	    					newCompositeNode(grammarAccess.getEbnfGrammarAccess().getLinesLineParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_lines_1_0=ruleLine();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEbnfGrammarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lines",
            	    						lv_lines_1_0,
            	    						"it.unibg.ebnfwb.lang.EbnfLang.Line");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEbnfGrammar"


    // $ANTLR start "entryRuleLine"
    // InternalEbnfLang.g:109:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalEbnfLang.g:109:45: (iv_ruleLine= ruleLine EOF )
            // InternalEbnfLang.g:110:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalEbnfLang.g:116:1: ruleLine returns [EObject current=null] : (this_CommentEBNF_0= ruleCommentEBNF | this_ProductionRule_1= ruleProductionRule ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject this_CommentEBNF_0 = null;

        EObject this_ProductionRule_1 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:122:2: ( (this_CommentEBNF_0= ruleCommentEBNF | this_ProductionRule_1= ruleProductionRule ) )
            // InternalEbnfLang.g:123:2: (this_CommentEBNF_0= ruleCommentEBNF | this_ProductionRule_1= ruleProductionRule )
            {
            // InternalEbnfLang.g:123:2: (this_CommentEBNF_0= ruleCommentEBNF | this_ProductionRule_1= ruleProductionRule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_EBNF_COMMENT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_NAME) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEbnfLang.g:124:3: this_CommentEBNF_0= ruleCommentEBNF
                    {

                    			newCompositeNode(grammarAccess.getLineAccess().getCommentEBNFParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommentEBNF_0=ruleCommentEBNF();

                    state._fsp--;


                    			current = this_CommentEBNF_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:133:3: this_ProductionRule_1= ruleProductionRule
                    {

                    			newCompositeNode(grammarAccess.getLineAccess().getProductionRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductionRule_1=ruleProductionRule();

                    state._fsp--;


                    			current = this_ProductionRule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleProductionRule"
    // InternalEbnfLang.g:145:1: entryRuleProductionRule returns [EObject current=null] : iv_ruleProductionRule= ruleProductionRule EOF ;
    public final EObject entryRuleProductionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductionRule = null;


        try {
            // InternalEbnfLang.g:145:55: (iv_ruleProductionRule= ruleProductionRule EOF )
            // InternalEbnfLang.g:146:2: iv_ruleProductionRule= ruleProductionRule EOF
            {
             newCompositeNode(grammarAccess.getProductionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductionRule=ruleProductionRule();

            state._fsp--;

             current =iv_ruleProductionRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductionRule"


    // $ANTLR start "ruleProductionRule"
    // InternalEbnfLang.g:152:1: ruleProductionRule returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleProductionRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:158:2: ( ( () ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // InternalEbnfLang.g:159:2: ( () ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // InternalEbnfLang.g:159:2: ( () ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ';' )
            // InternalEbnfLang.g:160:3: () ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '=' ( (lv_expr_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // InternalEbnfLang.g:160:3: ()
            // InternalEbnfLang.g:161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProductionRuleAccess().getProductionRuleAction_0(),
            					current);
            			

            }

            // InternalEbnfLang.g:167:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalEbnfLang.g:168:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalEbnfLang.g:168:4: (lv_name_1_0= RULE_NAME )
            // InternalEbnfLang.g:169:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProductionRuleAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductionRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.unibg.ebnfwb.lang.EbnfLang.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProductionRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalEbnfLang.g:189:3: ( (lv_expr_3_0= ruleExpression ) )
            // InternalEbnfLang.g:190:4: (lv_expr_3_0= ruleExpression )
            {
            // InternalEbnfLang.g:190:4: (lv_expr_3_0= ruleExpression )
            // InternalEbnfLang.g:191:5: lv_expr_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getProductionRuleAccess().getExprExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_expr_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductionRuleRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_3_0,
            						"it.unibg.ebnfwb.lang.EbnfLang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProductionRuleAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductionRule"


    // $ANTLR start "entryRuleExpression"
    // InternalEbnfLang.g:216:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEbnfLang.g:216:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEbnfLang.g:217:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEbnfLang.g:223:1: ruleExpression returns [EObject current=null] : this_Expression_Alternative_0= ruleExpression_Alternative ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_Alternative_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:229:2: (this_Expression_Alternative_0= ruleExpression_Alternative )
            // InternalEbnfLang.g:230:2: this_Expression_Alternative_0= ruleExpression_Alternative
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getExpression_AlternativeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression_Alternative_0=ruleExpression_Alternative();

            state._fsp--;


            		current = this_Expression_Alternative_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_Alternative"
    // InternalEbnfLang.g:241:1: entryRuleExpression_Alternative returns [EObject current=null] : iv_ruleExpression_Alternative= ruleExpression_Alternative EOF ;
    public final EObject entryRuleExpression_Alternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Alternative = null;


        try {
            // InternalEbnfLang.g:241:63: (iv_ruleExpression_Alternative= ruleExpression_Alternative EOF )
            // InternalEbnfLang.g:242:2: iv_ruleExpression_Alternative= ruleExpression_Alternative EOF
            {
             newCompositeNode(grammarAccess.getExpression_AlternativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Alternative=ruleExpression_Alternative();

            state._fsp--;

             current =iv_ruleExpression_Alternative; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Alternative"


    // $ANTLR start "ruleExpression_Alternative"
    // InternalEbnfLang.g:248:1: ruleExpression_Alternative returns [EObject current=null] : (this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )? ) ;
    public final EObject ruleExpression_Alternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression_Concatenation_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:254:2: ( (this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )? ) )
            // InternalEbnfLang.g:255:2: (this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )? )
            {
            // InternalEbnfLang.g:255:2: (this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )? )
            // InternalEbnfLang.g:256:3: this_Expression_Concatenation_0= ruleExpression_Concatenation ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getExpression_AlternativeAccess().getExpression_ConcatenationParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Expression_Concatenation_0=ruleExpression_Concatenation();

            state._fsp--;


            			current = this_Expression_Concatenation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEbnfLang.g:264:3: ( () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEbnfLang.g:265:4: () (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+
                    {
                    // InternalEbnfLang.g:265:4: ()
                    // InternalEbnfLang.g:266:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getExpression_AlternativeAccess().getExpression_AlternativeElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEbnfLang.g:272:4: (otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalEbnfLang.g:273:5: otherlv_2= '|' ( (lv_elements_3_0= ruleExpression_Concatenation ) )
                    	    {
                    	    otherlv_2=(Token)match(input,18,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getExpression_AlternativeAccess().getVerticalLineKeyword_1_1_0());
                    	    				
                    	    // InternalEbnfLang.g:277:5: ( (lv_elements_3_0= ruleExpression_Concatenation ) )
                    	    // InternalEbnfLang.g:278:6: (lv_elements_3_0= ruleExpression_Concatenation )
                    	    {
                    	    // InternalEbnfLang.g:278:6: (lv_elements_3_0= ruleExpression_Concatenation )
                    	    // InternalEbnfLang.g:279:7: lv_elements_3_0= ruleExpression_Concatenation
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpression_AlternativeAccess().getElementsExpression_ConcatenationParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_elements_3_0=ruleExpression_Concatenation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpression_AlternativeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"it.unibg.ebnfwb.lang.EbnfLang.Expression_Concatenation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Alternative"


    // $ANTLR start "entryRuleExpression_Concatenation"
    // InternalEbnfLang.g:302:1: entryRuleExpression_Concatenation returns [EObject current=null] : iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF ;
    public final EObject entryRuleExpression_Concatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Concatenation = null;


        try {
            // InternalEbnfLang.g:302:65: (iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF )
            // InternalEbnfLang.g:303:2: iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF
            {
             newCompositeNode(grammarAccess.getExpression_ConcatenationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Concatenation=ruleExpression_Concatenation();

            state._fsp--;

             current =iv_ruleExpression_Concatenation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Concatenation"


    // $ANTLR start "ruleExpression_Concatenation"
    // InternalEbnfLang.g:309:1: ruleExpression_Concatenation returns [EObject current=null] : (this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )? ) ;
    public final EObject ruleExpression_Concatenation() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression_Exception_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:315:2: ( (this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )? ) )
            // InternalEbnfLang.g:316:2: (this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )? )
            {
            // InternalEbnfLang.g:316:2: (this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )? )
            // InternalEbnfLang.g:317:3: this_Expression_Exception_0= ruleExpression_Exception ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )?
            {

            			newCompositeNode(grammarAccess.getExpression_ConcatenationAccess().getExpression_ExceptionParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_Expression_Exception_0=ruleExpression_Exception();

            state._fsp--;


            			current = this_Expression_Exception_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEbnfLang.g:325:3: ( () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEbnfLang.g:326:4: () (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+
                    {
                    // InternalEbnfLang.g:326:4: ()
                    // InternalEbnfLang.g:327:5: 
                    {

                    					current = forceCreateModelElementAndAdd(
                    						grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationElementsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEbnfLang.g:333:4: (otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEbnfLang.g:334:5: otherlv_2= ',' ( (lv_elements_3_0= ruleExpression_Exception ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getExpression_ConcatenationAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalEbnfLang.g:338:5: ( (lv_elements_3_0= ruleExpression_Exception ) )
                    	    // InternalEbnfLang.g:339:6: (lv_elements_3_0= ruleExpression_Exception )
                    	    {
                    	    // InternalEbnfLang.g:339:6: (lv_elements_3_0= ruleExpression_Exception )
                    	    // InternalEbnfLang.g:340:7: lv_elements_3_0= ruleExpression_Exception
                    	    {

                    	    							newCompositeNode(grammarAccess.getExpression_ConcatenationAccess().getElementsExpression_ExceptionParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_elements_3_0=ruleExpression_Exception();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExpression_ConcatenationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"it.unibg.ebnfwb.lang.EbnfLang.Expression_Exception");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Concatenation"


    // $ANTLR start "entryRuleExpression_Exception"
    // InternalEbnfLang.g:363:1: entryRuleExpression_Exception returns [EObject current=null] : iv_ruleExpression_Exception= ruleExpression_Exception EOF ;
    public final EObject entryRuleExpression_Exception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Exception = null;


        try {
            // InternalEbnfLang.g:363:61: (iv_ruleExpression_Exception= ruleExpression_Exception EOF )
            // InternalEbnfLang.g:364:2: iv_ruleExpression_Exception= ruleExpression_Exception EOF
            {
             newCompositeNode(grammarAccess.getExpression_ExceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Exception=ruleExpression_Exception();

            state._fsp--;

             current =iv_ruleExpression_Exception; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Exception"


    // $ANTLR start "ruleExpression_Exception"
    // InternalEbnfLang.g:370:1: ruleExpression_Exception returns [EObject current=null] : (this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )* ) ;
    public final EObject ruleExpression_Exception() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Expression_Repetition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:376:2: ( (this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )* ) )
            // InternalEbnfLang.g:377:2: (this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )* )
            {
            // InternalEbnfLang.g:377:2: (this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )* )
            // InternalEbnfLang.g:378:3: this_Expression_Repetition_0= ruleExpression_Repetition ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpression_ExceptionAccess().getExpression_RepetitionParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Expression_Repetition_0=ruleExpression_Repetition();

            state._fsp--;


            			current = this_Expression_Repetition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEbnfLang.g:386:3: ( () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEbnfLang.g:387:4: () otherlv_2= '-' ( (lv_right_3_0= ruleExpression_Repetition ) )
            	    {
            	    // InternalEbnfLang.g:387:4: ()
            	    // InternalEbnfLang.g:388:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpression_ExceptionAccess().getExpression_ExceptionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getExpression_ExceptionAccess().getHyphenMinusKeyword_1_1());
            	    			
            	    // InternalEbnfLang.g:398:4: ( (lv_right_3_0= ruleExpression_Repetition ) )
            	    // InternalEbnfLang.g:399:5: (lv_right_3_0= ruleExpression_Repetition )
            	    {
            	    // InternalEbnfLang.g:399:5: (lv_right_3_0= ruleExpression_Repetition )
            	    // InternalEbnfLang.g:400:6: lv_right_3_0= ruleExpression_Repetition
            	    {

            	    						newCompositeNode(grammarAccess.getExpression_ExceptionAccess().getRightExpression_RepetitionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleExpression_Repetition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpression_ExceptionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"it.unibg.ebnfwb.lang.EbnfLang.Expression_Repetition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Exception"


    // $ANTLR start "entryRuleExpression_Repetition"
    // InternalEbnfLang.g:422:1: entryRuleExpression_Repetition returns [EObject current=null] : iv_ruleExpression_Repetition= ruleExpression_Repetition EOF ;
    public final EObject entryRuleExpression_Repetition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Repetition = null;


        try {
            // InternalEbnfLang.g:422:62: (iv_ruleExpression_Repetition= ruleExpression_Repetition EOF )
            // InternalEbnfLang.g:423:2: iv_ruleExpression_Repetition= ruleExpression_Repetition EOF
            {
             newCompositeNode(grammarAccess.getExpression_RepetitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Repetition=ruleExpression_Repetition();

            state._fsp--;

             current =iv_ruleExpression_Repetition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Repetition"


    // $ANTLR start "ruleExpression_Repetition"
    // InternalEbnfLang.g:429:1: ruleExpression_Repetition returns [EObject current=null] : (this_Expression_Terminal_0= ruleExpression_Terminal | ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) ) ) ;
    public final EObject ruleExpression_Repetition() throws RecognitionException {
        EObject current = null;

        Token lv_repetitions_2_0=null;
        Token otherlv_3=null;
        EObject this_Expression_Terminal_0 = null;

        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:435:2: ( (this_Expression_Terminal_0= ruleExpression_Terminal | ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) ) ) )
            // InternalEbnfLang.g:436:2: (this_Expression_Terminal_0= ruleExpression_Terminal | ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) ) )
            {
            // InternalEbnfLang.g:436:2: (this_Expression_Terminal_0= ruleExpression_Terminal | ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_NAME||(LA8_0>=RULE_SPECIAL_SEQUENCE && LA8_0<=RULE_TERMINAL_SYMBOL)||LA8_0==22||LA8_0==24||LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_NUMBER) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEbnfLang.g:437:3: this_Expression_Terminal_0= ruleExpression_Terminal
                    {

                    			newCompositeNode(grammarAccess.getExpression_RepetitionAccess().getExpression_TerminalParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Terminal_0=ruleExpression_Terminal();

                    state._fsp--;


                    			current = this_Expression_Terminal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:446:3: ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) )
                    {
                    // InternalEbnfLang.g:446:3: ( () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) ) )
                    // InternalEbnfLang.g:447:4: () ( (lv_repetitions_2_0= RULE_NUMBER ) ) otherlv_3= '*' ( (lv_expr_4_0= ruleExpression_Terminal ) )
                    {
                    // InternalEbnfLang.g:447:4: ()
                    // InternalEbnfLang.g:448:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpression_RepetitionAccess().getExpression_RepetitionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalEbnfLang.g:454:4: ( (lv_repetitions_2_0= RULE_NUMBER ) )
                    // InternalEbnfLang.g:455:5: (lv_repetitions_2_0= RULE_NUMBER )
                    {
                    // InternalEbnfLang.g:455:5: (lv_repetitions_2_0= RULE_NUMBER )
                    // InternalEbnfLang.g:456:6: lv_repetitions_2_0= RULE_NUMBER
                    {
                    lv_repetitions_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_10); 

                    						newLeafNode(lv_repetitions_2_0, grammarAccess.getExpression_RepetitionAccess().getRepetitionsNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExpression_RepetitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"repetitions",
                    							lv_repetitions_2_0,
                    							"it.unibg.ebnfwb.lang.EbnfLang.NUMBER");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpression_RepetitionAccess().getAsteriskKeyword_1_2());
                    			
                    // InternalEbnfLang.g:476:4: ( (lv_expr_4_0= ruleExpression_Terminal ) )
                    // InternalEbnfLang.g:477:5: (lv_expr_4_0= ruleExpression_Terminal )
                    {
                    // InternalEbnfLang.g:477:5: (lv_expr_4_0= ruleExpression_Terminal )
                    // InternalEbnfLang.g:478:6: lv_expr_4_0= ruleExpression_Terminal
                    {

                    						newCompositeNode(grammarAccess.getExpression_RepetitionAccess().getExprExpression_TerminalParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_4_0=ruleExpression_Terminal();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpression_RepetitionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_4_0,
                    							"it.unibg.ebnfwb.lang.EbnfLang.Expression_Terminal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Repetition"


    // $ANTLR start "entryRuleExpression_Terminal"
    // InternalEbnfLang.g:500:1: entryRuleExpression_Terminal returns [EObject current=null] : iv_ruleExpression_Terminal= ruleExpression_Terminal EOF ;
    public final EObject entryRuleExpression_Terminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Terminal = null;


        try {
            // InternalEbnfLang.g:500:60: (iv_ruleExpression_Terminal= ruleExpression_Terminal EOF )
            // InternalEbnfLang.g:501:2: iv_ruleExpression_Terminal= ruleExpression_Terminal EOF
            {
             newCompositeNode(grammarAccess.getExpression_TerminalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Terminal=ruleExpression_Terminal();

            state._fsp--;

             current =iv_ruleExpression_Terminal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Terminal"


    // $ANTLR start "ruleExpression_Terminal"
    // InternalEbnfLang.g:507:1: ruleExpression_Terminal returns [EObject current=null] : (this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference | this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol | this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group | this_Expression_Optional_Group_3= ruleExpression_Optional_Group | this_Expression_Group_4= ruleExpression_Group | this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence ) ;
    public final EObject ruleExpression_Terminal() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_Rule_Reference_0 = null;

        EObject this_Expression_Terminal_Symbol_1 = null;

        EObject this_Expression_Repetition_Group_2 = null;

        EObject this_Expression_Optional_Group_3 = null;

        EObject this_Expression_Group_4 = null;

        EObject this_Expression_Special_Sequence_5 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:513:2: ( (this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference | this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol | this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group | this_Expression_Optional_Group_3= ruleExpression_Optional_Group | this_Expression_Group_4= ruleExpression_Group | this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence ) )
            // InternalEbnfLang.g:514:2: (this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference | this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol | this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group | this_Expression_Optional_Group_3= ruleExpression_Optional_Group | this_Expression_Group_4= ruleExpression_Group | this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence )
            {
            // InternalEbnfLang.g:514:2: (this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference | this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol | this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group | this_Expression_Optional_Group_3= ruleExpression_Optional_Group | this_Expression_Group_4= ruleExpression_Group | this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence )
            int alt9=6;
            switch ( input.LA(1) ) {
            case RULE_NAME:
                {
                alt9=1;
                }
                break;
            case RULE_TERMINAL_SYMBOL:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            case RULE_SPECIAL_SEQUENCE:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEbnfLang.g:515:3: this_Expression_Rule_Reference_0= ruleExpression_Rule_Reference
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Rule_ReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Rule_Reference_0=ruleExpression_Rule_Reference();

                    state._fsp--;


                    			current = this_Expression_Rule_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:524:3: this_Expression_Terminal_Symbol_1= ruleExpression_Terminal_Symbol
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Terminal_SymbolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Terminal_Symbol_1=ruleExpression_Terminal_Symbol();

                    state._fsp--;


                    			current = this_Expression_Terminal_Symbol_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEbnfLang.g:533:3: this_Expression_Repetition_Group_2= ruleExpression_Repetition_Group
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Repetition_GroupParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Repetition_Group_2=ruleExpression_Repetition_Group();

                    state._fsp--;


                    			current = this_Expression_Repetition_Group_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalEbnfLang.g:542:3: this_Expression_Optional_Group_3= ruleExpression_Optional_Group
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Optional_GroupParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Optional_Group_3=ruleExpression_Optional_Group();

                    state._fsp--;


                    			current = this_Expression_Optional_Group_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalEbnfLang.g:551:3: this_Expression_Group_4= ruleExpression_Group
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_GroupParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Group_4=ruleExpression_Group();

                    state._fsp--;


                    			current = this_Expression_Group_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalEbnfLang.g:560:3: this_Expression_Special_Sequence_5= ruleExpression_Special_Sequence
                    {

                    			newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_Special_SequenceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_Special_Sequence_5=ruleExpression_Special_Sequence();

                    state._fsp--;


                    			current = this_Expression_Special_Sequence_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Terminal"


    // $ANTLR start "entryRuleExpression_Rule_Reference"
    // InternalEbnfLang.g:572:1: entryRuleExpression_Rule_Reference returns [EObject current=null] : iv_ruleExpression_Rule_Reference= ruleExpression_Rule_Reference EOF ;
    public final EObject entryRuleExpression_Rule_Reference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Rule_Reference = null;


        try {
            // InternalEbnfLang.g:572:66: (iv_ruleExpression_Rule_Reference= ruleExpression_Rule_Reference EOF )
            // InternalEbnfLang.g:573:2: iv_ruleExpression_Rule_Reference= ruleExpression_Rule_Reference EOF
            {
             newCompositeNode(grammarAccess.getExpression_Rule_ReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Rule_Reference=ruleExpression_Rule_Reference();

            state._fsp--;

             current =iv_ruleExpression_Rule_Reference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Rule_Reference"


    // $ANTLR start "ruleExpression_Rule_Reference"
    // InternalEbnfLang.g:579:1: ruleExpression_Rule_Reference returns [EObject current=null] : ( () ( (otherlv_1= RULE_NAME ) ) ) ;
    public final EObject ruleExpression_Rule_Reference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEbnfLang.g:585:2: ( ( () ( (otherlv_1= RULE_NAME ) ) ) )
            // InternalEbnfLang.g:586:2: ( () ( (otherlv_1= RULE_NAME ) ) )
            {
            // InternalEbnfLang.g:586:2: ( () ( (otherlv_1= RULE_NAME ) ) )
            // InternalEbnfLang.g:587:3: () ( (otherlv_1= RULE_NAME ) )
            {
            // InternalEbnfLang.g:587:3: ()
            // InternalEbnfLang.g:588:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Rule_ReferenceAccess().getExpression_Rule_ReferenceAction_0(),
            					current);
            			

            }

            // InternalEbnfLang.g:594:3: ( (otherlv_1= RULE_NAME ) )
            // InternalEbnfLang.g:595:4: (otherlv_1= RULE_NAME )
            {
            // InternalEbnfLang.g:595:4: (otherlv_1= RULE_NAME )
            // InternalEbnfLang.g:596:5: otherlv_1= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpression_Rule_ReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_NAME,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getExpression_Rule_ReferenceAccess().getRuleProductionRuleCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Rule_Reference"


    // $ANTLR start "entryRuleExpression_Special_Sequence"
    // InternalEbnfLang.g:611:1: entryRuleExpression_Special_Sequence returns [EObject current=null] : iv_ruleExpression_Special_Sequence= ruleExpression_Special_Sequence EOF ;
    public final EObject entryRuleExpression_Special_Sequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Special_Sequence = null;


        try {
            // InternalEbnfLang.g:611:68: (iv_ruleExpression_Special_Sequence= ruleExpression_Special_Sequence EOF )
            // InternalEbnfLang.g:612:2: iv_ruleExpression_Special_Sequence= ruleExpression_Special_Sequence EOF
            {
             newCompositeNode(grammarAccess.getExpression_Special_SequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Special_Sequence=ruleExpression_Special_Sequence();

            state._fsp--;

             current =iv_ruleExpression_Special_Sequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Special_Sequence"


    // $ANTLR start "ruleExpression_Special_Sequence"
    // InternalEbnfLang.g:618:1: ruleExpression_Special_Sequence returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) ) ) ;
    public final EObject ruleExpression_Special_Sequence() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalEbnfLang.g:624:2: ( ( () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) ) ) )
            // InternalEbnfLang.g:625:2: ( () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) ) )
            {
            // InternalEbnfLang.g:625:2: ( () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) ) )
            // InternalEbnfLang.g:626:3: () ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) )
            {
            // InternalEbnfLang.g:626:3: ()
            // InternalEbnfLang.g:627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Special_SequenceAccess().getExpression_Special_SequenceAction_0(),
            					current);
            			

            }

            // InternalEbnfLang.g:633:3: ( (lv_text_1_0= RULE_SPECIAL_SEQUENCE ) )
            // InternalEbnfLang.g:634:4: (lv_text_1_0= RULE_SPECIAL_SEQUENCE )
            {
            // InternalEbnfLang.g:634:4: (lv_text_1_0= RULE_SPECIAL_SEQUENCE )
            // InternalEbnfLang.g:635:5: lv_text_1_0= RULE_SPECIAL_SEQUENCE
            {
            lv_text_1_0=(Token)match(input,RULE_SPECIAL_SEQUENCE,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getExpression_Special_SequenceAccess().getTextSPECIAL_SEQUENCETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpression_Special_SequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"it.unibg.ebnfwb.lang.EbnfLang.SPECIAL_SEQUENCE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Special_Sequence"


    // $ANTLR start "entryRuleExpression_Terminal_Symbol"
    // InternalEbnfLang.g:655:1: entryRuleExpression_Terminal_Symbol returns [EObject current=null] : iv_ruleExpression_Terminal_Symbol= ruleExpression_Terminal_Symbol EOF ;
    public final EObject entryRuleExpression_Terminal_Symbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Terminal_Symbol = null;


        try {
            // InternalEbnfLang.g:655:67: (iv_ruleExpression_Terminal_Symbol= ruleExpression_Terminal_Symbol EOF )
            // InternalEbnfLang.g:656:2: iv_ruleExpression_Terminal_Symbol= ruleExpression_Terminal_Symbol EOF
            {
             newCompositeNode(grammarAccess.getExpression_Terminal_SymbolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Terminal_Symbol=ruleExpression_Terminal_Symbol();

            state._fsp--;

             current =iv_ruleExpression_Terminal_Symbol; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Terminal_Symbol"


    // $ANTLR start "ruleExpression_Terminal_Symbol"
    // InternalEbnfLang.g:662:1: ruleExpression_Terminal_Symbol returns [EObject current=null] : ( () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) ) ) ;
    public final EObject ruleExpression_Terminal_Symbol() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalEbnfLang.g:668:2: ( ( () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) ) ) )
            // InternalEbnfLang.g:669:2: ( () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) ) )
            {
            // InternalEbnfLang.g:669:2: ( () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) ) )
            // InternalEbnfLang.g:670:3: () ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) )
            {
            // InternalEbnfLang.g:670:3: ()
            // InternalEbnfLang.g:671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Terminal_SymbolAccess().getExpression_Terminal_SymbolAction_0(),
            					current);
            			

            }

            // InternalEbnfLang.g:677:3: ( (lv_text_1_0= RULE_TERMINAL_SYMBOL ) )
            // InternalEbnfLang.g:678:4: (lv_text_1_0= RULE_TERMINAL_SYMBOL )
            {
            // InternalEbnfLang.g:678:4: (lv_text_1_0= RULE_TERMINAL_SYMBOL )
            // InternalEbnfLang.g:679:5: lv_text_1_0= RULE_TERMINAL_SYMBOL
            {
            lv_text_1_0=(Token)match(input,RULE_TERMINAL_SYMBOL,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getExpression_Terminal_SymbolAccess().getTextTERMINAL_SYMBOLTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpression_Terminal_SymbolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"it.unibg.ebnfwb.lang.EbnfLang.TERMINAL_SYMBOL");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Terminal_Symbol"


    // $ANTLR start "entryRuleExpression_Repetition_Group"
    // InternalEbnfLang.g:699:1: entryRuleExpression_Repetition_Group returns [EObject current=null] : iv_ruleExpression_Repetition_Group= ruleExpression_Repetition_Group EOF ;
    public final EObject entryRuleExpression_Repetition_Group() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Repetition_Group = null;


        try {
            // InternalEbnfLang.g:699:68: (iv_ruleExpression_Repetition_Group= ruleExpression_Repetition_Group EOF )
            // InternalEbnfLang.g:700:2: iv_ruleExpression_Repetition_Group= ruleExpression_Repetition_Group EOF
            {
             newCompositeNode(grammarAccess.getExpression_Repetition_GroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Repetition_Group=ruleExpression_Repetition_Group();

            state._fsp--;

             current =iv_ruleExpression_Repetition_Group; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Repetition_Group"


    // $ANTLR start "ruleExpression_Repetition_Group"
    // InternalEbnfLang.g:706:1: ruleExpression_Repetition_Group returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )? ) ;
    public final EObject ruleExpression_Repetition_Group() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_atLeastOne_4_0=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:712:2: ( ( () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )? ) )
            // InternalEbnfLang.g:713:2: ( () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )? )
            {
            // InternalEbnfLang.g:713:2: ( () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )? )
            // InternalEbnfLang.g:714:3: () otherlv_1= '{' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= '}' ( (lv_atLeastOne_4_0= '-' ) )?
            {
            // InternalEbnfLang.g:714:3: ()
            // InternalEbnfLang.g:715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Repetition_GroupAccess().getExpression_Repetition_GroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExpression_Repetition_GroupAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalEbnfLang.g:725:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEbnfLang.g:726:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEbnfLang.g:726:4: (lv_expr_2_0= ruleExpression )
            // InternalEbnfLang.g:727:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpression_Repetition_GroupAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_Repetition_GroupRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"it.unibg.ebnfwb.lang.EbnfLang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getExpression_Repetition_GroupAccess().getRightCurlyBracketKeyword_3());
            		
            // InternalEbnfLang.g:748:3: ( (lv_atLeastOne_4_0= '-' ) )?
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
                    // InternalEbnfLang.g:749:4: (lv_atLeastOne_4_0= '-' )
                    {
                    // InternalEbnfLang.g:749:4: (lv_atLeastOne_4_0= '-' )
                    // InternalEbnfLang.g:750:5: lv_atLeastOne_4_0= '-'
                    {
                    lv_atLeastOne_4_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_atLeastOne_4_0, grammarAccess.getExpression_Repetition_GroupAccess().getAtLeastOneHyphenMinusKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpression_Repetition_GroupRule());
                    					}
                    					setWithLastConsumed(current, "atLeastOne", true, "-");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Repetition_Group"


    // $ANTLR start "entryRuleExpression_Optional_Group"
    // InternalEbnfLang.g:766:1: entryRuleExpression_Optional_Group returns [EObject current=null] : iv_ruleExpression_Optional_Group= ruleExpression_Optional_Group EOF ;
    public final EObject entryRuleExpression_Optional_Group() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Optional_Group = null;


        try {
            // InternalEbnfLang.g:766:66: (iv_ruleExpression_Optional_Group= ruleExpression_Optional_Group EOF )
            // InternalEbnfLang.g:767:2: iv_ruleExpression_Optional_Group= ruleExpression_Optional_Group EOF
            {
             newCompositeNode(grammarAccess.getExpression_Optional_GroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Optional_Group=ruleExpression_Optional_Group();

            state._fsp--;

             current =iv_ruleExpression_Optional_Group; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Optional_Group"


    // $ANTLR start "ruleExpression_Optional_Group"
    // InternalEbnfLang.g:773:1: ruleExpression_Optional_Group returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']' ) ;
    public final EObject ruleExpression_Optional_Group() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:779:2: ( ( () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']' ) )
            // InternalEbnfLang.g:780:2: ( () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']' )
            {
            // InternalEbnfLang.g:780:2: ( () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']' )
            // InternalEbnfLang.g:781:3: () otherlv_1= '[' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ']'
            {
            // InternalEbnfLang.g:781:3: ()
            // InternalEbnfLang.g:782:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_Optional_GroupAccess().getExpression_Optional_GroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExpression_Optional_GroupAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalEbnfLang.g:792:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEbnfLang.g:793:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEbnfLang.g:793:4: (lv_expr_2_0= ruleExpression )
            // InternalEbnfLang.g:794:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpression_Optional_GroupAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_Optional_GroupRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"it.unibg.ebnfwb.lang.EbnfLang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExpression_Optional_GroupAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Optional_Group"


    // $ANTLR start "entryRuleExpression_Group"
    // InternalEbnfLang.g:819:1: entryRuleExpression_Group returns [EObject current=null] : iv_ruleExpression_Group= ruleExpression_Group EOF ;
    public final EObject entryRuleExpression_Group() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Group = null;


        try {
            // InternalEbnfLang.g:819:57: (iv_ruleExpression_Group= ruleExpression_Group EOF )
            // InternalEbnfLang.g:820:2: iv_ruleExpression_Group= ruleExpression_Group EOF
            {
             newCompositeNode(grammarAccess.getExpression_GroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression_Group=ruleExpression_Group();

            state._fsp--;

             current =iv_ruleExpression_Group; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression_Group"


    // $ANTLR start "ruleExpression_Group"
    // InternalEbnfLang.g:826:1: ruleExpression_Group returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleExpression_Group() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEbnfLang.g:832:2: ( ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalEbnfLang.g:833:2: ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalEbnfLang.g:833:2: ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalEbnfLang.g:834:3: () otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            // InternalEbnfLang.g:834:3: ()
            // InternalEbnfLang.g:835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpression_GroupAccess().getExpression_GroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getExpression_GroupAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEbnfLang.g:845:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEbnfLang.g:846:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEbnfLang.g:846:4: (lv_expr_2_0= ruleExpression )
            // InternalEbnfLang.g:847:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getExpression_GroupAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpression_GroupRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"it.unibg.ebnfwb.lang.EbnfLang.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExpression_GroupAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression_Group"


    // $ANTLR start "entryRuleCommentEBNF"
    // InternalEbnfLang.g:872:1: entryRuleCommentEBNF returns [EObject current=null] : iv_ruleCommentEBNF= ruleCommentEBNF EOF ;
    public final EObject entryRuleCommentEBNF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentEBNF = null;


        try {
            // InternalEbnfLang.g:872:52: (iv_ruleCommentEBNF= ruleCommentEBNF EOF )
            // InternalEbnfLang.g:873:2: iv_ruleCommentEBNF= ruleCommentEBNF EOF
            {
             newCompositeNode(grammarAccess.getCommentEBNFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommentEBNF=ruleCommentEBNF();

            state._fsp--;

             current =iv_ruleCommentEBNF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentEBNF"


    // $ANTLR start "ruleCommentEBNF"
    // InternalEbnfLang.g:879:1: ruleCommentEBNF returns [EObject current=null] : ( (lv_contentComment_0_0= RULE_EBNF_COMMENT ) ) ;
    public final EObject ruleCommentEBNF() throws RecognitionException {
        EObject current = null;

        Token lv_contentComment_0_0=null;


        	enterRule();

        try {
            // InternalEbnfLang.g:885:2: ( ( (lv_contentComment_0_0= RULE_EBNF_COMMENT ) ) )
            // InternalEbnfLang.g:886:2: ( (lv_contentComment_0_0= RULE_EBNF_COMMENT ) )
            {
            // InternalEbnfLang.g:886:2: ( (lv_contentComment_0_0= RULE_EBNF_COMMENT ) )
            // InternalEbnfLang.g:887:3: (lv_contentComment_0_0= RULE_EBNF_COMMENT )
            {
            // InternalEbnfLang.g:887:3: (lv_contentComment_0_0= RULE_EBNF_COMMENT )
            // InternalEbnfLang.g:888:4: lv_contentComment_0_0= RULE_EBNF_COMMENT
            {
            lv_contentComment_0_0=(Token)match(input,RULE_EBNF_COMMENT,FOLLOW_2); 

            				newLeafNode(lv_contentComment_0_0, grammarAccess.getCommentEBNFAccess().getContentCommentEBNF_COMMENTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCommentEBNFRule());
            				}
            				setWithLastConsumed(
            					current,
            					"contentComment",
            					lv_contentComment_0_0,
            					"it.unibg.ebnfwb.lang.EbnfLang.EBNF_COMMENT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentEBNF"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000112L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000054000F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000054000D0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});

}