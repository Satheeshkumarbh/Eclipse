package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageExample {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
	//System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));
	System.out.println(driver.findElement(By.id("hplogo")).getText());
		String PageTitle= driver.getTitle();
		System.out.println("Page Title " +PageTitle);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		driver.findElement(By.linkText("Gmail")).click();
		driver.manage().window().maximize();
		//driver.close();
	}

}
