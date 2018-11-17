package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
	//WebDriver driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.seleniumhq.org");
	driver.findElement(By.linkText("Download")).click();
	driver.findElement(By.linkText("Javadoc")).click();
	//Frame name
	/*driver.switchTo().frame("classFrame");//packageListFrame;packageFrame;classFrame
	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	driver.switchTo().defaultContent();
	//driver.navigate().back();
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.linkText("org.openqa.selenium")).click();
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("EdgeFilter")).click();*/
	//Frame index
	driver.switchTo().frame("3");
	driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
	driver.switchTo().defaultContent();

	}

}
