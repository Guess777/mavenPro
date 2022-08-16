package shekharsPro.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class Listner  implements ITestListener{
	
	ExtentReports extent=ExtentReportGenrator.getReport();
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getClass().getName()+"=="+result.getMethod().getMethodName());
		extentTest.set(Library.test);
		
	
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		extentTest.get().log(Status.PASS, "Pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().log(Status.FAIL, "fail");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.PASS, "Skip");
	}
	@Override
	public void onFinish(ITestContext context) {
	extent.flush();
	}
	
	
	

}
