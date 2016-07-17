import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class goldCoins {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		BigInteger n1 = in.nextBigInteger();
		BigInteger n2 = in.nextBigInteger();
		BigInteger noofCoins = n1.add(n2);
		for (BigInteger i = BigInteger.ONE; i.compareTo(n2) > 0; i.add(BigInteger.ONE)){
			noofCoins = n1.add(i);
		}
		//noOfFlips = (int)Math.ceil(n/3.0);
		System.out.println(noofCoins);
	}
}