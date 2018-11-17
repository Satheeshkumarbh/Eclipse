package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class NewTest2 {

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
	public void deleteVendor()
	{
		System.out.println("vendor deleted successful");
	}
@Test
	public void deleteAddress()
	{
		System.out.println("Address deleted successful");
	} 
}
