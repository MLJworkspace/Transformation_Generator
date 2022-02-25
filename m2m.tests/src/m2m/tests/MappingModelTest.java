/**
 */
package m2m.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import m2m.M2mFactory;
import m2m.MappingModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingModelTest extends TestCase {

	/**
	 * The fixture for this Mapping Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingModel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappingModelTest.class);
	}

	/**
	 * Constructs a new Mapping Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mapping Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MappingModel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mapping Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingModel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(M2mFactory.eINSTANCE.createMappingModel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MappingModelTest
