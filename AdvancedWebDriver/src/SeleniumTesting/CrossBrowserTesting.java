package SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {

	public static WebDriver driver;
	public static int browser;
	public static String browserName;
	
	
	public static void main(String[] args) {

		for (browser = 1; browser<= 3; browser++){
			if (browser==1)
			{
				System.setProperty("webdriver.chrome.driver","D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe" );
				driver = new ChromeDriver();
				
				browserName = "Chrome Browser";
			}
			else if(browser==2)
				{
					
				driver = new FirefoxDriver();
				browserName = "FF Browser";
				}
		 
			else if(browser==3)
			{
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Desktop\\Selenium libs\\chromedriver_win32\\chromedriver.exe" );
			driver = new ChromeDriver();
			browserName = "Chrome Browser";
			}
		driver.get("https://www.google.co.in/");
		String PageTitle = driver.getTitle();
		
		if (PageTitle.equals("Google"))
		{
			System.out.println(browserName + "Google Application launched");
		}
			else
			{
			System.out.println(browserName +"Google Application not launched");
			}
		
		driver.close();
		
	}

}
}
