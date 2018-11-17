package SeleniumLab;

public class Sample1 {

	//calling external method with returning value
	public int muliply(int a, int b, int c){
		int result = a*b*c;
		return result;
	}
	//calling external method without returning value
	public static void sub(int a, int b, int c){
		int sub1 = a-b-c;
		System.out.println(sub1);
			}
	
}
