package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooMailChceck {

	public static void main(String[] args) throws Exception {
	
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://login.yahoo.com");
		//driver.findElement(By.linkText("Sign in")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='persistent' and @type='checkbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='persistent' and @type='checkbox']")).click();
		
		
		
	}

}
