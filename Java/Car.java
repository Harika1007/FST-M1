
public class Car {
	String color;
	String transmission;
	int make;
	int tyres;
	int speed;
	
	Car(String color, String transmission, int make, int tyres, int speed){
		this.color=color;
		this.transmission=transmission;
		this.make=make;
		this.tyres=tyres;
		this.speed=speed;
	}
	
	public void accelerate() {
		this.speed++;
	}
	
	public void brake() {
		this.speed=0;
	}
}
