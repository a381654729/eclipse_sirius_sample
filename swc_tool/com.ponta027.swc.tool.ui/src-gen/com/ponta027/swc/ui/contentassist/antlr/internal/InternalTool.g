/*
 * generated by Xtext
 */
grammar InternalTool;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package com.ponta027.swc.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getElementsAssignment()); }
(rule__Model__ElementsAssignment)*
{ after(grammarAccess.getModelAccess().getElementsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleElement
entryRuleElement 
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getElementAccess().getAlternatives()); }
(rule__Element__Alternatives)
{ after(grammarAccess.getElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSwc
entryRuleSwc 
:
{ before(grammarAccess.getSwcRule()); }
	 ruleSwc
{ after(grammarAccess.getSwcRule()); } 
	 EOF 
;

// Rule Swc
ruleSwc
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSwcAccess().getGroup()); }
(rule__Swc__Group__0)
{ after(grammarAccess.getSwcAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePort
entryRulePort 
:
{ before(grammarAccess.getPortRule()); }
	 rulePort
{ after(grammarAccess.getPortRule()); } 
	 EOF 
;

// Rule Port
rulePort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPortAccess().getAlternatives()); }
(rule__Port__Alternatives)
{ after(grammarAccess.getPortAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRPort
entryRuleRPort 
:
{ before(grammarAccess.getRPortRule()); }
	 ruleRPort
{ after(grammarAccess.getRPortRule()); } 
	 EOF 
;

// Rule RPort
ruleRPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRPortAccess().getGroup()); }
(rule__RPort__Group__0)
{ after(grammarAccess.getRPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePPort
entryRulePPort 
:
{ before(grammarAccess.getPPortRule()); }
	 rulePPort
{ after(grammarAccess.getPPortRule()); } 
	 EOF 
;

// Rule PPort
rulePPort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPPortAccess().getGroup()); }
(rule__PPort__Group__0)
{ after(grammarAccess.getPPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInterface
entryRuleInterface 
:
{ before(grammarAccess.getInterfaceRule()); }
	 ruleInterface
{ after(grammarAccess.getInterfaceRule()); } 
	 EOF 
;

// Rule Interface
ruleInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInterfaceAccess().getAlternatives()); }
(rule__Interface__Alternatives)
{ after(grammarAccess.getInterfaceAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSenderReceiverInterface
entryRuleSenderReceiverInterface 
:
{ before(grammarAccess.getSenderReceiverInterfaceRule()); }
	 ruleSenderReceiverInterface
{ after(grammarAccess.getSenderReceiverInterfaceRule()); } 
	 EOF 
;

// Rule SenderReceiverInterface
ruleSenderReceiverInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSenderReceiverInterfaceAccess().getGroup()); }
(rule__SenderReceiverInterface__Group__0)
{ after(grammarAccess.getSenderReceiverInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDataElement
entryRuleDataElement 
:
{ before(grammarAccess.getDataElementRule()); }
	 ruleDataElement
{ after(grammarAccess.getDataElementRule()); } 
	 EOF 
;

// Rule DataElement
ruleDataElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDataElementAccess().getGroup()); }
(rule__DataElement__Group__0)
{ after(grammarAccess.getDataElementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleClientServerInterface
entryRuleClientServerInterface 
:
{ before(grammarAccess.getClientServerInterfaceRule()); }
	 ruleClientServerInterface
{ after(grammarAccess.getClientServerInterfaceRule()); } 
	 EOF 
;

// Rule ClientServerInterface
ruleClientServerInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getClientServerInterfaceAccess().getGroup()); }
(rule__ClientServerInterface__Group__0)
{ after(grammarAccess.getClientServerInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Element__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementAccess().getSwcParserRuleCall_0()); }
	ruleSwc
{ after(grammarAccess.getElementAccess().getSwcParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getElementAccess().getInterfaceParserRuleCall_1()); }
	ruleInterface
{ after(grammarAccess.getElementAccess().getInterfaceParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getPPortParserRuleCall_0()); }
	rulePPort
{ after(grammarAccess.getPortAccess().getPPortParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getPortAccess().getRPortParserRuleCall_1()); }
	ruleRPort
{ after(grammarAccess.getPortAccess().getRPortParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getSenderReceiverInterfaceParserRuleCall_0()); }
	ruleSenderReceiverInterface
{ after(grammarAccess.getInterfaceAccess().getSenderReceiverInterfaceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getInterfaceAccess().getClientServerInterfaceParserRuleCall_1()); }
	ruleClientServerInterface
{ after(grammarAccess.getInterfaceAccess().getClientServerInterfaceParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Swc__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Swc__Group__0__Impl
	rule__Swc__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Swc__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSwcAccess().getSwcKeyword_0()); }

	'swc' 

