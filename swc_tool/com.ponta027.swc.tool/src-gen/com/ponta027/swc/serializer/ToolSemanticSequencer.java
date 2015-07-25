/*
 * generated by Xtext
 */
package com.ponta027.swc.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ponta027.swc.services.ToolGrammarAccess;
import com.ponta027.swc.tool.ClientServerInterface;
import com.ponta027.swc.tool.DataElement;
import com.ponta027.swc.tool.DataType;
import com.ponta027.swc.tool.Model;
import com.ponta027.swc.tool.PPort;
import com.ponta027.swc.tool.RPort;
import com.ponta027.swc.tool.SenderReceiverInterface;
import com.ponta027.swc.tool.Swc;
import com.ponta027.swc.tool.ToolPackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ToolSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ToolGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ToolPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ToolPackage.CLIENT_SERVER_INTERFACE:
				sequence_ClientServerInterface(context, (ClientServerInterface) semanticObject); 
				return; 
			case ToolPackage.DATA_ELEMENT:
				sequence_DataElement(context, (DataElement) semanticObject); 
				return; 
			case ToolPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case ToolPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ToolPackage.PPORT:
				sequence_PPort(context, (PPort) semanticObject); 
				return; 
			case ToolPackage.RPORT:
				sequence_RPort(context, (RPort) semanticObject); 
				return; 
			case ToolPackage.SENDER_RECEIVER_INTERFACE:
				sequence_SenderReceiverInterface(context, (SenderReceiverInterface) semanticObject); 
				return; 
			case ToolPackage.SWC:
				sequence_Swc(context, (Swc) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ClientServerInterface(EObject context, ClientServerInterface semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToolPackage.Literals.ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToolPackage.Literals.ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClientServerInterfaceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dataType=[DataType|ID])
	 */
	protected void sequence_DataElement(EObject context, DataElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToolPackage.Literals.DATA_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToolPackage.Literals.DATA_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, ToolPackage.Literals.DATA_ELEMENT__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToolPackage.Literals.DATA_ELEMENT__DATA_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataElementAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataElementAccess().getDataTypeDataTypeIDTerminalRuleCall_2_0_1(), semanticObject.getDataType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ToolPackage.Literals.DATA_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ToolPackage.Literals.DATA_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Element*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interface=[Interface|QualifiedName]? toPort=[RPort|QualifiedName]?)
	 */
	protected void sequence_PPort(EObject context, PPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interface=[Interface|QualifiedName]? fromPort=[PPort|QualifiedName]?)
	 */
	protected void sequence_RPort(EObject context, RPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dataElement+=DataElement)
	 */
	protected void sequence_SenderReceiverInterface(EObject context, SenderReceiverInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ports+=Port+)
	 */
	protected void sequence_Swc(EObject context, Swc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}