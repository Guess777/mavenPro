package shekharsPro.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public void IsDisplayed(WebElement element,String feildName)
	{
		
		try {
			element.isDisplayed();
			test.log(Status.PASS, feildName+" is Displayed");
			
		} catch (Exception e) {
			test.log(Status.FAIL, feildName+" is not Displayed");
		}
		
	}

}
