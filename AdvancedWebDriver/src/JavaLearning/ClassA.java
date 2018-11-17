package JavaLearning;

public class ClassA {

	int id;
	String name;
	float fee;
	ClassA(int id,String name){
		this.id =id;
		this.name=name;
	}
	ClassA(int id,String name,float fee){
		this(id,name);
		this.fee=fee;
		//this(id,name); //Constructor call must be the first statement in a constructor
	}
	void display() {
		
		System.out.println(id+" "+name+" "+fee);
	}
	public static void main(String[] args) {
	
		ClassA s1=new ClassA(1, "BIT");
		ClassA s2 = new ClassA(2,"AIT",20f);
		s1.display();
		s2.display();
	}

}
