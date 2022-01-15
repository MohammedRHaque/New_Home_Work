package state.base;

import state.webpage.Investment;
import state.webpage.PayaBill;

public class Test extends Base_Class{

	@org.testng.annotations.Test(priority = 2)
	public void InvestmentTest() throws InterruptedException {
		Investment   iv = new Investment (driver);
		iv.investmentClick();
		Thread.sleep(3000);
	
	}
	
	@org.testng.annotations.Test (priority =1)
	public void paybillTest () throws InterruptedException {
		PayaBill pBill = new PayaBill(driver);
		pBill.PayaBillClick();
		Thread.sleep(3000);
	}
}

