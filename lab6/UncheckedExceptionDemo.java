package lab6;

import java.text.SimpleDateFormat;

public class UncheckedExceptionDemo {

	/**
	 * A class that demonstrates certain unchecked Exceptions in Java
	 * @param args
	 */
	public static void main(String[] args) {
		//NullPointerException
		try {
			String str = null;
			System.out.println("Length of str = " + str.length());
		} catch(NullPointerException e) {
			System.out.println(e);
		}
		
		//NumberFormatException
		try {
			int a = Integer.parseInt("abc");
			System.out.println(a);
		} catch(NumberFormatException ne) {
			System.out.println(ne);
		}
		
		//ClassCastException
		try {
			A a = new B();
			C c = (C)a;
		} catch(ClassCastException ce) {
			System.out.println(ce);
		}
		
		//IllegalArgumentException
		try {
			formPath(null,"/dir");
		} catch(IllegalArgumentException ie) {
			System.out.println(ie);
		}
		
		//ArrayIndexOutOfBoundsException
		int[] arr = new int[5];
		try {
			System.out.println(arr[7]);
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		
		//ArithmaticException
		try {
			performSub(2,3);
		} catch(ArithmeticException ahe) {
			System.out.println(ahe);
		}
		
		//ClassNotFoundException
		try {
			Class loadedClass = Class.forName("java.Utils");
		} catch(ClassNotFoundException cfe) {
			System.out.println(cfe);
		}
	}
	
	private static void formPath(String parent, String child) throws IllegalArgumentException {
		if(parent == null) {
			throw new IllegalArgumentException("Parent Path cannot be NULL");
		}
	}
	
	private static void performSub(int a, int b) throws ArithmeticException {
		if(a < b) {
			throw new ArithmeticException("a cannot subtract b because a is less than b");
		}
	}

}

class A {
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}

class B extends A {
	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

class C extends B {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}