package mainTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

import java.io.IOException;
import org.apache.logging.log4j.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import resources.base;

public class dataProvider extends base {

	private static Logger log = LogManager.getLogger(dataProvider.class.getName());

	@BeforeTest

	public void initialize() throws IOException {
		
		

		// initialise driver
		driver = initializeDriver();
		log.info("//////COMMENCING SAMPLE EXCEL TEST//////");

	}

	@Test

	public void sampleDataProviderTest() throws IOException {
	

	}

	@AfterTest

	public void teardown() {
		log.info("////SAMPLE TEST COMPLETED////");

		// driver.close();

	}

}
