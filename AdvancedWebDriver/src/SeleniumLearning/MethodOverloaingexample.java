package SeleniumLearning;

public class MethodOverloaingexample {

	public static void add(int a,int b)
	{
		int res =  a+b;
		System.out.println(res);
	}
	public static void add(int a,int b,int c)
	{
		int res =  a+b+c;
		System.out.println(res);
	}
	
	public static void add(double a,double b )
	{
		double res =  a+b;
		System.out.println(res);
	}
	public static void add(double a,double b,double c)
	{
		double res =  a+b+c;
		System.out.println(res);
	}
	public static void main(String[] args) {
	
		MethodOverloaingexample obj = new MethodOverloaingexample();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10.5, 11.7);
		obj.add(1.9, 2.9, 2.8);
	}

}
