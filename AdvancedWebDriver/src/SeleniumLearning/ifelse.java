package SeleniumLearning;

public class ifelse {

	public static void main(String[] args) {
		
		int a = 300;
		int b = 50;
		int c =20;
		int d;
		/*
		if (a>b)
		{
			System.out.println("a is big number");
		}
		else
		{
			System.out.println("b is big number");
		}*/

		if (a>b&&a>c)
		{
			System.out.println("a is big number");
		}
		else if (b>c&&b>a)
		{
			System.out.println("b is big number");
		}
		else
		{
			System.out.println("c is big number");
		}
	}

}
