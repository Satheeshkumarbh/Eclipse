package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
//Firefox browser launch
		/*WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.close();*/
	
//Chrome browser launch		
//		System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
		
//IE browser launch
		System.setProperty("webdriver.ie.driver", "D:\\2.JAVA_Materials\\Selenium libs\\IEdriver_win32\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//driver.wait(10);
		driver.close();
	}

}
