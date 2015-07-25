/**
 */
package com.ponta027.swc.tool;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ponta027.swc.tool.ToolFactory
 * @model kind="package"
 * @generated
 */
public interface ToolPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tool";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ponta027.com/swc/Tool";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tool";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ToolPackage eINSTANCE = com.ponta027.swc.tool.impl.ToolPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.ModelImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.ElementImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.SwcImpl <em>Swc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.SwcImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getSwc()
   * @generated
   */
  int SWC = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWC__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWC__PORTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Swc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWC_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.PortImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getPort()
   * @generated
   */
  int PORT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__INTERFACE = 1;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.RPortImpl <em>RPort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.RPortImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getRPort()
   * @generated
   */
  int RPORT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPORT__INTERFACE = PORT__INTERFACE;

  /**
   * The feature id for the '<em><b>From Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPORT__FROM_PORT = PORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RPort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.PPortImpl <em>PPort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.PPortImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getPPort()
   * @generated
   */
  int PPORT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PPORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PPORT__INTERFACE = PORT__INTERFACE;

  /**
   * The feature id for the '<em><b>To Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PPORT__TO_PORT = PORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>PPort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PPORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.InterfaceImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.SenderReceiverInterfaceImpl <em>Sender Receiver Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.SenderReceiverInterfaceImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getSenderReceiverInterface()
   * @generated
   */
  int SENDER_RECEIVER_INTERFACE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDER_RECEIVER_INTERFACE__NAME = INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Data Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDER_RECEIVER_INTERFACE__DATA_ELEMENT = INTERFACE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sender Receiver Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SENDER_RECEIVER_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.DataElementImpl <em>Data Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.DataElementImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getDataElement()
   * @generated
   */
  int DATA_ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT__DATA_TYPE = 1;

  /**
   * The number of structural features of the '<em>Data Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.DataTypeImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ponta027.swc.tool.impl.ClientServerInterfaceImpl <em>Client Server Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ponta027.swc.tool.impl.ClientServerInterfaceImpl
   * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getClientServerInterface()
   * @generated
   */
  int CLIENT_SERVER_INTERFACE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_SERVER_INTERFACE__NAME = INTERFACE__NAME;

  /**
   * The number of structural features of the '<em>Client Server Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_SERVER_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.ponta027.swc.tool.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.ponta027.swc.tool.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.ponta027.swc.tool.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see com.ponta027.swc.tool.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.swc.tool.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ponta027.swc.tool.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.Swc <em>Swc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Swc</em>'.
   * @see com.ponta027.swc.tool.Swc
   * @generated
   */
  EClass getSwc();

  /**
   * Returns the meta object for the containment reference list '{@link com.ponta027.swc.tool.Swc#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see com.ponta027.swc.tool.Swc#getPorts()
   * @see #getSwc()
   * @generated
   */
  EReference getSwc_Ports();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see com.ponta027.swc.tool.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.swc.tool.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ponta027.swc.tool.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for the reference '{@link com.ponta027.swc.tool.Port#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface</em>'.
   * @see com.ponta027.swc.tool.Port#getInterface()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Interface();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.RPort <em>RPort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RPort</em>'.
   * @see com.ponta027.swc.tool.RPort
   * @generated
   */
  EClass getRPort();

  /**
   * Returns the meta object for the reference '{@link com.ponta027.swc.tool.RPort#getFromPort <em>From Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From Port</em>'.
   * @see com.ponta027.swc.tool.RPort#getFromPort()
   * @see #getRPort()
   * @generated
   */
  EReference getRPort_FromPort();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.PPort <em>PPort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PPort</em>'.
   * @see com.ponta027.swc.tool.PPort
   * @generated
   */
  EClass getPPort();

  /**
   * Returns the meta object for the reference '{@link com.ponta027.swc.tool.PPort#getToPort <em>To Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Port</em>'.
   * @see com.ponta027.swc.tool.PPort#getToPort()
   * @see #getPPort()
   * @generated
   */
  EReference getPPort_ToPort();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see com.ponta027.swc.tool.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.SenderReceiverInterface <em>Sender Receiver Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sender Receiver Interface</em>'.
   * @see com.ponta027.swc.tool.SenderReceiverInterface
   * @generated
   */
  EClass getSenderReceiverInterface();

  /**
   * Returns the meta object for the containment reference list '{@link com.ponta027.swc.tool.SenderReceiverInterface#getDataElement <em>Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Element</em>'.
   * @see com.ponta027.swc.tool.SenderReceiverInterface#getDataElement()
   * @see #getSenderReceiverInterface()
   * @generated
   */
  EReference getSenderReceiverInterface_DataElement();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.DataElement <em>Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Element</em>'.
   * @see com.ponta027.swc.tool.DataElement
   * @generated
   */
  EClass getDataElement();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.swc.tool.DataElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ponta027.swc.tool.DataElement#getName()
   * @see #getDataElement()
   * @generated
   */
  EAttribute getDataElement_Name();

  /**
   * Returns the meta object for the reference '{@link com.ponta027.swc.tool.DataElement#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Data Type</em>'.
   * @see com.ponta027.swc.tool.DataElement#getDataType()
   * @see #getDataElement()
   * @generated
   */
  EReference getDataElement_DataType();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see com.ponta027.swc.tool.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link com.ponta027.swc.tool.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ponta027.swc.tool.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for class '{@link com.ponta027.swc.tool.ClientServerInterface <em>Client Server Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Client Server Interface</em>'.
   * @see com.ponta027.swc.tool.ClientServerInterface
   * @generated
   */
  EClass getClientServerInterface();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ToolFactory getToolFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.ModelImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.ElementImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.SwcImpl <em>Swc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.SwcImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getSwc()
     * @generated
     */
    EClass SWC = eINSTANCE.getSwc();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWC__PORTS = eINSTANCE.getSwc_Ports();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.PortImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__INTERFACE = eINSTANCE.getPort_Interface();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.RPortImpl <em>RPort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.RPortImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getRPort()
     * @generated
     */
    EClass RPORT = eINSTANCE.getRPort();

    /**
     * The meta object literal for the '<em><b>From Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RPORT__FROM_PORT = eINSTANCE.getRPort_FromPort();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.PPortImpl <em>PPort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.PPortImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getPPort()
     * @generated
     */
    EClass PPORT = eINSTANCE.getPPort();

    /**
     * The meta object literal for the '<em><b>To Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PPORT__TO_PORT = eINSTANCE.getPPort_ToPort();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.InterfaceImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.SenderReceiverInterfaceImpl <em>Sender Receiver Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.SenderReceiverInterfaceImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getSenderReceiverInterface()
     * @generated
     */
    EClass SENDER_RECEIVER_INTERFACE = eINSTANCE.getSenderReceiverInterface();

    /**
     * The meta object literal for the '<em><b>Data Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SENDER_RECEIVER_INTERFACE__DATA_ELEMENT = eINSTANCE.getSenderReceiverInterface_DataElement();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.DataElementImpl <em>Data Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.DataElementImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getDataElement()
     * @generated
     */
    EClass DATA_ELEMENT = eINSTANCE.getDataElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_ELEMENT__NAME = eINSTANCE.getDataElement_Name();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ELEMENT__DATA_TYPE = eINSTANCE.getDataElement_DataType();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.DataTypeImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '{@link com.ponta027.swc.tool.impl.ClientServerInterfaceImpl <em>Client Server Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ponta027.swc.tool.impl.ClientServerInterfaceImpl
     * @see com.ponta027.swc.tool.impl.ToolPackageImpl#getClientServerInterface()
     * @generated
     */
    EClass CLIENT_SERVER_INTERFACE = eINSTANCE.getClientServerInterface();

  }

} //ToolPackage
