package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pageupdown {

	public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in/search?source=hp&ei=Hnl-WrivJ4Og0gSrj42wBw&q=flipkart&oq=flipkart&gs_l=psy-ab.3..0j0i131k1l2j0l7.10339.13712.0.13991.10.6.1.3.3.0.225.1203.0j4j2.6.0....0...1c.1.64.psy-ab..0.10.1269...0i10k1.0.7t4wJ_lcfn0");
	WebElement element = driver.findElement(By.cssSelector("body"));
	element.sendKeys(Keys.PAGE_DOWN);
	element.sendKeys(Keys.PAGE_UP);
	
		}

}
