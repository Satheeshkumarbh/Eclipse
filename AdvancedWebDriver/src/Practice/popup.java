package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		String S1= 	driver.getCurrentUrl();
		String S2=	driver.getTitle();
		System.out.println("Page Title "+S2);
		System.out.println("Current URL "+S1);
		driver.findElement(By.id("login1")).sendKeys("india");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		alert.dismiss();
	}

}
