import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\rh0083\\workspace\\SeleniumJavaFramework\\Drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.marionette", projectPath + "\\Drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromeDriver/chromedriver.exe");
		 
		System.setProperty("webdriver.ie.driver", projectPath + "/Drivers/iedriver/IEDriverServer.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("accion");
		
		java.util.List<WebElement> numberofinput = driver.findElements(By.xpath("//input"));
		
		int count = numberofinput.size();
		System.out.println(count);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
}
