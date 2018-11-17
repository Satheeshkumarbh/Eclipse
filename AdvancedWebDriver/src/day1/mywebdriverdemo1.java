package day1;

import mylib.MyWebDriver;

public class mywebdriverdemo1 
{

	public static void main(String[] args) 
	{
		MyWebDriver oBrowser;
		
		oBrowser = new MyWebDriver();
		
		//oBrowser.Openfirefoxbrowser();
		//oBrowser.openIEBrowser();
		oBrowser.openChromeBrowser();
		oBrowser.navigateToURL("http://www.seleniumhq.org");
		oBrowser.waitforseconds(3L);
		oBrowser.savePageSnapshot("C:\\Work\\Snap.jpg");
		
		oBrowser.scrollPageTo(0, 1000);
		oBrowser.waitforseconds(3L);
	
		oBrowser.scrollPageTo(0, 2000);
		oBrowser.waitforseconds(3L);
		
		oBrowser.closeCurrentBrowser();

	}

}
