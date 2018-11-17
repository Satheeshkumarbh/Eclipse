package SeleniumLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\work\\Testdata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);//load the complete work book this is for .xlsx files
		//HSSFWorkbook wb = new HSSFWorkbook(fis); //this is to deal with .xls files
		XSSFSheet sheet1= wb.getSheetAt(0);//reads the first work book
		
		/*String data0 =sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1 =sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("1st Column value "+ data0);
		System.out.println("2nd column value "+ data1);*/
		
		int rowcount = sheet1.getLastRowNum();
		
		System.out.println("Row count "+ rowcount+1);
		
		for (int i = 0; i<=rowcount; i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("row value is "+ i +" "+data0);
		}
		
		
		wb.close();
	}

}
