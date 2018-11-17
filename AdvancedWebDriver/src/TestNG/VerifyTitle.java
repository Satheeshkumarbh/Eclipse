package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
@Test
public void VerifyTitle() {

	//System.setProperty("webdriver.chrome.driver","D:\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	String pageTitle = driver.getTitle();
	Assert.assertEquals("Google", pageTitle);
	driver.close();
}
}
