package SeleniumLearning;

public class Forloop {

	public static void main(String[] args) {
	
		int i;
		int j;
		
		for (i=1;i<=10;i++)
		{
		//if (i!=5 && i!=7)
			if(i==5) //display only 5 without continue
			continue;//which display except 5 with continue
			
			System.out.println(i );	
		}
		
		for (j=1;j<=10;j++)
		{
		//if (i!=5 && i!=7)
			if(j==5) //display only 5 without continue
			break;//which display except 5 with continue
			
			System.out.println("second loop "+j );	
}
}
}