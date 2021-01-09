package dataprovider_Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Lis implements ITestListener {

	One objc = new One();
	
	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		try {
			objc.failScreenShot(result.getName());
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
