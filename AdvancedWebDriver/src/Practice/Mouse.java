package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	driver.findElement(By.linkText("Droppable")).click();
	driver.manage().window().maximize();
	//Switching to Frame
	driver.switchTo().frame(0);
	WebElement dropable = driver.findElement(By.id("droppable"));
	WebElement dragable = driver.findElement(By.id("draggable"));
	//Example 1
	action.clickAndHold(dragable).moveToElement(dropable).release(dragable).build().perform();
	//Example 2
	//action.dragAndDrop(dragable, dropable).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Resizable")).click();
	WebElement drag = driver.findElement(By.linkText("Resizable"));
	action.clickAndHold(drag).moveByOffset(80, 20).release(drag).build().perform();
	}

}
