package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLaunch {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Desktop\\Selenium libs\\chromedriver_win32\\chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com");
		String PageTitle= driver.getTitle();
		System.out.println("Page Title " + PageTitle);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		driver.findElement(By.id("login-username")).clear();
	WebElement Ymail =	driver.findElement(By.id("login-username"));
	Ymail.sendKeys("sathishkumarb");
	driver.findElement(By.xpath(".//*[@id='login-signin']")).click();
	driver.manage().window().maximize();
	driver.findElement(By.id("login-passwd")).sendKeys("jhjh");
	driver.findElement(By.name("signin")).click();
	String error = driver.findElement(By.xpath(".//*[@id='mbr-login-error']")).getText();
	System.out.println(error);

	}

}
