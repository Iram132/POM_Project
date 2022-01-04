package util;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Testcase started and details are " + result.getName());
		}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase succeded and details are " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed and details are " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped and details are " + result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


	}
	
	

