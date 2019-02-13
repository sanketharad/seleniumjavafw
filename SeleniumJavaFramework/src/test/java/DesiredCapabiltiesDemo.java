import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabiltiesDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);

		System.setProperty("webdriver.ie.driver", projectPath + "/Drivers/iedriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("accion");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}

}
