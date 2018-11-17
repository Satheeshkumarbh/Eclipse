package SeleniumTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumBrowserLaunch {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Desktop\\Selenium libs\\chromedriver_win32\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
//	WebDriver driver = new FirefoxDriver();
//	driver.get("http://www.google.com");
//	String PageTitle= driver.getTitle();
//	System.out.println("Page Title " +PageTitle);
//	String Url = driver.getCurrentUrl();
//	System.out.println(Url);
//	String WindowHandle = driver.getWindowHandle();
//	System.out.println(WindowHandle);
//	driver.findElement(By.linkText("Gmail")).click();
//	driver.manage().window().maximize();
	//driver.close();
	//driver.quit();
	}

}
