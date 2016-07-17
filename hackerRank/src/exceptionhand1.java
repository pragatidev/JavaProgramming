import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class exceptionhand1 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		try {
			Integer numer = sc.nextInt();
			Integer deno = sc.nextInt();
			int quotient = numer / deno;
			System.out.println(quotient);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (Exception ex) {
			// ex.
			// ex.printStackTrace();
			System.out.println(ex.getClass().getName());
		}

	}
}