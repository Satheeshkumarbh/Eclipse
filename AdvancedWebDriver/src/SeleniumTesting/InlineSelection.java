package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class InlineSelection {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
	driver.findElement(By.xpath(".//*[@id='gb31']/span[1]")).click();
	

	}

}
