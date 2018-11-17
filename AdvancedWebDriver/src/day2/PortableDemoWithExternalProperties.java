package day2;

import java.io.File;

import mylib.MyWebDriverWithProperties;

public class PortableDemoWithExternalProperties 

{

	public static void main(String[] args)
	
	{
		try
		{
			
			MyWebDriverWithProperties oBrowser;
			
			String sFilename;
			
		if(args.length ==0)
		{
			throw new Exception("Property file input argument is missing...");
		}
	sFilename = args[0];
	
	if (!(new File(sFilename)).exists())
	{
		throw new Exception("Specified Property file not found! File="+ sFilename);
	}
		oBrowser=new MyWebDriverWithProperties(sFilename);
		oBrowser.openChromeBrowser();
		oBrowser.navigateToURL(oBrowser.oProperties.getProperty("url"));
		oBrowser.waitforseconds(3L);
		System.out.println("Title="+oBrowser.getDriver().getTitle());
		oBrowser.closeAllBrowser();
		}
		catch(Exception e)
		{
			System.err.println("Exception="+e.getMessage());
			
		}
	}
	
	
}
