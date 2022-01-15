package state.webpage;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Investment {

	@FindBy(xpath = "//span[text()='Investments']")
	public WebElement investmentElement;
	
	public Investment(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
    public void investmentClick() {
    	investmentElement.click();
    }

	}



//@FindBy(xpath = "//span[text()='Banking']")
//public WebElement bankingElement;
//
//public Banking(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//}
//
//public void bankingClick() {
//	bankingElement.click();
//}
