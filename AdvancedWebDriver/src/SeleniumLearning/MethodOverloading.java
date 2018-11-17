package SeleniumLearning;

public class MethodOverloading {
	
//In java, Method Overloading is not possible by changing the return type of the method only.

	
	//Method with return type
public static int add(int a,int b)
{
	int result1 =  a+b;
	return result1;
	//System.out.println(result1);	
}
//Method without return type
public static void add(double d,double e,double f)
{
	int result2 =  d+e;
	System.out.println(result2);
	
}	
//Method with return type
public static double add(double a,double b)
{
	double result3 =  a+b;
	return result3;
	//System.out.println(result3);
}
//Method without return type
public static void add(float a,float b,float c)
{
	float result4 =  a+b+c;
	System.out.println(result4);
}	
	public static void main(String[] args) {
	

		MethodOverloading obj = new MethodOverloading();
		//obj.add(10, 2);
		obj.add(2.6, 1.1, 8.9);
	
	}

}
