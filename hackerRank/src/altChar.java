import java.util.Scanner;

public class altChar {
	private static Scanner in;

	public static void main(String args[]) {
		int retryCount=20;
		Integer.parseInt("RETRY", retryCount);
		in = new Scanner(System.in);
		int pass = in.nextInt();
		String[] arr = new String[pass];
		for (int i = 0; i < pass; i++) {
			arr[i] = in.next();
		}

		for (String str : arr) {
			StringBuilder strb = new StringBuilder(str);
			int noOfDel = 0;
			for (int i = 0; i < strb.length() - 1; i++) {
				if (strb.charAt(i) == strb.charAt(i + 1))
					// strb.deleteCharAt(i++);
					noOfDel++;
			}
			System.out.println(noOfDel);
		}
	}

}
