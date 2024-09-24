package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport extends BaseTest {
	
	ExtentSparkReporter sparkReporter;
	ExtentReports extentReports;
	ExtentTest extentTest;
	
	@BeforeTest
	
	public void startReport() {
		
	}
	
	@Test
	
	public void test() throws IOException {
		
		extentTest.log(Status.PASS, "TestCase Passed");
	}
	
	@AfterMethod 
	
	public void afterMethod() {
		
		String path = BaseTest.takeScreenshots("test");
		
		extentTest.addScreenCaptureFromPath(path);
		
		extentTest.fail("TestCase Failed");
			
	}
	
	@AfterTest 
	
	public void endReport() {
		
		extentReports.flush();
	}
}
