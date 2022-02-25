/**
 */
package m2m.impl;

import java.util.Collection;
import m2m.Action;
import m2m.AssignmentOperator;
import m2m.M2mPackage;
import m2m.MappingModel;
import m2m.MappingRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m2m.impl.MappingRuleImpl#getInput <em>Input</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getAction <em>Action</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getMappingCondition <em>Mapping Condition</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getMappingModel <em>Mapping Model</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getChildRules <em>Child Rules</em>}</li>
 *   <li>{@link m2m.impl.MappingRuleImpl#getParentRule <em>Parent Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingRuleImpl extends MinimalEObjectImpl.Container implements MappingRule {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EObject input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EObject output;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.TRANSFORM;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected static final AssignmentOperator ASSIGNMENT_EDEFAULT = AssignmentOperator.ASSIGNMENT;

	/**
	 * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignment()
	 * @generated
	 * @ordered
	 */
	protected AssignmentOperator assignment = ASSIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMappingCondition() <em>Mapping Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String MAPPING_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappingCondition() <em>Mapping Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingCondition()
	 * @generated
	 * @ordered
	 */
	protected String mappingCondition = MAPPING_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildRules() <em>Child Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildRules()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingRule> childRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2mPackage.Literals.MAPPING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject)input;
			input = eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2mPackage.MAPPING_RULE__INPUT, oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(EObject newInput) {
		EObject oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2mPackage.MAPPING_RULE__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(EObject newOutput) {
		EObject oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentOperator getAssignment() {
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignment(AssignmentOperator newAssignment) {
		AssignmentOperator oldAssignment = assignment;
		assignment = newAssignment == null ? ASSIGNMENT_EDEFAULT : newAssignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__ASSIGNMENT, oldAssignment, assignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMappingCondition() {
		return mappingCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingCondition(String newMappingCondition) {
		String oldMappingCondition = mappingCondition;
		mappingCondition = newMappingCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__MAPPING_CONDITION, oldMappingCondition, mappingCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel getMappingModel() {
		if (eContainerFeatureID() != M2mPackage.MAPPING_RULE__MAPPING_MODEL) return null;
		return (MappingModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingModel(MappingModel newMappingModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMappingModel, M2mPackage.MAPPING_RULE__MAPPING_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingModel(MappingModel newMappingModel) {
		if (newMappingModel != eInternalContainer() || (eContainerFeatureID() != M2mPackage.MAPPING_RULE__MAPPING_MODEL && newMappingModel != null)) {
			if (EcoreUtil.isAncestor(this, newMappingModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMappingModel != null)
				msgs = ((InternalEObject)newMappingModel).eInverseAdd(this, M2mPackage.MAPPING_MODEL__RULES, MappingModel.class, msgs);
			msgs = basicSetMappingModel(newMappingModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__MAPPING_MODEL, newMappingModel, newMappingModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingRule> getChildRules() {
		if (childRules == null) {
			childRules = new EObjectContainmentWithInverseEList<MappingRule>(MappingRule.class, this, M2mPackage.MAPPING_RULE__CHILD_RULES, M2mPackage.MAPPING_RULE__PARENT_RULE);
		}
		return childRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRule getParentRule() {
		if (eContainerFeatureID() != M2mPackage.MAPPING_RULE__PARENT_RULE) return null;
		return (MappingRule)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRule(MappingRule newParentRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRule, M2mPackage.MAPPING_RULE__PARENT_RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRule(MappingRule newParentRule) {
		if (newParentRule != eInternalContainer() || (eContainerFeatureID() != M2mPackage.MAPPING_RULE__PARENT_RULE && newParentRule != null)) {
			if (EcoreUtil.isAncestor(this, newParentRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRule != null)
				msgs = ((InternalEObject)newParentRule).eInverseAdd(this, M2mPackage.MAPPING_RULE__CHILD_RULES, MappingRule.class, msgs);
			msgs = basicSetParentRule(newParentRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_RULE__PARENT_RULE, newParentRule, newParentRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2mPackage.MAPPING_RULE__MAPPING_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMappingModel((MappingModel)otherEnd, msgs);
			case M2mPackage.MAPPING_RULE__CHILD_RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildRules()).basicAdd(otherEnd, msgs);
			case M2mPackage.MAPPING_RULE__PARENT_RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRule((MappingRule)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2mPackage.MAPPING_RULE__MAPPING_MODEL:
				return basicSetMappingModel(null, msgs);
			case M2mPackage.MAPPING_RULE__CHILD_RULES:
				return ((InternalEList<?>)getChildRules()).basicRemove(otherEnd, msgs);
			case M2mPackage.MAPPING_RULE__PARENT_RULE:
				return basicSetParentRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case M2mPackage.MAPPING_RULE__MAPPING_MODEL:
				return eInternalContainer().eInverseRemove(this, M2mPackage.MAPPING_MODEL__RULES, MappingModel.class, msgs);
			case M2mPackage.MAPPING_RULE__PARENT_RULE:
				return eInternalContainer().eInverseRemove(this, M2mPackage.MAPPING_RULE__CHILD_RULES, MappingRule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2mPackage.MAPPING_RULE__INPUT:
				if (resolve) return getInput();
				return basicGetInput();
			case M2mPackage.MAPPING_RULE__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case M2mPackage.MAPPING_RULE__NAME:
				return getName();
			case M2mPackage.MAPPING_RULE__ACTION:
				return getAction();
			case M2mPackage.MAPPING_RULE__ASSIGNMENT:
				return getAssignment();
			case M2mPackage.MAPPING_RULE__MAPPING_CONDITION:
				return getMappingCondition();
			case M2mPackage.MAPPING_RULE__FILTER:
				return getFilter();
			case M2mPackage.MAPPING_RULE__COMMENT:
				return getComment();
			case M2mPackage.MAPPING_RULE__MAPPING_MODEL:
				return getMappingModel();
			case M2mPackage.MAPPING_RULE__CHILD_RULES:
				return getChildRules();
			case M2mPackage.MAPPING_RULE__PARENT_RULE:
				return getParentRule();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M2mPackage.MAPPING_RULE__INPUT:
				setInput((EObject)newValue);
				return;
			case M2mPackage.MAPPING_RULE__OUTPUT:
				setOutput((EObject)newValue);
				return;
			case M2mPackage.MAPPING_RULE__NAME:
				setName((String)newValue);
				return;
			case M2mPackage.MAPPING_RULE__ACTION:
				setAction((Action)newValue);
				return;
			case M2mPackage.MAPPING_RULE__ASSIGNMENT:
				setAssignment((AssignmentOperator)newValue);
				return;
			case M2mPackage.MAPPING_RULE__MAPPING_CONDITION:
				setMappingCondition((String)newValue);
				return;
			case M2mPackage.MAPPING_RULE__FILTER:
				setFilter((String)newValue);
				return;
			case M2mPackage.MAPPING_RULE__COMMENT:
				setComment((String)newValue);
				return;
			case M2mPackage.MAPPING_RULE__MAPPING_MODEL:
				setMappingModel((MappingModel)newValue);
				return;
			case M2mPackage.MAPPING_RULE__CHILD_RULES:
				getChildRules().clear();
				getChildRules().addAll((Collection<? extends MappingRule>)newValue);
				return;
			case M2mPackage.MAPPING_RULE__PARENT_RULE:
				setParentRule((MappingRule)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case M2mPackage.MAPPING_RULE__INPUT:
				setInput((EObject)null);
				return;
			case M2mPackage.MAPPING_RULE__OUTPUT:
				setOutput((EObject)null);
				return;
			case M2mPackage.MAPPING_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case M2mPackage.MAPPING_RULE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case M2mPackage.MAPPING_RULE__ASSIGNMENT:
				setAssignment(ASSIGNMENT_EDEFAULT);
				return;
			case M2mPackage.MAPPING_RULE__MAPPING_CONDITION:
				setMappingCondition(MAPPING_CONDITION_EDEFAULT);
				return;
			case M2mPackage.MAPPING_RULE__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case M2mPackage.MAPPING_RULE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case M2mPackage.MAPPING_RULE__MAPPING_MODEL:
				setMappingModel((MappingModel)null);
				return;
			case M2mPackage.MAPPING_RULE__CHILD_RULES:
				getChildRules().clear();
				return;
			case M2mPackage.MAPPING_RULE__PARENT_RULE:
				setParentRule((MappingRule)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case M2mPackage.MAPPING_RULE__INPUT:
				return input != null;
			case M2mPackage.MAPPING_RULE__OUTPUT:
				return output != null;
			case M2mPackage.MAPPING_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case M2mPackage.MAPPING_RULE__ACTION:
				return action != ACTION_EDEFAULT;
			case M2mPackage.MAPPING_RULE__ASSIGNMENT:
				return assignment != ASSIGNMENT_EDEFAULT;
			case M2mPackage.MAPPING_RULE__MAPPING_CONDITION:
				return MAPPING_CONDITION_EDEFAULT == null ? mappingCondition != null : !MAPPING_CONDITION_EDEFAULT.equals(mappingCondition);
			case M2mPackage.MAPPING_RULE__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case M2mPackage.MAPPING_RULE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case M2mPackage.MAPPING_RULE__MAPPING_MODEL:
				return getMappingModel() != null;
			case M2mPackage.MAPPING_RULE__CHILD_RULES:
				return childRules != null && !childRules.isEmpty();
			case M2mPackage.MAPPING_RULE__PARENT_RULE:
				return getParentRule() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", action: ");
		result.append(action);
		result.append(", assignment: ");
		result.append(assignment);
		result.append(", mappingCondition: ");
		result.append(mappingCondition);
		result.append(", filter: ");
		result.append(filter);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //MappingRuleImpl
