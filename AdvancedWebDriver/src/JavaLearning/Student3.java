package JavaLearning;

public class Student3 {

	int rollno;
	String  name;
	void insertrecord(int r,String n)
	{
		rollno = r;
		name = n;
	}
	void Diplay(){
		System.out.println(rollno+" "+name);
	}

 
	 public static void main(String args[]){  
	  Student3 s1=new Student3();  
	  Student3 s2=new Student3();  
	  s1.insertrecord(111,"Karan");  
	  s2.insertrecord(222,"Aryan");  
	  s1.Diplay();  
	  s2.Diplay();  
	 }  
	}  