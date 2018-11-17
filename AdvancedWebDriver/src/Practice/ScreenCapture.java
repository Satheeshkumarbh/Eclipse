package Practice;

import java.io.File;

import mylib.MyWebDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenCapture {

	public static void main(String[] args) {
		
		MyWebDriver oBrowser;
		
		oBrowser = new MyWebDriver();
		
		oBrowser.Openfirefoxbrowser();
		oBrowser.navigateToURL("http://www.seleniumhq.org");
		oBrowser.waitforseconds(3L);
		oBrowser.savePageSnapshot("C:\\Work\\Snap.jpg");
		
	}

	

}
