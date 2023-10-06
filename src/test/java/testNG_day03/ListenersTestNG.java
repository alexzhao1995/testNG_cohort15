package testNG_day03;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	@Override
	public void onStart(ITestContext context) { // will only run once at start
		System.out.println("onStart");
		ITestListener.super.onStart(context);
	}

	@Override
	public void onTestStart(ITestResult result) { // will only run at start of each tests
		System.out.println("onTestStart");
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) { // will only run if test is successful
		System.out.println("onTestSuccess");
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) { // will only run if test fails
		System.out.println("onTestFailure");
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onFinish(ITestContext context) { // will only run once at end
		System.out.println("onFinish");
		ITestListener.super.onFinish(context);
	}

}
