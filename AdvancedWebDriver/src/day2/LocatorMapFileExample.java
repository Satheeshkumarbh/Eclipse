package day2;

import java.util.Properties;

import org.openqa.selenium.By;

import mylib.CommonTools;
import mylib.MyWebDriverWithProperties;

public class LocatorMapFileExample {

	public static void main(String[] args) 
	{
	
		Properties oLocatorProperties;
		MyWebDriverWithProperties oBrowser;
		
		By oBy;
	
		oLocatorProperties = CommonTools.getProperties("EbayLocators.properties");
		oBrowser =  new MyWebDriverWithProperties();
		oBrowser.openChromeBrowser();
		oBrowser.navigateToURL("http://www.ebay.in");
		oBrowser.wait_TillPageLoads(30L);
		
		//oBrowser.setText(By.id("gh-ac"), "Rado Watch");
		
		oBy = CommonTools.getByObject(oLocatorProperties.getProperty("searchtextbox"));
		oBrowser.setText(oBy, "Rado Watch");
		
		oBy = CommonTools.getByObject(oLocatorProperties.getProperty("categorylistboxpass"));
		oBrowser.selectItem(oBy, "Watches");
		
		
		oBy = CommonTools.getByObject(oLocatorProperties.getProperty("searchbutton"));
		oBrowser.click(oBy);
		
		oBrowser.wait_TillPageLoads(30L);
		
		oBy = CommonTools.getByObject(oLocatorProperties.getProperty("searchcount"));
		System.out.println("Count="+oBrowser.getText(oBy));
		
		oBrowser.waitforseconds(3L);
		
		oBrowser.closeAllBrowser();
	}

}
