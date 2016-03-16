public class Dublicate {
	private static int parthInt(String st) {
		int result = 0;
		for (char ch : st.toCharArray()) {
			result = result * 10 + (ch - '0');
		}
		return result;

	}
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Error");
			System.exit(0);
		}
		
		System.out.println("Result = " + parthInt(args[0]) * 2);
		
	}
}