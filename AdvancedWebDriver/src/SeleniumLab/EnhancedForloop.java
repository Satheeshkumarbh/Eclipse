package SeleniumLab;

public class EnhancedForloop {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		double [] mathop =new double[4];
		
		mathop[0]=a+b;
		mathop[1]=a-b;
		mathop[2]=a*b;
		mathop[3]=a/b;
		
		for(double result:mathop){
			System.out.println(result);
		}
		
	}

}
