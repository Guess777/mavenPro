package shekharsPro;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import shekharsPro.POM.HomePage;
import shekharsPro.Utility.BaseClass;

public class SeleniumTest extends BaseClass{
	
	HomePage home=PageFactory.initElements(driver, HomePage.class);

	@Test
	public void browserAutomation() {
		home.getLogoImg();
		
	}
}
