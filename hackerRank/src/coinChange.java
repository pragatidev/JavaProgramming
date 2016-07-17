import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class coinChange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// System.out.println(N);

		int M = sc.nextInt();
		// System.out.println(M);
		int[] marr = new int[M];
		for (int i = 0; i < M; i++) {
			marr[i] = sc.nextInt();
		}
		Arrays.sort(marr);
		List number = Arrays.asList(marr);
		int count = 0;
		int rem = 0;
		for (int i = 0; i < marr.length; i++) {
			rem = N % marr[i];
			if (rem == 0) {
				count = count + 1;
				int quotient = N / marr[i];
				
				if (Arrays.binarySearch(marr, quotient)>=0){
					count = count+1;					
				}
					
				
			} else if (Arrays.binarySearch(marr, rem) >= 0)
				count = count + 1;
			

		}
		System.out.println(count);

	}
}
