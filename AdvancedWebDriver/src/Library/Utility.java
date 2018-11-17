package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {

	
public static void captureScreenshot(WebDriver driver, String Screenshotname) throws Exception 
	
	{
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src	= ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./ScreenShots/"+Screenshotname+".png") );
		} catch (WebDriverException e) {
			
			System.out.println("Exceptreen while taking screen capture" +e);
		} 
	}
}
