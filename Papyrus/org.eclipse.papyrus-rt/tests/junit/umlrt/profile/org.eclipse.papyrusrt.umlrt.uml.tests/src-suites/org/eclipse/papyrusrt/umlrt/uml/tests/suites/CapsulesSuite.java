/*****************************************************************************
 * Copyright (c) 2017 Christian W. Damus and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Christian W. Damus - Initial API and implementation
 *   
 *****************************************************************************/

package org.eclipse.papyrusrt.umlrt.uml.tests.suites;

import org.eclipse.papyrusrt.umlrt.uml.tests.categories.CapsuleTests;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite aggregator for capsules.
 */
@RunWith(Categories.class)
@IncludeCategory(CapsuleTests.class)
@SuiteClasses(AllTests.class)
public class CapsulesSuite {

	public CapsulesSuite() {
		super();
	}

}
