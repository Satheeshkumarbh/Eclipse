package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleLaunch {
	public WebDriver driver;
	
@Test	(priority=1)
		public void driverDeclaration()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();	
			System.out.println("Driver declaration successful");
		}
	
@Test(priority=2)
		public void googleLaunch()		
		{
			driver.get("https://www.google.com/");
			System.out.println("Google launched");
		}
@Test(priority=3)
		public void titleCapture()
		{
			String S1 = driver.getTitle();
			System.out.println(S1);
		}
@Test(priority=4)
		public void navigateToYahoo()
		{
			driver.navigate().to("https://login.yahoo.com/");
			System.out.println("Yahoomail launched");
		}
@Test(priority=5)
		public void navigateBack()
		{
			driver.navigate().back();
			System.out.println("Google launched back");
		}	
@Test(priority=6)
		public void close()
		{
			driver.close();
			System.out.println("urL closed");
		}
	}


