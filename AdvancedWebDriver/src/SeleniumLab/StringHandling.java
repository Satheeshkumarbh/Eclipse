package SeleniumLab;

import java.util.Arrays;

public class StringHandling {

	public static void main(String[] args) {
	
		String str1 = "	Welcome to SELENIUM World	";
		String str2 = "selenium";
		String str3 = "Selinium";
		String str4 = "selenium";
		
		
			System.out.println(str1==str2);
			System.out.println(str1==str3);
			System.out.println(str1==str4);
			
	/*//string comparison using equals method	
	//System.out.println(str1.equals(str2));
	System.out.println(str1.compareTo(str2));
	System.out.println(str2.compareTo(str1));
	System.out.println(str2.compareTo(str4));
	System.out.println(str1.equals(str2));
	System.out.println(str1.concat(str2));
	System.out.println(str1.charAt(3));
	System.out.println(str1.equalsIgnoreCase(str2));
	System.out.println(str2.toUpperCase());
	System.out.println(str1.toLowerCase());*/
	System.out.println(str1);
	
	System.out.println(str1.trim());
	System.out.println(str1.substring(3,6));
	
	String [] Array1 = {"C","Java","C++","RFT"};
	String str = Arrays.toString(Array1);
	System.out.println(str);
	boolean a= Arrays.asList(Array1).contains("Java");
	System.out.println(a);
	
	
	}
	 

}
