package SeleniumLab;

public class HeroHonda extends Bike{

	
	@Override
	public void engine() {
		System.out.println("Bikes have engine");	
		
	}

	@Override
	public void wheels() {
		System.out.println("Bikes have wheels");
		
	}


public static void main(String[] args) {
	//create object
	HeroHonda objHH = new HeroHonda();
	objHH.engine();
	objHH.handle();
	objHH.seat();
	objHH.wheels();

}
}