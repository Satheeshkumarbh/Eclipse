package SeleniumLearning;

import Library.ExcelConfig;

public class ExcelByReuse {

	public static void main(String[] args) throws Exception {
		
		ExcelConfig excel =new ExcelConfig("C:\\work\\Testdata\\Testdata.xlsx");//Constructor from Library
		String data1 = excel.getExcelData(0, 0, 0);
				
		System.out.println(data1);
	}

}
