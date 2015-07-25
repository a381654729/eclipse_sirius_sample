/**
 */
package com.ponta027.swc.tool.impl;

import com.ponta027.swc.tool.PPort;
import com.ponta027.swc.tool.RPort;
import com.ponta027.swc.tool.ToolPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ponta027.swc.tool.impl.RPortImpl#getFromPort <em>From Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPortImpl extends PortImpl implements RPort
{
  /**
   * The cached value of the '{@link #getFromPort() <em>From Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromPort()
   * @generated
   * @ordered
   */
  protected PPort fromPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RPortImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ToolPackage.Literals.RPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PPort getFromPort()
  {
    if (fromPort != null && fromPort.eIsProxy())
    {
      InternalEObject oldFromPort = (InternalEObject)fromPort;
      fromPort = (PPort)eResolveProxy(oldFromPort);
      if (fromPort != oldFromPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.RPORT__FROM_PORT, oldFromPort, fromPort));
      }
    }
    return fromPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PPort basicGetFromPort()
  {
    return fromPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromPort(PPort newFromPort)
  {
    PPort oldFromPort = fromPort;
    fromPort = newFromPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.RPORT__FROM_PORT, oldFromPort, fromPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ToolPackage.RPORT__FROM_PORT:
        if (resolve) return getFromPort();
        return basicGetFromPort();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ToolPackage.RPORT__FROM_PORT:
        setFromPort((PPort)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ToolPackage.RPORT__FROM_PORT:
        setFromPort((PPort)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ToolPackage.RPORT__FROM_PORT:
        return fromPort != null;
    }
    return super.eIsSet(featureID);
  }

} //RPortImpl
