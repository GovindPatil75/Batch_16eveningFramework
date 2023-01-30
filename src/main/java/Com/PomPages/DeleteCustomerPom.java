package Com.PomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeleteCustomerPom {

	
	@FindBy(how=How.XPATH,using="//input[@name='cusid']") private WebElement txt_customerId;
	
	@FindBy(how=How.XPATH,using="//input[@name='submit']") private WebElement submit;
	
	@FindBy(how=How.XPATH,using="//input[@name='res']") private WebElement Reset;
	
	public WebElement gettxt_customerId() {
		return txt_customerId;
	}
	
	public WebElement getsubmit() {
		return submit;
	}
	
	public WebElement getReset() {
		return Reset;
	}
}
