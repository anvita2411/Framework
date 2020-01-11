package MyFramework.Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class testCase1Test {

	
WebDriver driver=null;
	
	@BeforeTest
	public void LaunchChrome() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/#/index");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}
