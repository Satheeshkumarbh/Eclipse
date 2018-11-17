package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
	
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.findElement(By.id("primary-header-flight")).click();
		driver.findElement(By.id("flight-origin")).sendKeys("SFO");
		driver.findElement(By.id("flight-destination")).sendKeys("DFW");
		driver.findElement(By.id("flight-departing")).sendKeys("03/03/2018");
		driver.findElement(By.id("flight-returning")).sendKeys("03/03/2018");
		driver.findElement(By.id("search-button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		
		String price = driver.findElement(By.xpath(".//*[@id='flight-module-wl_']/div/div[2]/div[2]/div/div/div/span[2]")).getText().replace("$", "");
		driver.close();
		System.out.println(price);
		
		
	}

}
