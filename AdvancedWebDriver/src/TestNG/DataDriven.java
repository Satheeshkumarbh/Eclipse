package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	public WebDriver  driver;

	@Test (dataProvider = "testdata")
	public void login(String username,String password) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "http://demosite.center/wordpress/wp-admin/");
		driver.close();
	}

	@DataProvider(name = "testdata")
	public Object [][] excelRead() throws Exception {
		File src = new File("C:\\work\\Testdata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheetAt(0);

		int rowNum = ws.getLastRowNum()+1;
		int colNum = ws.getRow(0).getLastCellNum();
		String [][] inputdata = new String [rowNum][colNum];

		for (int i=0; i<rowNum;i++)
		{
			XSSFRow row = ws.getRow(i);
			for (int j= 0;j<colNum;j++)
			{
				XSSFCell cell = row.getCell(j);
				String value = cellToString(cell);
				inputdata[i][j]=value;
				System.out.println("The cell value is "+ value);
			}
		}
		return inputdata;
	}



	public static String cellToString(XSSFCell cell){
		int type;
		Object result;
		type=cell.getCellType();

		switch(type){
		case 0:
			result=cell.getNumericCellValue();
			break;
		case 1:
			result=cell.getStringCellValue();
			break;
		default:
			throw new RuntimeException("There is no support of this type of cell");
		}
		return result.toString();
	}
}
