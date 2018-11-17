package SeleniumLearning;

	public class Abstract1 extends Abstarct {

	

	@Override
	public void engine() {
	System.out.println("Bikes have Engine");
		
	}

	@Override
	public void whleels() {
	System.out.println("Bikes have wheels");
	}
	public static void main(String[] args) {
		Abstract1 obj = new Abstract1();
		obj.engine();
		obj.seat();
		obj.whleels();
		obj.handle();
		
		
			
	}

}
