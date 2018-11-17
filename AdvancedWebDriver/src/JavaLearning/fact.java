package JavaLearning;

public class fact {

	
	void fact1(int n)
	{
		int fact1 =1;
		for(int i = 1; i<=n; i++) {
			fact1=fact1*i;
		}
		System.out.println(fact1);
	}
	

	
public static void main(String[] args) {
	new fact().fact1(5);//annonymus object
	
}
}