package JavaLearning;

public class I3 implements I1,I2{


	public void print() {
		System.out.println( "Interface 1");
		
	}

	public void show() {
		System.out.println("Interface 2");
		
	}

	public static void main(String[] args) {
	
		I3 obj = new I3();
		obj.print();
		System.out.println(obj.getClass());
		obj.show();

	}

}
