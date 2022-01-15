package state.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayaBill {

	@FindBy(xpath = "//span[text()='Pay a Bill']")
	public WebElement paybillElement;
	
	public PayaBill(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void PayaBillClick() {
		paybillElement.click();
		
	}


}
