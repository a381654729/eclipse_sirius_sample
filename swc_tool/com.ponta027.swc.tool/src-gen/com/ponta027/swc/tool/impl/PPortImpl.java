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
 * An implementation of the model object '<em><b>PPort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ponta027.swc.tool.impl.PPortImpl#getToPort <em>To Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PPortImpl extends PortImpl implements PPort
{
  /**
   * The cached value of the '{@link #getToPort() <em>To Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToPort()
   * @generated
   * @ordered
   */
  protected RPort toPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PPortImpl()
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
    return ToolPackage.Literals.PPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RPort getToPort()
  {
    if (toPort != null && toPort.eIsProxy())
    {
      InternalEObject oldToPort = (InternalEObject)toPort;
      toPort = (RPort)eResolveProxy(oldToPort);
      if (toPort != oldToPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolPackage.PPORT__TO_PORT, oldToPort, toPort));
      }
    }
    return toPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RPort basicGetToPort()
  {
    return toPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToPort(RPort newToPort)
  {
    RPort oldToPort = toPort;
    toPort = newToPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ToolPackage.PPORT__TO_PORT, oldToPort, toPort));
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
      case ToolPackage.PPORT__TO_PORT:
        if (resolve) return getToPort();
        return basicGetToPort();
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
      case ToolPackage.PPORT__TO_PORT:
        setToPort((RPort)newValue);
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
      case ToolPackage.PPORT__TO_PORT:
        setToPort((RPort)null);
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
      case ToolPackage.PPORT__TO_PORT:
        return toPort != null;
    }
    return super.eIsSet(featureID);
  }

} //PPortImpl
