package Java_Selenimum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class getURL {
	WebDriver driver;
	

	@BeforeTest
	public void setUp()  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\moham\\eclipse-workspace\\hm1Q2JavaBasics\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portaldev.cms.gov/portal/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		}
	
	@Test(enabled = true, priority = 1)
	public void currentURLTest() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Help']")).click();
		Thread.sleep(5000);
		System.out.println("The Current URL is: "+driver.getCurrentUrl());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
