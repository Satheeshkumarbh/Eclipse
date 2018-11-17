package SeleniumLearning;

public class Interface2 implements Interface1 {

		@Override
	public void handle() {
	System.out.println("Bikes have handles");
		
	}

	@Override
	public void Engine() {
	System.out.println("Bikes have Engine");
		
	}

	@Override
	public void seat() {
	System.out.println("Bikes have Seat");
		
	}

	@Override
	public void wheels() {
	System.out.println("Bikes have Wheels");
		
	}
	
	public static void main(String[] args) {
		
		Interface2 obj = new Interface2();
		obj.wheels();
		obj.Engine();
		obj.seat();
		obj.handle();
		
	}


}
