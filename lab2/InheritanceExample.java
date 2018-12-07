package lab2;

class Parent {
	int age;
	public Parent(int x) {
		System.out.println("Parent 1-arg constructor");		
		this.age = x;
	}
	public void show() {
		System.out.println("Parent show() method; age here is: " + age);
	}
}

class Child extends Parent {
	int age;
	public Child(int cAge, int pAge) {
		super(pAge);
		System.out.println("Child 2-args constructor");
		this.age = cAge;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("Child show() method; age here is: " + age);
	}
}

/**
 * Demo of inheritance
 * 
 * @author students
 *
 */
public class InheritanceExample {
	public static void main(String args[]) throws Exception {
		Child c = new Child(23,54);
		c.show();
                Parent p = new Child(23,35);
                p.show();
	}
}
