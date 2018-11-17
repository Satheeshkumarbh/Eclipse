package JavaLearning;

public class Constructor {
	int id;
	String name;
	int age ;
	Constructor(int i,String n)
	{
	id =i;
	name =n;
	}
	Constructor(Constructor s)
	{
	//id =s.id;
	//name =s.name;
	}
	
	Constructor()
	{
		
	}
	Constructor(int i,String n,int a)
	{
	id =i;
	name =n;
	age = a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		Constructor c1 = new Constructor(1, "Sathish");
		Constructor c2 = new Constructor(2,"Kumar",28);
		Constructor c3 = new Constructor(c2);
		Constructor c4 = new Constructor();
		c4.id =c1.id;
		c4.name =c1.name;
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();
		
	}

}
