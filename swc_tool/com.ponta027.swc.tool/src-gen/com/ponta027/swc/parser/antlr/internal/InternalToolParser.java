package com.ponta027.swc.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ponta027.swc.services.ToolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'swc'", "'{'", "'}'", "'rport'", "'interface'", "'from'", "'pport'", "'to'", "'SRInterface'", "'dataType'", "'CSInterface'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalToolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalToolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalToolParser.tokenNames; }
    public String getGrammarFileName() { return "../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g"; }



     	private ToolGrammarAccess grammarAccess;
     	
        public InternalToolParser(TokenStream input, ToolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ToolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:76:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:79:28: ( ( (lv_elements_0_0= ruleElement ) )* )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:80:1: ( (lv_elements_0_0= ruleElement ) )*
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:80:1: ( (lv_elements_0_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==20||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:81:1: (lv_elements_0_0= ruleElement )
            	    {
            	    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:81:1: (lv_elements_0_0= ruleElement )
            	    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:82:3: lv_elements_0_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel130);
            	    lv_elements_0_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:106:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:107:2: (iv_ruleElement= ruleElement EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:108:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement166);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement176); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:115:1: ruleElement returns [EObject current=null] : (this_Swc_0= ruleSwc | this_Interface_1= ruleInterface ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Swc_0 = null;

        EObject this_Interface_1 = null;


         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:118:28: ( (this_Swc_0= ruleSwc | this_Interface_1= ruleInterface ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:119:1: (this_Swc_0= ruleSwc | this_Interface_1= ruleInterface )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:119:1: (this_Swc_0= ruleSwc | this_Interface_1= ruleInterface )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==20||LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:120:5: this_Swc_0= ruleSwc
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getSwcParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSwc_in_ruleElement223);
                    this_Swc_0=ruleSwc();

                    state._fsp--;

                     
                            current = this_Swc_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:130:5: this_Interface_1= ruleInterface
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getInterfaceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInterface_in_ruleElement250);
                    this_Interface_1=ruleInterface();

                    state._fsp--;

                     
                            current = this_Interface_1; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:146:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:147:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:148:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName286);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName297); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:155:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:158:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:159:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:159:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:159:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName337); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:166:1: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:167:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedName356); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName371); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSwc"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:187:1: entryRuleSwc returns [EObject current=null] : iv_ruleSwc= ruleSwc EOF ;
    public final EObject entryRuleSwc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwc = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:188:2: (iv_ruleSwc= ruleSwc EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:189:2: iv_ruleSwc= ruleSwc EOF
            {
             newCompositeNode(grammarAccess.getSwcRule()); 
            pushFollow(FOLLOW_ruleSwc_in_entryRuleSwc418);
            iv_ruleSwc=ruleSwc();

            state._fsp--;

             current =iv_ruleSwc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwc428); 

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
    // $ANTLR end "entryRuleSwc"


    // $ANTLR start "ruleSwc"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:196:1: ruleSwc returns [EObject current=null] : (otherlv_0= 'swc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )+ otherlv_4= '}' ) ;
    public final EObject ruleSwc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ports_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:199:28: ( (otherlv_0= 'swc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )+ otherlv_4= '}' ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:200:1: (otherlv_0= 'swc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )+ otherlv_4= '}' )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:200:1: (otherlv_0= 'swc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )+ otherlv_4= '}' )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:200:3: otherlv_0= 'swc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleSwc465); 

                	newLeafNode(otherlv_0, grammarAccess.getSwcAccess().getSwcKeyword_0());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:204:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:205:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:205:1: (lv_name_1_0= RULE_ID )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:206:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSwc482); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSwcAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSwcRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSwc499); 

                	newLeafNode(otherlv_2, grammarAccess.getSwcAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:226:1: ( (lv_ports_3_0= rulePort ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:227:1: (lv_ports_3_0= rulePort )
            	    {
            	    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:227:1: (lv_ports_3_0= rulePort )
            	    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:228:3: lv_ports_3_0= rulePort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwcAccess().getPortsPortParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleSwc520);
            	    lv_ports_3_0=rulePort();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwcRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ports",
            	            		lv_ports_3_0, 
            	            		"Port");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSwc533); 

                	newLeafNode(otherlv_4, grammarAccess.getSwcAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSwc"


    // $ANTLR start "entryRulePort"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:256:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:257:2: (iv_rulePort= rulePort EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:258:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort569);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort579); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:265:1: rulePort returns [EObject current=null] : (this_PPort_0= rulePPort | this_RPort_1= ruleRPort ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        EObject this_PPort_0 = null;

        EObject this_RPort_1 = null;


         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:268:28: ( (this_PPort_0= rulePPort | this_RPort_1= ruleRPort ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:269:1: (this_PPort_0= rulePPort | this_RPort_1= ruleRPort )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:269:1: (this_PPort_0= rulePPort | this_RPort_1= ruleRPort )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:270:5: this_PPort_0= rulePPort
                    {
                     
                            newCompositeNode(grammarAccess.getPortAccess().getPPortParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePPort_in_rulePort626);
                    this_PPort_0=rulePPort();

                    state._fsp--;

                     
                            current = this_PPort_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:280:5: this_RPort_1= ruleRPort
                    {
                     
                            newCompositeNode(grammarAccess.getPortAccess().getRPortParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRPort_in_rulePort653);
                    this_RPort_1=ruleRPort();

                    state._fsp--;

                     
                            current = this_RPort_1; 
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleRPort"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:296:1: entryRuleRPort returns [EObject current=null] : iv_ruleRPort= ruleRPort EOF ;
    public final EObject entryRuleRPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRPort = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:297:2: (iv_ruleRPort= ruleRPort EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:298:2: iv_ruleRPort= ruleRPort EOF
            {
             newCompositeNode(grammarAccess.getRPortRule()); 
            pushFollow(FOLLOW_ruleRPort_in_entryRuleRPort688);
            iv_ruleRPort=ruleRPort();

            state._fsp--;

             current =iv_ruleRPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRPort698); 

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
    // $ANTLR end "entryRuleRPort"


    // $ANTLR start "ruleRPort"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:305:1: ruleRPort returns [EObject current=null] : (otherlv_0= 'rport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'from' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:308:28: ( (otherlv_0= 'rport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'from' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:309:1: (otherlv_0= 'rport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'from' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:309:1: (otherlv_0= 'rport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'from' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:309:3: otherlv_0= 'rport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'from' ( ( ruleQualifiedName ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRPort735); 

                	newLeafNode(otherlv_0, grammarAccess.getRPortAccess().getRportKeyword_0());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:313:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:314:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:314:1: (lv_name_1_0= RULE_ID )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:315:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRPort752); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRPortAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleRPort769); 

                	newLeafNode(otherlv_2, grammarAccess.getRPortAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:335:1: (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:335:3: otherlv_3= 'interface' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleRPort782); 

                        	newLeafNode(otherlv_3, grammarAccess.getRPortAccess().getInterfaceKeyword_3_0());
                        
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:339:1: ( ( ruleQualifiedName ) )
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:340:1: ( ruleQualifiedName )
                    {
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:340:1: ( ruleQualifiedName )
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:341:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRPort805);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:354:4: (otherlv_5= 'from' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:354:6: otherlv_5= 'from' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleRPort820); 

                        	newLeafNode(otherlv_5, grammarAccess.getRPortAccess().getFromKeyword_4_0());
                        
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:358:1: ( ( ruleQualifiedName ) )
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:359:1: ( ruleQualifiedName )
                    {
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:359:1: ( ruleQualifiedName )
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:360:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRPortAccess().getFromPortPPortCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleRPort843);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleRPort857); 

                	newLeafNode(otherlv_7, grammarAccess.getRPortAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleRPort"


    // $ANTLR start "entryRulePPort"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:385:1: entryRulePPort returns [EObject current=null] : iv_rulePPort= rulePPort EOF ;
    public final EObject entryRulePPort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePPort = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:386:2: (iv_rulePPort= rulePPort EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:387:2: iv_rulePPort= rulePPort EOF
            {
             newCompositeNode(grammarAccess.getPPortRule()); 
            pushFollow(FOLLOW_rulePPort_in_entryRulePPort893);
            iv_rulePPort=rulePPort();

            state._fsp--;

             current =iv_rulePPort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePPort903); 

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
    // $ANTLR end "entryRulePPort"


    // $ANTLR start "rulePPort"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:394:1: rulePPort returns [EObject current=null] : (otherlv_0= 'pport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'to' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' ) ;
    public final EObject rulePPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:397:28: ( (otherlv_0= 'pport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'to' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:398:1: (otherlv_0= 'pport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'to' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:398:1: (otherlv_0= 'pport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'to' ( ( ruleQualifiedName ) ) )? otherlv_7= '}' )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:398:3: otherlv_0= 'pport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )? (otherlv_5= 'to' ( ( ruleQualifiedName ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePPort940); 

                	newLeafNode(otherlv_0, grammarAccess.getPPortAccess().getPportKeyword_0());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:402:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:403:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:403:1: (lv_name_1_0= RULE_ID )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:404:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePPort957); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPPortAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePPort974); 

                	newLeafNode(otherlv_2, grammarAccess.getPPortAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:424:1: (otherlv_3= 'interface' ( ( ruleQualifiedName ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:424:3: otherlv_3= 'interface' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_rulePPort987); 

                        	newLeafNode(otherlv_3, grammarAccess.getPPortAccess().getInterfaceKeyword_3_0());
                        
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:428:1: ( ( ruleQualifiedName ) )
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:429:1: ( ruleQualifiedName )
                    {
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:429:1: ( ruleQualifiedName )
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:430:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePPort1010);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:443:4: (otherlv_5= 'to' ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:443:6: otherlv_5= 'to' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_rulePPort1025); 

                        	newLeafNode(otherlv_5, grammarAccess.getPPortAccess().getToKeyword_4_0());
                        
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:447:1: ( ( ruleQualifiedName ) )
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:448:1: ( ruleQualifiedName )
                    {
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:448:1: ( ruleQualifiedName )
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:449:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPPortRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPPortAccess().getToPortRPortCrossReference_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePPort1048);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_rulePPort1062); 

                	newLeafNode(otherlv_7, grammarAccess.getPPortAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "rulePPort"


    // $ANTLR start "entryRuleInterface"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:474:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:475:2: (iv_ruleInterface= ruleInterface EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:476:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1098);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1108); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:483:1: ruleInterface returns [EObject current=null] : (this_SenderReceiverInterface_0= ruleSenderReceiverInterface | this_ClientServerInterface_1= ruleClientServerInterface ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        EObject this_SenderReceiverInterface_0 = null;

        EObject this_ClientServerInterface_1 = null;


         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:486:28: ( (this_SenderReceiverInterface_0= ruleSenderReceiverInterface | this_ClientServerInterface_1= ruleClientServerInterface ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:487:1: (this_SenderReceiverInterface_0= ruleSenderReceiverInterface | this_ClientServerInterface_1= ruleClientServerInterface )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:487:1: (this_SenderReceiverInterface_0= ruleSenderReceiverInterface | this_ClientServerInterface_1= ruleClientServerInterface )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:488:5: this_SenderReceiverInterface_0= ruleSenderReceiverInterface
                    {
                     
                            newCompositeNode(grammarAccess.getInterfaceAccess().getSenderReceiverInterfaceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSenderReceiverInterface_in_ruleInterface1155);
                    this_SenderReceiverInterface_0=ruleSenderReceiverInterface();

                    state._fsp--;

                     
                            current = this_SenderReceiverInterface_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:498:5: this_ClientServerInterface_1= ruleClientServerInterface
                    {
                     
                            newCompositeNode(grammarAccess.getInterfaceAccess().getClientServerInterfaceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClientServerInterface_in_ruleInterface1182);
                    this_ClientServerInterface_1=ruleClientServerInterface();

                    state._fsp--;

                     
                            current = this_ClientServerInterface_1; 
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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleSenderReceiverInterface"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:514:1: entryRuleSenderReceiverInterface returns [EObject current=null] : iv_ruleSenderReceiverInterface= ruleSenderReceiverInterface EOF ;
    public final EObject entryRuleSenderReceiverInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSenderReceiverInterface = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:515:2: (iv_ruleSenderReceiverInterface= ruleSenderReceiverInterface EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:516:2: iv_ruleSenderReceiverInterface= ruleSenderReceiverInterface EOF
            {
             newCompositeNode(grammarAccess.getSenderReceiverInterfaceRule()); 
            pushFollow(FOLLOW_ruleSenderReceiverInterface_in_entryRuleSenderReceiverInterface1217);
            iv_ruleSenderReceiverInterface=ruleSenderReceiverInterface();

            state._fsp--;

             current =iv_ruleSenderReceiverInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSenderReceiverInterface1227); 

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
    // $ANTLR end "entryRuleSenderReceiverInterface"


    // $ANTLR start "ruleSenderReceiverInterface"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:523:1: ruleSenderReceiverInterface returns [EObject current=null] : (otherlv_0= 'SRInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_dataElement_3_0= ruleDataElement ) ) otherlv_4= '}' ) ;
    public final EObject ruleSenderReceiverInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dataElement_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:526:28: ( (otherlv_0= 'SRInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_dataElement_3_0= ruleDataElement ) ) otherlv_4= '}' ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:527:1: (otherlv_0= 'SRInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_dataElement_3_0= ruleDataElement ) ) otherlv_4= '}' )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:527:1: (otherlv_0= 'SRInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_dataElement_3_0= ruleDataElement ) ) otherlv_4= '}' )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:527:3: otherlv_0= 'SRInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_dataElement_3_0= ruleDataElement ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSenderReceiverInterface1264); 

                	newLeafNode(otherlv_0, grammarAccess.getSenderReceiverInterfaceAccess().getSRInterfaceKeyword_0());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:531:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:532:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:532:1: (lv_name_1_0= RULE_ID )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:533:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSenderReceiverInterface1281); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSenderReceiverInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSenderReceiverInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleSenderReceiverInterface1298); 

                	newLeafNode(otherlv_2, grammarAccess.getSenderReceiverInterfaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:553:1: ( (lv_dataElement_3_0= ruleDataElement ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:554:1: (lv_dataElement_3_0= ruleDataElement )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:554:1: (lv_dataElement_3_0= ruleDataElement )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:555:3: lv_dataElement_3_0= ruleDataElement
            {
             
            	        newCompositeNode(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementDataElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDataElement_in_ruleSenderReceiverInterface1319);
            lv_dataElement_3_0=ruleDataElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSenderReceiverInterfaceRule());
            	        }
                   		add(
                   			current, 
                   			"dataElement",
                    		lv_dataElement_3_0, 
                    		"DataElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSenderReceiverInterface1331); 

                	newLeafNode(otherlv_4, grammarAccess.getSenderReceiverInterfaceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleSenderReceiverInterface"


    // $ANTLR start "entryRuleDataElement"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:583:1: entryRuleDataElement returns [EObject current=null] : iv_ruleDataElement= ruleDataElement EOF ;
    public final EObject entryRuleDataElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataElement = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:584:2: (iv_ruleDataElement= ruleDataElement EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:585:2: iv_ruleDataElement= ruleDataElement EOF
            {
             newCompositeNode(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_ruleDataElement_in_entryRuleDataElement1367);
            iv_ruleDataElement=ruleDataElement();

            state._fsp--;

             current =iv_ruleDataElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataElement1377); 

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
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:592:1: ruleDataElement returns [EObject current=null] : (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleDataElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:595:28: ( (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:596:1: (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:596:1: (otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:596:3: otherlv_0= 'dataType' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDataElement1414); 

                	newLeafNode(otherlv_0, grammarAccess.getDataElementAccess().getDataTypeKeyword_0());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:600:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:601:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:601:1: (lv_name_1_0= RULE_ID )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:602:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataElement1431); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:618:2: ( (otherlv_2= RULE_ID ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:619:1: (otherlv_2= RULE_ID )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:619:1: (otherlv_2= RULE_ID )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:620:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataElementRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataElement1456); 

            		newLeafNode(otherlv_2, grammarAccess.getDataElementAccess().getDataTypeDataTypeCrossReference_2_0()); 
            	

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
    // $ANTLR end "ruleDataElement"


    // $ANTLR start "entryRuleClientServerInterface"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:641:1: entryRuleClientServerInterface returns [EObject current=null] : iv_ruleClientServerInterface= ruleClientServerInterface EOF ;
    public final EObject entryRuleClientServerInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClientServerInterface = null;


        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:642:2: (iv_ruleClientServerInterface= ruleClientServerInterface EOF )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:643:2: iv_ruleClientServerInterface= ruleClientServerInterface EOF
            {
             newCompositeNode(grammarAccess.getClientServerInterfaceRule()); 
            pushFollow(FOLLOW_ruleClientServerInterface_in_entryRuleClientServerInterface1494);
            iv_ruleClientServerInterface=ruleClientServerInterface();

            state._fsp--;

             current =iv_ruleClientServerInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClientServerInterface1504); 

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
    // $ANTLR end "entryRuleClientServerInterface"


    // $ANTLR start "ruleClientServerInterface"
    // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:650:1: ruleClientServerInterface returns [EObject current=null] : (otherlv_0= 'CSInterface' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleClientServerInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:653:28: ( (otherlv_0= 'CSInterface' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:654:1: (otherlv_0= 'CSInterface' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:654:1: (otherlv_0= 'CSInterface' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:654:3: otherlv_0= 'CSInterface' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleClientServerInterface1541); 

                	newLeafNode(otherlv_0, grammarAccess.getClientServerInterfaceAccess().getCSInterfaceKeyword_0());
                
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:658:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:659:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:659:1: (lv_name_1_0= RULE_ID )
            // ../com.ponta027.swc.tool/src-gen/com/ponta027/swc/parser/antlr/internal/InternalTool.g:660:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClientServerInterface1558); 

            			newLeafNode(lv_name_1_0, grammarAccess.getClientServerInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClientServerInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleClientServerInterface"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel130 = new BitSet(new long[]{0x0000000000501002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwc_in_ruleElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName337 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedName356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName371 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSwc_in_entryRuleSwc418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwc428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleSwc465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSwc482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSwc499 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rulePort_in_ruleSwc520 = new BitSet(new long[]{0x000000000004C000L});
    public static final BitSet FOLLOW_14_in_ruleSwc533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePPort_in_rulePort626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPort_in_rulePort653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPort_in_entryRuleRPort688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRPort698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRPort735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRPort752 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRPort769 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_16_in_ruleRPort782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRPort805 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleRPort820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRPort843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRPort857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePPort_in_entryRulePPort893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePPort903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePPort940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePPort957 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePPort974 = new BitSet(new long[]{0x0000000000094000L});
    public static final BitSet FOLLOW_16_in_rulePPort987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePPort1010 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_rulePPort1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePPort1048 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePPort1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSenderReceiverInterface_in_ruleInterface1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientServerInterface_in_ruleInterface1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSenderReceiverInterface_in_entryRuleSenderReceiverInterface1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSenderReceiverInterface1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSenderReceiverInterface1264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSenderReceiverInterface1281 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSenderReceiverInterface1298 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleDataElement_in_ruleSenderReceiverInterface1319 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSenderReceiverInterface1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_entryRuleDataElement1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataElement1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDataElement1414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataElement1431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataElement1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientServerInterface_in_entryRuleClientServerInterface1494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClientServerInterface1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleClientServerInterface1541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClientServerInterface1558 = new BitSet(new long[]{0x0000000000000002L});

}