import java.math.BigInteger;
import java.util.Scanner;

class myCalculator {
	public int power(int num, int power) throws Exception {
		if (power == 0)
			return 1;
		if (power > 0 && num >= 0) {
			int number = 1;
			for (int i = 0; i < power; i++)
				number = number * num;
			return number;
		} else
			throw new Exception("n and p should be non-negative");
	}
}

class exceptionHandling {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			myCalculator M = new myCalculator();
			try {
				System.out.println(M.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
