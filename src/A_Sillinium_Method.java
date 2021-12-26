import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Sillinium_Method {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome,driver", "C:\\Users\\moham\\eclipse-workspace\\hm1Q2JavaBasics\\driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("www.facebook.com");
		
	}

}
