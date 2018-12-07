package lab3;

/**
 * Method Overloading to demonstrate static polymorphism
 * 
 * @author students
 *
 */
class Shape {
	private int x;
	private int y;
	private int z;	
	private int r;
	public Shape(int width, int height) {
		this.x = width;
		this.y = height;
	}
	public Shape(int width, int height, int z) {
		this.x = width;
		this.y = height;
		this.z = z;
	}
	public Shape(int r) {
		this.r = r;
	}
	public int calcArea(int x, int y) {
		return x*y;
	}
	public int calcArea(int x, int y, int z) {
		return x*y*z;
	}
	public int calcArea(int r) {
		return (int)3.14*r*r;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public int getZ() {
		return this.z;
	}
	public int getR() {
		return this.r;
	}
}
public class Overloading {
	public static void main(String args[]) throws Exception {
		System.out.println("Creating a rectangle");	
		Shape rect = new Shape(3,4);
		System.out.println("Rectangle length: " + rect.getX() + " and breadth: " + rect.getY());
		System.out.println("Creating a circle");	
		Shape circle = new Shape(4);
		System.out.println("Circle is created with radius: " + circle.getR());
		System.out.println("Creating a box");	
		Shape box = new Shape(2,3,4);
		System.out.println("Box Dimensions: " + box.getX() + "," + box.getY() + "," + box.getZ());
		System.out.println("Area of rectangle = " + rect.calcArea(rect.getX(), rect.getY()));
		System.out.println("Area of circle = " + circle.calcArea(circle.getR()));
		System.out.println("Area of box = " + box.calcArea(box.getX(),box.getY(),box.getZ()));
	}
}
