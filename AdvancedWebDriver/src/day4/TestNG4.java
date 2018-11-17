package day4;

import org.junit.Assert;
import org.testng.annotations.Test;



public class TestNG4 
{
	
	@Test(enabled=false)
	
	public void t1()
	{
		System.out.println("t1...");
		
		
	}
	@Test
	public void t2()
	{
		System.out.println("t2...");
		Assert.assertEquals(10, 11);
		
	}
	@Test
	public void t3()
	{
		System.out.println("t3...");
		Assert.assertTrue("10>50 is not valid",10>5);
		
	}
	@Test
	public void t4()
	{
		System.out.println("t4...");
		
	}

}
