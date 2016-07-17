import java.io.*;
import java.util.*;

public class javaAnagram {

	static boolean isAnagram(String A, String B) {
		if (A.length() == B.length()) {
			char[] charstr1 = A.trim().toLowerCase().toCharArray();
			char[] charstr2 = B.trim().toLowerCase().toCharArray();
			Arrays.sort(charstr1);
			Arrays.sort(charstr2);

			for (int i = 0; i < charstr1.length; i++) {
				if (charstr1[i] != charstr2[i])
					return false;

			}
			return true;
		} else
			return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}
