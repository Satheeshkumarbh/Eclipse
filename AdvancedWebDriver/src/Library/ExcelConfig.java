package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	//delcation of variables at class level
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelConfig(String excelpath) throws Exception
	{
		try {
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			//HSSFWorkbook wb = new HSSFWorkbook(fis); //this is to deal with .xls files

		} 

		catch (FileNotFoundException e) 

		{
			System.out.println(e.getMessage());

		} 

	}


	public String getExcelData(int sheetnumber,int row,int column) 
	
	{
		sheet=wb.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}



}
