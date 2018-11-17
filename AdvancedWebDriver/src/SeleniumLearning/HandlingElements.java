package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingElements {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		driver.manage().window().maximize();
//Radio button operations:		
	boolean a =	driver.findElement(By.name("gender")).isDisplayed();
	boolean b =	driver.findElement(By.name("gender")).isEnabled();
	driver.findElement(By.name("gender")).click(); 
	boolean c = driver.findElement(By.name("gender")).isSelected();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
//textbox operation
driver.findElement(By.name("firstname")).sendKeys("india");	
driver.findElement(By.name("lastname")).sendKeys("india1");
driver.findElement(By.name("dob")).sendKeys("01/01/1980");
driver.findElement(By.name("email_address")).sendKeys("india@gmail.com");

//Dropdown operation for select
Select dropdown = new Select(driver.findElement(By.name("country")));
//dropdown.selectByIndex(5);//index starts from zero
dropdown.selectByVisibleText("Austria");
//list of dropdown options to display

List<WebElement> e =dropdown.getOptions();
int count = e.size();
System.out.println(count);


	}

}
