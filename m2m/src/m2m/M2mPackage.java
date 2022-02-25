/**
 */
package m2m;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see m2m.M2mFactory
 * @model kind="package"
 * @generated
 */
public interface M2mPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "m2m";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/m2m";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "m2m";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M2mPackage eINSTANCE = m2m.impl.M2mPackageImpl.init();

	/**
	 * The meta object id for the '{@link m2m.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m2m.impl.MappingRuleImpl
	 * @see m2m.impl.M2mPackageImpl#getMappingRule()
	 * @generated
	 */
	int MAPPING_RULE = 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__ACTION = 3;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__ASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Mapping Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__MAPPING_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__FILTER = 6;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__COMMENT = 7;

	/**
	 * The feature id for the '<em><b>Mapping Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__MAPPING_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Child Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__CHILD_RULES = 9;

	/**
	 * The feature id for the '<em><b>Parent Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__PARENT_RULE = 10;

	/**
	 * The number of structural features of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m2m.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m2m.impl.ModelImpl
	 * @see m2m.impl.M2mPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link m2m.impl.MappingModelImpl <em>Mapping Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m2m.impl.MappingModelImpl
	 * @see m2m.impl.M2mPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__RULES = 1;

	/**
	 * The feature id for the '<em><b>Left Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__LEFT_MODELS = 2;

	/**
	 * The feature id for the '<em><b>Right Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__RIGHT_MODELS = 3;

	/**
	 * The feature id for the '<em><b>Main Left Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__MAIN_LEFT_METAMODEL = 4;

	/**
	 * The number of structural features of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link m2m.AssignmentOperator <em>Assignment Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m2m.AssignmentOperator
	 * @see m2m.impl.M2mPackageImpl#getAssignmentOperator()
	 * @generated
	 */
	int ASSIGNMENT_OPERATOR = 3;

	/**
	 * The meta object id for the '{@link m2m.Action <em>Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m2m.Action
	 * @see m2m.impl.M2mPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 4;


	/**
	 * Returns the meta object for class '{@link m2m.MappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule</em>'.
	 * @see m2m.MappingRule
	 * @generated
	 */
	EClass getMappingRule();

	/**
	 * Returns the meta object for the reference '{@link m2m.MappingRule#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see m2m.MappingRule#getInput()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_Input();

	/**
	 * Returns the meta object for the reference '{@link m2m.MappingRule#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see m2m.MappingRule#getOutput()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_Output();

	/**
	 * Returns the meta object for the attribute '{@link m2m.MappingRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m2m.MappingRule#getName()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link m2m.MappingRule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see m2m.MappingRule#getAction()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_Action();

	/**
	 * Returns the meta object for the attribute '{@link m2m.MappingRule#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment</em>'.
	 * @see m2m.MappingRule#getAssignment()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link m2m.MappingRule#getMappingCondition <em>Mapping Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Condition</em>'.
	 * @see m2m.MappingRule#getMappingCondition()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_MappingCondition();

	/**
	 * Returns the meta object for the attribute '{@link m2m.MappingRule#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see m2m.MappingRule#getFilter()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_Filter();

	/**
	 * Returns the meta object for the attribute '{@link m2m.MappingRule#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see m2m.MappingRule#getComment()
	 * @see #getMappingRule()
	 * @generated
	 */
	EAttribute getMappingRule_Comment();

	/**
	 * Returns the meta object for the container reference '{@link m2m.MappingRule#getMappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mapping Model</em>'.
	 * @see m2m.MappingRule#getMappingModel()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_MappingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link m2m.MappingRule#getChildRules <em>Child Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Rules</em>'.
	 * @see m2m.MappingRule#getChildRules()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_ChildRules();

	/**
	 * Returns the meta object for the container reference '{@link m2m.MappingRule#getParentRule <em>Parent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Rule</em>'.
	 * @see m2m.MappingRule#getParentRule()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_ParentRule();

	/**
	 * Returns the meta object for class '{@link m2m.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see m2m.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the reference '{@link m2m.Model#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see m2m.Model#getModel()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Model();

	/**
	 * Returns the meta object for the attribute '{@link m2m.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m2m.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link m2m.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Model</em>'.
	 * @see m2m.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the attribute '{@link m2m.MappingModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see m2m.MappingModel#getName()
	 * @see #getMappingModel()
	 * @generated
	 */
	EAttribute getMappingModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link m2m.MappingModel#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see m2m.MappingModel#getRules()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link m2m.MappingModel#getLeftModels <em>Left Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Left Models</em>'.
	 * @see m2m.MappingModel#getLeftModels()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_LeftModels();

	/**
	 * Returns the meta object for the containment reference list '{@link m2m.MappingModel#getRightModels <em>Right Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Right Models</em>'.
	 * @see m2m.MappingModel#getRightModels()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_RightModels();

	/**
	 * Returns the meta object for the reference '{@link m2m.MappingModel#getMainLeftMetamodel <em>Main Left Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Left Metamodel</em>'.
	 * @see m2m.MappingModel#getMainLeftMetamodel()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_MainLeftMetamodel();

	/**
	 * Returns the meta object for enum '{@link m2m.AssignmentOperator <em>Assignment Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assignment Operator</em>'.
	 * @see m2m.AssignmentOperator
	 * @generated
	 */
	EEnum getAssignmentOperator();

	/**
	 * Returns the meta object for enum '{@link m2m.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action</em>'.
	 * @see m2m.Action
	 * @generated
	 */
	EEnum getAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	M2mFactory getM2mFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link m2m.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m2m.impl.MappingRuleImpl
		 * @see m2m.impl.M2mPackageImpl#getMappingRule()
		 * @generated
		 */
		EClass MAPPING_RULE = eINSTANCE.getMappingRule();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__INPUT = eINSTANCE.getMappingRule_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__OUTPUT = eINSTANCE.getMappingRule_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__NAME = eINSTANCE.getMappingRule_Name();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__ACTION = eINSTANCE.getMappingRule_Action();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__ASSIGNMENT = eINSTANCE.getMappingRule_Assignment();

		/**
		 * The meta object literal for the '<em><b>Mapping Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__MAPPING_CONDITION = eINSTANCE.getMappingRule_MappingCondition();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__FILTER = eINSTANCE.getMappingRule_Filter();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_RULE__COMMENT = eINSTANCE.getMappingRule_Comment();

		/**
		 * The meta object literal for the '<em><b>Mapping Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__MAPPING_MODEL = eINSTANCE.getMappingRule_MappingModel();

		/**
		 * The meta object literal for the '<em><b>Child Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__CHILD_RULES = eINSTANCE.getMappingRule_ChildRules();

		/**
		 * The meta object literal for the '<em><b>Parent Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__PARENT_RULE = eINSTANCE.getMappingRule_ParentRule();

		/**
		 * The meta object literal for the '{@link m2m.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m2m.impl.ModelImpl
		 * @see m2m.impl.M2mPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MODEL = eINSTANCE.getModel_Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link m2m.impl.MappingModelImpl <em>Mapping Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m2m.impl.MappingModelImpl
		 * @see m2m.impl.M2mPackageImpl#getMappingModel()
		 * @generated
		 */
		EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_MODEL__NAME = eINSTANCE.getMappingModel_Name();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__RULES = eINSTANCE.getMappingModel_Rules();

		/**
		 * The meta object literal for the '<em><b>Left Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__LEFT_MODELS = eINSTANCE.getMappingModel_LeftModels();

		/**
		 * The meta object literal for the '<em><b>Right Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__RIGHT_MODELS = eINSTANCE.getMappingModel_RightModels();

		/**
		 * The meta object literal for the '<em><b>Main Left Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__MAIN_LEFT_METAMODEL = eINSTANCE.getMappingModel_MainLeftMetamodel();

		/**
		 * The meta object literal for the '{@link m2m.AssignmentOperator <em>Assignment Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m2m.AssignmentOperator
		 * @see m2m.impl.M2mPackageImpl#getAssignmentOperator()
		 * @generated
		 */
		EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

		/**
		 * The meta object literal for the '{@link m2m.Action <em>Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m2m.Action
		 * @see m2m.impl.M2mPackageImpl#getAction()
		 * @generated
		 */
		EEnum ACTION = eINSTANCE.getAction();

	}

} //M2mPackage
