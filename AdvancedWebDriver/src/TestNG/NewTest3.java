package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest3 {
	
@BeforeGroups(groups = {"sanity","regression"}) //@Test(groups = {"sanity","regression"},priority =1) 
	public void login()
	{
		System.out.println("login successful");
	}
@AfterGroups(groups = {"sanity","regression"})
	public void logut()
	{
		System.out.println("logout successful");
	}
@Test(groups = {"sanity","regression"},priority =2)
	public void fundTransfer()
	{
		System.out.println("fund Transfer successful");
	}
@Test(groups = {"sanity"},priority =3)
	public void balance()
	{
		System.out.println("Balance check successful");
	} 

@Test(groups = {"regression"},priority =4)
	public void withdrawl()
	{
	System.out.println("withdrawl successful");
	}
@Test(groups = {"regression"},priority =5)
	public void fundreceive()
	{
		System.out.println("fundreceive successful");
	} 

@Test(groups = {"sanity"},priority =6)
	public void Recharge()
	{
	System.out.println("Recharge successful");
	} 
} 

