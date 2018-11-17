package SeleniumLearning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Library.Utility;

import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;

public class CaptureScreenshot {

	public static void main(String[] args) throws Exception {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Utility.captureScreenshot(driver, "screen2");
		
		//Take Screenshot is a webDriver interface which is type casted to selenium
		/*TakesScreenshot ts = (TakesScreenshot)driver;
		File src	= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/screen1.png") );*/
		driver.quit();

	}

}
