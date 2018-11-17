package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelOrbitz {
	//*****************************Main Method start********************************************//
	public static void main(String[] args) throws Exception {

		String  [][] data;
		HashMap map = new HashMap();
		String itin;
		data = excelRead(); 
		double price;
		for (int i = 1; i<data.length; i++){
			System.out.println("Itin : From "+ data[i][0]+ " To " +data[i][1]);
			price= findPriceByOrbitz(data[i][0],data[i][1]);
			itin = "Using Orbitz from : "+ data[i][0]+ " to " +data[i][1];
			System.out.println("Orbitz price is "+price);
			map.put(price, itin);
		}
			ArrayList list= new ArrayList(map.keySet());
			java.util.Collections.sort(list);
			
		System.out.println("The minimum fare is "+list.get(0)+ "and the itin is "+ map.get(list.get(0)));
		
	}
	//*****************************Main Method end & Excel read method start********************************************//

	public static String[][] excelRead() throws Exception
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
	//**************************Converting cell value to String ********************//
	public static String cellTOStrng(XSSFCell cell) {
		int type;
		Object result = null;
		type = cell.getCellType();

		switch(type){
		case 0 :
			result = cell.getNumericCellValue();
			break;

		case 1:
			result = cell.getStringCellValue();
		default:
	//		System.out.println("there are no support for this type of cell");
		}
		return result.toString();
	}

	//**************************Excel read method end ********************//


















































	//*******************************ORBITZ method start*****************************************//	
	public static double findPriceByOrbitz(String dep,String dest)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\2.JAVA_Materials\\Selenium libs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.findElement(By.id("primary-header-flight")).click();
		driver.findElement(By.id("flight-origin")).sendKeys(dep);
		driver.findElement(By.id("flight-destination")).sendKeys(dest);
		driver.findElement(By.id("flight-departing")).sendKeys("03/03/2018");
		driver.findElement(By.id("flight-returning")).sendKeys("03/03/2018");
		driver.findElement(By.id("search-button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );

		String price = driver.findElement(By.xpath(".//*[@id='flight-module-wl_']/div/div[2]/div[2]/div/div/div/span[2]")).getText().replace("$", "");
		//span[@class='money small-cents'])[1]
		driver.close();
		double dprice = Double.parseDouble(price);
		//System.out.println(price);
		return dprice;
	}
	//*******************************ORBITZ method end*****************************************//	

}
