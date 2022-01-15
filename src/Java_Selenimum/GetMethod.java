package Java_Selenimum;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetMethod {
	public class D05_use_of_getAttribute_method {
		WebDriver driver;

		@BeforeTest
		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\moham\\eclipse-workspace\\hm1Q2JavaBasics\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://portaldev.cms.gov/portal/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				}
		
		
		@Test(enabled = true, priority = 0)
		public void getAttributeTest() {
			String value1 = driver.findElement(By.xpath("//a[text()='New User Registration']")).getAttribute("id");
			String value2 = driver.findElement(By.xpath("//a[text()='New User Registration']")).getAttribute("href");
			System.out.println("The value of the specific attribute is: "+value1);
			System.out.println("The value of the specific attribute is: "+value2);
		}

		@AfterTest
		public void tearUp() {
			driver.close();
		}

	}

}