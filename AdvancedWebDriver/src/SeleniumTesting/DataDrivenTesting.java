package SeleniumTesting;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTesting {

	public static void main(String[] args) throws BiffException, IOException {
	File f = new File("C:/Users/Sathish/Desktop/Testdata1.xlsx"); 
	Workbook w =  Workbook.getWorkbook(f);
	Sheet s =w.getSheet("Sheet1");//0//import sheet jxl
	int rows =s.getRows();
	int col =s.getColumns();
	System.out.println(rows);
	System.out.println(col);
		
	}

}
