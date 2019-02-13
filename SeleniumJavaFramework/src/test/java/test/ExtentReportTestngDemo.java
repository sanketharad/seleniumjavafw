package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestngDemo {
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	private WebDriver driver = null;
	
	
	@BeforeSuite
	public void setup(){
		// initialize the HtmlReporter
				htmlReporter = new ExtentHtmlReporter("extentReports.html");
				extent = new ExtentReports();
				extent.attachReporter(htmlReporter);
	}
	
	@BeforeTest
	public void setupTest(){
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test1() throws Exception{
		driver.get("https://www.google.com/");
		test = extent.createTest("google Search Test one", "This is a test to validate google search functionality");
		test.log(Status.INFO, "This is step show usage of log");
		test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void teardownTest(){
		driver.close();
		driver.quit();
		test.pass("Close the browser");
		test.info("Test case completed");

	}
	
	@AfterSuite
	public void teardown(){
		extent.flush();
	}

}
