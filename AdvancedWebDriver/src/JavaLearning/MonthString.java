package JavaLearning;

public class MonthString {
	public static void main(String []args)
	{
		int arr[] = {1,2,3,4,5};
		int month = 1;
		String monthString = "";
		switch(month) {
		case 1:monthString="1 - January";
				break;
		case 2:monthString="2- Febraury";
		break;
		case 3 :monthString="3-March";
		 default:System.out.println("invalid month");
		
		}
		System.out.println(monthString);
		
		for(int i : arr) {
		System.out.println(i);
		}
	}
	
	

}
