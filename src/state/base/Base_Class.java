package state.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_Class {

public static WebDriver driver;

@SuppressWarnings("deprecation")
@BeforeTest
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\hm1Q2JavaBasics\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.statefarm.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		}

@AfterTest
public void closingbrowsers() {
	driver.quit();
}
}
