package SeleniumLearning;

public class ClassB extends ClassA{
	/*int a = 40;
	int b = 20;*/

	public  void mul()
	{
		
		System.out.println(a*b);
		
	}
	
/*	int a = 20;
	int b = 10;
	
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
	
	
	}
	
	public static void div(int a,int b)
	{
		int result4 = a/b;
		System.out.println(result4);
		}
		*/
	
	
	public static void main(String[] args) {
	
		ClassB obj = new ClassB();
		obj.mul();
	}

}
