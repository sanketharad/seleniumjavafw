package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		// initialize ExtentReports and attach the HtmlReporter
		ExtentReports extent = new ExtentReports();

		// attach only HtmlReporter
		extent.attachReporter(htmlReporter);
		
		ExtentTest test1 = extent.createTest("google Search Test one", "This is a test to validate google search functionality");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case");
		driver.get("https://www.google.com/");
		test1.pass("Navigated to google");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("accion");
		test1.pass("Entered in text box");
		//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		test1.pass("Pressed enter key");
		
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		test1.info("Test case completed");
		extent.flush();
	}

}
