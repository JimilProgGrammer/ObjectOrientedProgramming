package lab5;

public class StringBuilderExample {

	/**
	 * Class to demonstrate the example of StringBuilder class
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb);
		System.out.println("Inserting 'JAVA' in " + sb + " gives --> " + sb.insert(0, " JAVA "));
		System.out.println("Appending 'Says Hello' to " + sb + " gives --> " + sb.append(" Says Hello "));
		System.out.println("Capacity for sb = " + sb.capacity());
		System.out.println("Deleting from " + sb + " from 0 to 2 gives --> " + sb.delete(0, 2));
	}

}
