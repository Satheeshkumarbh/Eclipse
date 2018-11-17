package day4;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import mylib.FrameworkActionLibrary;


public class TestNGWebDriver2 
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
			
			sExpected="Selenium";
			sActual=oBrowser.getDriver().getTitle();
			Assert.assertTrue(sActual.contains(sExpected), "Invalid title..");
		}
		catch(Throwable t)
		{
		 Assert.fail(t.getMessage(),t);
		}
	
	}
	
	
//----------------------
	
	
	@Test(priority=2)
	public void Validation_DownloadLinkExistance()
	{
		try
		{
			oBrowser.getDriver().findElement(By.linkText("Download"));
		}
		
		catch(Throwable t)
		{
		 Assert.fail(t.getMessage(),t);
		}
	
	}
	
	//--------------------------------------------------
	
	@Test(priority=3)
	public void Functionality_SearchText()
	{
		try
		{
			oBrowser.setText("id:=q", "Grid");
			oBrowser.click("id:=submit");
			oBrowser.waitforseconds(4L);
			
			String sText;
			sText= oBrowser.getText("className:=gsc-above-wrapper-area");
			System.out.println("Result="+sText);
			Reporter.log("Result="+sText);
		}
		
		catch(Throwable t)
		{
		 Assert.fail(t.getMessage(),t);
		}
	
	}
	
}
