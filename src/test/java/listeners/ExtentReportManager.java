package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkreporter;//Ui of the report
    public ExtentReports extentreports;//common info
    public ExtentTest test;
	public void onStart(ITestContext context) 
	{
	    sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Myreport.html");
	    sparkreporter.config().setDocumentTitle("AutomationReport");
	    sparkreporter.config().setReportName("Functional");
	    sparkreporter.config().setTheme(Theme.STANDARD);
	    
	    extentreports=new ExtentReports();
	    extentreports.setSystemInfo("Tester", "Ashutosh");
	    extentreports.setSystemInfo("Browser","Edge");
	    extentreports.setSystemInfo("OS", "Windows");
	    
	    extentreports.attachReporter(sparkreporter);//Attach the report 
	      
	}
	

	public void onTestSuccess(ITestResult result) 
	{
		test=extentreports.createTest(result.getName());
		test.log(Status.PASS, "Test case passed is"+result.getName());
	}
	
	public void onTestFailure(ITestResult result) 
	{
	    test=extentreports.createTest(result.getName());
	    test.log(Status.FAIL, "Test case failed is"+result.getName());
	    test.log(Status.FAIL, "Test case failed cause is"+result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) 
	{
	   test=extentreports.createTest(result.getName());
	   test.log(Status.SKIP, "Test case skip is"+result.getName());
	}
	
	public void onFinish(ITestContext context) 
	{
	   extentreports.flush();
	}
}
