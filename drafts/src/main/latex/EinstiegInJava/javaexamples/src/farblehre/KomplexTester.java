package farblehre;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class KomplexTester {

	static final Logger logger = Logger
			.getLogger(KomplexTester.class.getName());

	protected void printFarbe(SWFarbe farbe) {
		logger.info(farbe.toString());
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() {
		System.out.println("@Before");
	}

	@After
	public void tearDown() {
		System.out.println("@After");
	}

	@Test
	public void test1() {
		System.out.println("test 1");
	}

}
