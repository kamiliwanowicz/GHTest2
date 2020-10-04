package mainTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import resources.base;

public class sampleTest extends base {

	private static Logger log = LogManager.getLogger(sampleTest.class.getName());

	@BeforeTest

	public void initialize() throws IOException {

		// initialise driver
		driver = initializeDriver();
		log.info("//////COMMENCING SAMPLE TEST//////");

	}

	@Test

	public void tier2SampleTest() throws IOException {
		LandingPage l = new LandingPage(driver);

		driver.get(prop.getProperty("kingscollege"));

		l.getPopup().click();
		l.getInputField().sendKeys("hello");
		l.getInputField().sendKeys(Keys.ENTER);

	}

	@AfterTest

	public void teardown() {
		log.info("////SAMPLE TEST COMPLETED////");

		// driver.close();

	}

}
