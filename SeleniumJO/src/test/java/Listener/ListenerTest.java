package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	
	// 콘솔에 어떻게 나오는지 설정 하는 곳, 자동화 코드 자체와는 연관 없음 
	// 단, tearDown이 Success 유무에 따라 동작 함 

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