{ after(grammarAccess.getSwcAccess().getSwcKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Swc__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Swc__Group__1__Impl
	rule__Swc__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Swc__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSwcAccess().getNameAssignment_1()); }
(rule__Swc__NameAssignment_1)
{ after(grammarAccess.getSwcAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Swc__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Swc__Group__2__Impl
	rule__Swc__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Swc__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSwcAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getSwcAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Swc__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Swc__Group__3__Impl
	rule__Swc__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Swc__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getSwcAccess().getPortsAssignment_3()); }
(rule__Swc__PortsAssignment_3)
{ after(grammarAccess.getSwcAccess().getPortsAssignment_3()); }
)
(
{ before(grammarAccess.getSwcAccess().getPortsAssignment_3()); }
(rule__Swc__PortsAssignment_3)*
{ after(grammarAccess.getSwcAccess().getPortsAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Swc__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Swc__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Swc__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSwcAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getSwcAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__RPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group__0__Impl
	rule__RPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getRportKeyword_0()); }

	'rport' 

{ after(grammarAccess.getRPortAccess().getRportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group__1__Impl
	rule__RPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getNameAssignment_1()); }
(rule__RPort__NameAssignment_1)
{ after(grammarAccess.getRPortAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RPort__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group__2__Impl
	rule__RPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getRPortAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RPort__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group__3__Impl
	rule__RPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getGroup_3()); }
(rule__RPort__Group_3__0)?
{ after(grammarAccess.getRPortAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RPort__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group__4__Impl
	rule__RPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getGroup_4()); }
(rule__RPort__Group_4__0)?
{ after(grammarAccess.getRPortAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RPort__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getRPortAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__RPort__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group_3__0__Impl
	rule__RPort__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getInterfaceKeyword_3_0()); }

	'interface' 

{ after(grammarAccess.getRPortAccess().getInterfaceKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RPort__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getInterfaceAssignment_3_1()); }
(rule__RPort__InterfaceAssignment_3_1)
{ after(grammarAccess.getRPortAccess().getInterfaceAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__RPort__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group_4__0__Impl
	rule__RPort__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getFromKeyword_4_0()); }

	'from' 

{ after(grammarAccess.getRPortAccess().getFromKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__RPort__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__RPort__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getFromPortAssignment_4_1()); }
(rule__RPort__FromPortAssignment_4_1)
{ after(grammarAccess.getRPortAccess().getFromPortAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PPort__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group__0__Impl
	rule__PPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getPportKeyword_0()); }

	'pport' 

{ after(grammarAccess.getPPortAccess().getPportKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PPort__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group__1__Impl
	rule__PPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getNameAssignment_1()); }
(rule__PPort__NameAssignment_1)
{ after(grammarAccess.getPPortAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PPort__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group__2__Impl
	rule__PPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPPortAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PPort__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group__3__Impl
	rule__PPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getGroup_3()); }
(rule__PPort__Group_3__0)?
{ after(grammarAccess.getPPortAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PPort__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group__4__Impl
	rule__PPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getGroup_4()); }
(rule__PPort__Group_4__0)?
{ after(grammarAccess.getPPortAccess().getGroup_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PPort__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getRightCurlyBracketKeyword_5()); }

	'}' 

{ after(grammarAccess.getPPortAccess().getRightCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__PPort__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group_3__0__Impl
	rule__PPort__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getInterfaceKeyword_3_0()); }

	'interface' 

{ after(grammarAccess.getPPortAccess().getInterfaceKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PPort__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getInterfaceAssignment_3_1()); }
(rule__PPort__InterfaceAssignment_3_1)
{ after(grammarAccess.getPPortAccess().getInterfaceAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PPort__Group_4__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group_4__0__Impl
	rule__PPort__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group_4__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getToKeyword_4_0()); }

	'to' 

{ after(grammarAccess.getPPortAccess().getToKeyword_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PPort__Group_4__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PPort__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__Group_4__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getToPortAssignment_4_1()); }
(rule__PPort__ToPortAssignment_4_1)
{ after(grammarAccess.getPPortAccess().getToPortAssignment_4_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__SenderReceiverInterface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SenderReceiverInterface__Group__0__Impl
	rule__SenderReceiverInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SenderReceiverInterface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSenderReceiverInterfaceAccess().getSRInterfaceKeyword_0()); }

	'SRInterface' 

{ after(grammarAccess.getSenderReceiverInterfaceAccess().getSRInterfaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SenderReceiverInterface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SenderReceiverInterface__Group__1__Impl
	rule__SenderReceiverInterface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SenderReceiverInterface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSenderReceiverInterfaceAccess().getNameAssignment_1()); }
(rule__SenderReceiverInterface__NameAssignment_1)
{ after(grammarAccess.getSenderReceiverInterfaceAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SenderReceiverInterface__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SenderReceiverInterface__Group__2__Impl
	rule__SenderReceiverInterface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SenderReceiverInterface__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSenderReceiverInterfaceAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getSenderReceiverInterfaceAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SenderReceiverInterface__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SenderReceiverInterface__Group__3__Impl
	rule__SenderReceiverInterface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SenderReceiverInterface__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementAssignment_3()); }
(rule__SenderReceiverInterface__DataElementAssignment_3)
{ after(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SenderReceiverInterface__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SenderReceiverInterface__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SenderReceiverInterface__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSenderReceiverInterfaceAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getSenderReceiverInterfaceAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__DataElement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataElement__Group__0__Impl
	rule__DataElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataElementAccess().getDataTypeKeyword_0()); }

	'dataType' 

{ after(grammarAccess.getDataElementAccess().getDataTypeKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataElement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataElement__Group__1__Impl
	rule__DataElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataElementAccess().getNameAssignment_1()); }
(rule__DataElement__NameAssignment_1)
{ after(grammarAccess.getDataElementAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__DataElement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__DataElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataElementAccess().getDataTypeAssignment_2()); }
(rule__DataElement__DataTypeAssignment_2)
{ after(grammarAccess.getDataElementAccess().getDataTypeAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__ClientServerInterface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ClientServerInterface__Group__0__Impl
	rule__ClientServerInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ClientServerInterface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClientServerInterfaceAccess().getCSInterfaceKeyword_0()); }

	'CSInterface' 

{ after(grammarAccess.getClientServerInterfaceAccess().getCSInterfaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ClientServerInterface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ClientServerInterface__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ClientServerInterface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClientServerInterfaceAccess().getNameAssignment_1()); }
(rule__ClientServerInterface__NameAssignment_1)
{ after(grammarAccess.getClientServerInterfaceAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__ElementsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); }
	ruleElement{ after(grammarAccess.getModelAccess().getElementsElementParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Swc__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSwcAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getSwcAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Swc__PortsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSwcAccess().getPortsPortParserRuleCall_3_0()); }
	rulePort{ after(grammarAccess.getSwcAccess().getPortsPortParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getRPortAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__InterfaceAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); }
(
{ before(grammarAccess.getRPortAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getRPortAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getRPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RPort__FromPortAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRPortAccess().getFromPortPPortCrossReference_4_1_0()); }
(
{ before(grammarAccess.getRPortAccess().getFromPortPPortQualifiedNameParserRuleCall_4_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getRPortAccess().getFromPortPPortQualifiedNameParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getRPortAccess().getFromPortPPortCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPPortAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__InterfaceAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); }
(
{ before(grammarAccess.getPPortAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_3_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getPPortAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_3_1_0_1()); }
)
{ after(grammarAccess.getPPortAccess().getInterfaceInterfaceCrossReference_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PPort__ToPortAssignment_4_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPPortAccess().getToPortRPortCrossReference_4_1_0()); }
(
{ before(grammarAccess.getPPortAccess().getToPortRPortQualifiedNameParserRuleCall_4_1_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getPPortAccess().getToPortRPortQualifiedNameParserRuleCall_4_1_0_1()); }
)
{ after(grammarAccess.getPPortAccess().getToPortRPortCrossReference_4_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SenderReceiverInterface__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSenderReceiverInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getSenderReceiverInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SenderReceiverInterface__DataElementAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementDataElementParserRuleCall_3_0()); }
	ruleDataElement{ after(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementDataElementParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DataElement__DataTypeAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDataElementAccess().getDataTypeDataTypeCrossReference_2_0()); }
(
{ before(grammarAccess.getDataElementAccess().getDataTypeDataTypeIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getDataElementAccess().getDataTypeDataTypeIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getDataElementAccess().getDataTypeDataTypeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ClientServerInterface__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClientServerInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getClientServerInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


