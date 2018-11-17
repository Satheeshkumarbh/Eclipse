package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class WorkingWithProperityFiles 
{

	public static void main(String[] args) 
	 {
		try
		{
		InputStream oFileReader;
		Properties oProperties;
		
		oFileReader = new FileInputStream("SampleData.properties");
		
		oProperties = new Properties();
		oProperties.load(oFileReader);
		
		System.out.println("Tool="+ oProperties.getProperty("toolname"));
		System.out.println("Ver="+oProperties.getProperty("toolver"));
		
		oFileReader.close();
		

		
	 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
