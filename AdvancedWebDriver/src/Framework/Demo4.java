package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.intl.NumberFormat;

public class Demo4 {
	
	public static void main(String[] args) throws Exception {
		
	String  [][] data;
	data = excelData(); 
	String price;
	for (int i = 1; i<data.length; i++){
		price= findprice(data[i][1]);
	}
	}
	
	public static String[][] excelData() throws Exception
	{
		File src = new File("C:\\work\\Testdata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheetAt(0);
		
		int rowNum = ws.getLastRowNum()+1;
		int colNum = ws.getRow(0).getLastCellNum();
		String [][] data = new String [rowNum][colNum];
		
		for (int i=0; i<rowNum;i++)
		{
			XSSFRow row = ws.getRow(i);
			
			for (int j=0;j<colNum;j++)
			{
				XSSFCell cell = row.getCell(j);
				String value = cellTOStrng(cell);
				data[i][j]=value;
				System.out.println("The cell value is "+ value);
			}
		}
		return data;
	}

	public static String cellTOStrng(XSSFCell cell) {
		int type = 0;
		Object result = null;
		
		
		switch(type){
		case 0 :
			result = cell.getNumericCellValue();
		break;
		
		case 1:
			result = cell.getStringCellValue();
		default:
			System.out.println("there are no support for this type of cell");
		}
		return result.toString();
	}

	public static String findprice(String dest)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.findElement(By.id("primary-header-flight")).click();
		driver.findElement(By.id("flight-origin")).sendKeys("SFO");
		driver.findElement(By.id("flight-destination")).sendKeys(dest);
		driver.findElement(By.id("flight-departing")).sendKeys("03/03/2018");
		driver.findElement(By.id("flight-returning")).sendKeys("03/03/2018");
		driver.findElement(By.id("search-button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		
		String price = driver.findElement(By.xpath(".//*[@id='flight-module-wl_']/div/div[2]/div[2]/div/div/div/span[2]")).getText().replace("$", "");
		
		//double price = driver.findElement(By.xpath(".//*[@id='flight-module-wl_']/div/div[2]/div[2]/div/div/div/span[2]")).getText().replace("$", "");
		driver.close();
		System.out.println(price);
		return price;
	}
	
}
