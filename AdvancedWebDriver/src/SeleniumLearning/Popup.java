package SeleniumLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		driver.findElement(By.id("login1")).sendKeys("india");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		String S1 = alert.getText();
		System.out.println(S1);
		alert.accept();
	}

}
