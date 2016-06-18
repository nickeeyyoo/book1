package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'section'", "'ref'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBook"
    // InternalMyDsl.g:53:1: entryRuleBook : ruleBook EOF ;
    public final void entryRuleBook() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleBook EOF )
            // InternalMyDsl.g:55:1: ruleBook EOF
            {
             before(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getBookRule()); 
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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalMyDsl.g:62:1: ruleBook : ( ( rule__Book__Group__0 ) ) ;
    public final void ruleBook() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Book__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Book__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Book__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Book__Group__0 )
            {
             before(grammarAccess.getBookAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Book__Group__0 )
            // InternalMyDsl.g:69:4: rule__Book__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getGroup()); 

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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleSection"
    // InternalMyDsl.g:78:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleSection EOF )
            // InternalMyDsl.g:80:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalMyDsl.g:87:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Section__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Section__Group__0 )
            // InternalMyDsl.g:94:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionReference"
    // InternalMyDsl.g:103:1: entryRuleSectionReference : ruleSectionReference EOF ;
    public final void entryRuleSectionReference() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSectionReference EOF )
            // InternalMyDsl.g:105:1: ruleSectionReference EOF
            {
             before(grammarAccess.getSectionReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSectionReference();

            state._fsp--;

             after(grammarAccess.getSectionReferenceRule()); 
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
    // $ANTLR end "entryRuleSectionReference"


    // $ANTLR start "ruleSectionReference"
    // InternalMyDsl.g:112:1: ruleSectionReference : ( ( rule__SectionReference__Group__0 ) ) ;
    public final void ruleSectionReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__SectionReference__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__SectionReference__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__SectionReference__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__SectionReference__Group__0 )
            {
             before(grammarAccess.getSectionReferenceAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__SectionReference__Group__0 )
            // InternalMyDsl.g:119:4: rule__SectionReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SectionReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleSectionReference"


    // $ANTLR start "rule__Section__Alternatives_2"
    // InternalMyDsl.g:127:1: rule__Section__Alternatives_2 : ( ( RULE_STRING ) | ( ( rule__Section__Group_2_1__0 ) ) );
    public final void rule__Section__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:131:1: ( ( RULE_STRING ) | ( ( rule__Section__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:132:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:132:2: ( RULE_STRING )
                    // InternalMyDsl.g:133:3: RULE_STRING
                    {
                     before(grammarAccess.getSectionAccess().getSTRINGTerminalRuleCall_2_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getSectionAccess().getSTRINGTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:138:2: ( ( rule__Section__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:138:2: ( ( rule__Section__Group_2_1__0 ) )
                    // InternalMyDsl.g:139:3: ( rule__Section__Group_2_1__0 )
                    {
                     before(grammarAccess.getSectionAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:140:3: ( rule__Section__Group_2_1__0 )
                    // InternalMyDsl.g:140:4: rule__Section__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSectionAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Section__Alternatives_2"


    // $ANTLR start "rule__Book__Group__0"
    // InternalMyDsl.g:148:1: rule__Book__Group__0 : rule__Book__Group__0__Impl rule__Book__Group__1 ;
    public final void rule__Book__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:152:1: ( rule__Book__Group__0__Impl rule__Book__Group__1 )
            // InternalMyDsl.g:153:2: rule__Book__Group__0__Impl rule__Book__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Book__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__1();

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
    // $ANTLR end "rule__Book__Group__0"


    // $ANTLR start "rule__Book__Group__0__Impl"
    // InternalMyDsl.g:160:1: rule__Book__Group__0__Impl : ( 'title' ) ;
    public final void rule__Book__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:164:1: ( ( 'title' ) )
            // InternalMyDsl.g:165:1: ( 'title' )
            {
            // InternalMyDsl.g:165:1: ( 'title' )
            // InternalMyDsl.g:166:2: 'title'
            {
             before(grammarAccess.getBookAccess().getTitleKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getTitleKeyword_0()); 

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
    // $ANTLR end "rule__Book__Group__0__Impl"


    // $ANTLR start "rule__Book__Group__1"
    // InternalMyDsl.g:175:1: rule__Book__Group__1 : rule__Book__Group__1__Impl rule__Book__Group__2 ;
    public final void rule__Book__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:179:1: ( rule__Book__Group__1__Impl rule__Book__Group__2 )
            // InternalMyDsl.g:180:2: rule__Book__Group__1__Impl rule__Book__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__2();

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
    // $ANTLR end "rule__Book__Group__1"


    // $ANTLR start "rule__Book__Group__1__Impl"
    // InternalMyDsl.g:187:1: rule__Book__Group__1__Impl : ( ( rule__Book__NameAssignment_1 ) ) ;
    public final void rule__Book__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:1: ( ( ( rule__Book__NameAssignment_1 ) ) )
            // InternalMyDsl.g:192:1: ( ( rule__Book__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:192:1: ( ( rule__Book__NameAssignment_1 ) )
            // InternalMyDsl.g:193:2: ( rule__Book__NameAssignment_1 )
            {
             before(grammarAccess.getBookAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:194:2: ( rule__Book__NameAssignment_1 )
            // InternalMyDsl.g:194:3: rule__Book__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Book__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Book__Group__1__Impl"


    // $ANTLR start "rule__Book__Group__2"
    // InternalMyDsl.g:202:1: rule__Book__Group__2 : rule__Book__Group__2__Impl ;
    public final void rule__Book__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( rule__Book__Group__2__Impl )
            // InternalMyDsl.g:207:2: rule__Book__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__2__Impl();

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
    // $ANTLR end "rule__Book__Group__2"


    // $ANTLR start "rule__Book__Group__2__Impl"
    // InternalMyDsl.g:213:1: rule__Book__Group__2__Impl : ( ( rule__Book__SectionsAssignment_2 )* ) ;
    public final void rule__Book__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:217:1: ( ( ( rule__Book__SectionsAssignment_2 )* ) )
            // InternalMyDsl.g:218:1: ( ( rule__Book__SectionsAssignment_2 )* )
            {
            // InternalMyDsl.g:218:1: ( ( rule__Book__SectionsAssignment_2 )* )
            // InternalMyDsl.g:219:2: ( rule__Book__SectionsAssignment_2 )*
            {
             before(grammarAccess.getBookAccess().getSectionsAssignment_2()); 
            // InternalMyDsl.g:220:2: ( rule__Book__SectionsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:220:3: rule__Book__SectionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Book__SectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getBookAccess().getSectionsAssignment_2()); 

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
    // $ANTLR end "rule__Book__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalMyDsl.g:229:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:233:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalMyDsl.g:234:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

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
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalMyDsl.g:241:1: rule__Section__Group__0__Impl : ( 'section' ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( ( 'section' ) )
            // InternalMyDsl.g:246:1: ( 'section' )
            {
            // InternalMyDsl.g:246:1: ( 'section' )
            // InternalMyDsl.g:247:2: 'section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_0()); 

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
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalMyDsl.g:256:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:260:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalMyDsl.g:261:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

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
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalMyDsl.g:268:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalMyDsl.g:273:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:273:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalMyDsl.g:274:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:275:2: ( rule__Section__NameAssignment_1 )
            // InternalMyDsl.g:275:3: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalMyDsl.g:283:1: rule__Section__Group__2 : rule__Section__Group__2__Impl ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:287:1: ( rule__Section__Group__2__Impl )
            // InternalMyDsl.g:288:2: rule__Section__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__2__Impl();

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
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalMyDsl.g:294:1: rule__Section__Group__2__Impl : ( ( rule__Section__Alternatives_2 )* ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:298:1: ( ( ( rule__Section__Alternatives_2 )* ) )
            // InternalMyDsl.g:299:1: ( ( rule__Section__Alternatives_2 )* )
            {
            // InternalMyDsl.g:299:1: ( ( rule__Section__Alternatives_2 )* )
            // InternalMyDsl.g:300:2: ( rule__Section__Alternatives_2 )*
            {
             before(grammarAccess.getSectionAccess().getAlternatives_2()); 
            // InternalMyDsl.g:301:2: ( rule__Section__Alternatives_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_STRING||LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:301:3: rule__Section__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Section__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group_2_1__0"
    // InternalMyDsl.g:310:1: rule__Section__Group_2_1__0 : rule__Section__Group_2_1__0__Impl rule__Section__Group_2_1__1 ;
    public final void rule__Section__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( rule__Section__Group_2_1__0__Impl rule__Section__Group_2_1__1 )
            // InternalMyDsl.g:315:2: rule__Section__Group_2_1__0__Impl rule__Section__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Section__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_2_1__1();

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
    // $ANTLR end "rule__Section__Group_2_1__0"


    // $ANTLR start "rule__Section__Group_2_1__0__Impl"
    // InternalMyDsl.g:322:1: rule__Section__Group_2_1__0__Impl : ( 'ref' ) ;
    public final void rule__Section__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( ( 'ref' ) )
            // InternalMyDsl.g:327:1: ( 'ref' )
            {
            // InternalMyDsl.g:327:1: ( 'ref' )
            // InternalMyDsl.g:328:2: 'ref'
            {
             before(grammarAccess.getSectionAccess().getRefKeyword_2_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRefKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Section__Group_2_1__0__Impl"


    // $ANTLR start "rule__Section__Group_2_1__1"
    // InternalMyDsl.g:337:1: rule__Section__Group_2_1__1 : rule__Section__Group_2_1__1__Impl ;
    public final void rule__Section__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( rule__Section__Group_2_1__1__Impl )
            // InternalMyDsl.g:342:2: rule__Section__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Section__Group_2_1__1"


    // $ANTLR start "rule__Section__Group_2_1__1__Impl"
    // InternalMyDsl.g:348:1: rule__Section__Group_2_1__1__Impl : ( ( rule__Section__SectionReferencesAssignment_2_1_1 ) ) ;
    public final void rule__Section__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:352:1: ( ( ( rule__Section__SectionReferencesAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:353:1: ( ( rule__Section__SectionReferencesAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:353:1: ( ( rule__Section__SectionReferencesAssignment_2_1_1 ) )
            // InternalMyDsl.g:354:2: ( rule__Section__SectionReferencesAssignment_2_1_1 )
            {
             before(grammarAccess.getSectionAccess().getSectionReferencesAssignment_2_1_1()); 
            // InternalMyDsl.g:355:2: ( rule__Section__SectionReferencesAssignment_2_1_1 )
            // InternalMyDsl.g:355:3: rule__Section__SectionReferencesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__SectionReferencesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getSectionReferencesAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Section__Group_2_1__1__Impl"


    // $ANTLR start "rule__SectionReference__Group__0"
    // InternalMyDsl.g:364:1: rule__SectionReference__Group__0 : rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1 ;
    public final void rule__SectionReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1 )
            // InternalMyDsl.g:369:2: rule__SectionReference__Group__0__Impl rule__SectionReference__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SectionReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionReference__Group__1();

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
    // $ANTLR end "rule__SectionReference__Group__0"


    // $ANTLR start "rule__SectionReference__Group__0__Impl"
    // InternalMyDsl.g:376:1: rule__SectionReference__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SectionReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:381:1: ( RULE_ID )
            {
            // InternalMyDsl.g:381:1: ( RULE_ID )
            // InternalMyDsl.g:382:2: RULE_ID
            {
             before(grammarAccess.getSectionReferenceAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionReferenceAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__SectionReference__Group__0__Impl"


    // $ANTLR start "rule__SectionReference__Group__1"
    // InternalMyDsl.g:391:1: rule__SectionReference__Group__1 : rule__SectionReference__Group__1__Impl ;
    public final void rule__SectionReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__SectionReference__Group__1__Impl )
            // InternalMyDsl.g:396:2: rule__SectionReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionReference__Group__1__Impl();

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
    // $ANTLR end "rule__SectionReference__Group__1"


    // $ANTLR start "rule__SectionReference__Group__1__Impl"
    // InternalMyDsl.g:402:1: rule__SectionReference__Group__1__Impl : ( ( rule__SectionReference__Group_1__0 )? ) ;
    public final void rule__SectionReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( ( rule__SectionReference__Group_1__0 )? ) )
            // InternalMyDsl.g:407:1: ( ( rule__SectionReference__Group_1__0 )? )
            {
            // InternalMyDsl.g:407:1: ( ( rule__SectionReference__Group_1__0 )? )
            // InternalMyDsl.g:408:2: ( rule__SectionReference__Group_1__0 )?
            {
             before(grammarAccess.getSectionReferenceAccess().getGroup_1()); 
            // InternalMyDsl.g:409:2: ( rule__SectionReference__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:409:3: rule__SectionReference__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SectionReference__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionReferenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SectionReference__Group__1__Impl"


    // $ANTLR start "rule__SectionReference__Group_1__0"
    // InternalMyDsl.g:418:1: rule__SectionReference__Group_1__0 : rule__SectionReference__Group_1__0__Impl rule__SectionReference__Group_1__1 ;
    public final void rule__SectionReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__SectionReference__Group_1__0__Impl rule__SectionReference__Group_1__1 )
            // InternalMyDsl.g:423:2: rule__SectionReference__Group_1__0__Impl rule__SectionReference__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SectionReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SectionReference__Group_1__1();

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
    // $ANTLR end "rule__SectionReference__Group_1__0"


    // $ANTLR start "rule__SectionReference__Group_1__0__Impl"
    // InternalMyDsl.g:430:1: rule__SectionReference__Group_1__0__Impl : ( '.' ) ;
    public final void rule__SectionReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( '.' ) )
            // InternalMyDsl.g:435:1: ( '.' )
            {
            // InternalMyDsl.g:435:1: ( '.' )
            // InternalMyDsl.g:436:2: '.'
            {
             before(grammarAccess.getSectionReferenceAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSectionReferenceAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__SectionReference__Group_1__0__Impl"


    // $ANTLR start "rule__SectionReference__Group_1__1"
    // InternalMyDsl.g:445:1: rule__SectionReference__Group_1__1 : rule__SectionReference__Group_1__1__Impl ;
    public final void rule__SectionReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__SectionReference__Group_1__1__Impl )
            // InternalMyDsl.g:450:2: rule__SectionReference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SectionReference__Group_1__1__Impl();

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
    // $ANTLR end "rule__SectionReference__Group_1__1"


    // $ANTLR start "rule__SectionReference__Group_1__1__Impl"
    // InternalMyDsl.g:456:1: rule__SectionReference__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__SectionReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:461:1: ( RULE_ID )
            {
            // InternalMyDsl.g:461:1: ( RULE_ID )
            // InternalMyDsl.g:462:2: RULE_ID
            {
             before(grammarAccess.getSectionReferenceAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionReferenceAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__SectionReference__Group_1__1__Impl"


    // $ANTLR start "rule__Book__NameAssignment_1"
    // InternalMyDsl.g:472:1: rule__Book__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Book__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:477:2: ( RULE_ID )
            {
            // InternalMyDsl.g:477:2: ( RULE_ID )
            // InternalMyDsl.g:478:3: RULE_ID
            {
             before(grammarAccess.getBookAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Book__NameAssignment_1"


    // $ANTLR start "rule__Book__SectionsAssignment_2"
    // InternalMyDsl.g:487:1: rule__Book__SectionsAssignment_2 : ( ruleSection ) ;
    public final void rule__Book__SectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:1: ( ( ruleSection ) )
            // InternalMyDsl.g:492:2: ( ruleSection )
            {
            // InternalMyDsl.g:492:2: ( ruleSection )
            // InternalMyDsl.g:493:3: ruleSection
            {
             before(grammarAccess.getBookAccess().getSectionsSectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getBookAccess().getSectionsSectionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Book__SectionsAssignment_2"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalMyDsl.g:502:1: rule__Section__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:507:2: ( RULE_ID )
            {
            // InternalMyDsl.g:507:2: ( RULE_ID )
            // InternalMyDsl.g:508:3: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__SectionReferencesAssignment_2_1_1"
    // InternalMyDsl.g:517:1: rule__Section__SectionReferencesAssignment_2_1_1 : ( ( ruleSectionReference ) ) ;
    public final void rule__Section__SectionReferencesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( ( ( ruleSectionReference ) ) )
            // InternalMyDsl.g:522:2: ( ( ruleSectionReference ) )
            {
            // InternalMyDsl.g:522:2: ( ( ruleSectionReference ) )
            // InternalMyDsl.g:523:3: ( ruleSectionReference )
            {
             before(grammarAccess.getSectionAccess().getSectionReferencesSectionCrossReference_2_1_1_0()); 
            // InternalMyDsl.g:524:3: ( ruleSectionReference )
            // InternalMyDsl.g:525:4: ruleSectionReference
            {
             before(grammarAccess.getSectionAccess().getSectionReferencesSectionSectionReferenceParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleSectionReference();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getSectionReferencesSectionSectionReferenceParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getSectionAccess().getSectionReferencesSectionCrossReference_2_1_1_0()); 

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
    // $ANTLR end "rule__Section__SectionReferencesAssignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});

}