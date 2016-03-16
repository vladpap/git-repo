public class HelloWorld {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Error, no arguments...");
			System.exit(0);
		}
		int result = 0;
		for (int i = 0; i < args[0].length(); i++) {
			char ch = args[0].charAt(i);
			result = result * 10 + (ch - '0');
		}
		System.out.println("Result = " + result * 3);
		System.out.println("End...");
		System.out.println("Hi my frends");
	}
}