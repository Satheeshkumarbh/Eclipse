package day2;

import mylib.MyWebDriver;

public class PortableDemo 

{

	public static void main(String[] args)
	
	{
		MyWebDriver oBrowser;
		
		oBrowser = new MyWebDriver();
		oBrowser.openChromeBrowser();
		
		if (args.length ==0)
		{
		oBrowser.navigateToURL("http://www.seleniumhq.org");
		}
		else
		{
			oBrowser.navigateToURL(args[0]);
		}
		oBrowser.waitforseconds(2L);
		System.out.println("Title="+oBrowser.getDriver().getTitle());
		oBrowser.closeAllBrowser();
	}
	
	
}
