package lab6;

public class UserDefinedException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			div(5,5);
			div(5,10);
		} catch(DivisionBy10Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally Block Executed");
		}
	}
	
	private static void div(int x, int y) throws DivisionBy10Exception {
		if(y == 10) {
			throw new DivisionBy10Exception();
		}
		System.out.println(x/y);
	}

}

class DivisionBy10Exception extends Exception {
	
	@Override
	public String toString() {
		return "Division By 10 Exception was raised";
	}
	
}
