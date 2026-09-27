package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Five 
{
	@Test
	public void method1()
	{
		System.out.println("TestCase1");
	}
	
	
	@BeforeMethod					//bodyguard1 for every @test
	public void bm()
	{
		System.out.println("bm");
	}
	
	
	@AfterMethod					//bodyguard2 for every @test
	public void am()
	{
		System.out.println("am");
	}
	
	@Test
	public void method2()
	{
		System.out.println("TestCase2");
	}
}
