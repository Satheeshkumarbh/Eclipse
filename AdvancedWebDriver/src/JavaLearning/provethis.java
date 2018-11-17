package JavaLearning;

public class provethis {
	void m() 
	{
		System.out.println(this);
	}
	
	
	
	
	public static void main(String[] args) {
	
		provethis obj = new provethis();
		System.out.println(obj);
		obj.m();

	}

}
