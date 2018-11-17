package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.chrome.driver","D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.carmax.com/");
		//Create Action Builder instance by passing web driver instance 
		Actions builder = new Actions(driver);	
		WebElement menuelements = driver.findElement(By.linkText("SELL YOUR CAR"));
		builder.moveToElement(menuelements).build().perform();
		driver.findElement(By.linkText("SCHEDULE AN APPRAISAL")).click();
		
	}

}
