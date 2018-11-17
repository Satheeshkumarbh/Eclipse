package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelDemo1 {

	public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	
	driver.get("https://www.travelocity.com/");
	
	driver.findElement(By.xpath(".//*[@id='primary-header-flight']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath(".//*[@id='flight-origin-flp']")).sendKeys("SFO");
	driver.findElement(By.xpath(".//*[@id='flight-destination-flp']")).sendKeys("DFW");
	driver.findElement(By.id("flight-departing-flp")).sendKeys("03/03/2018");
	driver.findElement(By.id("flight-returning-flp")).sendKeys("03/03/2018");
	driver.findElement(By.xpath(".//*[@id='gcw-flights-form-flp']/div[8]/label/button")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String price = driver.findElement(By.xpath(".//*[@id='flight-module-wl_']/div/div[2]/div[2]/div/div/div/span[2]")).getText();
	////div[@class='amt']"
	System.out.println(price);
	}

}
