/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.hclscope.hclScope;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.hclscope.hclScope.HistoryTransition#getFrom <em>From</em>}</li>
 *   <li>{@link org.xtext.example.hclscope.hclScope.HistoryTransition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getHistoryTransition()
 * @model
 * @generated
 */
public interface HistoryTransition extends Transitions
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Vertex)
   * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getHistoryTransition_From()
   * @model
   * @generated
   */
  Vertex getFrom();

  /**
   * Sets the value of the '{@link org.xtext.example.hclscope.hclScope.HistoryTransition#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Vertex value);

  /**
   * Returns the value of the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' containment reference.
   * @see #setTo(DeepHistory)
   * @see org.xtext.example.hclscope.hclScope.HclScopePackage#getHistoryTransition_To()
   * @model containment="true"
   * @generated
   */
  DeepHistory getTo();

  /**
   * Sets the value of the '{@link org.xtext.example.hclscope.hclScope.HistoryTransition#getTo <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' containment reference.
   * @see #getTo()
   * @generated
   */
  void setTo(DeepHistory value);

} // HistoryTransition
