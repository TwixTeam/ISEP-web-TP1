package ex01F;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** * Unit test for simple App. */
public class CircleTest extends TestCase {
	/** * Create the test case * * @param testName name of the test case */
	public CircleTest(String testName) {
		super(testName);
	}

	/** * @return the suite of tests being tested */
	public static Test suite() {
		return new TestSuite(CircleTest.class);
	}

	/** * Rigourous Test :-) */
	public void testApp() {
		Circle c = new Circle(1,2, 5);

		/** On test la bonne création de notre instance de Circle */
		assertTrue(c.x == 1 && c.y ==2 && c.radius == 5);
	}
}