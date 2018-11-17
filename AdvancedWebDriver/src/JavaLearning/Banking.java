package JavaLearning;

public class Banking {

	int acc_no;
	float amount;
	String name;
	
	void insert(int a,float amt,String n) 
	{
		acc_no=a;
		amount=amt;
		name=n;
	}
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println("deposited amount is "+ amt);
	}
	
	void withdraw(float amt) {
		if(amt<0) {
			System.out.println("Insufficient Balance");
		}else 
		{
			amount =amount-amt;
			System.out.println("amount with drawn "+amt);
		}
		}
	void checkBalance() 
	{
	System.out.println("Balance is "+amount);	
	}
	void display() 
	{
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
	
	
	public static void main(String[] args) {
		Banking B = new Banking();
		B.insert(101, 2000, "Sathish");
		B.display();
		B.checkBalance();
		B.deposit(1000);
		B.checkBalance();
		B.withdraw(1000);
		B.checkBalance();
	
	}

}
