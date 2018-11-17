package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	 
	public void testcase1()
	{
		long id = Thread.currentThread().getId();
		System.out.println("testcase1 successful:thread id"+id);
	}

	public void testcase2()
	{
		long id = Thread.currentThread().getId();
		System.out.println("testcase2 successful :thread id"+id);
	}

	public void testcase3()
	{
		long id = Thread.currentThread().getId();
		System.out.println("testcase3 successful:thread id"+id);
	}
}
