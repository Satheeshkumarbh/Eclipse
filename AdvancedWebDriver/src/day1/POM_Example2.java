package day1;


import mylib.EbayHomePagePOM2;
import mylib.EbayResultPagePOM;
import mylib.MyWebDriver;

public class POM_Example2 

{

	public static void main(String[] args) 
	{
		MyWebDriver oBrowser;
		EbayHomePagePOM2 oHomepage;
		EbayResultPagePOM oResultpage;
		
		oBrowser = new MyWebDriver();
		oBrowser.openChromeBrowser();
		
		oBrowser.navigateToURL("http://www.ebay.in");
		oBrowser.wait_TillPageLoads(15L);
		
		oHomepage = new EbayHomePagePOM2(oBrowser.getDriver());
		oHomepage.Search_Product("Titan", "watches");
		
		
		oBrowser.wait_TillPageLoads(60L);
		oResultpage = new EbayResultPagePOM(oBrowser.getDriver());
		System.out.println("Count = "+ oResultpage.oSearchCount.getText());
		
		
		oBrowser.closeAllBrowser();
	}

}
