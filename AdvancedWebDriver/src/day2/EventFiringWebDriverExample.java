package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import mylib.MyWebDriver;
import mylib.MyWebDriverListner;

public class EventFiringWebDriverExample {

	public static void main(String[] args)
	
	{
		EventFiringWebDriver oEventDriver;
		
		MyWebDriver oBrowser;
		
		MyWebDriverListner oListener;
		
		oBrowser =  new MyWebDriver();
		
		oBrowser.openChromeBrowser();
		
		oEventDriver = new EventFiringWebDriver(oBrowser.getDriver());
		oListener = new MyWebDriverListner();
		oEventDriver.register(oListener);
		
		oEventDriver.get("http://www.w3schools.com");
		oBrowser.waitforseconds(5L);
		
		oEventDriver.findElement(By.linkText("LEARN HTML")).click();
		oBrowser.waitforseconds(5L);
		
		oBrowser.closeAllBrowser();
		
		
		

	}

}
