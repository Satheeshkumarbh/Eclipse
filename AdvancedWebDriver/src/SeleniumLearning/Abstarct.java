package SeleniumLearning;

public abstract class Abstarct {

	public void handle()
	{
		System.out.println("Bikes have handle");
	}
	
	public void seat()
	{
		System.out.println("Bikes have seat");
	}
	public abstract void engine();
	
	public abstract void  whleels();
	
	public static void main(String[] args) {
		
//Abstarct obj = new Abstarct();
//We can not create object in Abstract class
//Abstarct methods have only method no body
		
//create child object in parent we can access all methods abstract and concrete methods
		
	Abstract1 obj1= new Abstract1();
	obj1.whleels();
	obj1.engine();
	obj1.handle();
	obj1.seat();

	}

}
