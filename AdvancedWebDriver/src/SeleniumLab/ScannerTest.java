package SeleniumLab;
import java.io.File;
import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in);  
	       //System.out.println("Enter your rollno");  
		   //int rollno=sc.nextInt();  
		   //System.out.println("Enter your name");
	       System.out.println("Enter a & b"); 
		   String a=sc.nextLine();  
		   String b=sc.nextLine();  
		  // System.out.println("Enter your fee");  
		   //double fee=sc.nextDouble();  
		  // System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);  
		   System.out.println(a+b); 
		   
		   int s1 = Integer.parseInt(a);
		   int s2 = Integer.parseInt(b);
		   System.out.println(s1+s2);
		   
		   
		   sc.close();  
		   
	File fileobj = new File("C:/selenium.txt");
	
	boolean c = fileobj.exists();
	
	if (c==true){
	fileobj.delete();
	}
	else
	{
		fileobj.mkdir();
	}
	}
}
