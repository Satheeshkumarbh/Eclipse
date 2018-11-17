package JavaLearning;

public class thiskeyword {

	int rollno;
	
	String name;
	int age;
	thiskeyword(int rollno,String name,int age)
	{
	this.rollno = rollno;
	this.name=name;
	this.age=age;
	
	/*rollno = rollno;
	name=name;
	age=age; */
	}
	void display() {
		System.out.println(rollno+" "+name+" "+age);
	}
	public static void main(String[] args) {
		thiskeyword s1= new thiskeyword(1, "sathish", 20);
		s1.display();
	}

}
