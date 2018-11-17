package JavaLearning;

public class A1 extends A2 {
	A1(){
		super();
		System.out.println("child class consructor");
		sytem.out.println("Child")
	}
	{
		System.out.println("Instance Initilizer block");
	}
	
	public static void main(String args[]) {
		A1 obj = new A1();
	}
}
