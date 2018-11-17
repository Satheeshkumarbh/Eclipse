package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLaunch {

	public static void main(String[] args) {
		//WebDriver driver =null;
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Desktop\\Selenium libs\\chromedriver_win32\\chromedriver.exe" );
		//WebDriver	driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String PageTitle= driver.getTitle();
		System.out.println("Page Title " + PageTitle);
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		driver.findElement(By.linkText("Gmail")).click();
		WebElement Email = driver.findElement(By.id("identifierId"));
		Email.sendKeys("India");
		String ATT1 = Email.getAttribute("type");
		System.out.println("Attribute value"+ ATT1);
		String Text1 = Email.getText();
		System.out.println(Text1);
	boolean x1=Email.isDisplayed();
	System.out.println("is Displayed" + x1 );
	boolean x2=Email.isEnabled();
	System.out.println("is Enabled" + x2 );
	Email.clear();
	 driver.manage().window().maximize();
		
		//driver.close();
		//driver.quit();
	}

}
