package ex01D;

import junit.framework.TestCase;
import org.apache.log4j.*;

public class CTest extends TestCase {
	protected static Logger log = Logger.getLogger(CTest.class);
	private StringBuilder s;

	/**
	 * @param name
	 */
	public CTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		s = new StringBuilder("abc");
		super.setUp();
	}
	
	/**
	 * Test method for {@link ex01D.C#method1(int, java.lang.StringBuilder)}.
	 */
	public void testMethod1() {
		int i = 0;
		C.method1(i, s);
		assertEquals(i, 0);
		assertEquals(s.toString(), "abcd");
		log.info("method1 ok");
	}

}
