package shekharsPro.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	
	public static ExtentReports getReport()
	{
		
		String epath=System.getProperty("user.dir")+"\\Report\\index.html";
		System.out.println(epath);
		ExtentSparkReporter repo=new ExtentSparkReporter(epath);
		
		repo.config().setDocumentTitle("Amazon Automation");
		repo.config().setReportName("Shekhar's");
		repo.config().setTheme(Theme.DARK);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(repo);
		
		extent.setSystemInfo("Project Name", "Amazon");
		extent.setSystemInfo("Project Owner", "Tirmale");
		extent.setSystemInfo("Testr", "Chandrashekhar");
		return extent;
		
	}

}
