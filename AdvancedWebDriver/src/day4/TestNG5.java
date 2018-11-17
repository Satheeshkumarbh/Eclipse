package day4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG5 
{
	
	@Test
	
	public void t4()
	{
		System.out.println("t4...");
		
	}
	@BeforeMethod
	public void MethodSetup()
	{
		System.out.println("MethodSetup...");
		
	}
	@AfterMethod
	public void MethodTearDown()
	{
		System.out.println("MethodTearDown...");
		
	}
	
	@BeforeClass
	public void ClassSetup()
	{
	System.out.println("ClassSetup...");
	
	}
	@AfterClass
	public void ClassTearDown()
	{
	System.out.println("ClassTearDown...");
	
	}

}
