package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.carmax.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement menuElement= driver.findElement(By.xpath(".//*[@id='researchMenu']/a"));
		action.moveToElement(menuElement).build().perform();
		driver.findElement(By.xpath(".//*[@id='researchMenu']/div/ul/li[1]/a")).click();
	}

}
