package SeleniumLearning;

public interface Interface1 {
	
		public void handle();
		public void Engine();
		public void seat();
		public void wheels();
		
		public static void main(String[] args)
		{			
		Interface2 obj = new Interface2();
		obj.wheels();
		obj.Engine();
		obj.handle();
		obj.seat();
		
}
}
//interface methods are 100% Abstract
//we can not create object in interface
//interface methods can accessed with class by creating object and implements