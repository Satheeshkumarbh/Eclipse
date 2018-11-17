package SeleniumLab;

public class Sample2 {
	
	public int add(int a,int b,int c){
		int result1=a+b+c;
		return result1;
	}

	public static void main(String[] args) {
		Sample2 obj1 =new Sample2();
		int x = obj1.add(1, 3, 4); 
		System.out.println(x);
		  
				
		Sample1 obj2 =new Sample1();
		int y = obj2.muliply(1, 3, 4); 
		System.out.println(y);
		Sample1.sub(1, 2, 6);
		

	}

}
