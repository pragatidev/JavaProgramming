import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class spikeCoinflips1 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int noOfFlips = (int)Math.ceil(n/3.0);
		System.out.println(noOfFlips);
	}
}