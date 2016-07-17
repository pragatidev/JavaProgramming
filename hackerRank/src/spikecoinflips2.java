import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class spikecoinflips2 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int noOfFlips = 0;
		if (n%3 == 0){
			noOfFlips = n/3;
		} else {
			noOfFlips = n;
		}
		//noOfFlips = (int)Math.ceil(n/3.0);
		System.out.println(noOfFlips);
	}
}