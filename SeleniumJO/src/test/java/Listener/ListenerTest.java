package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	
	
	// Singatory 서명 요청자 : On/Off Case 2개씩  필요 
	
	// Document - Document sign on/off 각 2개씩 
	
	// Documet validation 하나 필요 
	
	// 총 5개 필요 

	@Override
	public void onFinish(ITestContext Result) {

	}

	@Override
	public void onStart(ITestContext Result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {

	}

	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println(Result.getName() + " = Fail");
	}

	@Override
	public void onTestSkipped(ITestResult Result) {
		System.out.println(Result.getName() + " = Skip");
	}

	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println((Result.getName() + " Test Start"));
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println((Result.getName() + " = Pass"));
	}

}
