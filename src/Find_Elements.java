import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Find_Elements {

	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\hm1Q2JavaBasics\\drivers\\chromedriver.exe");
		driver.get("https://www.mountsinai.org/");
		driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	}
	
	@Test(enabled=true, priority=1)
	public void mouseHoverActionOnOurLocations () throws InterruptedException  {
		Actions actions = new Actions(driver);
		WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Find a Doctor' and @class='hidden-xs dropdown']"));
		Thread.sleep(5000);
		actions.moveToElement(ourLocations).build().perform();
		Thread.sleep(5000);
		System.out.println("The text of this Webelement is "+ ourLocations.getText());
		
	}
	
	@AfterTest()
	public void closebrowser() {
    driver.close();
		
	}
}
