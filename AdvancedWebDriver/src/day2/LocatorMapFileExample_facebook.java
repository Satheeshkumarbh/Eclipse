package day2;

import java.util.Properties;

import org.openqa.selenium.By;

import mylib.CommonTools;
import mylib.MyWebDriverWithProperties;

public class LocatorMapFileExample_facebook 

{

	public static void main(String[] args) 
	{
	
		Properties oLocatorProperties;
		MyWebDriverWithProperties oBrowser;
		
		By oBy;
	
		oLocatorProperties = CommonTools.getProperties("FacebookLocators.properties");
		oBrowser =  new MyWebDriverWithProperties();
		oBrowser.Openfirefoxbrowser();
		oBrowser.navigateToURL("https://www.facebook.com/?_rdr=p");
		oBrowser.wait_TillPageLoads(30L);
		
		//oBrowser.setText(By.id("gh-ac"), "Rado Watch");
		
		oBy = CommonTools.getByObject(oLocatorProperties.getProperty("logintextbox"));
		oBrowser.setText(oBy, "user@someserver.com");
		
		oBy = CommonTools.getByObject(oLocatorProperties.getProperty("passwordtextbox"));
		oBrowser.setText(oBy, "123456");
		
		
		oBy = CommonTools.getByObject(oLocatorProperties.getProperty("loginbutton"));
		oBrowser.click(oBy);
		
		oBrowser.wait_TillPageLoads(30L);
		
		oBy = CommonTools.getByObject(oLocatorProperties.getProperty("errorframe"));
		System.out.println("Error="+oBrowser.getText(oBy));
		
		oBrowser.waitforseconds(3L);
		
		oBrowser.closeAllBrowser();
	}

}
