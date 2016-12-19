package it.unibg.ebnfwb.lang.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEbnfLangLexer extends Lexer {
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

    public InternalEbnfLangLexer() {;} 
    public InternalEbnfLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEbnfLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEbnfLang.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:11:7: ( '=' )
            // InternalEbnfLang.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:12:7: ( ';' )
            // InternalEbnfLang.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:13:7: ( '|' )
            // InternalEbnfLang.g:13:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:14:7: ( ',' )
            // InternalEbnfLang.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:15:7: ( '-' )
            // InternalEbnfLang.g:15:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:16:7: ( '*' )
            // InternalEbnfLang.g:16:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:17:7: ( '{' )
            // InternalEbnfLang.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:18:7: ( '}' )
            // InternalEbnfLang.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:19:7: ( '[' )
            // InternalEbnfLang.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:20:7: ( ']' )
            // InternalEbnfLang.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:21:7: ( '(' )
            // InternalEbnfLang.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:22:7: ( ')' )
            // InternalEbnfLang.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1957:13: ( '1' .. '9' ( '0' .. '9' )* )
            // InternalEbnfLang.g:1957:15: '1' .. '9' ( '0' .. '9' )*
            {
            matchRange('1','9'); 
            // InternalEbnfLang.g:1957:24: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEbnfLang.g:1957:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1959:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // InternalEbnfLang.g:1959:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // InternalEbnfLang.g:1959:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEbnfLang.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_TERMINAL_SYMBOL"
    public final void mRULE_TERMINAL_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_TERMINAL_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1961:22: ( ( '\"' (~ ( '\"' ) )+ '\"' | '\\'' (~ ( '\\'' ) )+ '\\'' ) )
            // InternalEbnfLang.g:1961:24: ( '\"' (~ ( '\"' ) )+ '\"' | '\\'' (~ ( '\\'' ) )+ '\\'' )
            {
            // InternalEbnfLang.g:1961:24: ( '\"' (~ ( '\"' ) )+ '\"' | '\\'' (~ ( '\\'' ) )+ '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEbnfLang.g:1961:25: '\"' (~ ( '\"' ) )+ '\"'
                    {
                    match('\"'); 
                    // InternalEbnfLang.g:1961:29: (~ ( '\"' ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalEbnfLang.g:1961:29: ~ ( '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:1961:41: '\\'' (~ ( '\\'' ) )+ '\\''
                    {
                    match('\''); 
                    // InternalEbnfLang.g:1961:46: (~ ( '\\'' ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalEbnfLang.g:1961:46: ~ ( '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINAL_SYMBOL"

    // $ANTLR start "RULE_SPECIAL_SEQUENCE"
    public final void mRULE_SPECIAL_SEQUENCE() throws RecognitionException {
        try {
            int _type = RULE_SPECIAL_SEQUENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1963:23: ( '?' (~ ( '?' ) )+ '?' )
            // InternalEbnfLang.g:1963:25: '?' (~ ( '?' ) )+ '?'
            {
            match('?'); 
            // InternalEbnfLang.g:1963:29: (~ ( '?' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='>')||(LA6_0>='@' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEbnfLang.g:1963:29: ~ ( '?' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='>')||(input.LA(1)>='@' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPECIAL_SEQUENCE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1965:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalEbnfLang.g:1965:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalEbnfLang.g:1965:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEbnfLang.g:1965:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalEbnfLang.g:1965:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEbnfLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1967:10: ( ( '0' .. '9' )+ )
            // InternalEbnfLang.g:1967:12: ( '0' .. '9' )+
            {
            // InternalEbnfLang.g:1967:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEbnfLang.g:1967:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1969:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEbnfLang.g:1969:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEbnfLang.g:1969:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEbnfLang.g:1969:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEbnfLang.g:1969:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEbnfLang.g:1969:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEbnfLang.g:1969:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEbnfLang.g:1969:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEbnfLang.g:1969:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEbnfLang.g:1969:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEbnfLang.g:1969:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1971:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEbnfLang.g:1971:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEbnfLang.g:1971:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEbnfLang.g:1971:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1973:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEbnfLang.g:1973:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEbnfLang.g:1973:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEbnfLang.g:1973:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalEbnfLang.g:1973:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEbnfLang.g:1973:41: ( '\\r' )? '\\n'
                    {
                    // InternalEbnfLang.g:1973:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalEbnfLang.g:1973:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1975:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalEbnfLang.g:1975:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalEbnfLang.g:1975:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEbnfLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEbnfLang.g:1977:16: ( . )
            // InternalEbnfLang.g:1977:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalEbnfLang.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_NUMBER | RULE_NAME | RULE_TERMINAL_SYMBOL | RULE_SPECIAL_SEQUENCE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=23;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalEbnfLang.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalEbnfLang.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalEbnfLang.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalEbnfLang.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalEbnfLang.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalEbnfLang.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalEbnfLang.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalEbnfLang.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalEbnfLang.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalEbnfLang.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalEbnfLang.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalEbnfLang.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalEbnfLang.g:1:82: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 14 :
                // InternalEbnfLang.g:1:94: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 15 :
                // InternalEbnfLang.g:1:104: RULE_TERMINAL_SYMBOL
                {
                mRULE_TERMINAL_SYMBOL(); 

                }
                break;
            case 16 :
                // InternalEbnfLang.g:1:125: RULE_SPECIAL_SEQUENCE
                {
                mRULE_SPECIAL_SEQUENCE(); 

                }
                break;
            case 17 :
                // InternalEbnfLang.g:1:147: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // InternalEbnfLang.g:1:155: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // InternalEbnfLang.g:1:164: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // InternalEbnfLang.g:1:176: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // InternalEbnfLang.g:1:192: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // InternalEbnfLang.g:1:208: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // InternalEbnfLang.g:1:216: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\15\uffff\1\44\1\46\4\26\1\uffff\1\26\16\uffff\1\44\1\uffff\1\46\14\uffff\1\70\2\uffff\1\70\3\uffff";
    static final String DFA18_eofS =
        "\71\uffff";
    static final String DFA18_minS =
        "\1\0\14\uffff\2\60\3\0\1\101\1\uffff\1\52\16\uffff\1\60\1\uffff\1\60\2\uffff\2\0\1\uffff\2\0\5\uffff\2\0\1\uffff\2\0\2\uffff";
    static final String DFA18_maxS =
        "\1\uffff\14\uffff\1\71\1\172\3\uffff\1\172\1\uffff\1\57\16\uffff\1\71\1\uffff\1\172\2\uffff\2\uffff\1\uffff\2\uffff\5\uffff\2\uffff\1\uffff\2\uffff\2\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\6\uffff\1\22\1\uffff\1\26\1\27\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\uffff\1\15\1\uffff\1\16\1\21\2\uffff\1\23\2\uffff\1\20\1\22\1\24\1\25\1\26\2\uffff\1\17\2\uffff\2\17";
    static final String DFA18_specialS =
        "\1\10\16\uffff\1\5\1\0\1\4\26\uffff\1\1\1\13\1\uffff\1\6\1\3\5\uffff\1\7\1\12\1\uffff\1\11\1\2\2\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\17\4\26\1\20\1\13\1\14\1\6\1\26\1\4\1\5\1\26\1\24\1\23\11\15\1\26\1\2\1\26\1\1\1\26\1\21\1\26\32\16\1\11\1\26\1\12\1\22\1\16\1\26\32\16\1\7\1\3\1\10\uff82\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43",
            "\12\47\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\42\51\1\52\71\51\1\50\uffa3\51",
            "\47\54\1\52\64\54\1\53\uffa3\54",
            "\77\55\1\uffff\uffc0\55",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43",
            "",
            "\12\47\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\42\63\1\62\uffdd\63",
            "\42\51\1\64\71\51\1\50\uffa3\51",
            "",
            "\47\66\1\65\uffd8\66",
            "\47\54\1\67\64\54\1\53\uffa3\54",
            "",
            "",
            "",
            "",
            "",
            "\0\52",
            "\42\51\1\64\71\51\1\50\uffa3\51",
            "",
            "\0\52",
            "\47\54\1\67\64\54\1\53\uffa3\54",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_NUMBER | RULE_NAME | RULE_TERMINAL_SYMBOL | RULE_SPECIAL_SEQUENCE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_16 = input.LA(1);

                        s = -1;
                        if ( (LA18_16=='\\') ) {s = 43;}

                        else if ( ((LA18_16>='\u0000' && LA18_16<='&')||(LA18_16>='(' && LA18_16<='[')||(LA18_16>=']' && LA18_16<='\uFFFF')) ) {s = 44;}

                        else if ( (LA18_16=='\'') ) {s = 42;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_40 = input.LA(1);

                        s = -1;
                        if ( (LA18_40=='\"') ) {s = 50;}

                        else if ( ((LA18_40>='\u0000' && LA18_40<='!')||(LA18_40>='#' && LA18_40<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_54 = input.LA(1);

                        s = -1;
                        if ( (LA18_54=='\'') ) {s = 55;}

                        else if ( (LA18_54=='\\') ) {s = 43;}

                        else if ( ((LA18_54>='\u0000' && LA18_54<='&')||(LA18_54>='(' && LA18_54<='[')||(LA18_54>=']' && LA18_54<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_44 = input.LA(1);

                        s = -1;
                        if ( (LA18_44=='\'') ) {s = 55;}

                        else if ( (LA18_44=='\\') ) {s = 43;}

                        else if ( ((LA18_44>='\u0000' && LA18_44<='&')||(LA18_44>='(' && LA18_44<='[')||(LA18_44>=']' && LA18_44<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA18_17 = input.LA(1);

                        s = -1;
                        if ( ((LA18_17>='\u0000' && LA18_17<='>')||(LA18_17>='@' && LA18_17<='\uFFFF')) ) {s = 45;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA18_15 = input.LA(1);

                        s = -1;
                        if ( (LA18_15=='\\') ) {s = 40;}

                        else if ( ((LA18_15>='\u0000' && LA18_15<='!')||(LA18_15>='#' && LA18_15<='[')||(LA18_15>=']' && LA18_15<='\uFFFF')) ) {s = 41;}

                        else if ( (LA18_15=='\"') ) {s = 42;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA18_43 = input.LA(1);

                        s = -1;
                        if ( (LA18_43=='\'') ) {s = 53;}

                        else if ( ((LA18_43>='\u0000' && LA18_43<='&')||(LA18_43>='(' && LA18_43<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA18_50 = input.LA(1);

                        s = -1;
                        if ( ((LA18_50>='\u0000' && LA18_50<='\uFFFF')) ) {s = 42;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='=') ) {s = 1;}

                        else if ( (LA18_0==';') ) {s = 2;}

                        else if ( (LA18_0=='|') ) {s = 3;}

                        else if ( (LA18_0==',') ) {s = 4;}

                        else if ( (LA18_0=='-') ) {s = 5;}

                        else if ( (LA18_0=='*') ) {s = 6;}

                        else if ( (LA18_0=='{') ) {s = 7;}

                        else if ( (LA18_0=='}') ) {s = 8;}

                        else if ( (LA18_0=='[') ) {s = 9;}

                        else if ( (LA18_0==']') ) {s = 10;}

                        else if ( (LA18_0=='(') ) {s = 11;}

                        else if ( (LA18_0==')') ) {s = 12;}

                        else if ( ((LA18_0>='1' && LA18_0<='9')) ) {s = 13;}

                        else if ( ((LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {s = 14;}

                        else if ( (LA18_0=='\"') ) {s = 15;}

                        else if ( (LA18_0=='\'') ) {s = 16;}

                        else if ( (LA18_0=='?') ) {s = 17;}

                        else if ( (LA18_0=='^') ) {s = 18;}

                        else if ( (LA18_0=='0') ) {s = 19;}

                        else if ( (LA18_0=='/') ) {s = 20;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 21;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='#' && LA18_0<='&')||LA18_0=='+'||LA18_0=='.'||LA18_0==':'||LA18_0=='<'||LA18_0=='>'||LA18_0=='@'||LA18_0=='\\'||LA18_0=='`'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA18_53 = input.LA(1);

                        s = -1;
                        if ( ((LA18_53>='\u0000' && LA18_53<='\uFFFF')) ) {s = 42;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA18_51 = input.LA(1);

                        s = -1;
                        if ( (LA18_51=='\"') ) {s = 52;}

                        else if ( (LA18_51=='\\') ) {s = 40;}

                        else if ( ((LA18_51>='\u0000' && LA18_51<='!')||(LA18_51>='#' && LA18_51<='[')||(LA18_51>=']' && LA18_51<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA18_41 = input.LA(1);

                        s = -1;
                        if ( (LA18_41=='\"') ) {s = 52;}

                        else if ( (LA18_41=='\\') ) {s = 40;}

                        else if ( ((LA18_41>='\u0000' && LA18_41<='!')||(LA18_41>='#' && LA18_41<='[')||(LA18_41>=']' && LA18_41<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}