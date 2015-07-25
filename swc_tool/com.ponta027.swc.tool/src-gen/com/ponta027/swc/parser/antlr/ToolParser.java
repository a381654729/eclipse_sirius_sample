/*
 * generated by Xtext
 */
package com.ponta027.swc.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.ponta027.swc.services.ToolGrammarAccess;

public class ToolParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ToolGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.ponta027.swc.parser.antlr.internal.InternalToolParser createParser(XtextTokenStream stream) {
		return new com.ponta027.swc.parser.antlr.internal.InternalToolParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public ToolGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ToolGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}