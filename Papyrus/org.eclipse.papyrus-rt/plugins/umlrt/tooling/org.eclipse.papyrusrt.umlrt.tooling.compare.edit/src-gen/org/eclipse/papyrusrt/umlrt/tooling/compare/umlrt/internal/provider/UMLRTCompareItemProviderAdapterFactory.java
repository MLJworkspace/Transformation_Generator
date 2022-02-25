/**
 * Copyright (c) 2016 EclipseSource Services GmbH
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Philip Langer (EclipseSource) - Initial API and implementation
 */
package org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.util.UMLRTCompareAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class UMLRTCompareItemProviderAdapterFactory extends UMLRTCompareAdapterFactory implements
		ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement
	 * {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public UMLRTCompareItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.UMLRTDiff} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRTDiffItemProvider umlrtDiffItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.UMLRTDiff}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRTDiffAdapter() {
		if (umlrtDiffItemProvider == null) {
			umlrtDiffItemProvider = new UMLRTDiffItemProvider(this);
		}

		return umlrtDiffItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.ProtocolChange} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolChangeItemProvider protocolChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.ProtocolChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProtocolChangeAdapter() {
		if (protocolChangeItemProvider == null) {
			protocolChangeItemProvider = new ProtocolChangeItemProvider(this);
		}

		return protocolChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.ProtocolMessageChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolMessageChangeItemProvider protocolMessageChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.ProtocolMessageChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProtocolMessageChangeAdapter() {
		if (protocolMessageChangeItemProvider == null) {
			protocolMessageChangeItemProvider = new ProtocolMessageChangeItemProvider(this);
		}

		return protocolMessageChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.ProtocolMessageParameterChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolMessageParameterChangeItemProvider protocolMessageParameterChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.ProtocolMessageParameterChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProtocolMessageParameterChangeAdapter() {
		if (protocolMessageParameterChangeItemProvider == null) {
			protocolMessageParameterChangeItemProvider = new ProtocolMessageParameterChangeItemProvider(this);
		}

		return protocolMessageParameterChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.UMLRTDiagramChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRTDiagramChangeItemProvider umlrtDiagramChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.papyrusrt.umlrt.tooling.compare.umlrt.internal.UMLRTDiagramChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUMLRTDiagramChangeAdapter() {
		if (umlrtDiagramChangeItemProvider == null) {
			umlrtDiagramChangeItemProvider = new UMLRTDiagramChangeItemProvider(this);
		}

		return umlrtDiagramChangeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to
	 * {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void dispose() {
		if (umlrtDiffItemProvider != null)
			umlrtDiffItemProvider.dispose();
		if (protocolChangeItemProvider != null)
			protocolChangeItemProvider.dispose();
		if (protocolMessageChangeItemProvider != null)
			protocolMessageChangeItemProvider.dispose();
		if (protocolMessageParameterChangeItemProvider != null)
			protocolMessageParameterChangeItemProvider.dispose();
		if (umlrtDiagramChangeItemProvider != null)
			umlrtDiagramChangeItemProvider.dispose();
	}

}