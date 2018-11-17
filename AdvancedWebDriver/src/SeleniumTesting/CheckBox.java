package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://html.com/input-type-checkbox");
	WebElement checkbox = driver.findElement(By.xpath(".//*[@id='wrapper']/article/section/div[5]/form/p[2]/label[1]"));
	boolean x = checkbox.isDisplayed();
	boolean y =checkbox.isEnabled();
	boolean z = checkbox.isSelected();
	System.out.println("Is Displayed "+ x);
	System.out.println("Is Enabled "+ y);
	System.out.println("Is selected "+ z);
	checkbox.click();
	boolean z1 = checkbox.isSelected();
	System.out.println("Is selected1 "+ z1);
	checkbox.click();
	
	}
 
}
