package SeleniumLab;

public class ClassMethod {

	/*//calling method with obj
	public int multiply(int a,int b,int c){
	int result = a*b*c;
	return result;
		}
	//without calling method without obj
	public static int add(int a,int b,int c){
		int sum = a+b+c;
		return sum;
			}
	*/
	//calling method with obj
		public void sub(int a,int b){
		 int result1 = a-b;
		System.out.println(result1);
		
		}
		
		int result2;
		public static void div(int a,int b){
			try{
				int result2 = a/b;	
				System.out.println(result2);
			}
			 
			catch(ArithmeticException e)
			{
			System.out.println("divide by zero");
			}
			}
	public static void main(String[] args) {
		
		/*ClassMethod obj = new ClassMethod();
		int result = obj.multiply(1, 3, 4);
		int sum = add(2, 9, 6);//with ClassMethod. > or direct method name we can access
		System.out.println(result);
		System.out.println(sum);*/
		
		//ClassMethod obj1 = new ClassMethod();
		//obj1.sub(1, 4);
		div(10,10);
		
		
		
	}

}
