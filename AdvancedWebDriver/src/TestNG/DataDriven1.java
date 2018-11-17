package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Data driven with integer data
public class DataDriven1 {
	@Test(dataProvider="testdata")
	public void add(String val1,String val2,String val3)
	{
		int a = Integer.parseInt(val1);
		int b = Integer.parseInt(val2);
		int c = Integer.parseInt(val3);
		int result = a+b+c;
		System.out.println("sum is "+result);
	}
	
	@DataProvider(name = "testdata")
	public Object [][]excelRead() throws Exception{
		File src = new File("C:\\work\\Testdata\\Testdata.xlsx");	
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheetAt(0);

		int rowNum = ws.getLastRowNum()+1;
		int colNum = ws.getRow(0).getLastCellNum();

		//Array Declaration:
		String[][] inputdata = new String[rowNum][colNum];

		for (int i = 0;i<rowNum;i++)
		{
			XSSFRow row = ws.getRow(i);

			for (int j =0;j<colNum;j++)
			{
				XSSFCell cell = row.getCell(j);
				String value = cellToString(cell);
				inputdata[i][j]=value;
				System.out.println("The cell value is "+ value);
			}
		}
		return inputdata;
	}
	public static String cellToString(XSSFCell cell) 
	{
		int type;
		Object result;
		type = cell.getCellType();

		switch(type)
		{
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
