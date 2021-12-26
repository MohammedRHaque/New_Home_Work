package homeWorkOctober2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class Click_method_use_testNG {

	 WebDriver driver;
	
	@BeforeTest
	public void setup () throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\moham\\eclipse-workspace\\hm1Q2JavaBasics\\drivers\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
	}
		
		@Test
		public void submitbutton () throws InterruptedException {
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(4000);
			
		}
		
		@AfterTest
		public void tearUp() {
			driver.quit ();
		}
		
	}

 
