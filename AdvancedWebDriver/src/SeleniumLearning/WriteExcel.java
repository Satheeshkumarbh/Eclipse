package SeleniumLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\work\\Testdata\\Testdata.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		sheet.getRow(0).createCell(2).setCellValue("Pass");
		sheet.getRow(1).createCell(2).setCellValue("fail");
		
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		wb.close();
		
	}

}
