package dblab.hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** * Unit test for simple App. */
public class AppTest extends TestCase {
	/** * Create the test case * * @param testName name of the test case */
	public AppTest(String testName) {
		super(testName);
	}

	/** * @return the suite of tests being tested */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/** * Rigourous Test :-) */
	public void testApp() {

		/** On test le passage de paramètres à la méthode main */
		App.main(new String[] {"Hello", "World", "It's", "Me", "Mario"});
	}
}