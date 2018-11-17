package day3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Properties;

import mylib.CommonTools;
import mylib.ExcelDriver;
import mylib.FrameworkActionLibrary;

public class FrameworkDriver 
{

	private static String sFWInputFile;
	private static String SFWInputSheet;
	private static String sReultFolder;
	private static String sOutputFile;
	private static FrameworkActionLibrary oFwDriver;
	
	
	public static void main(String[] args) 
	{
		Framework_ReadInput();
		Framework_MainDriver();
		Framework_WriteOutput();
		Framework_GenerateHtml();

	}
	private static void Framework_WriteOutput() 
	
	{
		
		
	}
	//----------------------------------------------------------------------------------------------------------------
	private static void Framework_ReadInput()
	{
		Properties oProperties;
		
		oProperties=CommonTools.getProperties("FrameworkInput.properties");
		sFWInputFile=oProperties.getProperty("FWInputFile");
		SFWInputSheet=oProperties.getProperty("FWInputSheet");
		sReultFolder=oProperties.getProperty("ResultFolder");
		
		
	}
	//----------------------------------------------------------------------------------------------------------------
	private static void Framework_MainDriver()
	{
		String sActionName;
		String sLocator;
		String sArgValue;
		String sRunFlag;	
		String sExecutionStatus;
		String sReturnValue;
		String sComment;
		
		ExcelDriver oExcel;
		
		int iRow, iRowCount;
		
		oExcel = new ExcelDriver();
		oFwDriver=new FrameworkActionLibrary("FrameworkInput.properties");
		
		oExcel.openExcelWorkbook(sFWInputFile);
		iRowCount=oExcel.getRowCount(SFWInputSheet);
		
		for(iRow=2; iRow<=iRowCount; iRow++)
		{
			
			sActionName="";
			sLocator="";
			sArgValue="";
			sRunFlag="";	
			sExecutionStatus="";
			sReturnValue="";
			sComment="";
			
			sActionName=oExcel.getCellData(SFWInputSheet, iRow, 2);
					sLocator=oExcel.getCellData(SFWInputSheet, iRow, 3);
							sArgValue=oExcel.getCellData(SFWInputSheet, iRow, 4);
									sRunFlag=oExcel.getCellData(SFWInputSheet, iRow, 5);
											
			sExecutionStatus=Framework_RunAction(sActionName, sLocator, sArgValue, sRunFlag);
			
			if(sExecutionStatus.startsWith("Error:"))
			{
				sComment=sExecutionStatus.split(":")[1];
				sExecutionStatus="Error";
				oExcel.setCellData(SFWInputSheet, iRow, 6, sExecutionStatus);
				oExcel.setCellBackgroundColourToRed(SFWInputSheet, iRow, 6);
				
			}
			else
			{
				
				if(sExecutionStatus.contains("Skipped"))
				{
					sComment=sExecutionStatus.split(":")[1];
					sExecutionStatus="Skipped";
				}
				else
				{
					if (sExecutionStatus.contains("Completed"))
					{
						sReturnValue="";
					}
					else
					{
						sReturnValue=sExecutionStatus;
						sExecutionStatus="Completed";
					}
					sReturnValue=sExecutionStatus;
				sExecutionStatus="Completed";
				}
				oExcel.setCellData(SFWInputSheet, iRow, 6, sExecutionStatus);
				oExcel.setCellBackgroundColourToGreen(SFWInputSheet, iRow, 6);
			}
			
			oExcel.setCellData(SFWInputSheet, iRow, 7, sReturnValue);
			oExcel.setCellData(SFWInputSheet, iRow, 8, sComment);
			
			}
		
		
		sOutputFile= sReultFolder+"\\"+
						SFWInputSheet+"_Result as on"+
						CommonTools.getDateTimeStamp()+".xlsx";
		
		oExcel.saveAs(sOutputFile);		
		oExcel.close();
	}
	
	

