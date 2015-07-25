package com.ponta027.swc.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.ponta027.swc.services.ToolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalToolParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g"; }


     
     	private ToolGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ToolGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:61:1: ( ruleModel EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:73:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:75:1: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:76:1: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==20||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:76:2: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleElement"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:89:1: ( ruleElement EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement122);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement129); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:104:1: ( rule__Element__Alternatives )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement155);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:116:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:117:1: ( ruleQualifiedName EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:118:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName182);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName189); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:125:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:129:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:130:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:131:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:132:1: ( rule__QualifiedName__Group__0 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:132:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName215);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleSwc"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:144:1: entryRuleSwc : ruleSwc EOF ;
    public final void entryRuleSwc() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:145:1: ( ruleSwc EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:146:1: ruleSwc EOF
            {
             before(grammarAccess.getSwcRule()); 
            pushFollow(FOLLOW_ruleSwc_in_entryRuleSwc242);
            ruleSwc();

            state._fsp--;

             after(grammarAccess.getSwcRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwc249); 

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
    // $ANTLR end "entryRuleSwc"


    // $ANTLR start "ruleSwc"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:153:1: ruleSwc : ( ( rule__Swc__Group__0 ) ) ;
    public final void ruleSwc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:157:2: ( ( ( rule__Swc__Group__0 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:158:1: ( ( rule__Swc__Group__0 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:158:1: ( ( rule__Swc__Group__0 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:159:1: ( rule__Swc__Group__0 )
            {
             before(grammarAccess.getSwcAccess().getGroup()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:160:1: ( rule__Swc__Group__0 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:160:2: rule__Swc__Group__0
            {
            pushFollow(FOLLOW_rule__Swc__Group__0_in_ruleSwc275);
            rule__Swc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSwcAccess().getGroup()); 

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
    // $ANTLR end "ruleSwc"


    // $ANTLR start "entryRulePort"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:172:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:173:1: ( rulePort EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:174:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort302);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort309); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:181:1: rulePort : ( ( rule__Port__Alternatives ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:185:2: ( ( ( rule__Port__Alternatives ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:186:1: ( ( rule__Port__Alternatives ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:186:1: ( ( rule__Port__Alternatives ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:187:1: ( rule__Port__Alternatives )
            {
             before(grammarAccess.getPortAccess().getAlternatives()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:188:1: ( rule__Port__Alternatives )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:188:2: rule__Port__Alternatives
            {
            pushFollow(FOLLOW_rule__Port__Alternatives_in_rulePort335);
            rule__Port__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getAlternatives()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleRPort"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:200:1: entryRuleRPort : ruleRPort EOF ;
    public final void entryRuleRPort() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:201:1: ( ruleRPort EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:202:1: ruleRPort EOF
            {
             before(grammarAccess.getRPortRule()); 
            pushFollow(FOLLOW_ruleRPort_in_entryRuleRPort362);
            ruleRPort();

            state._fsp--;

             after(grammarAccess.getRPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRPort369); 

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
    // $ANTLR end "entryRuleRPort"


    // $ANTLR start "ruleRPort"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:209:1: ruleRPort : ( ( rule__RPort__Group__0 ) ) ;
    public final void ruleRPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:213:2: ( ( ( rule__RPort__Group__0 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:214:1: ( ( rule__RPort__Group__0 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:214:1: ( ( rule__RPort__Group__0 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:215:1: ( rule__RPort__Group__0 )
            {
             before(grammarAccess.getRPortAccess().getGroup()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:216:1: ( rule__RPort__Group__0 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:216:2: rule__RPort__Group__0
            {
            pushFollow(FOLLOW_rule__RPort__Group__0_in_ruleRPort395);
            rule__RPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRPortAccess().getGroup()); 

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
    // $ANTLR end "ruleRPort"


    // $ANTLR start "entryRulePPort"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:228:1: entryRulePPort : rulePPort EOF ;
    public final void entryRulePPort() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:229:1: ( rulePPort EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:230:1: rulePPort EOF
            {
             before(grammarAccess.getPPortRule()); 
            pushFollow(FOLLOW_rulePPort_in_entryRulePPort422);
            rulePPort();

            state._fsp--;

             after(grammarAccess.getPPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePPort429); 

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
    // $ANTLR end "entryRulePPort"


    // $ANTLR start "rulePPort"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:237:1: rulePPort : ( ( rule__PPort__Group__0 ) ) ;
    public final void rulePPort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:241:2: ( ( ( rule__PPort__Group__0 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:242:1: ( ( rule__PPort__Group__0 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:242:1: ( ( rule__PPort__Group__0 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:243:1: ( rule__PPort__Group__0 )
            {
             before(grammarAccess.getPPortAccess().getGroup()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:244:1: ( rule__PPort__Group__0 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:244:2: rule__PPort__Group__0
            {
            pushFollow(FOLLOW_rule__PPort__Group__0_in_rulePPort455);
            rule__PPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPPortAccess().getGroup()); 

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
    // $ANTLR end "rulePPort"


    // $ANTLR start "entryRuleInterface"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:256:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:257:1: ( ruleInterface EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:258:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface482);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface489); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:265:1: ruleInterface : ( ( rule__Interface__Alternatives ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:269:2: ( ( ( rule__Interface__Alternatives ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:270:1: ( ( rule__Interface__Alternatives ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:270:1: ( ( rule__Interface__Alternatives ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:271:1: ( rule__Interface__Alternatives )
            {
             before(grammarAccess.getInterfaceAccess().getAlternatives()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:272:1: ( rule__Interface__Alternatives )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:272:2: rule__Interface__Alternatives
            {
            pushFollow(FOLLOW_rule__Interface__Alternatives_in_ruleInterface515);
            rule__Interface__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleSenderReceiverInterface"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:284:1: entryRuleSenderReceiverInterface : ruleSenderReceiverInterface EOF ;
    public final void entryRuleSenderReceiverInterface() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:285:1: ( ruleSenderReceiverInterface EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:286:1: ruleSenderReceiverInterface EOF
            {
             before(grammarAccess.getSenderReceiverInterfaceRule()); 
            pushFollow(FOLLOW_ruleSenderReceiverInterface_in_entryRuleSenderReceiverInterface542);
            ruleSenderReceiverInterface();

            state._fsp--;

             after(grammarAccess.getSenderReceiverInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSenderReceiverInterface549); 

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
    // $ANTLR end "entryRuleSenderReceiverInterface"


    // $ANTLR start "ruleSenderReceiverInterface"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:293:1: ruleSenderReceiverInterface : ( ( rule__SenderReceiverInterface__Group__0 ) ) ;
    public final void ruleSenderReceiverInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:297:2: ( ( ( rule__SenderReceiverInterface__Group__0 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:298:1: ( ( rule__SenderReceiverInterface__Group__0 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:298:1: ( ( rule__SenderReceiverInterface__Group__0 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:299:1: ( rule__SenderReceiverInterface__Group__0 )
            {
             before(grammarAccess.getSenderReceiverInterfaceAccess().getGroup()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:300:1: ( rule__SenderReceiverInterface__Group__0 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:300:2: rule__SenderReceiverInterface__Group__0
            {
            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__0_in_ruleSenderReceiverInterface575);
            rule__SenderReceiverInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSenderReceiverInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleSenderReceiverInterface"


    // $ANTLR start "entryRuleDataElement"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:312:1: entryRuleDataElement : ruleDataElement EOF ;
    public final void entryRuleDataElement() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:313:1: ( ruleDataElement EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:314:1: ruleDataElement EOF
            {
             before(grammarAccess.getDataElementRule()); 
            pushFollow(FOLLOW_ruleDataElement_in_entryRuleDataElement602);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getDataElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataElement609); 

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
    // $ANTLR end "entryRuleDataElement"


    // $ANTLR start "ruleDataElement"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:321:1: ruleDataElement : ( ( rule__DataElement__Group__0 ) ) ;
    public final void ruleDataElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:325:2: ( ( ( rule__DataElement__Group__0 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:326:1: ( ( rule__DataElement__Group__0 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:326:1: ( ( rule__DataElement__Group__0 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:327:1: ( rule__DataElement__Group__0 )
            {
             before(grammarAccess.getDataElementAccess().getGroup()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:328:1: ( rule__DataElement__Group__0 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:328:2: rule__DataElement__Group__0
            {
            pushFollow(FOLLOW_rule__DataElement__Group__0_in_ruleDataElement635);
            rule__DataElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getGroup()); 

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
    // $ANTLR end "ruleDataElement"


    // $ANTLR start "entryRuleClientServerInterface"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:342:1: entryRuleClientServerInterface : ruleClientServerInterface EOF ;
    public final void entryRuleClientServerInterface() throws RecognitionException {
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:343:1: ( ruleClientServerInterface EOF )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:344:1: ruleClientServerInterface EOF
            {
             before(grammarAccess.getClientServerInterfaceRule()); 
            pushFollow(FOLLOW_ruleClientServerInterface_in_entryRuleClientServerInterface664);
            ruleClientServerInterface();

            state._fsp--;

             after(grammarAccess.getClientServerInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClientServerInterface671); 

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
    // $ANTLR end "entryRuleClientServerInterface"


    // $ANTLR start "ruleClientServerInterface"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:351:1: ruleClientServerInterface : ( ( rule__ClientServerInterface__Group__0 ) ) ;
    public final void ruleClientServerInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:355:2: ( ( ( rule__ClientServerInterface__Group__0 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:356:1: ( ( rule__ClientServerInterface__Group__0 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:356:1: ( ( rule__ClientServerInterface__Group__0 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:357:1: ( rule__ClientServerInterface__Group__0 )
            {
             before(grammarAccess.getClientServerInterfaceAccess().getGroup()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:358:1: ( rule__ClientServerInterface__Group__0 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:358:2: rule__ClientServerInterface__Group__0
            {
            pushFollow(FOLLOW_rule__ClientServerInterface__Group__0_in_ruleClientServerInterface697);
            rule__ClientServerInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClientServerInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleClientServerInterface"


    // $ANTLR start "rule__Element__Alternatives"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:370:1: rule__Element__Alternatives : ( ( ruleSwc ) | ( ruleInterface ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:374:1: ( ( ruleSwc ) | ( ruleInterface ) )
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
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:375:1: ( ruleSwc )
                    {
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:375:1: ( ruleSwc )
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:376:1: ruleSwc
                    {
                     before(grammarAccess.getElementAccess().getSwcParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSwc_in_rule__Element__Alternatives733);
                    ruleSwc();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSwcParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:381:6: ( ruleInterface )
                    {
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:381:6: ( ruleInterface )
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:382:1: ruleInterface
                    {
                     before(grammarAccess.getElementAccess().getInterfaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInterface_in_rule__Element__Alternatives750);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInterfaceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Port__Alternatives"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:392:1: rule__Port__Alternatives : ( ( rulePPort ) | ( ruleRPort ) );
    public final void rule__Port__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:396:1: ( ( rulePPort ) | ( ruleRPort ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:397:1: ( rulePPort )
                    {
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:397:1: ( rulePPort )
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:398:1: rulePPort
                    {
                     before(grammarAccess.getPortAccess().getPPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePPort_in_rule__Port__Alternatives782);
                    rulePPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getPPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:403:6: ( ruleRPort )
                    {
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:403:6: ( ruleRPort )
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:404:1: ruleRPort
                    {
                     before(grammarAccess.getPortAccess().getRPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRPort_in_rule__Port__Alternatives799);
                    ruleRPort();

                    state._fsp--;

                     after(grammarAccess.getPortAccess().getRPortParserRuleCall_1()); 

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
    // $ANTLR end "rule__Port__Alternatives"


    // $ANTLR start "rule__Interface__Alternatives"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:414:1: rule__Interface__Alternatives : ( ( ruleSenderReceiverInterface ) | ( ruleClientServerInterface ) );
    public final void rule__Interface__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:418:1: ( ( ruleSenderReceiverInterface ) | ( ruleClientServerInterface ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:419:1: ( ruleSenderReceiverInterface )
                    {
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:419:1: ( ruleSenderReceiverInterface )
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:420:1: ruleSenderReceiverInterface
                    {
                     before(grammarAccess.getInterfaceAccess().getSenderReceiverInterfaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSenderReceiverInterface_in_rule__Interface__Alternatives831);
                    ruleSenderReceiverInterface();

                    state._fsp--;

                     after(grammarAccess.getInterfaceAccess().getSenderReceiverInterfaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:425:6: ( ruleClientServerInterface )
                    {
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:425:6: ( ruleClientServerInterface )
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:426:1: ruleClientServerInterface
                    {
                     before(grammarAccess.getInterfaceAccess().getClientServerInterfaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleClientServerInterface_in_rule__Interface__Alternatives848);
                    ruleClientServerInterface();

                    state._fsp--;

                     after(grammarAccess.getInterfaceAccess().getClientServerInterfaceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Interface__Alternatives"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:438:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:442:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:443:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0878);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0881);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:450:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:454:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:455:1: ( RULE_ID )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:455:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:456:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl908); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:467:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:471:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:472:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1937);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:478:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:482:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:483:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:483:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:484:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:485:1: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:485:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl964);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:499:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:503:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:504:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0999);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01002);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:511:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:515:1: ( ( '.' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:516:1: ( '.' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:516:1: ( '.' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:517:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__QualifiedName__Group_1__0__Impl1030); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:530:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:534:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:535:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11061);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:541:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:545:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:546:1: ( RULE_ID )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:546:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:547:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1088); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Swc__Group__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:562:1: rule__Swc__Group__0 : rule__Swc__Group__0__Impl rule__Swc__Group__1 ;
    public final void rule__Swc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:566:1: ( rule__Swc__Group__0__Impl rule__Swc__Group__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:567:2: rule__Swc__Group__0__Impl rule__Swc__Group__1
            {
            pushFollow(FOLLOW_rule__Swc__Group__0__Impl_in_rule__Swc__Group__01121);
            rule__Swc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Swc__Group__1_in_rule__Swc__Group__01124);
            rule__Swc__Group__1();

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
    // $ANTLR end "rule__Swc__Group__0"


    // $ANTLR start "rule__Swc__Group__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:574:1: rule__Swc__Group__0__Impl : ( 'swc' ) ;
    public final void rule__Swc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:578:1: ( ( 'swc' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:579:1: ( 'swc' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:579:1: ( 'swc' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:580:1: 'swc'
            {
             before(grammarAccess.getSwcAccess().getSwcKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Swc__Group__0__Impl1152); 
             after(grammarAccess.getSwcAccess().getSwcKeyword_0()); 

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
    // $ANTLR end "rule__Swc__Group__0__Impl"


    // $ANTLR start "rule__Swc__Group__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:593:1: rule__Swc__Group__1 : rule__Swc__Group__1__Impl rule__Swc__Group__2 ;
    public final void rule__Swc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:597:1: ( rule__Swc__Group__1__Impl rule__Swc__Group__2 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:598:2: rule__Swc__Group__1__Impl rule__Swc__Group__2
            {
            pushFollow(FOLLOW_rule__Swc__Group__1__Impl_in_rule__Swc__Group__11183);
            rule__Swc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Swc__Group__2_in_rule__Swc__Group__11186);
            rule__Swc__Group__2();

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
    // $ANTLR end "rule__Swc__Group__1"


    // $ANTLR start "rule__Swc__Group__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:605:1: rule__Swc__Group__1__Impl : ( ( rule__Swc__NameAssignment_1 ) ) ;
    public final void rule__Swc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:609:1: ( ( ( rule__Swc__NameAssignment_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:610:1: ( ( rule__Swc__NameAssignment_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:610:1: ( ( rule__Swc__NameAssignment_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:611:1: ( rule__Swc__NameAssignment_1 )
            {
             before(grammarAccess.getSwcAccess().getNameAssignment_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:612:1: ( rule__Swc__NameAssignment_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:612:2: rule__Swc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Swc__NameAssignment_1_in_rule__Swc__Group__1__Impl1213);
            rule__Swc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSwcAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Swc__Group__1__Impl"


    // $ANTLR start "rule__Swc__Group__2"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:622:1: rule__Swc__Group__2 : rule__Swc__Group__2__Impl rule__Swc__Group__3 ;
    public final void rule__Swc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:626:1: ( rule__Swc__Group__2__Impl rule__Swc__Group__3 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:627:2: rule__Swc__Group__2__Impl rule__Swc__Group__3
            {
            pushFollow(FOLLOW_rule__Swc__Group__2__Impl_in_rule__Swc__Group__21243);
            rule__Swc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Swc__Group__3_in_rule__Swc__Group__21246);
            rule__Swc__Group__3();

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
    // $ANTLR end "rule__Swc__Group__2"


    // $ANTLR start "rule__Swc__Group__2__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:634:1: rule__Swc__Group__2__Impl : ( '{' ) ;
    public final void rule__Swc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:638:1: ( ( '{' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:639:1: ( '{' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:639:1: ( '{' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:640:1: '{'
            {
             before(grammarAccess.getSwcAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Swc__Group__2__Impl1274); 
             after(grammarAccess.getSwcAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Swc__Group__2__Impl"


    // $ANTLR start "rule__Swc__Group__3"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:653:1: rule__Swc__Group__3 : rule__Swc__Group__3__Impl rule__Swc__Group__4 ;
    public final void rule__Swc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:657:1: ( rule__Swc__Group__3__Impl rule__Swc__Group__4 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:658:2: rule__Swc__Group__3__Impl rule__Swc__Group__4
            {
            pushFollow(FOLLOW_rule__Swc__Group__3__Impl_in_rule__Swc__Group__31305);
            rule__Swc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Swc__Group__4_in_rule__Swc__Group__31308);
            rule__Swc__Group__4();

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
    // $ANTLR end "rule__Swc__Group__3"


    // $ANTLR start "rule__Swc__Group__3__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:665:1: rule__Swc__Group__3__Impl : ( ( ( rule__Swc__PortsAssignment_3 ) ) ( ( rule__Swc__PortsAssignment_3 )* ) ) ;
    public final void rule__Swc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:669:1: ( ( ( ( rule__Swc__PortsAssignment_3 ) ) ( ( rule__Swc__PortsAssignment_3 )* ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:670:1: ( ( ( rule__Swc__PortsAssignment_3 ) ) ( ( rule__Swc__PortsAssignment_3 )* ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:670:1: ( ( ( rule__Swc__PortsAssignment_3 ) ) ( ( rule__Swc__PortsAssignment_3 )* ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:671:1: ( ( rule__Swc__PortsAssignment_3 ) ) ( ( rule__Swc__PortsAssignment_3 )* )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:671:1: ( ( rule__Swc__PortsAssignment_3 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:672:1: ( rule__Swc__PortsAssignment_3 )
            {
             before(grammarAccess.getSwcAccess().getPortsAssignment_3()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:673:1: ( rule__Swc__PortsAssignment_3 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:673:2: rule__Swc__PortsAssignment_3
            {
            pushFollow(FOLLOW_rule__Swc__PortsAssignment_3_in_rule__Swc__Group__3__Impl1337);
            rule__Swc__PortsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSwcAccess().getPortsAssignment_3()); 

            }

            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:676:1: ( ( rule__Swc__PortsAssignment_3 )* )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:677:1: ( rule__Swc__PortsAssignment_3 )*
            {
             before(grammarAccess.getSwcAccess().getPortsAssignment_3()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:678:1: ( rule__Swc__PortsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:678:2: rule__Swc__PortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Swc__PortsAssignment_3_in_rule__Swc__Group__3__Impl1349);
            	    rule__Swc__PortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSwcAccess().getPortsAssignment_3()); 

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
    // $ANTLR end "rule__Swc__Group__3__Impl"


    // $ANTLR start "rule__Swc__Group__4"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:689:1: rule__Swc__Group__4 : rule__Swc__Group__4__Impl ;
    public final void rule__Swc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:693:1: ( rule__Swc__Group__4__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:694:2: rule__Swc__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Swc__Group__4__Impl_in_rule__Swc__Group__41382);
            rule__Swc__Group__4__Impl();

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
    // $ANTLR end "rule__Swc__Group__4"


    // $ANTLR start "rule__Swc__Group__4__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:700:1: rule__Swc__Group__4__Impl : ( '}' ) ;
    public final void rule__Swc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:704:1: ( ( '}' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:705:1: ( '}' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:705:1: ( '}' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:706:1: '}'
            {
             before(grammarAccess.getSwcAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Swc__Group__4__Impl1410); 
             after(grammarAccess.getSwcAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Swc__Group__4__Impl"


    // $ANTLR start "rule__RPort__Group__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:729:1: rule__RPort__Group__0 : rule__RPort__Group__0__Impl rule__RPort__Group__1 ;
    public final void rule__RPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:733:1: ( rule__RPort__Group__0__Impl rule__RPort__Group__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:734:2: rule__RPort__Group__0__Impl rule__RPort__Group__1
            {
            pushFollow(FOLLOW_rule__RPort__Group__0__Impl_in_rule__RPort__Group__01451);
            rule__RPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RPort__Group__1_in_rule__RPort__Group__01454);
            rule__RPort__Group__1();

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
    // $ANTLR end "rule__RPort__Group__0"


    // $ANTLR start "rule__RPort__Group__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:741:1: rule__RPort__Group__0__Impl : ( 'rport' ) ;
    public final void rule__RPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:745:1: ( ( 'rport' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:746:1: ( 'rport' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:746:1: ( 'rport' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:747:1: 'rport'
            {
             before(grammarAccess.getRPortAccess().getRportKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__RPort__Group__0__Impl1482); 
             after(grammarAccess.getRPortAccess().getRportKeyword_0()); 

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
    // $ANTLR end "rule__RPort__Group__0__Impl"


    // $ANTLR start "rule__RPort__Group__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:760:1: rule__RPort__Group__1 : rule__RPort__Group__1__Impl rule__RPort__Group__2 ;
    public final void rule__RPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:764:1: ( rule__RPort__Group__1__Impl rule__RPort__Group__2 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:765:2: rule__RPort__Group__1__Impl rule__RPort__Group__2
            {
            pushFollow(FOLLOW_rule__RPort__Group__1__Impl_in_rule__RPort__Group__11513);
            rule__RPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RPort__Group__2_in_rule__RPort__Group__11516);
            rule__RPort__Group__2();

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
    // $ANTLR end "rule__RPort__Group__1"


    // $ANTLR start "rule__RPort__Group__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:772:1: rule__RPort__Group__1__Impl : ( ( rule__RPort__NameAssignment_1 ) ) ;
    public final void rule__RPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:776:1: ( ( ( rule__RPort__NameAssignment_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:777:1: ( ( rule__RPort__NameAssignment_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:777:1: ( ( rule__RPort__NameAssignment_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:778:1: ( rule__RPort__NameAssignment_1 )
            {
             before(grammarAccess.getRPortAccess().getNameAssignment_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:779:1: ( rule__RPort__NameAssignment_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:779:2: rule__RPort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RPort__NameAssignment_1_in_rule__RPort__Group__1__Impl1543);
            rule__RPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRPortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RPort__Group__1__Impl"


    // $ANTLR start "rule__RPort__Group__2"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:789:1: rule__RPort__Group__2 : rule__RPort__Group__2__Impl rule__RPort__Group__3 ;
    public final void rule__RPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:793:1: ( rule__RPort__Group__2__Impl rule__RPort__Group__3 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:794:2: rule__RPort__Group__2__Impl rule__RPort__Group__3
            {
            pushFollow(FOLLOW_rule__RPort__Group__2__Impl_in_rule__RPort__Group__21573);
            rule__RPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RPort__Group__3_in_rule__RPort__Group__21576);
            rule__RPort__Group__3();

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
    // $ANTLR end "rule__RPort__Group__2"


    // $ANTLR start "rule__RPort__Group__2__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:801:1: rule__RPort__Group__2__Impl : ( '{' ) ;
    public final void rule__RPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:805:1: ( ( '{' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:806:1: ( '{' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:806:1: ( '{' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:807:1: '{'
            {
             before(grammarAccess.getRPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__RPort__Group__2__Impl1604); 
             after(grammarAccess.getRPortAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RPort__Group__2__Impl"


    // $ANTLR start "rule__RPort__Group__3"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:820:1: rule__RPort__Group__3 : rule__RPort__Group__3__Impl rule__RPort__Group__4 ;
    public final void rule__RPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:824:1: ( rule__RPort__Group__3__Impl rule__RPort__Group__4 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:825:2: rule__RPort__Group__3__Impl rule__RPort__Group__4
            {
            pushFollow(FOLLOW_rule__RPort__Group__3__Impl_in_rule__RPort__Group__31635);
            rule__RPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RPort__Group__4_in_rule__RPort__Group__31638);
            rule__RPort__Group__4();

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
    // $ANTLR end "rule__RPort__Group__3"


    // $ANTLR start "rule__RPort__Group__3__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:832:1: rule__RPort__Group__3__Impl : ( ( rule__RPort__Group_3__0 )? ) ;
    public final void rule__RPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:836:1: ( ( ( rule__RPort__Group_3__0 )? ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:837:1: ( ( rule__RPort__Group_3__0 )? )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:837:1: ( ( rule__RPort__Group_3__0 )? )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:838:1: ( rule__RPort__Group_3__0 )?
            {
             before(grammarAccess.getRPortAccess().getGroup_3()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:839:1: ( rule__RPort__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:839:2: rule__RPort__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RPort__Group_3__0_in_rule__RPort__Group__3__Impl1665);
                    rule__RPort__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRPortAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RPort__Group__3__Impl"


    // $ANTLR start "rule__RPort__Group__4"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:849:1: rule__RPort__Group__4 : rule__RPort__Group__4__Impl rule__RPort__Group__5 ;
    public final void rule__RPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:853:1: ( rule__RPort__Group__4__Impl rule__RPort__Group__5 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:854:2: rule__RPort__Group__4__Impl rule__RPort__Group__5
            {
            pushFollow(FOLLOW_rule__RPort__Group__4__Impl_in_rule__RPort__Group__41696);
            rule__RPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RPort__Group__5_in_rule__RPort__Group__41699);
            rule__RPort__Group__5();

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
    // $ANTLR end "rule__RPort__Group__4"


    // $ANTLR start "rule__RPort__Group__4__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:861:1: rule__RPort__Group__4__Impl : ( ( rule__RPort__Group_4__0 )? ) ;
    public final void rule__RPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:865:1: ( ( ( rule__RPort__Group_4__0 )? ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:866:1: ( ( rule__RPort__Group_4__0 )? )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:866:1: ( ( rule__RPort__Group_4__0 )? )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:867:1: ( rule__RPort__Group_4__0 )?
            {
             before(grammarAccess.getRPortAccess().getGroup_4()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:868:1: ( rule__RPort__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:868:2: rule__RPort__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RPort__Group_4__0_in_rule__RPort__Group__4__Impl1726);
                    rule__RPort__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRPortAccess().getGroup_4()); 

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
    // $ANTLR end "rule__RPort__Group__4__Impl"


    // $ANTLR start "rule__RPort__Group__5"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:878:1: rule__RPort__Group__5 : rule__RPort__Group__5__Impl ;
    public final void rule__RPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:882:1: ( rule__RPort__Group__5__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:883:2: rule__RPort__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RPort__Group__5__Impl_in_rule__RPort__Group__51757);
            rule__RPort__Group__5__Impl();

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
    // $ANTLR end "rule__RPort__Group__5"


    // $ANTLR start "rule__RPort__Group__5__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:889:1: rule__RPort__Group__5__Impl : ( '}' ) ;
    public final void rule__RPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:893:1: ( ( '}' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:894:1: ( '}' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:894:1: ( '}' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:895:1: '}'
            {
             before(grammarAccess.getRPortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__RPort__Group__5__Impl1785); 
             after(grammarAccess.getRPortAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__RPort__Group__5__Impl"


    // $ANTLR start "rule__RPort__Group_3__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:920:1: rule__RPort__Group_3__0 : rule__RPort__Group_3__0__Impl rule__RPort__Group_3__1 ;
    public final void rule__RPort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:924:1: ( rule__RPort__Group_3__0__Impl rule__RPort__Group_3__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:925:2: rule__RPort__Group_3__0__Impl rule__RPort__Group_3__1
            {
            pushFollow(FOLLOW_rule__RPort__Group_3__0__Impl_in_rule__RPort__Group_3__01828);
            rule__RPort__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RPort__Group_3__1_in_rule__RPort__Group_3__01831);
            rule__RPort__Group_3__1();

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
    // $ANTLR end "rule__RPort__Group_3__0"


    // $ANTLR start "rule__RPort__Group_3__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:932:1: rule__RPort__Group_3__0__Impl : ( 'interface' ) ;
    public final void rule__RPort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:936:1: ( ( 'interface' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:937:1: ( 'interface' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:937:1: ( 'interface' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:938:1: 'interface'
            {
             before(grammarAccess.getRPortAccess().getInterfaceKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__RPort__Group_3__0__Impl1859); 
             after(grammarAccess.getRPortAccess().getInterfaceKeyword_3_0()); 

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
    // $ANTLR end "rule__RPort__Group_3__0__Impl"


    // $ANTLR start "rule__RPort__Group_3__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:951:1: rule__RPort__Group_3__1 : rule__RPort__Group_3__1__Impl ;
    public final void rule__RPort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:955:1: ( rule__RPort__Group_3__1__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:956:2: rule__RPort__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RPort__Group_3__1__Impl_in_rule__RPort__Group_3__11890);
            rule__RPort__Group_3__1__Impl();

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
    // $ANTLR end "rule__RPort__Group_3__1"


    // $ANTLR start "rule__RPort__Group_3__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:962:1: rule__RPort__Group_3__1__Impl : ( ( rule__RPort__InterfaceAssignment_3_1 ) ) ;
    public final void rule__RPort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:966:1: ( ( ( rule__RPort__InterfaceAssignment_3_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:967:1: ( ( rule__RPort__InterfaceAssignment_3_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:967:1: ( ( rule__RPort__InterfaceAssignment_3_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:968:1: ( rule__RPort__InterfaceAssignment_3_1 )
            {
             before(grammarAccess.getRPortAccess().getInterfaceAssignment_3_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:969:1: ( rule__RPort__InterfaceAssignment_3_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:969:2: rule__RPort__InterfaceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RPort__InterfaceAssignment_3_1_in_rule__RPort__Group_3__1__Impl1917);
            rule__RPort__InterfaceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRPortAccess().getInterfaceAssignment_3_1()); 

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
    // $ANTLR end "rule__RPort__Group_3__1__Impl"


    // $ANTLR start "rule__RPort__Group_4__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:983:1: rule__RPort__Group_4__0 : rule__RPort__Group_4__0__Impl rule__RPort__Group_4__1 ;
    public final void rule__RPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:987:1: ( rule__RPort__Group_4__0__Impl rule__RPort__Group_4__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:988:2: rule__RPort__Group_4__0__Impl rule__RPort__Group_4__1
            {
            pushFollow(FOLLOW_rule__RPort__Group_4__0__Impl_in_rule__RPort__Group_4__01951);
            rule__RPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RPort__Group_4__1_in_rule__RPort__Group_4__01954);
            rule__RPort__Group_4__1();

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
    // $ANTLR end "rule__RPort__Group_4__0"


    // $ANTLR start "rule__RPort__Group_4__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:995:1: rule__RPort__Group_4__0__Impl : ( 'from' ) ;
    public final void rule__RPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:999:1: ( ( 'from' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1000:1: ( 'from' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1000:1: ( 'from' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1001:1: 'from'
            {
             before(grammarAccess.getRPortAccess().getFromKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__RPort__Group_4__0__Impl1982); 
             after(grammarAccess.getRPortAccess().getFromKeyword_4_0()); 

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
    // $ANTLR end "rule__RPort__Group_4__0__Impl"


    // $ANTLR start "rule__RPort__Group_4__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1014:1: rule__RPort__Group_4__1 : rule__RPort__Group_4__1__Impl ;
    public final void rule__RPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1018:1: ( rule__RPort__Group_4__1__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1019:2: rule__RPort__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RPort__Group_4__1__Impl_in_rule__RPort__Group_4__12013);
            rule__RPort__Group_4__1__Impl();

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
    // $ANTLR end "rule__RPort__Group_4__1"


    // $ANTLR start "rule__RPort__Group_4__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1025:1: rule__RPort__Group_4__1__Impl : ( ( rule__RPort__FromPortAssignment_4_1 ) ) ;
    public final void rule__RPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1029:1: ( ( ( rule__RPort__FromPortAssignment_4_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1030:1: ( ( rule__RPort__FromPortAssignment_4_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1030:1: ( ( rule__RPort__FromPortAssignment_4_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1031:1: ( rule__RPort__FromPortAssignment_4_1 )
            {
             before(grammarAccess.getRPortAccess().getFromPortAssignment_4_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1032:1: ( rule__RPort__FromPortAssignment_4_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1032:2: rule__RPort__FromPortAssignment_4_1
            {
            pushFollow(FOLLOW_rule__RPort__FromPortAssignment_4_1_in_rule__RPort__Group_4__1__Impl2040);
            rule__RPort__FromPortAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRPortAccess().getFromPortAssignment_4_1()); 

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
    // $ANTLR end "rule__RPort__Group_4__1__Impl"


    // $ANTLR start "rule__PPort__Group__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1046:1: rule__PPort__Group__0 : rule__PPort__Group__0__Impl rule__PPort__Group__1 ;
    public final void rule__PPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1050:1: ( rule__PPort__Group__0__Impl rule__PPort__Group__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1051:2: rule__PPort__Group__0__Impl rule__PPort__Group__1
            {
            pushFollow(FOLLOW_rule__PPort__Group__0__Impl_in_rule__PPort__Group__02074);
            rule__PPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PPort__Group__1_in_rule__PPort__Group__02077);
            rule__PPort__Group__1();

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
    // $ANTLR end "rule__PPort__Group__0"


    // $ANTLR start "rule__PPort__Group__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1058:1: rule__PPort__Group__0__Impl : ( 'pport' ) ;
    public final void rule__PPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1062:1: ( ( 'pport' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1063:1: ( 'pport' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1063:1: ( 'pport' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1064:1: 'pport'
            {
             before(grammarAccess.getPPortAccess().getPportKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__PPort__Group__0__Impl2105); 
             after(grammarAccess.getPPortAccess().getPportKeyword_0()); 

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
    // $ANTLR end "rule__PPort__Group__0__Impl"


    // $ANTLR start "rule__PPort__Group__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1077:1: rule__PPort__Group__1 : rule__PPort__Group__1__Impl rule__PPort__Group__2 ;
    public final void rule__PPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1081:1: ( rule__PPort__Group__1__Impl rule__PPort__Group__2 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1082:2: rule__PPort__Group__1__Impl rule__PPort__Group__2
            {
            pushFollow(FOLLOW_rule__PPort__Group__1__Impl_in_rule__PPort__Group__12136);
            rule__PPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PPort__Group__2_in_rule__PPort__Group__12139);
            rule__PPort__Group__2();

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
    // $ANTLR end "rule__PPort__Group__1"


    // $ANTLR start "rule__PPort__Group__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1089:1: rule__PPort__Group__1__Impl : ( ( rule__PPort__NameAssignment_1 ) ) ;
    public final void rule__PPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1093:1: ( ( ( rule__PPort__NameAssignment_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1094:1: ( ( rule__PPort__NameAssignment_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1094:1: ( ( rule__PPort__NameAssignment_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1095:1: ( rule__PPort__NameAssignment_1 )
            {
             before(grammarAccess.getPPortAccess().getNameAssignment_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1096:1: ( rule__PPort__NameAssignment_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1096:2: rule__PPort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PPort__NameAssignment_1_in_rule__PPort__Group__1__Impl2166);
            rule__PPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPPortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PPort__Group__1__Impl"


    // $ANTLR start "rule__PPort__Group__2"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1106:1: rule__PPort__Group__2 : rule__PPort__Group__2__Impl rule__PPort__Group__3 ;
    public final void rule__PPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1110:1: ( rule__PPort__Group__2__Impl rule__PPort__Group__3 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1111:2: rule__PPort__Group__2__Impl rule__PPort__Group__3
            {
            pushFollow(FOLLOW_rule__PPort__Group__2__Impl_in_rule__PPort__Group__22196);
            rule__PPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PPort__Group__3_in_rule__PPort__Group__22199);
            rule__PPort__Group__3();

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
    // $ANTLR end "rule__PPort__Group__2"


    // $ANTLR start "rule__PPort__Group__2__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1118:1: rule__PPort__Group__2__Impl : ( '{' ) ;
    public final void rule__PPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1122:1: ( ( '{' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1123:1: ( '{' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1123:1: ( '{' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1124:1: '{'
            {
             before(grammarAccess.getPPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__PPort__Group__2__Impl2227); 
             after(grammarAccess.getPPortAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PPort__Group__2__Impl"


    // $ANTLR start "rule__PPort__Group__3"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1137:1: rule__PPort__Group__3 : rule__PPort__Group__3__Impl rule__PPort__Group__4 ;
    public final void rule__PPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1141:1: ( rule__PPort__Group__3__Impl rule__PPort__Group__4 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1142:2: rule__PPort__Group__3__Impl rule__PPort__Group__4
            {
            pushFollow(FOLLOW_rule__PPort__Group__3__Impl_in_rule__PPort__Group__32258);
            rule__PPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PPort__Group__4_in_rule__PPort__Group__32261);
            rule__PPort__Group__4();

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
    // $ANTLR end "rule__PPort__Group__3"


    // $ANTLR start "rule__PPort__Group__3__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1149:1: rule__PPort__Group__3__Impl : ( ( rule__PPort__Group_3__0 )? ) ;
    public final void rule__PPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1153:1: ( ( ( rule__PPort__Group_3__0 )? ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1154:1: ( ( rule__PPort__Group_3__0 )? )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1154:1: ( ( rule__PPort__Group_3__0 )? )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1155:1: ( rule__PPort__Group_3__0 )?
            {
             before(grammarAccess.getPPortAccess().getGroup_3()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1156:1: ( rule__PPort__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1156:2: rule__PPort__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PPort__Group_3__0_in_rule__PPort__Group__3__Impl2288);
                    rule__PPort__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPPortAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PPort__Group__3__Impl"


    // $ANTLR start "rule__PPort__Group__4"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1166:1: rule__PPort__Group__4 : rule__PPort__Group__4__Impl rule__PPort__Group__5 ;
    public final void rule__PPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1170:1: ( rule__PPort__Group__4__Impl rule__PPort__Group__5 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1171:2: rule__PPort__Group__4__Impl rule__PPort__Group__5
            {
            pushFollow(FOLLOW_rule__PPort__Group__4__Impl_in_rule__PPort__Group__42319);
            rule__PPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PPort__Group__5_in_rule__PPort__Group__42322);
            rule__PPort__Group__5();

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
    // $ANTLR end "rule__PPort__Group__4"


    // $ANTLR start "rule__PPort__Group__4__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1178:1: rule__PPort__Group__4__Impl : ( ( rule__PPort__Group_4__0 )? ) ;
    public final void rule__PPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1182:1: ( ( ( rule__PPort__Group_4__0 )? ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1183:1: ( ( rule__PPort__Group_4__0 )? )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1183:1: ( ( rule__PPort__Group_4__0 )? )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1184:1: ( rule__PPort__Group_4__0 )?
            {
             before(grammarAccess.getPPortAccess().getGroup_4()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1185:1: ( rule__PPort__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1185:2: rule__PPort__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PPort__Group_4__0_in_rule__PPort__Group__4__Impl2349);
                    rule__PPort__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPPortAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PPort__Group__4__Impl"


    // $ANTLR start "rule__PPort__Group__5"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1195:1: rule__PPort__Group__5 : rule__PPort__Group__5__Impl ;
    public final void rule__PPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1199:1: ( rule__PPort__Group__5__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1200:2: rule__PPort__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PPort__Group__5__Impl_in_rule__PPort__Group__52380);
            rule__PPort__Group__5__Impl();

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
    // $ANTLR end "rule__PPort__Group__5"


    // $ANTLR start "rule__PPort__Group__5__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1206:1: rule__PPort__Group__5__Impl : ( '}' ) ;
    public final void rule__PPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1210:1: ( ( '}' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1211:1: ( '}' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1211:1: ( '}' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1212:1: '}'
            {
             before(grammarAccess.getPPortAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__PPort__Group__5__Impl2408); 
             after(grammarAccess.getPPortAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__PPort__Group__5__Impl"


    // $ANTLR start "rule__PPort__Group_3__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1237:1: rule__PPort__Group_3__0 : rule__PPort__Group_3__0__Impl rule__PPort__Group_3__1 ;
    public final void rule__PPort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1241:1: ( rule__PPort__Group_3__0__Impl rule__PPort__Group_3__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1242:2: rule__PPort__Group_3__0__Impl rule__PPort__Group_3__1
            {
            pushFollow(FOLLOW_rule__PPort__Group_3__0__Impl_in_rule__PPort__Group_3__02451);
            rule__PPort__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PPort__Group_3__1_in_rule__PPort__Group_3__02454);
            rule__PPort__Group_3__1();

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
    // $ANTLR end "rule__PPort__Group_3__0"


    // $ANTLR start "rule__PPort__Group_3__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1249:1: rule__PPort__Group_3__0__Impl : ( 'interface' ) ;
    public final void rule__PPort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1253:1: ( ( 'interface' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1254:1: ( 'interface' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1254:1: ( 'interface' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1255:1: 'interface'
            {
             before(grammarAccess.getPPortAccess().getInterfaceKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__PPort__Group_3__0__Impl2482); 
             after(grammarAccess.getPPortAccess().getInterfaceKeyword_3_0()); 

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
    // $ANTLR end "rule__PPort__Group_3__0__Impl"


    // $ANTLR start "rule__PPort__Group_3__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1268:1: rule__PPort__Group_3__1 : rule__PPort__Group_3__1__Impl ;
    public final void rule__PPort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1272:1: ( rule__PPort__Group_3__1__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1273:2: rule__PPort__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PPort__Group_3__1__Impl_in_rule__PPort__Group_3__12513);
            rule__PPort__Group_3__1__Impl();

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
    // $ANTLR end "rule__PPort__Group_3__1"


    // $ANTLR start "rule__PPort__Group_3__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1279:1: rule__PPort__Group_3__1__Impl : ( ( rule__PPort__InterfaceAssignment_3_1 ) ) ;
    public final void rule__PPort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1283:1: ( ( ( rule__PPort__InterfaceAssignment_3_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1284:1: ( ( rule__PPort__InterfaceAssignment_3_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1284:1: ( ( rule__PPort__InterfaceAssignment_3_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1285:1: ( rule__PPort__InterfaceAssignment_3_1 )
            {
             before(grammarAccess.getPPortAccess().getInterfaceAssignment_3_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1286:1: ( rule__PPort__InterfaceAssignment_3_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1286:2: rule__PPort__InterfaceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PPort__InterfaceAssignment_3_1_in_rule__PPort__Group_3__1__Impl2540);
            rule__PPort__InterfaceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPPortAccess().getInterfaceAssignment_3_1()); 

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
    // $ANTLR end "rule__PPort__Group_3__1__Impl"


    // $ANTLR start "rule__PPort__Group_4__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1300:1: rule__PPort__Group_4__0 : rule__PPort__Group_4__0__Impl rule__PPort__Group_4__1 ;
    public final void rule__PPort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1304:1: ( rule__PPort__Group_4__0__Impl rule__PPort__Group_4__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1305:2: rule__PPort__Group_4__0__Impl rule__PPort__Group_4__1
            {
            pushFollow(FOLLOW_rule__PPort__Group_4__0__Impl_in_rule__PPort__Group_4__02574);
            rule__PPort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PPort__Group_4__1_in_rule__PPort__Group_4__02577);
            rule__PPort__Group_4__1();

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
    // $ANTLR end "rule__PPort__Group_4__0"


    // $ANTLR start "rule__PPort__Group_4__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1312:1: rule__PPort__Group_4__0__Impl : ( 'to' ) ;
    public final void rule__PPort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1316:1: ( ( 'to' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1317:1: ( 'to' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1317:1: ( 'to' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1318:1: 'to'
            {
             before(grammarAccess.getPPortAccess().getToKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__PPort__Group_4__0__Impl2605); 
             after(grammarAccess.getPPortAccess().getToKeyword_4_0()); 

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
    // $ANTLR end "rule__PPort__Group_4__0__Impl"


    // $ANTLR start "rule__PPort__Group_4__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1331:1: rule__PPort__Group_4__1 : rule__PPort__Group_4__1__Impl ;
    public final void rule__PPort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1335:1: ( rule__PPort__Group_4__1__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1336:2: rule__PPort__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PPort__Group_4__1__Impl_in_rule__PPort__Group_4__12636);
            rule__PPort__Group_4__1__Impl();

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
    // $ANTLR end "rule__PPort__Group_4__1"


    // $ANTLR start "rule__PPort__Group_4__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1342:1: rule__PPort__Group_4__1__Impl : ( ( rule__PPort__ToPortAssignment_4_1 ) ) ;
    public final void rule__PPort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1346:1: ( ( ( rule__PPort__ToPortAssignment_4_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1347:1: ( ( rule__PPort__ToPortAssignment_4_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1347:1: ( ( rule__PPort__ToPortAssignment_4_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1348:1: ( rule__PPort__ToPortAssignment_4_1 )
            {
             before(grammarAccess.getPPortAccess().getToPortAssignment_4_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1349:1: ( rule__PPort__ToPortAssignment_4_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1349:2: rule__PPort__ToPortAssignment_4_1
            {
            pushFollow(FOLLOW_rule__PPort__ToPortAssignment_4_1_in_rule__PPort__Group_4__1__Impl2663);
            rule__PPort__ToPortAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPPortAccess().getToPortAssignment_4_1()); 

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
    // $ANTLR end "rule__PPort__Group_4__1__Impl"


    // $ANTLR start "rule__SenderReceiverInterface__Group__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1363:1: rule__SenderReceiverInterface__Group__0 : rule__SenderReceiverInterface__Group__0__Impl rule__SenderReceiverInterface__Group__1 ;
    public final void rule__SenderReceiverInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1367:1: ( rule__SenderReceiverInterface__Group__0__Impl rule__SenderReceiverInterface__Group__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1368:2: rule__SenderReceiverInterface__Group__0__Impl rule__SenderReceiverInterface__Group__1
            {
            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__0__Impl_in_rule__SenderReceiverInterface__Group__02697);
            rule__SenderReceiverInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__1_in_rule__SenderReceiverInterface__Group__02700);
            rule__SenderReceiverInterface__Group__1();

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__0"


    // $ANTLR start "rule__SenderReceiverInterface__Group__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1375:1: rule__SenderReceiverInterface__Group__0__Impl : ( 'SRInterface' ) ;
    public final void rule__SenderReceiverInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1379:1: ( ( 'SRInterface' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1380:1: ( 'SRInterface' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1380:1: ( 'SRInterface' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1381:1: 'SRInterface'
            {
             before(grammarAccess.getSenderReceiverInterfaceAccess().getSRInterfaceKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__SenderReceiverInterface__Group__0__Impl2728); 
             after(grammarAccess.getSenderReceiverInterfaceAccess().getSRInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__0__Impl"


    // $ANTLR start "rule__SenderReceiverInterface__Group__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1394:1: rule__SenderReceiverInterface__Group__1 : rule__SenderReceiverInterface__Group__1__Impl rule__SenderReceiverInterface__Group__2 ;
    public final void rule__SenderReceiverInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1398:1: ( rule__SenderReceiverInterface__Group__1__Impl rule__SenderReceiverInterface__Group__2 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1399:2: rule__SenderReceiverInterface__Group__1__Impl rule__SenderReceiverInterface__Group__2
            {
            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__1__Impl_in_rule__SenderReceiverInterface__Group__12759);
            rule__SenderReceiverInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__2_in_rule__SenderReceiverInterface__Group__12762);
            rule__SenderReceiverInterface__Group__2();

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__1"


    // $ANTLR start "rule__SenderReceiverInterface__Group__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1406:1: rule__SenderReceiverInterface__Group__1__Impl : ( ( rule__SenderReceiverInterface__NameAssignment_1 ) ) ;
    public final void rule__SenderReceiverInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1410:1: ( ( ( rule__SenderReceiverInterface__NameAssignment_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1411:1: ( ( rule__SenderReceiverInterface__NameAssignment_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1411:1: ( ( rule__SenderReceiverInterface__NameAssignment_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1412:1: ( rule__SenderReceiverInterface__NameAssignment_1 )
            {
             before(grammarAccess.getSenderReceiverInterfaceAccess().getNameAssignment_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1413:1: ( rule__SenderReceiverInterface__NameAssignment_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1413:2: rule__SenderReceiverInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SenderReceiverInterface__NameAssignment_1_in_rule__SenderReceiverInterface__Group__1__Impl2789);
            rule__SenderReceiverInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSenderReceiverInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__1__Impl"


    // $ANTLR start "rule__SenderReceiverInterface__Group__2"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1423:1: rule__SenderReceiverInterface__Group__2 : rule__SenderReceiverInterface__Group__2__Impl rule__SenderReceiverInterface__Group__3 ;
    public final void rule__SenderReceiverInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1427:1: ( rule__SenderReceiverInterface__Group__2__Impl rule__SenderReceiverInterface__Group__3 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1428:2: rule__SenderReceiverInterface__Group__2__Impl rule__SenderReceiverInterface__Group__3
            {
            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__2__Impl_in_rule__SenderReceiverInterface__Group__22819);
            rule__SenderReceiverInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__3_in_rule__SenderReceiverInterface__Group__22822);
            rule__SenderReceiverInterface__Group__3();

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__2"


    // $ANTLR start "rule__SenderReceiverInterface__Group__2__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1435:1: rule__SenderReceiverInterface__Group__2__Impl : ( '{' ) ;
    public final void rule__SenderReceiverInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1439:1: ( ( '{' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1440:1: ( '{' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1440:1: ( '{' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1441:1: '{'
            {
             before(grammarAccess.getSenderReceiverInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__SenderReceiverInterface__Group__2__Impl2850); 
             after(grammarAccess.getSenderReceiverInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__2__Impl"


    // $ANTLR start "rule__SenderReceiverInterface__Group__3"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1454:1: rule__SenderReceiverInterface__Group__3 : rule__SenderReceiverInterface__Group__3__Impl rule__SenderReceiverInterface__Group__4 ;
    public final void rule__SenderReceiverInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1458:1: ( rule__SenderReceiverInterface__Group__3__Impl rule__SenderReceiverInterface__Group__4 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1459:2: rule__SenderReceiverInterface__Group__3__Impl rule__SenderReceiverInterface__Group__4
            {
            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__3__Impl_in_rule__SenderReceiverInterface__Group__32881);
            rule__SenderReceiverInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__4_in_rule__SenderReceiverInterface__Group__32884);
            rule__SenderReceiverInterface__Group__4();

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__3"


    // $ANTLR start "rule__SenderReceiverInterface__Group__3__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1466:1: rule__SenderReceiverInterface__Group__3__Impl : ( ( rule__SenderReceiverInterface__DataElementAssignment_3 ) ) ;
    public final void rule__SenderReceiverInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1470:1: ( ( ( rule__SenderReceiverInterface__DataElementAssignment_3 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1471:1: ( ( rule__SenderReceiverInterface__DataElementAssignment_3 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1471:1: ( ( rule__SenderReceiverInterface__DataElementAssignment_3 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1472:1: ( rule__SenderReceiverInterface__DataElementAssignment_3 )
            {
             before(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementAssignment_3()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1473:1: ( rule__SenderReceiverInterface__DataElementAssignment_3 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1473:2: rule__SenderReceiverInterface__DataElementAssignment_3
            {
            pushFollow(FOLLOW_rule__SenderReceiverInterface__DataElementAssignment_3_in_rule__SenderReceiverInterface__Group__3__Impl2911);
            rule__SenderReceiverInterface__DataElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementAssignment_3()); 

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__3__Impl"


    // $ANTLR start "rule__SenderReceiverInterface__Group__4"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1483:1: rule__SenderReceiverInterface__Group__4 : rule__SenderReceiverInterface__Group__4__Impl ;
    public final void rule__SenderReceiverInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1487:1: ( rule__SenderReceiverInterface__Group__4__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1488:2: rule__SenderReceiverInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SenderReceiverInterface__Group__4__Impl_in_rule__SenderReceiverInterface__Group__42941);
            rule__SenderReceiverInterface__Group__4__Impl();

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__4"


    // $ANTLR start "rule__SenderReceiverInterface__Group__4__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1494:1: rule__SenderReceiverInterface__Group__4__Impl : ( '}' ) ;
    public final void rule__SenderReceiverInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1498:1: ( ( '}' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1499:1: ( '}' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1499:1: ( '}' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1500:1: '}'
            {
             before(grammarAccess.getSenderReceiverInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SenderReceiverInterface__Group__4__Impl2969); 
             after(grammarAccess.getSenderReceiverInterfaceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SenderReceiverInterface__Group__4__Impl"


    // $ANTLR start "rule__DataElement__Group__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1523:1: rule__DataElement__Group__0 : rule__DataElement__Group__0__Impl rule__DataElement__Group__1 ;
    public final void rule__DataElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1527:1: ( rule__DataElement__Group__0__Impl rule__DataElement__Group__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1528:2: rule__DataElement__Group__0__Impl rule__DataElement__Group__1
            {
            pushFollow(FOLLOW_rule__DataElement__Group__0__Impl_in_rule__DataElement__Group__03010);
            rule__DataElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataElement__Group__1_in_rule__DataElement__Group__03013);
            rule__DataElement__Group__1();

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
    // $ANTLR end "rule__DataElement__Group__0"


    // $ANTLR start "rule__DataElement__Group__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1535:1: rule__DataElement__Group__0__Impl : ( 'dataType' ) ;
    public final void rule__DataElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1539:1: ( ( 'dataType' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1540:1: ( 'dataType' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1540:1: ( 'dataType' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1541:1: 'dataType'
            {
             before(grammarAccess.getDataElementAccess().getDataTypeKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__DataElement__Group__0__Impl3041); 
             after(grammarAccess.getDataElementAccess().getDataTypeKeyword_0()); 

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
    // $ANTLR end "rule__DataElement__Group__0__Impl"


    // $ANTLR start "rule__DataElement__Group__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1554:1: rule__DataElement__Group__1 : rule__DataElement__Group__1__Impl rule__DataElement__Group__2 ;
    public final void rule__DataElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1558:1: ( rule__DataElement__Group__1__Impl rule__DataElement__Group__2 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1559:2: rule__DataElement__Group__1__Impl rule__DataElement__Group__2
            {
            pushFollow(FOLLOW_rule__DataElement__Group__1__Impl_in_rule__DataElement__Group__13072);
            rule__DataElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataElement__Group__2_in_rule__DataElement__Group__13075);
            rule__DataElement__Group__2();

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
    // $ANTLR end "rule__DataElement__Group__1"


    // $ANTLR start "rule__DataElement__Group__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1566:1: rule__DataElement__Group__1__Impl : ( ( rule__DataElement__NameAssignment_1 ) ) ;
    public final void rule__DataElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1570:1: ( ( ( rule__DataElement__NameAssignment_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1571:1: ( ( rule__DataElement__NameAssignment_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1571:1: ( ( rule__DataElement__NameAssignment_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1572:1: ( rule__DataElement__NameAssignment_1 )
            {
             before(grammarAccess.getDataElementAccess().getNameAssignment_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1573:1: ( rule__DataElement__NameAssignment_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1573:2: rule__DataElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataElement__NameAssignment_1_in_rule__DataElement__Group__1__Impl3102);
            rule__DataElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataElement__Group__1__Impl"


    // $ANTLR start "rule__DataElement__Group__2"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1583:1: rule__DataElement__Group__2 : rule__DataElement__Group__2__Impl ;
    public final void rule__DataElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1587:1: ( rule__DataElement__Group__2__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1588:2: rule__DataElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DataElement__Group__2__Impl_in_rule__DataElement__Group__23132);
            rule__DataElement__Group__2__Impl();

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
    // $ANTLR end "rule__DataElement__Group__2"


    // $ANTLR start "rule__DataElement__Group__2__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1594:1: rule__DataElement__Group__2__Impl : ( ( rule__DataElement__DataTypeAssignment_2 ) ) ;
    public final void rule__DataElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1598:1: ( ( ( rule__DataElement__DataTypeAssignment_2 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1599:1: ( ( rule__DataElement__DataTypeAssignment_2 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1599:1: ( ( rule__DataElement__DataTypeAssignment_2 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1600:1: ( rule__DataElement__DataTypeAssignment_2 )
            {
             before(grammarAccess.getDataElementAccess().getDataTypeAssignment_2()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1601:1: ( rule__DataElement__DataTypeAssignment_2 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1601:2: rule__DataElement__DataTypeAssignment_2
            {
            pushFollow(FOLLOW_rule__DataElement__DataTypeAssignment_2_in_rule__DataElement__Group__2__Impl3159);
            rule__DataElement__DataTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataElementAccess().getDataTypeAssignment_2()); 

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
    // $ANTLR end "rule__DataElement__Group__2__Impl"


    // $ANTLR start "rule__ClientServerInterface__Group__0"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1618:1: rule__ClientServerInterface__Group__0 : rule__ClientServerInterface__Group__0__Impl rule__ClientServerInterface__Group__1 ;
    public final void rule__ClientServerInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1622:1: ( rule__ClientServerInterface__Group__0__Impl rule__ClientServerInterface__Group__1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1623:2: rule__ClientServerInterface__Group__0__Impl rule__ClientServerInterface__Group__1
            {
            pushFollow(FOLLOW_rule__ClientServerInterface__Group__0__Impl_in_rule__ClientServerInterface__Group__03196);
            rule__ClientServerInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClientServerInterface__Group__1_in_rule__ClientServerInterface__Group__03199);
            rule__ClientServerInterface__Group__1();

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
    // $ANTLR end "rule__ClientServerInterface__Group__0"


    // $ANTLR start "rule__ClientServerInterface__Group__0__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1630:1: rule__ClientServerInterface__Group__0__Impl : ( 'CSInterface' ) ;
    public final void rule__ClientServerInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1634:1: ( ( 'CSInterface' ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1635:1: ( 'CSInterface' )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1635:1: ( 'CSInterface' )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1636:1: 'CSInterface'
            {
             before(grammarAccess.getClientServerInterfaceAccess().getCSInterfaceKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__ClientServerInterface__Group__0__Impl3227); 
             after(grammarAccess.getClientServerInterfaceAccess().getCSInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__ClientServerInterface__Group__0__Impl"


    // $ANTLR start "rule__ClientServerInterface__Group__1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1649:1: rule__ClientServerInterface__Group__1 : rule__ClientServerInterface__Group__1__Impl ;
    public final void rule__ClientServerInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1653:1: ( rule__ClientServerInterface__Group__1__Impl )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1654:2: rule__ClientServerInterface__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ClientServerInterface__Group__1__Impl_in_rule__ClientServerInterface__Group__13258);
            rule__ClientServerInterface__Group__1__Impl();

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
    // $ANTLR end "rule__ClientServerInterface__Group__1"


    // $ANTLR start "rule__ClientServerInterface__Group__1__Impl"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1660:1: rule__ClientServerInterface__Group__1__Impl : ( ( rule__ClientServerInterface__NameAssignment_1 ) ) ;
    public final void rule__ClientServerInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1664:1: ( ( ( rule__ClientServerInterface__NameAssignment_1 ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1665:1: ( ( rule__ClientServerInterface__NameAssignment_1 ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1665:1: ( ( rule__ClientServerInterface__NameAssignment_1 ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1666:1: ( rule__ClientServerInterface__NameAssignment_1 )
            {
             before(grammarAccess.getClientServerInterfaceAccess().getNameAssignment_1()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1667:1: ( rule__ClientServerInterface__NameAssignment_1 )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1667:2: rule__ClientServerInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ClientServerInterface__NameAssignment_1_in_rule__ClientServerInterface__Group__1__Impl3285);
            rule__ClientServerInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClientServerInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ClientServerInterface__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1682:1: rule__Model__ElementsAssignment : ( ruleElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1686:1: ( ( ruleElement ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1687:1: ( ruleElement )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1687:1: ( ruleElement )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1688:1: ruleElement
            {
             before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Model__ElementsAssignment3324);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Swc__NameAssignment_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1697:1: rule__Swc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Swc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1701:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1702:1: ( RULE_ID )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1702:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1703:1: RULE_ID
            {
             before(grammarAccess.getSwcAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Swc__NameAssignment_13355); 
             after(grammarAccess.getSwcAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Swc__NameAssignment_1"


    // $ANTLR start "rule__Swc__PortsAssignment_3"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1712:1: rule__Swc__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__Swc__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1716:1: ( ( rulePort ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1717:1: ( rulePort )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1717:1: ( rulePort )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1718:1: rulePort
            {
             before(grammarAccess.getSwcAccess().getPortsPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Swc__PortsAssignment_33386);
            rulePort();

            state._fsp--;

             after(grammarAccess.getSwcAccess().getPortsPortParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Swc__PortsAssignment_3"


    // $ANTLR start "rule__RPort__NameAssignment_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1727:1: rule__RPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1731:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1732:1: ( RULE_ID )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1732:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1733:1: RULE_ID
            {
             before(grammarAccess.getRPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RPort__NameAssignment_13417); 
             after(grammarAccess.getRPortAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RPort__NameAssignment_1"


    // $ANTLR start "rule__RPort__InterfaceAssignment_3_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1742:1: rule__RPort__InterfaceAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RPort__InterfaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1746:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1747:1: ( ( ruleQualifiedName ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1747:1: ( ( ruleQualifiedName ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1748:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1749:1: ( ruleQualifiedName )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1750:1: ruleQualifiedName
            {
             before(grammarAccess.getRPortAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RPort__InterfaceAssignment_3_13452);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRPortAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getRPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__RPort__InterfaceAssignment_3_1"


    // $ANTLR start "rule__RPort__FromPortAssignment_4_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1761:1: rule__RPort__FromPortAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RPort__FromPortAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1765:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1766:1: ( ( ruleQualifiedName ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1766:1: ( ( ruleQualifiedName ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1767:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getRPortAccess().getFromPortPPortCrossReference_4_1_0()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1768:1: ( ruleQualifiedName )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1769:1: ruleQualifiedName
            {
             before(grammarAccess.getRPortAccess().getFromPortPPortQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__RPort__FromPortAssignment_4_13491);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRPortAccess().getFromPortPPortQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRPortAccess().getFromPortPPortCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__RPort__FromPortAssignment_4_1"


    // $ANTLR start "rule__PPort__NameAssignment_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1780:1: rule__PPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1784:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1785:1: ( RULE_ID )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1785:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1786:1: RULE_ID
            {
             before(grammarAccess.getPPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PPort__NameAssignment_13526); 
             after(grammarAccess.getPPortAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PPort__NameAssignment_1"


    // $ANTLR start "rule__PPort__InterfaceAssignment_3_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1795:1: rule__PPort__InterfaceAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PPort__InterfaceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1799:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1800:1: ( ( ruleQualifiedName ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1800:1: ( ( ruleQualifiedName ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1801:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getPPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1802:1: ( ruleQualifiedName )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1803:1: ruleQualifiedName
            {
             before(grammarAccess.getPPortAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PPort__InterfaceAssignment_3_13561);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPPortAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getPPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__PPort__InterfaceAssignment_3_1"


    // $ANTLR start "rule__PPort__ToPortAssignment_4_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1814:1: rule__PPort__ToPortAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PPort__ToPortAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1818:1: ( ( ( ruleQualifiedName ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1819:1: ( ( ruleQualifiedName ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1819:1: ( ( ruleQualifiedName ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1820:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getPPortAccess().getToPortRPortCrossReference_4_1_0()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1821:1: ( ruleQualifiedName )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1822:1: ruleQualifiedName
            {
             before(grammarAccess.getPPortAccess().getToPortRPortQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PPort__ToPortAssignment_4_13600);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPPortAccess().getToPortRPortQualifiedNameParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getPPortAccess().getToPortRPortCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__PPort__ToPortAssignment_4_1"


    // $ANTLR start "rule__SenderReceiverInterface__NameAssignment_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1833:1: rule__SenderReceiverInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SenderReceiverInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1837:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1838:1: ( RULE_ID )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1838:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1839:1: RULE_ID
            {
             before(grammarAccess.getSenderReceiverInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SenderReceiverInterface__NameAssignment_13635); 
             after(grammarAccess.getSenderReceiverInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SenderReceiverInterface__NameAssignment_1"


    // $ANTLR start "rule__SenderReceiverInterface__DataElementAssignment_3"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1848:1: rule__SenderReceiverInterface__DataElementAssignment_3 : ( ruleDataElement ) ;
    public final void rule__SenderReceiverInterface__DataElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1852:1: ( ( ruleDataElement ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1853:1: ( ruleDataElement )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1853:1: ( ruleDataElement )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1854:1: ruleDataElement
            {
             before(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementDataElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDataElement_in_rule__SenderReceiverInterface__DataElementAssignment_33666);
            ruleDataElement();

            state._fsp--;

             after(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementDataElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SenderReceiverInterface__DataElementAssignment_3"


    // $ANTLR start "rule__DataElement__NameAssignment_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1863:1: rule__DataElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1867:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1868:1: ( RULE_ID )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1868:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1869:1: RULE_ID
            {
             before(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataElement__NameAssignment_13697); 
             after(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataElement__NameAssignment_1"


    // $ANTLR start "rule__DataElement__DataTypeAssignment_2"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1878:1: rule__DataElement__DataTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DataElement__DataTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1882:1: ( ( ( RULE_ID ) ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1883:1: ( ( RULE_ID ) )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1883:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1884:1: ( RULE_ID )
            {
             before(grammarAccess.getDataElementAccess().getDataTypeDataTypeCrossReference_2_0()); 
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1885:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1886:1: RULE_ID
            {
             before(grammarAccess.getDataElementAccess().getDataTypeDataTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataElement__DataTypeAssignment_23732); 
             after(grammarAccess.getDataElementAccess().getDataTypeDataTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDataElementAccess().getDataTypeDataTypeCrossReference_2_0()); 

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
    // $ANTLR end "rule__DataElement__DataTypeAssignment_2"


    // $ANTLR start "rule__ClientServerInterface__NameAssignment_1"
    // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1898:1: rule__ClientServerInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClientServerInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1902:1: ( ( RULE_ID ) )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1903:1: ( RULE_ID )
            {
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1903:1: ( RULE_ID )
            // ../com.ponta027.swc.tool.ui/src-gen/com/ponta027/swc/ui/contentassist/antlr/internal/InternalTool.g:1904:1: RULE_ID
            {
             before(grammarAccess.getClientServerInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ClientServerInterface__NameAssignment_13768); 
             after(grammarAccess.getClientServerInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ClientServerInterface__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000501002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwc_in_entryRuleSwc242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwc249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Swc__Group__0_in_ruleSwc275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Alternatives_in_rulePort335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPort_in_entryRuleRPort362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRPort369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group__0_in_ruleRPort395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePPort_in_entryRulePPort422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePPort429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group__0_in_rulePPort455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Alternatives_in_ruleInterface515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSenderReceiverInterface_in_entryRuleSenderReceiverInterface542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSenderReceiverInterface549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__0_in_ruleSenderReceiverInterface575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_entryRuleDataElement602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataElement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataElement__Group__0_in_ruleDataElement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientServerInterface_in_entryRuleClientServerInterface664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClientServerInterface671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClientServerInterface__Group__0_in_ruleClientServerInterface697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwc_in_rule__Element__Alternatives733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Element__Alternatives750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePPort_in_rule__Port__Alternatives782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRPort_in_rule__Port__Alternatives799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSenderReceiverInterface_in_rule__Interface__Alternatives831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClientServerInterface_in_rule__Interface__Alternatives848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__0878 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__0881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl964 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__0999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__QualifiedName__Group_1__0__Impl1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Swc__Group__0__Impl_in_rule__Swc__Group__01121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Swc__Group__1_in_rule__Swc__Group__01124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Swc__Group__0__Impl1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Swc__Group__1__Impl_in_rule__Swc__Group__11183 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Swc__Group__2_in_rule__Swc__Group__11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Swc__NameAssignment_1_in_rule__Swc__Group__1__Impl1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Swc__Group__2__Impl_in_rule__Swc__Group__21243 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_rule__Swc__Group__3_in_rule__Swc__Group__21246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Swc__Group__2__Impl1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Swc__Group__3__Impl_in_rule__Swc__Group__31305 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Swc__Group__4_in_rule__Swc__Group__31308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Swc__PortsAssignment_3_in_rule__Swc__Group__3__Impl1337 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_rule__Swc__PortsAssignment_3_in_rule__Swc__Group__3__Impl1349 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_rule__Swc__Group__4__Impl_in_rule__Swc__Group__41382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Swc__Group__4__Impl1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group__0__Impl_in_rule__RPort__Group__01451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RPort__Group__1_in_rule__RPort__Group__01454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RPort__Group__0__Impl1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group__1__Impl_in_rule__RPort__Group__11513 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__RPort__Group__2_in_rule__RPort__Group__11516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__NameAssignment_1_in_rule__RPort__Group__1__Impl1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group__2__Impl_in_rule__RPort__Group__21573 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_rule__RPort__Group__3_in_rule__RPort__Group__21576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RPort__Group__2__Impl1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group__3__Impl_in_rule__RPort__Group__31635 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_rule__RPort__Group__4_in_rule__RPort__Group__31638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group_3__0_in_rule__RPort__Group__3__Impl1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group__4__Impl_in_rule__RPort__Group__41696 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_rule__RPort__Group__5_in_rule__RPort__Group__41699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group_4__0_in_rule__RPort__Group__4__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group__5__Impl_in_rule__RPort__Group__51757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RPort__Group__5__Impl1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group_3__0__Impl_in_rule__RPort__Group_3__01828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RPort__Group_3__1_in_rule__RPort__Group_3__01831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RPort__Group_3__0__Impl1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group_3__1__Impl_in_rule__RPort__Group_3__11890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__InterfaceAssignment_3_1_in_rule__RPort__Group_3__1__Impl1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group_4__0__Impl_in_rule__RPort__Group_4__01951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RPort__Group_4__1_in_rule__RPort__Group_4__01954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RPort__Group_4__0__Impl1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__Group_4__1__Impl_in_rule__RPort__Group_4__12013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RPort__FromPortAssignment_4_1_in_rule__RPort__Group_4__1__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group__0__Impl_in_rule__PPort__Group__02074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PPort__Group__1_in_rule__PPort__Group__02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PPort__Group__0__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group__1__Impl_in_rule__PPort__Group__12136 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PPort__Group__2_in_rule__PPort__Group__12139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__NameAssignment_1_in_rule__PPort__Group__1__Impl2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group__2__Impl_in_rule__PPort__Group__22196 = new BitSet(new long[]{0x0000000000094000L});
    public static final BitSet FOLLOW_rule__PPort__Group__3_in_rule__PPort__Group__22199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PPort__Group__2__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group__3__Impl_in_rule__PPort__Group__32258 = new BitSet(new long[]{0x0000000000094000L});
    public static final BitSet FOLLOW_rule__PPort__Group__4_in_rule__PPort__Group__32261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group_3__0_in_rule__PPort__Group__3__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group__4__Impl_in_rule__PPort__Group__42319 = new BitSet(new long[]{0x0000000000094000L});
    public static final BitSet FOLLOW_rule__PPort__Group__5_in_rule__PPort__Group__42322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group_4__0_in_rule__PPort__Group__4__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group__5__Impl_in_rule__PPort__Group__52380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PPort__Group__5__Impl2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group_3__0__Impl_in_rule__PPort__Group_3__02451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PPort__Group_3__1_in_rule__PPort__Group_3__02454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PPort__Group_3__0__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group_3__1__Impl_in_rule__PPort__Group_3__12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__InterfaceAssignment_3_1_in_rule__PPort__Group_3__1__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group_4__0__Impl_in_rule__PPort__Group_4__02574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PPort__Group_4__1_in_rule__PPort__Group_4__02577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PPort__Group_4__0__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__Group_4__1__Impl_in_rule__PPort__Group_4__12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PPort__ToPortAssignment_4_1_in_rule__PPort__Group_4__1__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__0__Impl_in_rule__SenderReceiverInterface__Group__02697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__1_in_rule__SenderReceiverInterface__Group__02700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SenderReceiverInterface__Group__0__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__1__Impl_in_rule__SenderReceiverInterface__Group__12759 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__2_in_rule__SenderReceiverInterface__Group__12762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__NameAssignment_1_in_rule__SenderReceiverInterface__Group__1__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__2__Impl_in_rule__SenderReceiverInterface__Group__22819 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__3_in_rule__SenderReceiverInterface__Group__22822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SenderReceiverInterface__Group__2__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__3__Impl_in_rule__SenderReceiverInterface__Group__32881 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__4_in_rule__SenderReceiverInterface__Group__32884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__DataElementAssignment_3_in_rule__SenderReceiverInterface__Group__3__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SenderReceiverInterface__Group__4__Impl_in_rule__SenderReceiverInterface__Group__42941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SenderReceiverInterface__Group__4__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataElement__Group__0__Impl_in_rule__DataElement__Group__03010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataElement__Group__1_in_rule__DataElement__Group__03013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataElement__Group__0__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataElement__Group__1__Impl_in_rule__DataElement__Group__13072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataElement__Group__2_in_rule__DataElement__Group__13075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataElement__NameAssignment_1_in_rule__DataElement__Group__1__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataElement__Group__2__Impl_in_rule__DataElement__Group__23132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataElement__DataTypeAssignment_2_in_rule__DataElement__Group__2__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClientServerInterface__Group__0__Impl_in_rule__ClientServerInterface__Group__03196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ClientServerInterface__Group__1_in_rule__ClientServerInterface__Group__03199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ClientServerInterface__Group__0__Impl3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClientServerInterface__Group__1__Impl_in_rule__ClientServerInterface__Group__13258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClientServerInterface__NameAssignment_1_in_rule__ClientServerInterface__Group__1__Impl3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Model__ElementsAssignment3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Swc__NameAssignment_13355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Swc__PortsAssignment_33386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RPort__NameAssignment_13417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RPort__InterfaceAssignment_3_13452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__RPort__FromPortAssignment_4_13491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PPort__NameAssignment_13526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PPort__InterfaceAssignment_3_13561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PPort__ToPortAssignment_4_13600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SenderReceiverInterface__NameAssignment_13635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataElement_in_rule__SenderReceiverInterface__DataElementAssignment_33666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataElement__NameAssignment_13697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataElement__DataTypeAssignment_23732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ClientServerInterface__NameAssignment_13768 = new BitSet(new long[]{0x0000000000000002L});

}