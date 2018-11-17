package day1;

import org.openqa.selenium.By;

import mylib.MyWebDriver;

public class mywebdriverdemo2 
{

	public static void main(String[] args) 
	{
		MyWebDriver oBrowser;
		
		oBrowser = new MyWebDriver();
		
		oBrowser.Openfirefoxbrowser();
		//oBrowser.openIEBrowser();
		//oBrowser.openChromeBrowser();
		oBrowser.navigateToURL("http://www.ebay.in");
		oBrowser.wait_TillPageLoads(60L);
		
		oBrowser.setText(By.id("gh-ac"), "iWatch");
		oBrowser.selectItem(By.id("gh-cat"), "Watches");
		oBrowser.click(By.id("gh-btn"));
		oBrowser.closeCurrentBrowser();
		
		System.out.println("Count = " + oBrowser.getText(By.className("listingscnt")));
		
	}
}

