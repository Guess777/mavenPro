package shekharsPro.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private WebElement logoImg;

	public WebElement getLogoImg() {
		return logoImg;
	}
	
	
	
}
