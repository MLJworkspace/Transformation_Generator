/**
 */
package m2m;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2m.MappingRule#getInput <em>Input</em>}</li>
 *   <li>{@link m2m.MappingRule#getOutput <em>Output</em>}</li>
 *   <li>{@link m2m.MappingRule#getName <em>Name</em>}</li>
 *   <li>{@link m2m.MappingRule#getAction <em>Action</em>}</li>
 *   <li>{@link m2m.MappingRule#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link m2m.MappingRule#getMappingCondition <em>Mapping Condition</em>}</li>
 *   <li>{@link m2m.MappingRule#getFilter <em>Filter</em>}</li>
 *   <li>{@link m2m.MappingRule#getComment <em>Comment</em>}</li>
 *   <li>{@link m2m.MappingRule#getMappingModel <em>Mapping Model</em>}</li>
 *   <li>{@link m2m.MappingRule#getChildRules <em>Child Rules</em>}</li>
 *   <li>{@link m2m.MappingRule#getParentRule <em>Parent Rule</em>}</li>
 * </ul>
 *
 * @see m2m.M2mPackage#getMappingRule()
 * @model
 * @generated
 */
public interface MappingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(EObject)
	 * @see m2m.M2mPackage#getMappingRule_Input()
	 * @model
	 * @generated
	 */
	EObject getInput();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(EObject value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(EObject)
	 * @see m2m.M2mPackage#getMappingRule_Output()
	 * @model
	 * @generated
	 */
	EObject getOutput();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(EObject value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see m2m.M2mPackage#getMappingRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link m2m.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see m2m.Action
	 * @see #setAction(Action)
	 * @see m2m.M2mPackage#getMappingRule_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see m2m.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Assignment</b></em>' attribute.
	 * The literals are from the enumeration {@link m2m.AssignmentOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment</em>' attribute.
	 * @see m2m.AssignmentOperator
	 * @see #setAssignment(AssignmentOperator)
	 * @see m2m.M2mPackage#getMappingRule_Assignment()
	 * @model
	 * @generated
	 */
	AssignmentOperator getAssignment();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getAssignment <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignment</em>' attribute.
	 * @see m2m.AssignmentOperator
	 * @see #getAssignment()
	 * @generated
	 */
	void setAssignment(AssignmentOperator value);

	/**
	 * Returns the value of the '<em><b>Mapping Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Condition</em>' attribute.
	 * @see #setMappingCondition(String)
	 * @see m2m.M2mPackage#getMappingRule_MappingCondition()
	 * @model
	 * @generated
	 */
	String getMappingCondition();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getMappingCondition <em>Mapping Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Condition</em>' attribute.
	 * @see #getMappingCondition()
	 * @generated
	 */
	void setMappingCondition(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see m2m.M2mPackage#getMappingRule_Filter()
	 * @model
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see m2m.M2mPackage#getMappingRule_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Mapping Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link m2m.MappingModel#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Model</em>' container reference.
	 * @see #setMappingModel(MappingModel)
	 * @see m2m.M2mPackage#getMappingRule_MappingModel()
	 * @see m2m.MappingModel#getRules
	 * @model opposite="Rules" transient="false"
	 * @generated
	 */
	MappingModel getMappingModel();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getMappingModel <em>Mapping Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Model</em>' container reference.
	 * @see #getMappingModel()
	 * @generated
	 */
	void setMappingModel(MappingModel value);

	/**
	 * Returns the value of the '<em><b>Child Rules</b></em>' containment reference list.
	 * The list contents are of type {@link m2m.MappingRule}.
	 * It is bidirectional and its opposite is '{@link m2m.MappingRule#getParentRule <em>Parent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Rules</em>' containment reference list.
	 * @see m2m.M2mPackage#getMappingRule_ChildRules()
	 * @see m2m.MappingRule#getParentRule
	 * @model opposite="ParentRule" containment="true"
	 * @generated
	 */
	EList<MappingRule> getChildRules();

	/**
	 * Returns the value of the '<em><b>Parent Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link m2m.MappingRule#getChildRules <em>Child Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Rule</em>' container reference.
	 * @see #setParentRule(MappingRule)
	 * @see m2m.M2mPackage#getMappingRule_ParentRule()
	 * @see m2m.MappingRule#getChildRules
	 * @model opposite="ChildRules" transient="false"
	 * @generated
	 */
	MappingRule getParentRule();

	/**
	 * Sets the value of the '{@link m2m.MappingRule#getParentRule <em>Parent Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Rule</em>' container reference.
	 * @see #getParentRule()
	 * @generated
	 */
	void setParentRule(MappingRule value);

} // MappingRule
