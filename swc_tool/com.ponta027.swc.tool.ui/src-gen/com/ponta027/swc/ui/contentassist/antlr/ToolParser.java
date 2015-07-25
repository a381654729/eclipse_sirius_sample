/*
 * generated by Xtext
 */
package com.ponta027.swc.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.ponta027.swc.services.ToolGrammarAccess;

public class ToolParser extends AbstractContentAssistParser {
	
	@Inject
	private ToolGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.ponta027.swc.ui.contentassist.antlr.internal.InternalToolParser createParser() {
		com.ponta027.swc.ui.contentassist.antlr.internal.InternalToolParser result = new com.ponta027.swc.ui.contentassist.antlr.internal.InternalToolParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getPortAccess().getAlternatives(), "rule__Port__Alternatives");
					put(grammarAccess.getInterfaceAccess().getAlternatives(), "rule__Interface__Alternatives");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getSwcAccess().getGroup(), "rule__Swc__Group__0");
					put(grammarAccess.getRPortAccess().getGroup(), "rule__RPort__Group__0");
					put(grammarAccess.getRPortAccess().getGroup_3(), "rule__RPort__Group_3__0");
					put(grammarAccess.getRPortAccess().getGroup_4(), "rule__RPort__Group_4__0");
					put(grammarAccess.getPPortAccess().getGroup(), "rule__PPort__Group__0");
					put(grammarAccess.getPPortAccess().getGroup_3(), "rule__PPort__Group_3__0");
					put(grammarAccess.getPPortAccess().getGroup_4(), "rule__PPort__Group_4__0");
					put(grammarAccess.getSenderReceiverInterfaceAccess().getGroup(), "rule__SenderReceiverInterface__Group__0");
					put(grammarAccess.getDataElementAccess().getGroup(), "rule__DataElement__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup(), "rule__DataType__Group__0");
					put(grammarAccess.getClientServerInterfaceAccess().getGroup(), "rule__ClientServerInterface__Group__0");
					put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
					put(grammarAccess.getSwcAccess().getNameAssignment_1(), "rule__Swc__NameAssignment_1");
					put(grammarAccess.getSwcAccess().getPortsAssignment_3(), "rule__Swc__PortsAssignment_3");
					put(grammarAccess.getRPortAccess().getNameAssignment_1(), "rule__RPort__NameAssignment_1");
					put(grammarAccess.getRPortAccess().getInterfaceAssignment_3_1(), "rule__RPort__InterfaceAssignment_3_1");
					put(grammarAccess.getRPortAccess().getFromPortAssignment_4_1(), "rule__RPort__FromPortAssignment_4_1");
					put(grammarAccess.getPPortAccess().getNameAssignment_1(), "rule__PPort__NameAssignment_1");
					put(grammarAccess.getPPortAccess().getInterfaceAssignment_3_1(), "rule__PPort__InterfaceAssignment_3_1");
					put(grammarAccess.getPPortAccess().getToPortAssignment_4_1(), "rule__PPort__ToPortAssignment_4_1");
					put(grammarAccess.getSenderReceiverInterfaceAccess().getNameAssignment_1(), "rule__SenderReceiverInterface__NameAssignment_1");
					put(grammarAccess.getSenderReceiverInterfaceAccess().getDataElementAssignment_3(), "rule__SenderReceiverInterface__DataElementAssignment_3");
					put(grammarAccess.getDataElementAccess().getNameAssignment_1(), "rule__DataElement__NameAssignment_1");
					put(grammarAccess.getDataElementAccess().getDataTypeAssignment_2(), "rule__DataElement__DataTypeAssignment_2");
					put(grammarAccess.getDataTypeAccess().getNameAssignment_1(), "rule__DataType__NameAssignment_1");
					put(grammarAccess.getClientServerInterfaceAccess().getNameAssignment_1(), "rule__ClientServerInterface__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.ponta027.swc.ui.contentassist.antlr.internal.InternalToolParser typedParser = (com.ponta027.swc.ui.contentassist.antlr.internal.InternalToolParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ToolGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ToolGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
