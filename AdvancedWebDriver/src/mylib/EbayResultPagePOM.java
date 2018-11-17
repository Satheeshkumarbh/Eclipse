package mylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayResultPagePOM 
{

	public WebElement oSearchCount;
	
	public EbayResultPagePOM(WebDriver driver)
	
	{
		oSearchCount = driver.findElement(By.className("listingscnt"));
	}
}
