package lab2;

public class MultiLevelInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Buying Maruti 800");
		MarutiCar maruti800 = new MarutiCar();
		maruti800.setBrand("Maruti");
		maruti800.setColor("Black");
		maruti800.setModel("Maruti 800");
		maruti800.vehicleType();
		System.out.println("Buying Maruti Swift");
		MarutiCar marutiSwift = new MarutiCar();
		marutiSwift.setBrand("Maruti");
		marutiSwift.setColor("Red");
		marutiSwift.setModel("Maruti Swift");
		marutiSwift.vehicleType();
	}

}

class Car {
	
	public Car() {
		System.out.println("Car() called");
	}
	
	public void vehicleType() {
		System.out.println("Vehicle Type: Car");
	}
	
}

class Maruti extends Car {
	
	private String brand;
	
	public Maruti() {
		System.out.println("Maruti() called");
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("Brand = " + this.brand);
	}
	
}

class MarutiCar extends Maruti {
	
	private String color;
	private String model;
	
	public MarutiCar() {
		System.out.println("MarutiCar() called");
	}
	
	public void setColor(String color) {
		this.color = color;
		System.out.println("Vehicle Colour = " + this.color);
	}
	
	public void setModel(String model) {
		this.model = model;
		System.out.println("Vehicle Model = " + this.model);
	}
	
}