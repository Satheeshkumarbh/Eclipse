package SeleniumTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
	Select	dropdown = new Select(driver.findElement(By.name("country")));
	//dropdown.selectByIndex(5);
	dropdown.selectByVisibleText("Algeria");

	List<WebElement> e =dropdown.getOptions();//import from java util
	int itemscount = e.size();
	System.out.println("itemscount " + itemscount);
	
	}

}
