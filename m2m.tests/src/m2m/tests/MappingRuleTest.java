/**
 */
package m2m.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import m2m.M2mFactory;
import m2m.MappingRule;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingRuleTest extends TestCase {

	/**
	 * The fixture for this Mapping Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRule fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappingRuleTest.class);
	}

	/**
	 * Constructs a new Mapping Rule test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRuleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mapping Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MappingRule fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mapping Rule test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRule getFixture() {
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
		setFixture(M2mFactory.eINSTANCE.createMappingRule());
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

} //MappingRuleTest
