package lab5;

public class StringMethods {

	/** Class that demonstrates the various methods of the String class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str = new String("Some Test String");
		System.out.println("1. Length = " + str.length());
		System.out.println("2. Character at index 3 = " + str.charAt(3));
		System.out.println("3. Hash Code = " + str.hashCode());
		System.out.println("4. Index of String 'So' = " + str.indexOf("So"));
		System.out.println("5. Concatenated String" + str.concat(System.lineSeparator() + "Concatenated String"));
		System.out.println("6. String in uppercase = " + str.toUpperCase());
		System.out.println("7. String in lowercase = " + str.toLowerCase());
		System.out.println("8. String with replaced character = " + str.replaceAll("Test", "Replaced"));
		System.out.println("9. Last index of S in " + str + " = " + str.lastIndexOf("S"));
		System.out.println("10. Does the string " + str + " starts with 'All'?" + str.startsWith("All"));
		System.out.println("11. " + str + " equals 'Some Other String'? = " + str.compareTo("Some Other String"));
		System.out.println("12. Substring of " + str + " from 2 to 7 = " + str.substring(2, 7));
		System.out.println("13. Is " + str + " empty? " + str.isEmpty());
		System.out.println("14. Does " + str + " contains 'Replaced' string?" + str.contains("Replaced"));
		System.out.println("15. Does " + str + " ends with 'String'?" + str.endsWith("String"));
	} 

}
