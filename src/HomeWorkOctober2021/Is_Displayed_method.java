package homeWorkOctober2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Java_Selenimum.IsDisplayed_method;

public class Is_Displayed_method {

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
			public void isdisplayed ( ) throws InterruptedException {
			boolean elementDisplayed =driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();
			System.out.println("THis is :" + elementDisplayed);
			Thread.sleep(3000);
			}
			
			@AfterTest
			public void tearUp() {
				driver.quit ();
				
			}
			
}
