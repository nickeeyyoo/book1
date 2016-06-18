package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'section'", "'ref'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Book";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBook"
    // InternalMyDsl.g:64:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // InternalMyDsl.g:64:45: (iv_ruleBook= ruleBook EOF )
            // InternalMyDsl.g:65:2: iv_ruleBook= ruleBook EOF
            {
             newCompositeNode(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBook=ruleBook();

            state._fsp--;

             current =iv_ruleBook; 
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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalMyDsl.g:71:1: ruleBook returns [EObject current=null] : (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sections_2_0= ruleSection ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBookAccess().getTitleKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBookAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_sections_2_0= ruleSection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_sections_2_0= ruleSection )
            	    // InternalMyDsl.g:103:5: lv_sections_2_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getBookAccess().getSectionsSectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBookRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_2_0,
            	    						"org.xtext.example.mydsl1.MyDsl.Section");
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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleSection"
    // InternalMyDsl.g:124:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalMyDsl.g:124:48: (iv_ruleSection= ruleSection EOF )
            // InternalMyDsl.g:125:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalMyDsl.g:131:1: ruleSection returns [EObject current=null] : (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) (this_STRING_2= RULE_STRING | (otherlv_3= 'ref' ( ( ruleSectionReference ) ) ) )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_STRING_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:137:2: ( (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) (this_STRING_2= RULE_STRING | (otherlv_3= 'ref' ( ( ruleSectionReference ) ) ) )* ) )
            // InternalMyDsl.g:138:2: (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) (this_STRING_2= RULE_STRING | (otherlv_3= 'ref' ( ( ruleSectionReference ) ) ) )* )
            {
            // InternalMyDsl.g:138:2: (otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) (this_STRING_2= RULE_STRING | (otherlv_3= 'ref' ( ( ruleSectionReference ) ) ) )* )
            // InternalMyDsl.g:139:3: otherlv_0= 'section' ( (lv_name_1_0= RULE_ID ) ) (this_STRING_2= RULE_STRING | (otherlv_3= 'ref' ( ( ruleSectionReference ) ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalMyDsl.g:143:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:144:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:144:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:145:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:161:3: (this_STRING_2= RULE_STRING | (otherlv_3= 'ref' ( ( ruleSectionReference ) ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }
                else if ( (LA2_0==13) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:162:4: this_STRING_2= RULE_STRING
            	    {
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_5); 

            	    				newLeafNode(this_STRING_2, grammarAccess.getSectionAccess().getSTRINGTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:167:4: (otherlv_3= 'ref' ( ( ruleSectionReference ) ) )
            	    {
            	    // InternalMyDsl.g:167:4: (otherlv_3= 'ref' ( ( ruleSectionReference ) ) )
            	    // InternalMyDsl.g:168:5: otherlv_3= 'ref' ( ( ruleSectionReference ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_3); 

            	    					newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getRefKeyword_2_1_0());
            	    				
            	    // InternalMyDsl.g:172:5: ( ( ruleSectionReference ) )
            	    // InternalMyDsl.g:173:6: ( ruleSectionReference )
            	    {
            	    // InternalMyDsl.g:173:6: ( ruleSectionReference )
            	    // InternalMyDsl.g:174:7: ruleSectionReference
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSectionRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getSectionAccess().getSectionReferencesSectionCrossReference_2_1_1_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    ruleSectionReference();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionReference"
    // InternalMyDsl.g:194:1: entryRuleSectionReference returns [String current=null] : iv_ruleSectionReference= ruleSectionReference EOF ;
    public final String entryRuleSectionReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSectionReference = null;


        try {
            // InternalMyDsl.g:194:56: (iv_ruleSectionReference= ruleSectionReference EOF )
            // InternalMyDsl.g:195:2: iv_ruleSectionReference= ruleSectionReference EOF
            {
             newCompositeNode(grammarAccess.getSectionReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionReference=ruleSectionReference();

            state._fsp--;

             current =iv_ruleSectionReference.getText(); 
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
    // $ANTLR end "entryRuleSectionReference"


    // $ANTLR start "ruleSectionReference"
    // InternalMyDsl.g:201:1: ruleSectionReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleSectionReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:207:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalMyDsl.g:208:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalMyDsl.g:208:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalMyDsl.g:209:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getSectionReferenceAccess().getIDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:216:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:217:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,14,FOLLOW_3); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSectionReferenceAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getSectionReferenceAccess().getIDTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleSectionReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});

}