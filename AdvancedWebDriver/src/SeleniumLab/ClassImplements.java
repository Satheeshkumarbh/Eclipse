 package SeleniumLab;

public class ClassImplements implements Interface1 {

	@Override
	public void engine() {
		// TODO Auto-generated method stub
	System.out.println("engine");	
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("handle");		
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("wheels");	
	}

/*	@Override
	public void seat() {
		// TODO Auto-generated method stub
		System.out.println("seat");		
	}*/
	public static void main(String[] args) 
		//create object
	{
		ClassImplements obj = new ClassImplements();
		obj.engine();
		obj.handle();
		obj.seat();
	
}

	@Override
	public void seat() {
		// TODO Auto-generated method stub
		
	}
}

 