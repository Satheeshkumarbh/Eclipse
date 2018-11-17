package JavaLearning;

public class Abstract1 extends Abstract2{

	@Override
	void run() {
		System.out.println("Abstarct method call");
		
	}
	public static void main(String [] args) {
		Abstract1 obj = new Abstract1();
		obj.run();
	}

}
