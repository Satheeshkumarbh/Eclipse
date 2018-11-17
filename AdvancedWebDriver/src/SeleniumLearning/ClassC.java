package SeleniumLearning;

public class ClassC extends ClassB{

	/*int a = 20;
	int b = 10;*/
	public  void add()
	{
		
		System.out.println(a+b);
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
	 
ClassC  objc = new ClassC();
objc.add();
	}

}
