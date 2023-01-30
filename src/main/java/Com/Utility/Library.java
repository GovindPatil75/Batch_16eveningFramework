package Com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Library {

	// Sendkeys 
	public static void custom_Sendkeys(WebElement element,String value) {
		try {
		  element.sendKeys(value);
		  
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	} 
	
	//click
	public static void custom_click(WebElement element) {
		
		try {
			element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Alert
	public static Alert HandleAlert(WebDriver driver) {
		
		return driver.switchTo().alert();
	}
	
	
	
	
}
