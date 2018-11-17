package day4;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import mylib.FrameworkActionLibrary;


public class TestNGWebDriver01 
{
	private FrameworkActionLibrary oBrowser;
	
	//--------
	@BeforeClass
	public void Automation_Init()
	{
		try
		{
			oBrowser=new FrameworkActionLibrary("FrameInput.properties");
			oBrowser.openfirefoxbrowser();
			oBrowser.navigateToURL("http://www.google.co.in");
			oBrowser.wait_TillPageLoads(5L);
		}
		catch(Throwable t)
		{
		 Assert.fail(t.getMessage(),t);
		}
	
	}
	//------------------------------
	@AfterClass
	public void Automation_End()
	{
		try
		{
			oBrowser.closeAllBrowser();
		}
		catch(Throwable t)
		{
		 Assert.fail(t.getMessage(),t);
		}
	
	}
	//-------------------------------------------------
	
	@Test(priority=1)
	public void Validation_Title()
	{
		try
		{
			String sExpected, sActual;
			
			sExpected="Google";
			sActual=oBrowser.getDriver().getTitle();
			Assert.assertEquals(sActual, sExpected);
		}
		catch(Throwable t)
		{
		 Assert.fail(t.getMessage(),t);
		}
	
	}
	
	
	
	
}
