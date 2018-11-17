package mylib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayHomePagePOM2 
{
	private WebElement oSearchTextBox, oSearchButton;
	private WebElement oElement;
	
	private Select oCatergoryListbox;
	
	public EbayHomePagePOM2(WebDriver driver)
	
	{
		oSearchTextBox = driver.findElement(By.id("gh-ac"));
		oSearchButton = driver.findElement(By.id("gh-btn"));
		
		oElement = driver.findElement(By.id("gh-cat"));
		oCatergoryListbox = new Select(oElement);
		
	}
	
	public void Search_Product(String sProduct, String sCatergory)
	
	{
		oSearchTextBox.sendKeys(sProduct);
		oCatergoryListbox.selectByVisibleText(sCatergory);
		oSearchButton.click();
		

}
}