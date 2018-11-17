package mylib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriver 

{

	private String sExcelFileName;
	
	private InputStream oFileReader;
	
	private OutputStream oFileWriter;
	
	private File oFile;
	
	private Workbook oExcelWorkbook;
	
	//-----------------------------------------------------------------------------------------
	
	private void setNullValues()
	{
		
		sExcelFileName = "";
		oFileReader =  null;
		oFileWriter = null;
		oFile = null;
		oExcelWorkbook = null;
		
	}
	
	
	//-----------------------------------------------------------------------------------------
	
	public ExcelDriver()
	
	{
		setNullValues();
				
	}
	
	
	//-----------------------------------------------------------------------------------------
	
	public void createNewExcelWorkbook(String sFileName)
	
	{
		try
		{
			oFile = new File(sFileName);
			
			if(oFile.exists())
			{
				throw new Exception("Specified ExcelFile already exists. Skipped creating new...");
				
			}
			if(!sFileName.toLowerCase().endsWith(".xlsx"))
			{
				sFileName+=".xlsx";
			}
			
			oExcelWorkbook = new XSSFWorkbook();
			oFileWriter = new FileOutputStream(sFileName);
			oExcelWorkbook.write(oFileWriter);
			oFileWriter.close();
			oExcelWorkbook.close();
			
			setNullValues();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	//-----------------------------------------------------------------------------------------
	public void openExcelWorkbook(String sFileName)
	
	{
		try
		{
			oFile = new File(sFileName);
			
			if(!oFile.exists())
			{
				throw new Exception("Specified ExcelFile does not exists.");
				
			}
			
			sExcelFileName = sFileName;
			
			oFileReader = new FileInputStream(oFile);
			oExcelWorkbook = WorkbookFactory.create(oFileReader);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	//-----------------------------------------------------------------------------------------
	
	public void createNewSheet(String sSheetName)
	
	{
		try
		{
			if (oExcelWorkbook == null)
			{
				throw new Exception("Excel Workbook is not opened!");
				
			}
			Sheet oSheet;
			
			oSheet = oExcelWorkbook.getSheet(sSheetName);
			
			if(oSheet==null)

			{
				oExcelWorkbook.createSheet(sSheetName);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	//-----------------------------------------------------------------------------------------
	public String getCellData(String sSheetName, int iRow, int iCell)
	
	{
		try
		{
		return oExcelWorkbook.getSheet(sSheetName).getRow(iRow-1).getCell(iCell-1).getStringCellValue();
		
		}
		catch(Exception e)
		{
			return "";
		}
		
	}
	
	//-----------------------------------------------------------------------------------------
public void setCellData(String sSheetName, int iRow, int iCell, String sValue)
	
	{
		try
		{
			Sheet oSheet;
			Row oRow;
			Cell oCell;
			
			oSheet = oExcelWorkbook.getSheet(sSheetName);
			if(oSheet==null)
			{
				oExcelWorkbook.createSheet(sSheetName);
				oSheet = oExcelWorkbook.getSheet(sSheetName);
				}
			
			oRow = oSheet.getRow(iRow-1);
			if (oRow==null)
			{
				oSheet.createRow(iRow-1);
				oRow = oSheet.getRow(iRow-1);
			
			}
			
			oCell = oRow.getCell(iCell-1);
			if (oCell==null)
			{
				oRow.createCell(iCell-1);
				oCell = oRow.getCell(iCell-1);
			
			}
			oCell.setCellValue(sValue);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	//-----------------------------------------------------------------------------------------
	
public void save()

{
	try
	{
		oFileWriter = new FileOutputStream(sExcelFileName);
		oExcelWorkbook.write(oFileWriter);
		oFileWriter.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
	
	//-----------------------------------------------------------------------------------------
	
public void saveAs(String sNewExcelFileName)

{
	try
	{
		oFileWriter = new FileOutputStream(sNewExcelFileName);
		oExcelWorkbook.write(oFileWriter);
		oFileWriter.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
	
	//-----------------------------------------------------------------------------------------
public int getRowCount(String sSheetName)

{
	try
	{
		return oExcelWorkbook.getSheet(sSheetName).getLastRowNum()+1;
		
	}
	catch(Exception e)
	{
		return 0;
	}
	
}
	
	//-----------------------------------------------------------------------------------------
	
public int getCellCount(String sSheetName, int iRow)

{
	try
	{
		return oExcelWorkbook.getSheet(sSheetName).getRow(iRow-1).getLastCellNum()+1;
	}
	catch(Exception e)
	{
		return 0;
	}
	
}
	//-----------------------------------------------------------------------------------------
	
public void close()

{
	try
	{
		oExcelWorkbook.close();
		oFileReader.close();
		setNullValues();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
	//-----------------------------------------------------------------------------------------
	
	public void setCellBackgroundColourToRed(String sSheetName, int iRow, int iCell)
	
	{
		try
		{
			Cell oCell;
			CellStyle oStyle;
			
			oCell=oExcelWorkbook.getSheet(sSheetName).getRow(iRow-1).getCell(iCell-1);
			oStyle=oExcelWorkbook.createCellStyle();
			oStyle.setFillBackgroundColor(IndexedColors.RED.index);
			oStyle.setFillForegroundColor(IndexedColors.RED.index);
			oStyle.setFillPattern(CellStyle.FINE_DOTS);
			oCell.setCellStyle(oStyle);		
		}
		catch (Exception e)
		{
		e.printStackTrace();
		}
		
		
	}
		

//----------------------------------------------------------------------------

public void setCellBackgroundColourToGreen(String sSheetName, int iRow, int iCell)

{
	try
	{
		Cell oCell;
		CellStyle oStyle;
		
		oCell=oExcelWorkbook.getSheet(sSheetName).getRow(iRow-1).getCell(iCell-1);
		oStyle=oExcelWorkbook.createCellStyle();
		oStyle.setFillBackgroundColor(IndexedColors.LIGHT_GREEN.index);
		oStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.index);
		oStyle.setFillPattern(CellStyle.FINE_DOTS);
		oCell.setCellStyle(oStyle);		
	}
	catch (Exception e)
	{
	e.printStackTrace();
	}
	
	
}
	
}
//-------------------------------------------------------------------------------------
