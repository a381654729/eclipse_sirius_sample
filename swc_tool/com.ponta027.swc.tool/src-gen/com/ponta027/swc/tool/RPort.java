/**
 */
package com.ponta027.swc.tool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ponta027.swc.tool.RPort#getFromPort <em>From Port</em>}</li>
 * </ul>
 *
 * @see com.ponta027.swc.tool.ToolPackage#getRPort()
 * @model
 * @generated
 */
public interface RPort extends Port
{
  /**
   * Returns the value of the '<em><b>From Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Port</em>' reference.
   * @see #setFromPort(PPort)
   * @see com.ponta027.swc.tool.ToolPackage#getRPort_FromPort()
   * @model
   * @generated
   */
  PPort getFromPort();

  /**
   * Sets the value of the '{@link com.ponta027.swc.tool.RPort#getFromPort <em>From Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Port</em>' reference.
   * @see #getFromPort()
   * @generated
   */
  void setFromPort(PPort value);

} // RPort
