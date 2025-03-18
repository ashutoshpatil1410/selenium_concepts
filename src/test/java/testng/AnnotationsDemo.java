package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo 
{
	@BeforeSuite
	void beforesuite()
	{
		System.out.println("This is before suite");
	}
	
	@BeforeTest
	void beforetest()
	{
		System.out.println("This is before Test");
	}
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("This is beforeclass");
	}
	
	@BeforeMethod
	void beforemethod()
	{
		System.out.println("This is beforeMethod");
	}
	@Test
	void Test1()
	{
		System.out.println("This is test1");
	}
	
	@Test
	void Test2()
	{
		System.out.println("This is test2");
	}
	
	@AfterMethod
	void aftermethod()
	{
		System.out.println("This is aftermethod");
	}
	@AfterClass
	void afterclass()
	{
		System.out.println("This is afterclass");
	}
	@AfterTest
	void aftertest()
	{
		System.out.println("This is aftertest");
	}
	@AfterSuite
	void aftersuite()
	{
		System.out.println("This is aftersuite");
	}
	
}
