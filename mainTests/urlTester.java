package mainTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.logging.log4j.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources.base;

public class urlTester extends base {

	private static Logger log = LogManager.getLogger(urlTester.class.getName());

	@BeforeTest

	public void initialize() throws IOException {
		
		

		// initialise driver
		driver = initializeDriver();
		log.info("//////COMMENCING URL TEST//////");
		

	}

	@Test

	public void sampleDataProviderTest() throws IOException {
		driver.get(prop.getProperty("williammain"));
		
		LandingPage lp = new LandingPage(driver); 
		
		for(WebElement link: lp.getAllHeaderLinks()) {
			
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL (url).openConnection(); 
			conn.setRequestMethod("HEAD");
			conn.connect();
			int httpCode = conn.getResponseCode();
			System.out.println(httpCode);
			
			if (httpCode>=400) {
				
				log.error("Broken link: "+ link.getText()+" /// " + link.getAttribute("value") + " /// "+link.getAttribute("textContent")+" with code: "+httpCode);
				
				
			}
			
		}
		
		
		

	}

	@AfterTest

	public void teardown() {
		log.info("////URL TEST COMPLETED////");

		 driver.close();

	}

}
