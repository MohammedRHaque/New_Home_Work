package Java_Selenimum;
public class Useof_get_method {

	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
    driver.manage().window().maximize();
    driver.manage().deleteallcockies();
    driver.get("https://www.amazon.com")
    Thread.sleep(3000);
	
}
	
}

	



