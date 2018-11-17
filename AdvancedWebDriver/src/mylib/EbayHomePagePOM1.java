package mylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePagePOM1 
{
	public WebElement oSearchTextBox, oSearchButton;
	private WebElement oElement;
	
	public Select oCatergoryListbox;
	
	public EbayHomePagePOM1(WebDriver driver)
	
	{
		oSearchTextBox = driver.findElement(By.id("gh-ac"));
		oSearchButton = driver.findElement(By.id("gh-btn"));
		
		oElement = driver.findElement(By.id("gh-cat"));
		oCatergoryListbox = new Select(oElement);
		
	}
	

}