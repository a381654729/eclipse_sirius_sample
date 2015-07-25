/**
 */
package com.ponta027.swc.tool;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PPort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ponta027.swc.tool.PPort#getToPort <em>To Port</em>}</li>
 * </ul>
 *
 * @see com.ponta027.swc.tool.ToolPackage#getPPort()
 * @model
 * @generated
 */
public interface PPort extends Port
{
  /**
   * Returns the value of the '<em><b>To Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Port</em>' reference.
   * @see #setToPort(RPort)
   * @see com.ponta027.swc.tool.ToolPackage#getPPort_ToPort()
   * @model
   * @generated
   */
  RPort getToPort();

  /**
   * Sets the value of the '{@link com.ponta027.swc.tool.PPort#getToPort <em>To Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Port</em>' reference.
   * @see #getToPort()
   * @generated
   */
  void setToPort(RPort value);

} // PPort
