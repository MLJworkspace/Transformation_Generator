/**
 */
package m2m;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link m2m.MappingModel#getName <em>Name</em>}</li>
 *   <li>{@link m2m.MappingModel#getRules <em>Rules</em>}</li>
 *   <li>{@link m2m.MappingModel#getLeftModels <em>Left Models</em>}</li>
 *   <li>{@link m2m.MappingModel#getRightModels <em>Right Models</em>}</li>
 *   <li>{@link m2m.MappingModel#getMainLeftMetamodel <em>Main Left Metamodel</em>}</li>
 * </ul>
 *
 * @see m2m.M2mPackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see m2m.M2mPackage#getMappingModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link m2m.MappingModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link m2m.MappingRule}.
	 * It is bidirectional and its opposite is '{@link m2m.MappingRule#getMappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see m2m.M2mPackage#getMappingModel_Rules()
	 * @see m2m.MappingRule#getMappingModel
	 * @model opposite="MappingModel" containment="true"
	 * @generated
	 */
	EList<MappingRule> getRules();

	/**
	 * Returns the value of the '<em><b>Left Models</b></em>' containment reference list.
	 * The list contents are of type {@link m2m.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Models</em>' containment reference list.
	 * @see m2m.M2mPackage#getMappingModel_LeftModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Model> getLeftModels();

	/**
	 * Returns the value of the '<em><b>Right Models</b></em>' containment reference list.
	 * The list contents are of type {@link m2m.Model}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Models</em>' containment reference list.
	 * @see m2m.M2mPackage#getMappingModel_RightModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Model> getRightModels();

	/**
	 * Returns the value of the '<em><b>Main Left Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Left Metamodel</em>' reference.
	 * @see #setMainLeftMetamodel(Model)
	 * @see m2m.M2mPackage#getMappingModel_MainLeftMetamodel()
	 * @model required="true"
	 * @generated
	 */
	Model getMainLeftMetamodel();

	/**
	 * Sets the value of the '{@link m2m.MappingModel#getMainLeftMetamodel <em>Main Left Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Left Metamodel</em>' reference.
	 * @see #getMainLeftMetamodel()
	 * @generated
	 */
	void setMainLeftMetamodel(Model value);

} // MappingModel
