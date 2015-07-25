/**
 */
package com.ponta027.swc.tool;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ponta027.swc.tool.Swc#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see com.ponta027.swc.tool.ToolPackage#getSwc()
 * @model
 * @generated
 */
public interface Swc extends Element
{
  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link com.ponta027.swc.tool.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see com.ponta027.swc.tool.ToolPackage#getSwc_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

} // Swc
