package ex01C;
import org.apache.log4j.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** * Unit test for simple C class. */
public class Log4jTest extends TestCase {

	protected static Logger log = Logger.getLogger(Log4jTest.class);
	/** * Create the test case * * @param testName name of the test case */
	public Log4jTest(String testName) {
		super(testName);
	}

	/** * @return the suite of tests being tested */
	public static Test suite() {
		return new TestSuite(Log4jTest.class);
	}

	/** * Rigourous Test :-) */
	public void testApp() {

		/** On test le l'affichage des logs dans le terminal */
		log.info("info message TEST");
		log.debug("debug message TEST");
	}
}