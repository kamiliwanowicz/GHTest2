package mainTests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.LandingPage;

import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import resources.base;

public class newTest extends base {

	private static Logger log = LogManager.getLogger(newTest.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		// initialise driver
		driver = initializeDriver();
		log.info("//////COMMENCING NEW TEST//////");
		
		

	}

	@Test

	public void tier2SampleTest() throws IOException {
		SoftAssert sa = new SoftAssert(); 

		driver.get(prop.getProperty(""));

		

		
		
		sa.assertAll();
	}

	@AfterTest

	public void teardown() {
		log.info("////NEW TEST COMPLETED////");

		// driver.close();

	}

}
