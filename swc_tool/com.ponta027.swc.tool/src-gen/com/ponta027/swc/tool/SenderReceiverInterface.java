/**
 */
package com.ponta027.swc.tool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sender Receiver Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ponta027.swc.tool.SenderReceiverInterface#getDataElement <em>Data Element</em>}</li>
 * </ul>
 *
 * @see com.ponta027.swc.tool.ToolPackage#getSenderReceiverInterface()
 * @model
 * @generated
 */
public interface SenderReceiverInterface extends Interface
{
  /**
   * Returns the value of the '<em><b>Data Element</b></em>' containment reference list.
   * The list contents are of type {@link com.ponta027.swc.tool.DataElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Element</em>' containment reference list.
   * @see com.ponta027.swc.tool.ToolPackage#getSenderReceiverInterface_DataElement()
   * @model containment="true"
   * @generated
   */
  EList<DataElement> getDataElement();

} // SenderReceiverInterface
