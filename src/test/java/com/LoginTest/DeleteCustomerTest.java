package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.PomPages.DeleteCustomerPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;

public class DeleteCustomerTest extends BaseClass{
	
	
	@Test
	public void verifyDeleteCustomer_TC_001() throws Exception {
		
		DeleteCustomerPom deletepom=PageFactory.initElements(driver, DeleteCustomerPom.class);
		
		Library.custom_Sendkeys(deletepom.gettxt_customerId(), "1234");
		Library.custom_click(deletepom.getsubmit());
		
		String Alert_text=Library.HandleAlert(driver).getText();
		System.out.println(Alert_text);
		
		Library.HandleAlert(driver).accept();
		
		Thread.sleep(2000);
		
		String childAlerttxt=Library.HandleAlert(driver).getText();
		System.out.println(childAlerttxt);
		
		Assert.assertEquals(childAlerttxt, "Customer Successfully Delete");
		Library.HandleAlert(driver).accept();
		
	}

}
