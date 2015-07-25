/**
 */
package com.ponta027.swc.tool.impl;

import com.ponta027.swc.tool.DataElement;
import com.ponta027.swc.tool.SenderReceiverInterface;
import com.ponta027.swc.tool.ToolPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sender Receiver Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ponta027.swc.tool.impl.SenderReceiverInterfaceImpl#getDataElement <em>Data Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SenderReceiverInterfaceImpl extends InterfaceImpl implements SenderReceiverInterface
{
  /**
   * The cached value of the '{@link #getDataElement() <em>Data Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataElement()
   * @generated
   * @ordered
   */
  protected EList<DataElement> dataElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SenderReceiverInterfaceImpl()
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
    return ToolPackage.Literals.SENDER_RECEIVER_INTERFACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataElement> getDataElement()
  {
    if (dataElement == null)
    {
      dataElement = new EObjectContainmentEList<DataElement>(DataElement.class, this, ToolPackage.SENDER_RECEIVER_INTERFACE__DATA_ELEMENT);
    }
    return dataElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ToolPackage.SENDER_RECEIVER_INTERFACE__DATA_ELEMENT:
        return ((InternalEList<?>)getDataElement()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ToolPackage.SENDER_RECEIVER_INTERFACE__DATA_ELEMENT:
        return getDataElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ToolPackage.SENDER_RECEIVER_INTERFACE__DATA_ELEMENT:
        getDataElement().clear();
        getDataElement().addAll((Collection<? extends DataElement>)newValue);
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
      case ToolPackage.SENDER_RECEIVER_INTERFACE__DATA_ELEMENT:
        getDataElement().clear();
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
      case ToolPackage.SENDER_RECEIVER_INTERFACE__DATA_ELEMENT:
        return dataElement != null && !dataElement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SenderReceiverInterfaceImpl
