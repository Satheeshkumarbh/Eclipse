package day3;

import mylib.ExcelDriver;

public class ExcelExample1 {

	public static void main(String[] args) 
	{
	ExcelDriver oExcel;
	oExcel= new ExcelDriver();
	oExcel.createNewExcelWorkbook("C:\\Work\\Data1.xlsx");
	oExcel.openExcelWorkbook("C:\\Work\\Data1.xlsx");
	oExcel.createNewSheet("Res1");
	oExcel.setCellData("Res1", 1, 1, "TestName");
	oExcel.setCellData("Res1", 1, 2, "Status");
	oExcel.setCellData("Res1", 2, 1, "Sanity");
	oExcel.setCellData("Res1", 2, 2, "Pass");
	oExcel.setCellBackgroundColourToGreen("Res1", 2, 2);
	oExcel.setCellData("Res1", 3, 1, "Smoke");
	oExcel.setCellData("Res1", 3, 2, "Fail");
	oExcel.setCellBackgroundColourToRed("Res1", 3, 2);
	
	oExcel.save();
	oExcel.close();
	System.out.println("Operations Completed!");
	
	
	

	}

}
