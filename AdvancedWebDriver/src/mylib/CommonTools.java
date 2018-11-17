package mylib;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;

public class CommonTools 

{

	
	//----------------------------------------------------------------------
	
	public static Properties getProperties(String sPropertyFile)
	{
		try
		{
			
			Properties oProperties;
			
			oProperties = new Properties();
			oProperties.load(new FileInputStream(sPropertyFile));
			return oProperties;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		
		}
		
	}
	
	//----------------------------------------------------------------------
	public static By getByObject(String sLocatorString)
	{
		try
		{
			
			String[] arrLocatorParts;
			String sLocatorType, sLocatorValue;
			
			if (!sLocatorString.contains(":="))
			{
				throw new Exception("Invalid locator.':=' is missing...");
			
				
			}
			
			arrLocatorParts = sLocatorString.split(":=");
			sLocatorType = arrLocatorParts[0].toLowerCase();
			sLocatorValue = arrLocatorParts[1];
			
			if (sLocatorType.equals("id"))
				
			{
				return By.id(sLocatorValue);
			}
			if (sLocatorType.equals("css"))
				
			{
				return By.cssSelector(sLocatorValue);
				
			}
			if (sLocatorType.equals("xpath"))
				
			{
				return By.xpath(sLocatorValue);
				
			}
			if (sLocatorType.equals("classname"))
				
			{
				return By.className(sLocatorValue);
				
			}
			
			if (sLocatorType.equals("tagname"))
				
			{
				return By.tagName(sLocatorValue);
				
			}
			if (sLocatorType.equals("linktext"))
				
			{
				return By.linkText(sLocatorValue);
				
			}
			
			if (sLocatorType.equals("partiallinktext"))
				
			{
				return By.partialLinkText(sLocatorValue);
				
			}
			
			throw new Exception("Invalid Locator tyepe = "+sLocatorType);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		
		}
		
	}
	
	//----------------------------------------------------------------------
	
	public static String getDateTimeStamp()
	
	{
		Date oDate = new Date();
		String sDateString = oDate.toString();
		String[] arrDateParts;
		String sStamp;
		
		sDateString = sDateString.replace(":", "_");
		arrDateParts =sDateString.split(" ");
		
		 sStamp=arrDateParts[5]+"_"+
				arrDateParts[1]+"_"+
						arrDateParts[2]+"_"+
								arrDateParts[3]+"_"+
										arrDateParts[4];
		 
		 return sStamp;
	}
	
	//----------------------------------------------------------------------
	
	
	//----------------------------------------------------------------------
	
	
	//----------------------------------------------------------------------
	
	//----------------------------------------------------------------------
	
	
	//----------------------------------------------------------------------
	
	//----------------------------------------------------------------------
	
	
	//----------------------------------------------------------------------
	
	
	//----------------------------------------------------------------------
	
	
	//----------------------------------------------------------------------
}
