package JavaLearning;

public class Super2 extends Super1{

	void eat() {
		System.out.println("Local Method called");
	}
	void drink() {
		System.out.println("Drink water from local class");
	}
	void supertest() {
		super.eat();
		drink();
	}
	
	
	public static void main(String args[]) 
	{
	Super2 s2 = new Super2();
	s2.supertest();
	}
}
