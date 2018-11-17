package SeleniumLab;

public class IOException {

	public static void main(String[] args) {
	
		int a = 2;
		int b = 0;
		try{
		int result = a/b;
		System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("divide by zero");
		
		}
		System.out.println("Hello");
		System.out.println("Java");  
		
	}

}
