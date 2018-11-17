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

public class MyWebDriverWithProperties 
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
	
	public MyWebDriverWithProperties()
	{
		sAutomationPropertyFile = "AutomationInput.properties";
		setDefaultProperyValues();
		
		
	}
	//-------------------------------------------------------------------
	public MyWebDriverWithProperties(String sProperyFile)
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
	
	public void Openfirefoxbrowser()
	{
	try
	{
		driver = new FirefoxDriver();
		setdefaultdriveroptions();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	//-----------------------------------------------------------------------------------------

private void setdefaultdriveroptions()
{
try
{
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(lngpageloadtimeout, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(lngElementDetectionTimeout, TimeUnit.SECONDS);
	
}
catch(Exception e)
{
	e.printStackTrace();
}
}
	//-----------------------------------------------------------------------------------------
public void closeCurrentBrowser()
{
try
{
	if (driver!=null);
	{
		driver.close();
		driver = null;
	}
}
catch(Exception e)
{
	e.printStackTrace();
}
}

	//-----------------------------------------------------------------------------------------
public void navigateToURL(String sURL)
{
try
{
	if (driver!=null);
	{
		driver.get(sURL);
	}
	
}
catch(Exception e)
{
	e.printStackTrace();
}
}
	//-----------------------------------------------------------------------------------------
public void waitforseconds(long seconds)
{
	try
	{
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
	try
	{
		System.setProperty("webdriver.ie.driver", sIEDriver);
		driver = new InternetExplorerDriver();

		setdefaultdriveroptions();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------
public void openChromeBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver", sChromeDriver);

		driver = new ChromeDriver();

		setdefaultdriveroptions();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------
public void closeAllBrowser()
{
	try
	{
		if (driver!=null);
		{
			driver.quit();
			driver = null;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------

public WebDriver getDriver()

{
	return driver;

}
	//-----------------------------------------------------------------------------------------

public void setText(By oBy, String sText)
{
	try
	{
		WebElement oTextBox;
		
		oTextBox = driver.findElement(oBy);
		oTextBox.clear();
		oTextBox.sendKeys(sText);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------


public void click(By oBy)
{
	try
	{
		driver.findElement(oBy).click();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------
public void setCheckbox(By oBy, boolean bStatus)
{
	try
	{
		WebElement oCheckBox;
		
		oCheckBox = driver.findElement(oBy);
		
		if ( oCheckBox.isSelected()!=bStatus)
			
		{
			oCheckBox.click();
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------
public void setRadiobutton(By oBy, boolean bStatus)
{
	try
	{
		WebElement ORadiobutton;
		
		ORadiobutton = driver.findElement(oBy);
		
		if ( ORadiobutton.isSelected()!=bStatus)
			
		{
			ORadiobutton.click();
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------

public void selectItem(By oBy, String sText)
{
	try
	{
		WebElement oElement;
		Select oListbox;
		
		oElement = driver.findElement(oBy);
		oListbox = new Select(oElement);
		oListbox.selectByVisibleText(sText);
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
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
public void wait_TillPageLoads(long timeoutSeconds)
{
	try
	{
	
		WebElement oPage;
		WebDriverWait oWait;
		
		oPage = driver.findElement(By.tagName("body"));
		
		oWait = new WebDriverWait(driver,timeoutSeconds);
		oWait.until(ExpectedConditions.visibilityOf(oPage));
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

//-----------------------------------------------------------------------------------------

public void moveMouseTo(By oBy)
{
	try
	{
		WebElement oElement;
		Actions oMouse;
		
		
		oElement = driver.findElement(oBy);
		oMouse = new Actions(driver);
		oMouse.moveToElement(oElement).build().perform();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------
public void scrollPageTo(int x, int y)
{
	try
	{
		JavascriptExecutor oJsEngine;
		String sCommand;
		
		oJsEngine = (JavascriptExecutor) driver;
		sCommand = String.format("window.scrollTo(%d, %d)", x,y);
		oJsEngine.executeScript(sCommand);
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	//-----------------------------------------------------------------------------------------
public String getText(By oBy)
{
	try
	{
		return driver.findElement(oBy).getText();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return "";
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
	