package lab2;

public class MultipleInheritanceUsingInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle car = new Vehicle(2,0);
		System.out.println("Speed of car = " + car.calcSpeed());
		Vehicle bus = new Vehicle(0,20);
		System.out.println("Distance travelled by bus = " + bus.calcDistanceTravelled());
	}

}

interface iCar {
	int distance = 100;
	public int calcSpeed();
}

interface iBus {
	int time = 2;
	public int calcDistanceTravelled();
}

class Vehicle implements iBus, iCar {

	private int time;
	private int speed;
	
	Vehicle(int time, int speed) {
		this.time = time;
		this.speed = speed;
	}
	
	public int calcSpeed() {
		// TODO Auto-generated method stub
		return iCar.distance * this.time;
	}

	public int calcDistanceTravelled() {
		// TODO Auto-generated method stub
		return this.speed/iBus.time;
	}
	
}