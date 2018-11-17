 package SeleniumLab;

public abstract class Bike {
//concrete methods
	public void handle(){
		System.out.println("Bikes have handle");
	}
	public void seat(){
		System.out.println("Bikes have seat");
	}
	//Abstract methods
	public abstract void engine();
	public abstract void wheels();
	
public static void main(String[] args) {
	//create object
	//Bike objHH = new Bike();
		HeroHonda objHH = new HeroHonda();
		objHH.engine();
		objHH.handle();
		objHH.seat();
		objHH.wheels();

	}
	}