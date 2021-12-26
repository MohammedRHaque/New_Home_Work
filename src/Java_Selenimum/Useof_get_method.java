package Java_Selenimum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useof_get_method {

	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\hm1Q2JavaBasics\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("https://www.amazon.com");
    Thread.sleep(3000);
	
}
	
}

	



