/**
 */
package com.ponta027.swc.tool.impl;

import com.ponta027.swc.tool.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolFactoryImpl extends EFactoryImpl implements ToolFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ToolFactory init()
  {
    try
    {
      ToolFactory theToolFactory = (ToolFactory)EPackage.Registry.INSTANCE.getEFactory(ToolPackage.eNS_URI);
      if (theToolFactory != null)
      {
        return theToolFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ToolFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ToolPackage.MODEL: return createModel();
      case ToolPackage.ELEMENT: return createElement();
      case ToolPackage.SWC: return createSwc();
      case ToolPackage.PORT: return createPort();
      case ToolPackage.RPORT: return createRPort();
      case ToolPackage.PPORT: return createPPort();
      case ToolPackage.INTERFACE: return createInterface();
      case ToolPackage.SENDER_RECEIVER_INTERFACE: return createSenderReceiverInterface();
      case ToolPackage.DATA_ELEMENT: return createDataElement();
      case ToolPackage.DATA_TYPE: return createDataType();
      case ToolPackage.CLIENT_SERVER_INTERFACE: return createClientServerInterface();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Swc createSwc()
  {
    SwcImpl swc = new SwcImpl();
    return swc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RPort createRPort()
  {
    RPortImpl rPort = new RPortImpl();
    return rPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PPort createPPort()
  {
    PPortImpl pPort = new PPortImpl();
    return pPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SenderReceiverInterface createSenderReceiverInterface()
  {
    SenderReceiverInterfaceImpl senderReceiverInterface = new SenderReceiverInterfaceImpl();
    return senderReceiverInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataElement createDataElement()
  {
    DataElementImpl dataElement = new DataElementImpl();
    return dataElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClientServerInterface createClientServerInterface()
  {
    ClientServerInterfaceImpl clientServerInterface = new ClientServerInterfaceImpl();
    return clientServerInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToolPackage getToolPackage()
  {
    return (ToolPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ToolPackage getPackage()
  {
    return ToolPackage.eINSTANCE;
  }

} //ToolFactoryImpl
