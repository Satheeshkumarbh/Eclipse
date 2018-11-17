package SeleniumLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLab1 {

	public static void main(String[] args) {

	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.co.in/?gfe_rd=cr&ei=WvCAWLjxH_HI8Ae94ImICQ&gws_rd=ssl");
	driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).sendKeys("sathish");;

}
}