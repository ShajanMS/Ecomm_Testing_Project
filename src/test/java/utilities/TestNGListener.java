package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import tests.BaseTest;

public class TestNGListener implements ITestListener {
	
	ExtentSparkReporter sparkReporter;
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		extentTest = extentReports.createTest("Verify the Test cases" + result.getMethod().getMethodName());
		System.out.println("Test Started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		extentTest.log(Status.PASS, "Testcases are Passed");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		String testCaseName = result.getMethod().getMethodName();
		
		String path = BaseTest.takeScreenshots(testCaseName);
		
		extentTest.log(Status.FAIL, "Testcases are Failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}
	
	@Override
	public void onStart(ITestContext context) {
		
	extentReports = new ExtentReports();
	
	sparkReporter = new ExtentSparkReporter("ExtendReport/Extend.html");
	
	extentReports.attachReporter(sparkReporter);
	
	sparkReporter.config().setDocumentTitle("Regression Test");
		
	}
	
	@Override
	
	public void onFinish(ITestContext context) {
		
		extentReports.flush();
		
	}

}
