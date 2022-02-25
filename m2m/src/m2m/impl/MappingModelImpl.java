/**
 */
package m2m.impl;

import java.util.Collection;

import m2m.M2mPackage;
import m2m.MappingModel;
import m2m.MappingRule;
import m2m.Model;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link m2m.impl.MappingModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link m2m.impl.MappingModelImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link m2m.impl.MappingModelImpl#getLeftModels <em>Left Models</em>}</li>
 *   <li>{@link m2m.impl.MappingModelImpl#getRightModels <em>Right Models</em>}</li>
 *   <li>{@link m2m.impl.MappingModelImpl#getMainLeftMetamodel <em>Main Left Metamodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingModelImpl extends MinimalEObjectImpl.Container implements MappingModel {
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
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingRule> rules;

	/**
	 * The cached value of the '{@link #getLeftModels() <em>Left Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> leftModels;

	/**
	 * The cached value of the '{@link #getRightModels() <em>Right Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> rightModels;

	/**
	 * The cached value of the '{@link #getMainLeftMetamodel() <em>Main Left Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainLeftMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Model mainLeftMetamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2mPackage.Literals.MAPPING_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentWithInverseEList<MappingRule>(MappingRule.class, this, M2mPackage.MAPPING_MODEL__RULES, M2mPackage.MAPPING_RULE__MAPPING_MODEL);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getLeftModels() {
		if (leftModels == null) {
			leftModels = new EObjectContainmentEList<Model>(Model.class, this, M2mPackage.MAPPING_MODEL__LEFT_MODELS);
		}
		return leftModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getRightModels() {
		if (rightModels == null) {
			rightModels = new EObjectContainmentEList<Model>(Model.class, this, M2mPackage.MAPPING_MODEL__RIGHT_MODELS);
		}
		return rightModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getMainLeftMetamodel() {
		if (mainLeftMetamodel != null && mainLeftMetamodel.eIsProxy()) {
			InternalEObject oldMainLeftMetamodel = (InternalEObject)mainLeftMetamodel;
			mainLeftMetamodel = (Model)eResolveProxy(oldMainLeftMetamodel);
			if (mainLeftMetamodel != oldMainLeftMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2mPackage.MAPPING_MODEL__MAIN_LEFT_METAMODEL, oldMainLeftMetamodel, mainLeftMetamodel));
			}
		}
		return mainLeftMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetMainLeftMetamodel() {
		return mainLeftMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainLeftMetamodel(Model newMainLeftMetamodel) {
		Model oldMainLeftMetamodel = mainLeftMetamodel;
		mainLeftMetamodel = newMainLeftMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2mPackage.MAPPING_MODEL__MAIN_LEFT_METAMODEL, oldMainLeftMetamodel, mainLeftMetamodel));
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
			case M2mPackage.MAPPING_MODEL__RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRules()).basicAdd(otherEnd, msgs);
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
			case M2mPackage.MAPPING_MODEL__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case M2mPackage.MAPPING_MODEL__LEFT_MODELS:
				return ((InternalEList<?>)getLeftModels()).basicRemove(otherEnd, msgs);
			case M2mPackage.MAPPING_MODEL__RIGHT_MODELS:
				return ((InternalEList<?>)getRightModels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2mPackage.MAPPING_MODEL__NAME:
				return getName();
			case M2mPackage.MAPPING_MODEL__RULES:
				return getRules();
			case M2mPackage.MAPPING_MODEL__LEFT_MODELS:
				return getLeftModels();
			case M2mPackage.MAPPING_MODEL__RIGHT_MODELS:
				return getRightModels();
			case M2mPackage.MAPPING_MODEL__MAIN_LEFT_METAMODEL:
				if (resolve) return getMainLeftMetamodel();
				return basicGetMainLeftMetamodel();
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
			case M2mPackage.MAPPING_MODEL__NAME:
				setName((String)newValue);
				return;
			case M2mPackage.MAPPING_MODEL__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends MappingRule>)newValue);
				return;
			case M2mPackage.MAPPING_MODEL__LEFT_MODELS:
				getLeftModels().clear();
				getLeftModels().addAll((Collection<? extends Model>)newValue);
				return;
			case M2mPackage.MAPPING_MODEL__RIGHT_MODELS:
				getRightModels().clear();
				getRightModels().addAll((Collection<? extends Model>)newValue);
				return;
			case M2mPackage.MAPPING_MODEL__MAIN_LEFT_METAMODEL:
				setMainLeftMetamodel((Model)newValue);
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
			case M2mPackage.MAPPING_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case M2mPackage.MAPPING_MODEL__RULES:
				getRules().clear();
				return;
			case M2mPackage.MAPPING_MODEL__LEFT_MODELS:
				getLeftModels().clear();
				return;
			case M2mPackage.MAPPING_MODEL__RIGHT_MODELS:
				getRightModels().clear();
				return;
			case M2mPackage.MAPPING_MODEL__MAIN_LEFT_METAMODEL:
				setMainLeftMetamodel((Model)null);
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
			case M2mPackage.MAPPING_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case M2mPackage.MAPPING_MODEL__RULES:
				return rules != null && !rules.isEmpty();
			case M2mPackage.MAPPING_MODEL__LEFT_MODELS:
				return leftModels != null && !leftModels.isEmpty();
			case M2mPackage.MAPPING_MODEL__RIGHT_MODELS:
				return rightModels != null && !rightModels.isEmpty();
			case M2mPackage.MAPPING_MODEL__MAIN_LEFT_METAMODEL:
				return mainLeftMetamodel != null;
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
		result.append(')');
		return result.toString();
	}

} //MappingModelImpl
