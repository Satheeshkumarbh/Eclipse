package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.carmax.com/");
	driver.manage().window().maximize();
	//Create Action Builder instance by passing web driver instance 
	/*Actions builder = new Actions(driver);
	WebElement Menuelement =driver.findElement(By.linkText("CARS FOR SALE"));
	builder.moveToElement(Menuelement).build().perform();
	driver.findElement(By.linkText("SEND US A QUESTION")).click();*/
	
	Actions builder = new Actions(driver);
	WebElement menuelement = driver.findElement(By.linkText("SELL YOUR CAR"));
	builder.moveToElement(menuelement).build().perform();
	driver.findElement(By.linkText("SCHEDULE AN APPRAISAL")).click();
	
	
		

	}

}
