package day1;

import mylib.EbayHomePagePOM1;
import mylib.EbayResultPagePOM;
import mylib.MyWebDriver;

public class POM_Example1 

{

	public static void main(String[] args) 
	{
		MyWebDriver oBrowser;
		EbayHomePagePOM1 oHomepage;
		EbayResultPagePOM oResultpage;
		
		oBrowser = new MyWebDriver();
		oBrowser.openChromeBrowser();
		
		oBrowser.navigateToURL("http://www.ebay.in");
		oBrowser.wait_TillPageLoads(15L);
		
		oHomepage = new EbayHomePagePOM1(oBrowser.getDriver());
		oHomepage.oSearchTextBox.sendKeys("iWatch");
		oHomepage.oCatergoryListbox.selectByVisibleText("Watches");
		oHomepage.oSearchButton.click();
		
		oBrowser.wait_TillPageLoads(60L);
		oResultpage = new EbayResultPagePOM(oBrowser.getDriver());
		System.out.println("Count = "+ oResultpage.oSearchCount.getText());
		
		
		oBrowser.closeAllBrowser();
	}

}
