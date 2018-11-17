package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxDemo 
{

	public static void main(String[] args)
	{
		WebDriver oBrowser;
		String sURL="http:\\www.seleniumhq.org";
		
		oBrowser = new FirefoxDriver();
		oBrowser.manage().window().maximize();
		
		oBrowser.get(sURL);;
		oBrowser.quit();

	}

}
