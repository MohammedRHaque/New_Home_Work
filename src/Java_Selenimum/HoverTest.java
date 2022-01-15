package Java_Selenimum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest {

	WebDriver driver = new ChromeDriver();
	@Test(enabled = true, priority = 0)
	public void mouseHoverActionOnOurLocations() throws InterruptedException {
	Actions actions = new Actions(driver);
		WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
		Thread.sleep(2000);
		actions.moveToElement(ourLocations).build().perform();
		Thread.sleep(6000);	
	}

}
