package JavaLearning;

public class Dog extends Animal{

	String color = "black";
	
	void eat() {
		System.out.println("child dog");
	}
	
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
public static void main (String args[])
{
	Animal d = new Dog();
	d.eat();
}
}
