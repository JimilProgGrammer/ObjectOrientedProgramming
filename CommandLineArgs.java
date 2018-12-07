public class CommandLineArgs {
	public static void main(String args[]) throws Exception {
		if(args.length > 0) {
			for(String x: args) {
				System.out.println(x);
			}
		} else {
			System.out.println("Command Line Arguments are not present");
		}
	}
}