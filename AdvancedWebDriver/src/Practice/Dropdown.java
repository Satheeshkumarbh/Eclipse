package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("country"));
		Select dropdown = new Select (element);
		dropdown.selectByIndex(6);
		//dropdown.selectByVisibleText("Algeria");
		//display count
		/*List<WebElement> e=dropdown.getOptions();
		int count = e.size();
		System.out.println(count);*/
		
		List<WebElement> e = dropdown.getOptions();
		int count = e.size();
		System.out.println(count);
				
	
	}

}
