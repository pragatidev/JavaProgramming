import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class testCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		Double posNum = 0.00, negNum = 0.00, zeroNum = 0.00;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				posNum = posNum++;
			else if (arr[i] < 0)
				negNum = negNum++;
			else
				zeroNum = zeroNum++;
		}
		System.out.println(posNum /n );
		System.out.println(negNum / n);
		System.out.println(zeroNum / n);
	}
}
