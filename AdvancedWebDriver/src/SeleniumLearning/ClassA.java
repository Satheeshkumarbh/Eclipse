package SeleniumLearning;

public class ClassA {

	static int a = 50;
	static int b = 8;
	
	public static void add(int a,int b)
	{
		int result1 = a+b;
		System.out.println(result1);
	}
	
	public static void sub(int a,int b)
	{
		int result2 = a-b;
		System.out.println(result2);
	}
	
	public static void mul(int a,int b)
	{
		int result3 = a*b;
		System.out.println(result3);
	}
	
	public static void div(int a,int b)
	{
		int result4 = a/b;
		System.out.println(result4);
	}
	
	public static void main(String[] args) {

	//	ClassA obj = new ClassA();
		
	//	obj.add(10, 20);
	// Accessing methods with class name
		
	ClassA.add(10, 20);
	ClassA.sub(10, 5);

	}

}
