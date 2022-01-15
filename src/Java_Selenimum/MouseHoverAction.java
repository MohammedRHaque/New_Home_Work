package Java_Selenimum;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHoverAction {
	

	private static final TimeUnit SECONDS = null;
	public static WebDriver driver;
	
	@BeforeTest
		public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\moham\\eclipse-workspace\\hm1Q2JavaBasics\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.mountsinai.org/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(2,SECONDS);
			}
	
	@Test(enabled = true, priority = 1)
	public void mouseHoverActionOnOurLocations() throws InterruptedException {
	Actions actions = new Actions(driver);
		WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
		Thread.sleep(2000);
		actions.moveToElement(ourLocations).build().perform();
		Thread.sleep(2000);	
	}
	
	
	@AfterTest
	public void closingbrowser (){
		driver.quit();
	}
	
	
}

