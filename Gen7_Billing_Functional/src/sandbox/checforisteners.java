package sandbox;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class checforisteners implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		
	}

	@Override
	public void onStart(ITestContext result) {
			
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed. Details : "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped. Details : "+result.getName());	
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Case Started. Details : "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case Passed. Details : "+result.getName());
		
	}

}
