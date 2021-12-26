package homeWorkOctober2021;

public class Html_tag {

	
	/*	
	 
	        source
		    https://www.amazon.com/
			From  search Box >>
			Example:
			//input[@id='twotabsearchtextbox']
			(this 1 of 1 unique, as id always Unique)

			source 
			https://www.amazon.com/
			 amazon logo >>
			Example:
			//a[@class='nav-logo-link nav-progressive-attribute']
			 
			 source 
			 https://www.amazon.com/AmazonBasics-Wireless-Control-Digital-specific/dp/B00BCEJ0E0/?_encoding=UTF8&pd_rd_w=XzHa2&pf_rd_p=d6b01961-0cda-4dec-abea-1aad33129038&pf_rd_r=T5R6GXQRRQ2S1TBP34FS&pd_rd_r=646cf692-b504-43f4-9e2a-14fa2d6d7ab7&pd_rd_wg=FSYet&ref_=pd_gw_unk&th=1
			 Under "About this item"  if we Inspect this below line 
			 Only compatible with the following  >>
			 Example:
		     //span[contains(text(), 'compatible with the following ')]   	
		       
			source
			https://www.mountsinai.org/
			Patient Care >>
			Example
			//a[normalize-space(text())='Patient Care' and @class='hidden-xs dropdown']
			  or //a[normalize-space(text())='Patient Care'][1]
			
			https://www.amazon.com/
			Deal of the Day >>
			Example:
			//h2[starts-with(@class, 'a-color-base headline truncate-1line gwm-u-blackjack-typography')]   
	
	*/

}
