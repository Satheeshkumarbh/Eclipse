package com.java.practice;

public class Student {
	int rollno;  
	String name;  
	float fee;  
	Student(int rollno,String name,float fee){  
	rollno=rollno;  
	name=name;  
	fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	}  
	class TestThis1{  
	public static void main(String args[]){  
	Student s1=new Student(111,"ankit",5000f);  
	Student s2=new Student(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	}}  
	Test it Now
	Output:

	0 null 0.0
	0 null 0.0
	In the above example, parameters (formal arguments) and instance variables are same. So, we are using this keyword to distinguish local variable and instance variable.

	Solution of the above problem by this keyword
	class Student{  
	int rollno;  
	String name;  
	float fee;  
	Student(int rollno,String name,float fee){  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}  
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
	}  
	  
	class TestThis2{  
	public static void main(String args[]){  
	Student s1=new Student(111,"ankit",5000f);  
	Student s2=new Student(112,"sumit",6000f);  
	s1.display();  
	s2.display();  
	
}
	}	
	
	/*  String name;
		 float amount;  
		 int acno;  
		 void insert(int a,String n,float amt)
		 {
			 acno = a;
			 name = n;
			 amount = amt;			 
		 }
		 
		 void deposit(float amt)
		 {
			 amount = amount + amt;
			 System.out.println(amt + "is deposited");
		 }
		 
		 void withdraw(float amt)
		 {
			 if(amount  < amt){
				 System.out.println("Insufficient fund");
			 }
			 else
			amount = amount-amt;
			 System.out.println(amt +"withdrwan ");
		 }
		 void checkBalanceAmount()
		 {
			 System.out.println("Balance is "+amount);
		 }
		 void displayInformation()
		 {
			 System.out.println(acno +""+ name+""+amount);
		}
		} 

	*/