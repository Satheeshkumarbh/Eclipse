package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		//driver.switchTo().frame(2);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();//switch to top window
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	

	}

}
