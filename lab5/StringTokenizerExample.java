package lab5;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	/**
	 * Class that demonstrates the use of StringTokenizer class in Java
	 * @param args
	 */
	public static void main(String[] args) {
		StringTokenizer stkr = new StringTokenizer("Some String That I Want To Break Into Tokens");
		System.out.println("Token count = " + stkr.countTokens());
		System.lineSeparator();
		while(stkr.hasMoreTokens()) {
			System.out.println("Token encountered = " + stkr.nextToken());
		}
		System.lineSeparator();
		while(stkr.hasMoreElements()) {
			System.out.println("Element encountered = " + stkr.nextElement());
		}
		
	}

}
