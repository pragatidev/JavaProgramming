import java.util.Arrays;
import java.util.Scanner;

public class panagrams {
	private static Scanner in;

	public static void main(String args[]) {
		in = new Scanner(System.in);
		String str = in.nextLine();
		char[] charArr = str.trim().toLowerCase().toCharArray();
		Arrays.sort(charArr);
		boolean notPanagram = false;
		for (char i = 'a'; i <= 'z'; i++) {
			if (Arrays.binarySearch(charArr, i) < 0)
				notPanagram = true;
		}

		if (notPanagram)
			System.out.println("not pangram");
		else
			System.out.println("pangram");

	}

}
