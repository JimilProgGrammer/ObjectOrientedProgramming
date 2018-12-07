/**
 * 
 */

/**
 * @author students
 *
 */
public class Calculator {
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		return a+b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int subtract(int a, int b) {
		if(a >= b) {
			return a-b;
		}
		return b-a;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int multiply(int a, int b) {
		return a*b;
	}
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int divide(int a, int b) {
		return a/b;
	}
}
