package day1;

import org.openqa.selenium.By;

import mylib.MyWebDriver;

public class mywebdriverdemo3 
{

	public static void main(String[] args) 
	{
		MyWebDriver oBrowser;
		
		oBrowser = new MyWebDriver();
		
		//oBrowser.Openfirefoxbrowser();
		//oBrowser.openIEBrowser();
		oBrowser.openChromeBrowser();
		oBrowser.navigateToURL("http://www.w3schools.com");
		oBrowser.wait_TillPageLoads(60L);
		
		
		oBrowser.click(By.linkText("LEARN HTML"));
		oBrowser.wait_TillPageLoads(60L);
		oBrowser.click(By.linkText("Next Chapter »"));
		oBrowser.wait_TillPageLoads(60L);
		oBrowser.savePageSnapshot("C:\\Work\\Snap1.jpg");
		
		oBrowser.closeCurrentBrowser();
		
		System.out.println("Count = " + oBrowser.getText(By.className("listingscnt")));
		
	}
}

