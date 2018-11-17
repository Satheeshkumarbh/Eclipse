package SeleniumLab;

public class FinalTest {

	public int multiply(int a, int b, int c)
	{
		int result = a* b* c;
		return result;
	}
	public static void main(String[] args) {
	int a = 10;
	int b = 20;
	final int c = 100;
	
	int sum = a + b;
	System.out.println("addition of a+b = " + sum);
	
	
//	/*if(a>b)
//	{
//		System.out.println("a is a big number" + a);
//	}
//	else 
//		System.out.println("b is a big number =  " + b);
//	
//	//loop
//	for (int i=0; i<=10; i++){
//		System.out.println(i);*/
	}
	
	FinalTest obj = new FinalTest();
	int result = obj.multiply(2, 3, 4);
	
	//System.out.println("Multiplication = " +  result);
	
}


