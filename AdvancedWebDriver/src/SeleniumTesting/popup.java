package SeleniumTesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sathish\\Desktop\\Selenium libs\\chromedriver_win32\\chromedriver.exe" );
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		String Errormessage = alert.getText();
		System.out.println("Errormessage "+Errormessage);
		//alert.dismiss();
		alert.accept();
		driver.findElement(By.id("login1")).sendKeys("India	");
		
				

	}

}
 