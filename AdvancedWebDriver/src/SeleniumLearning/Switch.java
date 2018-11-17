package SeleniumLearning;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	
	float a , b, res;
	char choice,ch;

	
	Scanner Scan = new Scanner(System.in);
	
		System.out.println("1. Addition\n");
		System.out.println("2. Subtraction \n");
		System.out.println("3. Multiplication \n");
		System.out.println("4. Division \n");
		System.out.println("Enter a choice to perform operatin");
		choice = Scan.next().charAt(0);
		switch (choice)
		{
			case '1' : System.out.println("Enter two numbers:  ");
					a= Scan.nextFloat();
					b=Scan.nextFloat();
					res = a+b;
					System.out.println("result ="+ res);
		    break;		
		    
			case '2' : System.out.println("Enter Two numbers");
					a= Scan.nextFloat();
					b=Scan.nextFloat();
					res = a-b;
					System.out.println("result ="+ res);
			break;
				
			case '3' : System.out.println("Enter Two numbers");
						a= Scan.nextFloat();
						b=Scan.nextFloat();
						res = a*b;
						System.out.println("result ="+ res);
			break;
	
			case '4' : System.out.println("Enter Two numbers");
						a= Scan.nextFloat();
						b=Scan.nextFloat();
						res = a/b;
						System.out.println("result ="+ res);
			break;		
			
			default :System.out.println("Wrong choice");
			break;
	}
	
	}	
	}
	
