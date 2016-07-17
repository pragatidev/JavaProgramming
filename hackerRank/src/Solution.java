import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		BigInteger t1 = in.nextBigInteger();
		BigInteger t2 = in.nextBigInteger();
		int n = in.nextInt();
		BigInteger tn = t2.pow(2).add(t1);

		for (int i = 2; i < n; i++) {
			// i= (i+1)*(i+1) + (i);
			tn = t2.pow(2).add(t1);
			t1 = t2;
			t2 = tn;
		}
		System.out.println(tn);
	}
}