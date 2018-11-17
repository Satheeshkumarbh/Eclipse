package Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo3 {

	public static void main(String[] args) throws Exception {
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

}
