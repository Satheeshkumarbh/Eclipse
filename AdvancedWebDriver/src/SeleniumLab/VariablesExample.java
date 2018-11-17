package SeleniumLab;

public class VariablesExample {

	static int a = 10;
	
	//mysal is local variable
	public int salary(){
		int mysal = 100+200+1000;
		return mysal;	
	}
	
	   public static void main(String[] args) {
		int b = 100;
	System.out.println(a);
	System.out.println(b);
	
	VariablesExample obj= new VariablesExample();
	int x = obj.salary();
	System.out.println(x);
	//i is local variable
	for(int i=0; i<1; i++){
		System.out.println(i);
		
		System.out.println((a>i));
	
	}
	
		
		
	}

}