	//----------------------------------------------------------------------------------------------------------------
	private static void Framework_GenerateHtml()
	{
		try 
		{
			BufferedWriter oHtmlWriter;
			FileWriter oFileWriter;
			ExcelDriver oExcel;
			
			String sHtmlText;
			int iRow, iRowCount, iCell, iCellCount;
			String sValue;
			
			oFileWriter = new FileWriter(sOutputFile + ".html");
			oHtmlWriter = new BufferedWriter(oFileWriter);
			
			sHtmlText = "<html><head><title>" + SFWInputSheet + " Report" +
						"</title></head>";
			
			oFileWriter.write(sHtmlText);
			
			sHtmlText = "<body><h1 align=center>" + SFWInputSheet + " Report" +
						"</h1><br><hr><br><table border=2>";
			oFileWriter.write(sHtmlText);
			
			oExcel = new ExcelDriver();
			oExcel.openExcelWorkbook(sOutputFile);
			
			iRowCount = oExcel.getRowCount(SFWInputSheet);
			
			for(iRow=1; iRow<=iRowCount; iRow++)
			{
				iCellCount = oExcel.getCellCount(SFWInputSheet, iRow);
				
				if (iRow==1)
				{
					sHtmlText = "<tr bgcolor='lightgreen'>";
				}
				else
				{
					sHtmlText = "<tr bgcolor='white'>";
				}
				
				for(iCell=1; iCell<=iCellCount; iCell++)
				{
					if (iCell==1 && iRow>1)
					{
						sValue =String.valueOf(iRow-1);
					}
					else
					{
						sValue = oExcel.getCellData(SFWInputSheet, iRow, iCell);
					}
					
					if (sValue == "")
					{
						sValue = " ";
					}
					
					sHtmlText+= "<td align='center'>" + sValue + "</td>";
				}
				sHtmlText+= "</tr>";
				oHtmlWriter.write(sHtmlText);
				
			}
			
			sHtmlText+= "</table></center></body></html>";
			oHtmlWriter.write(sHtmlText);
			
			oHtmlWriter.close();
			oFileWriter.close();
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
		
	//----------------------------------------------------------------------------------------------------------------
	private static String Framework_RunAction(String sActionName, String sLocator, String sArgValue, String sRunFlag)
	{
		
		sActionName=sActionName.toLowerCase().trim();
		if(sActionName.isEmpty())
		{
			return "Error:ActionKeyword is missing...";
			
		}
		
		sRunFlag=sRunFlag.toLowerCase().trim();
		
		if(sRunFlag.isEmpty()|| !sRunFlag.equalsIgnoreCase("y"))
		{
			return "Skipped: Because run status was not set to 'y'";
		}
		
		try
		{
			if(sActionName.equalsIgnoreCase("openFirefoxBrowser"))
			{
				oFwDriver.openfirefoxbrowser();
				return "Completed";
				
			}
			
			if(sActionName.equalsIgnoreCase("navigateToUrl"))
			{
				oFwDriver.navigateToURL(sArgValue);
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("wait_TillPageLoad"))
			{
				oFwDriver.wait_TillPageLoads(Long.valueOf(sArgValue));
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("click"))
			{
				oFwDriver.click(sLocator);
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("setText"))
			{
				oFwDriver.setText(sLocator, sArgValue);
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("getText"))
			{
				return oFwDriver.getText(sLocator);
				
			}
			
			if(sActionName.equalsIgnoreCase("closeAllBrowsers"))
			{
				oFwDriver.closeAllBrowser();
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("openIEBrowser"))
			{
				oFwDriver.openIEBrowser();
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("openChromeBrowser"))
			{
				oFwDriver.openChromeBrowser();
				return "Completed";
				
			}
			
			if(sActionName.equalsIgnoreCase("selectItem"))
			{
				oFwDriver.selectItem(sLocator, sArgValue);
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("moveMouseto"))
			{
				oFwDriver.moveMouseTo(sLocator);
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("setCheckbox"))
			{
				oFwDriver.setCheckbox(sLocator, Boolean.valueOf(sArgValue));
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("setRadiobutton"))
			{
				oFwDriver.setRadiobutton(sLocator, Boolean.valueOf(sArgValue));
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("savePageSnapshot"))
			{
				oFwDriver.savePageSnapshot(sArgValue);
				return "Completed";
				
			}
			if(sActionName.equalsIgnoreCase("waitforseconds"))
			{
				oFwDriver.waitforseconds(Long.valueOf(sArgValue));
				return "Completed";
				
			}
			
			if(sActionName.equalsIgnoreCase("scrollPageTo"))
			{
				int x, y;
				x=Integer.valueOf(sArgValue.split(",")[0]);
				y=Integer.valueOf(sArgValue.split(",")[1]);
				
				oFwDriver.scrollPageTo(x, y);
				
				return "Completed";
				
			}
		}
		catch (Exception e)
		{
			return "Error:"+e.getMessage();
		}
		
		return"Error:Unknown ActionKeyword...";
	}
	//----------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------------------------------
	
	
	
	
	
}
