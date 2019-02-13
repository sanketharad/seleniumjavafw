package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("accion");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		//driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_Search(driver).sendKeys(Keys.RETURN);
		
	}

}
