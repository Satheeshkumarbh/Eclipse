package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//http://www.gcrit.com/build3/create_account.php
public class Elements {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		String S1 = driver.getCurrentUrl();
		String S2 = driver.getTitle();
		System.out.println(S1);
		System.out.println(S2);
		driver.findElement(By.linkText("Gmail")).click();
		WebElement Email = driver.findElement(By.id("identifierId"));
		Email.sendKeys("India");
		WebElement next = driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]"));
		boolean a =next.isDisplayed();
		boolean b =next.isEnabled();
		System.out.println(a);
		System.out.println(b);
		next.click();
String s3 =	driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		System.out.println(s3);
		
		
	
		
		
		
		
		

	}

}
