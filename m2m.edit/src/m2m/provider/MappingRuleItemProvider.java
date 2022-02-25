/**
 */
package m2m.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import m2m.M2mFactory;
import m2m.M2mPackage;

import m2m.MappingRule;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link m2m.MappingRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingRuleItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInputPropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addAssignmentPropertyDescriptor(object);
			addMappingConditionPropertyDescriptor(object);
			addFilterPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
			addMappingModelPropertyDescriptor(object);
			addChildRulesPropertyDescriptor(object);
			addParentRulePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		getResourceLocator(), getString("_UI_MappingRule_input_feature"),
		getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_input_feature",
		"_UI_MappingRule_type"),
		M2mPackage.Literals.MAPPING_RULE__INPUT, true, false, true, null, null, null)
		{
		@Override
		// public Collection<?> getChoiceOfValues(Object object) {
		// List<EObject> choiceOfValues = new ArrayList<EObject>();
		// if (object instanceof MappingRule) {
		// EObject parentrule = ((MappingRule) object).getParentRule();
		// if (parentrule instanceof MappingRule) {
		// EObject inputproperty = ((MappingRule) parentrule).getInput();
		//
		// choiceOfValues = inputproperty.eContents();
		//
		// } else if (parentrule == null) {
		// MappingModel objectContainer = (MappingModel) ((MappingRule) object).eContainer();
		// EList<Model> models = objectContainer.getLeftModels();
//		    for (int i=0; i < models.size() ; i++) {
//		     EObject inputPackage =models.get(i).getModel();
//		     choiceOfValues = inputPackage.eContents();
//		    }
		//
		// }
		// }
		// return choiceOfValues;
		// }

		public IItemLabelProvider getLabelProvider(Object objecti) {
		List<EObject> choiceOfValues = new ArrayList<EObject>();
		objecti = getChoiceOfValues(object);
		final IItemLabelProvider labelProvider = super.getLabelProvider(objecti);
		return new IItemLabelProvider() {
		@Override
		public String getText(final Object objecti) {
		String label = labelProvider.getText(objecti);
		if (label != null) {
		if (objecti instanceof EObject) {
		EObject prindi = ((EObject) objecti).eContainer();
		if (prindi instanceof EPackage) {
		String emriprindit = ((EPackage) prindi).getName();
		label = String.format("%s \u2219 %s", label, emriprindit + "/" + label);
		} else if (prindi instanceof EClass) {
		String emriprindit = ((EClass) prindi).getName();
		EObject gjyshi = prindi.eContainer();
		String emrigjyshit = ((EPackage) gjyshi).getName();
		label = String.format("%s \u2219 %s", label,
		emrigjyshit + "/" + emriprindit + "/" + label);
		}
		}
		}
		return label;
		}
		@Override
		public Object getImage(final Object object) {
		return labelProvider.getImage(object);
		}
		};

		}
		}
		);
		}

		/**
		* This adds a property descriptor for the Output feature.
		* <!-- begin-user-doc -->
		* <!-- end-user-doc -->
		* @generated
		*/
		protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors
		.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
		getResourceLocator(), getString("_UI_MappingRule_output_feature"),
		getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_output_feature",
		"_UI_MappingRule_type"),
		M2mPackage.Literals.MAPPING_RULE__OUTPUT, true, false, true, null, null, null)
		{
		@Override
		public IItemLabelProvider getLabelProvider(Object objecti) {
		List<EObject> choiceOfValues = new ArrayList<EObject>();
		objecti = getChoiceOfValues(object);
		final IItemLabelProvider labelProvider = super.getLabelProvider(objecti);
		return new IItemLabelProvider() 
		
		{
			
			
		@Override
		public String getText(final Object objecti) {
		String label = labelProvider.getText(objecti);
		if (label != null) {
		if (objecti instanceof EObject) {
		EObject prindi = ((EObject) objecti).eContainer();
		if (prindi instanceof EPackage) {
		String emriprindit = ((EPackage) prindi).getName();
		label = String.format("%s \u2219 %s", label, emriprindit + "/" + label);
		} else if (prindi instanceof EClass) {
		String emriprindit = ((EClass) prindi).getName();
		EObject gjyshi = prindi.eContainer();
		String emrigjyshit = ((EPackage) gjyshi).getName();
		label = String.format("%s \u2219 %s", label,
		emrigjyshit + "/" + emriprindit + "/" + label);
		}
		}
		}
		return label;
		}
		
		
		@Override
		public Object getImage(final Object object) {
		return labelProvider.getImage(object);
		}
		};

		}
		}
		);
		}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_name_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null)
						
						);
	}
		/**
		 * This returns the label text for the adapted class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */			
			
					
				


	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_action_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Assignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_assignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_assignment_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__ASSIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapping Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappingConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_mappingCondition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_mappingCondition_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__MAPPING_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Filter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFilterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_filter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_filter_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__FILTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_comment_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__COMMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mapping Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMappingModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_MappingModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_MappingModel_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__MAPPING_MODEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child Rules feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_ChildRules_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_ChildRules_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__CHILD_RULES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MappingRule_ParentRule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MappingRule_ParentRule_feature", "_UI_MappingRule_type"),
				 M2mPackage.Literals.MAPPING_RULE__PARENT_RULE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(M2mPackage.Literals.MAPPING_RULE__CHILD_RULES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MappingRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	/**	
	@Override
	public String getText(Object object) {
     String label1 = ((MappingRule)object).getName();	
	if  (((MappingRule)object).getInput() instanceof EClass && ((MappingRule)object).getOutput() instanceof EClass) {
		String label = ((EClass) ((MappingRule)object).getInput()).getName() + "2" + ((EClass) ((MappingRule)object).getOutput()).getName();
		return label == null || label.length() == 0 ?
				getString("_UI_MappingRule_type") :
					getString("_UI_MappingRule_type") + " " + label;
	}
	else if  (((MappingRule)object).getInput() instanceof EReference && ((MappingRule)object).getOutput() instanceof EReference) {
		String label = ((EReference) ((MappingRule)object).getInput()).getName() + "2" + ((EReference) ((MappingRule)object).getOutput()).getName();
		return label == null || label.length() == 0 ?
				getString("_UI_MappingRule_type") :
					getString("_UI_MappingRule_type") + " " + label;
	}
	else if  (((MappingRule)object).getInput() instanceof EAttribute && ((MappingRule)object).getOutput() instanceof EAttribute) {
		String label = ((EAttribute) ((MappingRule)object).getInput()).getName() + "2" + ((EAttribute) ((MappingRule)object).getOutput()).getName();
		return label == null || label.length() == 0 ?
				getString("_UI_MappingRule_type") :
					getString("_UI_MappingRule_type") + " " + label;
	}
		
	return label1 == null || label1.length() == 0 ?
			getString("_UI_MappingRule_type") :
				getString("_UI_MappingRule_type") + " " + label1;
	}
 */
	
	@Override
	public String getText(Object object) {
		String label = ((MappingRule)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MappingRule_type") :
			getString("_UI_MappingRule_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(MappingRule.class)) {
			case M2mPackage.MAPPING_RULE__NAME:
			case M2mPackage.MAPPING_RULE__ACTION:
			case M2mPackage.MAPPING_RULE__ASSIGNMENT:
			case M2mPackage.MAPPING_RULE__MAPPING_CONDITION:
			case M2mPackage.MAPPING_RULE__FILTER:
			case M2mPackage.MAPPING_RULE__COMMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case M2mPackage.MAPPING_RULE__CHILD_RULES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(M2mPackage.Literals.MAPPING_RULE__CHILD_RULES,
				 M2mFactory.eINSTANCE.createMappingRule()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return M2mEditPlugin.INSTANCE;
	}

}
