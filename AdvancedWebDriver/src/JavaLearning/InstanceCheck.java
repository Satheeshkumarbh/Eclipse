package JavaLearning;

public class InstanceCheck {
static int res;
	public static int add(int a,int b) {
		int res = a+b;
		return res;
		
	}
	
			
	public static void main(String[] args) {
		InstanceCheck r1 = new InstanceCheck();
		
		System.out.println(r1.add(1, 2));
		System.out.println(r1 instanceof InstanceCheck);
	}

}
