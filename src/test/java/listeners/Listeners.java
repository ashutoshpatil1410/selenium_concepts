package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{

	//When you implement methods then methods should be public
	public void onStart(ITestContext context) 
	{
	    System.out.println("This is onStart method");
	}
	
	public void onTestStart(ITestResult result) 
	{
	    System.out.println("This is onTestStart method");
	}

	public void onTestSuccess(ITestResult result) 
	{
	    System.out.println("This is onTestSuccess methd");
	}
	
	public void onTestFailure(ITestResult result) 
	{
	    System.out.println("This is onTestFailure method");
	}
	
	public void onTestSkipped(ITestResult result) 
	{
	   System.out.println("This is onTestSkipped method");
	}
	
	public void onFinish(ITestContext context) 
	{
	   System.out.println("This is onFinish method");
	}
	
}
