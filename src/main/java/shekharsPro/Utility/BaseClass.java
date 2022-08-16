package shekharsPro.Utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigdataProvider config;
	
	
	@BeforeSuite
	public void SetUp() throws IOException
	{
		
		excel= new ExcelDataProvider();
		config= new ConfigdataProvider();
	}
	
	@Parameters({"BrowserName"})
	@BeforeTest
	public void StartUp(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions option=new ChromeOptions();
			option.addArguments("start-maximized");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(option);
			
		}
			driver.get(config.getBaseUrl());
		
		
		
		
		
	}
	

}
