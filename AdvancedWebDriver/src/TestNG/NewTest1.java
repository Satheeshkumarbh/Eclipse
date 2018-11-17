package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 {

@BeforeClass //which executes once in a run
	public void login()
	{
		System.out.println("login successful");
	}
@AfterClass	//which executes once in a run
	public void logut()
	{
		System.out.println("logout successful");
	}
@Test
	public void addVendor()
	{
		System.out.println("vendor added successful");
	}
@Test
	public void addAddress()
	{
		System.out.println("Address added successful");
	} 
}
