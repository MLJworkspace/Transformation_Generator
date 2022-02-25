/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.hclscope.hclScope;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.hclscope.hclScope.HclScopePackage
 * @generated
 */
public interface HclScopeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HclScopeFactory eINSTANCE = org.xtext.example.hclscope.hclScope.impl.HclScopeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>State Machine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Machine</em>'.
   * @generated
   */
  StateMachine createStateMachine();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Entry Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Action</em>'.
   * @generated
   */
  EntryAction createEntryAction();

  /**
   * Returns a new object of class '<em>Exit Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Action</em>'.
   * @generated
   */
  ExitAction createExitAction();

  /**
   * Returns a new object of class '<em>Initial State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial State</em>'.
   * @generated
   */
  InitialState createInitialState();

  /**
   * Returns a new object of class '<em>Junction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Junction</em>'.
   * @generated
   */
  Junction createJunction();

  /**
   * Returns a new object of class '<em>Choice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice</em>'.
   * @generated
   */
  Choice createChoice();

  /**
   * Returns a new object of class '<em>Entry Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entry Point</em>'.
   * @generated
   */
  EntryPoint createEntryPoint();

  /**
   * Returns a new object of class '<em>Exit Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exit Point</em>'.
   * @generated
   */
  ExitPoint createExitPoint();

  /**
   * Returns a new object of class '<em>Deep History</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deep History</em>'.
   * @generated
   */
  DeepHistory createDeepHistory();

  /**
   * Returns a new object of class '<em>Initial Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial Transition</em>'.
   * @generated
   */
  InitialTransition createInitialTransition();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>Internal Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Internal Transition</em>'.
   * @generated
   */
  InternalTransition createInternalTransition();

  /**
   * Returns a new object of class '<em>History Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>History Transition</em>'.
   * @generated
   */
  HistoryTransition createHistoryTransition();

  /**
   * Returns a new object of class '<em>Transition Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Body</em>'.
   * @generated
   */
  TransitionBody createTransitionBody();

  /**
   * Returns a new object of class '<em>Transition Guard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Guard</em>'.
   * @generated
   */
  TransitionGuard createTransitionGuard();

  /**
   * Returns a new object of class '<em>Transition Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition Operation</em>'.
   * @generated
   */
  TransitionOperation createTransitionOperation();

  /**
   * Returns a new object of class '<em>Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger</em>'.
   * @generated
   */
  Trigger createTrigger();

  /**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
  Method createMethod();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Method Parameter Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Parameter Trigger</em>'.
   * @generated
   */
  MethodParameterTrigger createMethodParameterTrigger();

  /**
   * Returns a new object of class '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port</em>'.
   * @generated
   */
  Port createPort();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Port Event Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Port Event Trigger</em>'.
   * @generated
   */
  PortEventTrigger createPortEventTrigger();

  /**
   * Returns a new object of class '<em>Vertex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vertex</em>'.
   * @generated
   */
  Vertex createVertex();

  /**
   * Returns a new object of class '<em>Transitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transitions</em>'.
   * @generated
   */
  Transitions createTransitions();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HclScopePackage getHclScopePackage();

} //HclScopeFactory