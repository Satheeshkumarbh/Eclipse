package mylib;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotFrameworkActionLibrary 
{

	private WebDriver driver;
	private long lngpageloadtimeout;
	private long lngElementDetectionTimeout;
	private String sIEDriver;
	private String sChromeDriver;
	public Properties oProperties;
	private InputStream oFileReader;
	
	private String sAutomationPropertyFile;
	
	
	
	//-----------------------------------------------------------------------------------------
	
	public RobotFrameworkActionLibrary()
	{
		sAutomationPropertyFile = "AutomationInput.properties";
		setDefaultProperyValues();
		
		
	}
	//-------------------------------------------------------------------
	public RobotFrameworkActionLibrary(String sProperyFile)
	{
	
		sAutomationPropertyFile = sProperyFile;
		setDefaultProperyValues();
		
		
	}
	//-----------------------------------------------------------------------------------------
	
	public void setDefaultProperyValues()
	{
		try {
			
			oFileReader = new FileInputStream(sAutomationPropertyFile);
			oProperties = new Properties();
			oProperties.load(oFileReader);
			
			
			lngpageloadtimeout = Long.valueOf(oProperties.getProperty("pageloadtimeout"));
			lngElementDetectionTimeout = Long.valueOf(oProperties.getProperty("elementdetectiontimeout"));
			
			
			sIEDriver=oProperties.getProperty("iedriver");
			sChromeDriver=oProperties.getProperty("chromedriver");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	//-----------------------------------------------------------------------------------------
	
	public void openfirefoxbrowser()
	{
		driver = new FirefoxDriver();
		setdefaultdriveroptions();
	
	}
	
	//-----------------------------------------------------------------------------------------

private void setdefaultdriveroptions()
{
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(lngpageloadtimeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(lngElementDetectionTimeout, TimeUnit.SECONDS);

}
	//-----------------------------------------------------------------------------------------
public void closeCurrentBrowser()
{
	if (driver!=null);
	{
		driver.close();
		driver = null;
	}
}

	//-----------------------------------------------------------------------------------------
public void navigateToURL(String sURL)
{
	if (driver!=null);
	{
		driver.get(sURL);
	}
}
	//-----------------------------------------------------------------------------------------
public void waitforseconds(String sSeconds)
{
	try
	{
		long seconds = Long.valueOf(sSeconds);
		Thread.sleep(seconds*1000L);
	}

	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------
public void openIEBrowser()
{
	{
		System.setProperty("webdriver.ie.driver", sIEDriver);
		driver = new InternetExplorerDriver();

		setdefaultdriveroptions();
	}
}
	//-----------------------------------------------------------------------------------------
public void openChromeBrowser()
{
	{
		System.setProperty("webdriver.chrome.driver", sChromeDriver);

		driver = new ChromeDriver();

		setdefaultdriveroptions();
	}
}
	//-----------------------------------------------------------------------------------------
public void closeAllBrowser()
{
	if (driver!=null);
	{
		driver.quit();
		driver = null;
	}
}
	//-----------------------------------------------------------------------------------------

public WebDriver getDriver()

{
	return driver;

}
	//-----------------------------------------------------------------------------------------

public void setText(String sLocator, String sText)
{
	{
		WebElement oTextBox;
		
		oTextBox = driver.findElement(CommonTools.getByObject(sLocator));
		oTextBox.clear();
		oTextBox.sendKeys(sText);
	}
}
	//-----------------------------------------------------------------------------------------


public void click(String sLocator)
{
	{
		driver.findElement(CommonTools.getByObject(sLocator)).click();
	}
}
	//-----------------------------------------------------------------------------------------
public void setCheckbox(String sLocator, String sStatus)
{
	{
		WebElement oCheckBox;
		
		boolean bStatus= Boolean.valueOf(sStatus);
		
		oCheckBox = driver.findElement(CommonTools.getByObject(sLocator));
		
		if ( oCheckBox.isSelected()!=bStatus)
			
		{
			oCheckBox.click();
		}
	}
}
	//-----------------------------------------------------------------------------------------
public void setRadiobutton(String sLocator, String sStatus)
{
	{
		WebElement ORadiobutton;
		boolean bStatus= Boolean.valueOf(sStatus);
		
		ORadiobutton = driver.findElement(CommonTools.getByObject(sLocator));
		
		if ( ORadiobutton.isSelected()!=bStatus)
			
		{
			ORadiobutton.click();
		}	
	}
}
	//-----------------------------------------------------------------------------------------

public void selectItem(String sLocator, String sText)
{
	{
		WebElement oElement;
		Select oListbox;
		
		oElement = driver.findElement(CommonTools.getByObject(sLocator));
		oListbox = new Select(oElement);
		oListbox.selectByVisibleText(sText);
		
	}
}
	//-----------------------------------------------------------------------------------------

public void savePageSnapshot(String sFileName)
{
	try
	{
	
		File oTmpFile, oOutputFile;
		TakesScreenshot oCamera;
	
	oCamera = (TakesScreenshot) driver;
	
	oTmpFile = oCamera.getScreenshotAs(OutputType.FILE);
	oOutputFile = new File(sFileName);
	FileUtils.copyFile(oTmpFile, oOutputFile);

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------
public void wait_TillPageLoads(String sTimeout)
{
	{
		
		WebElement oPage;
		WebDriverWait oWait;
		long timeoutSeconds= Long.valueOf(sTimeout);
		
		oPage = driver.findElement(By.tagName("body"));
		
		oWait = new WebDriverWait(driver,timeoutSeconds);
		oWait.until(ExpectedConditions.visibilityOf(oPage));
	
	}
}

//-----------------------------------------------------------------------------------------

public void moveMouseTo(String sLocator)
{
	{
		WebElement oElement;
		Actions oMouse;
		
		
		oElement = driver.findElement(CommonTools.getByObject(sLocator));
		oMouse = new Actions(driver);
		oMouse.moveToElement(oElement).build().perform();
		
		
	}
}
	//-----------------------------------------------------------------------------------------
public void scrollPageTo(String sXaxis, String sYaxis)
{
	{
		JavascriptExecutor oJsEngine;
		String sCommand;
		int x= Integer.valueOf(sXaxis);
		int y= Integer.valueOf(sYaxis);
		
		oJsEngine = (JavascriptExecutor) driver;
		sCommand = String.format("window.scrollTo(%d, %d)", x,y);
		oJsEngine.executeScript(sCommand);
		
	}
}
	//-----------------------------------------------------------------------------------------
public String getText(String sLocator)
{
	{
		return driver.findElement(CommonTools.getByObject(sLocator)).getText();
		
	}
}

	//-----------------------------------------------------------------------------------------

	//-----------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------
	//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
		//-----------------------------------------------------------------------------------------
	
}
	