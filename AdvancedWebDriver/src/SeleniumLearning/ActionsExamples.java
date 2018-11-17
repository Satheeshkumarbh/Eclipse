package SeleniumLearning;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExamples {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		Actions action= new Actions(driver);
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait statement
		driver.findElement(By.linkText("Droppable")).click();
		driver.manage().window().maximize();

		//Switching to frame
		driver.switchTo().frame(0);
		//create webelement
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		action.doubleClick(droppable);//double click on element
		action.contextClick(droppable);//Mouse right click
		Thread.sleep(1000);
		//Example 1
		action.dragAndDrop(draggable, droppable).build().perform();//Drag and drop  exp1
		//Example 2
		action.clickAndHold(draggable).moveToElement(droppable).release(draggable).build().perform();
		Thread.sleep(1000);

		//Resizing the text box by drag and drop b y offest
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Resizable")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement drag=driver.findElement(By.id("resizable"));
		action.clickAndHold(drag).moveByOffset(60, 20).release(drag).build().perform();
		Thread.sleep(1000);

		



	}

}
