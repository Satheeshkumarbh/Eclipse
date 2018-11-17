package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/create_account.php");
	WebElement Radio = driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]"));
	System.out.println(Radio.isSelected());
	Radio.click();
	System.out.println(Radio.isEnabled()); 
	System.out.println(Radio.isDisplayed());
	System.out.println(Radio.isSelected());
		
	}

}
