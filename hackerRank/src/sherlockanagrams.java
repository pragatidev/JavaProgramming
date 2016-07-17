import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class sherlockanagrams {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		String[] strArr = new String[test];
		for (int i = 0; i < test; i++) {
			strArr[i] = sc.next();
		}
		for (String str : strArr) {
			Map<Character, AtomicInteger> charCounts = new HashMap<Character, AtomicInteger>();
			for (char ch : str.toCharArray()) {
				AtomicInteger count = charCounts.get(ch);
				if (count == null) {
					charCounts.put(ch, new AtomicInteger(1));
				} else {
					count.incrementAndGet();
				}
			}
			int noOfWays = 1;

			for (Map.Entry e : charCounts.entrySet()) {
				if (Integer.valueOf(e.getValue().toString()) > 1) {
					noOfWays = noOfWays++;
//					noOfWays = noOfWays
//							* Integer.valueOf(e.getValue().toString());

				}
			}
			if (noOfWays > 1)
				System.out.println(noOfWays);
			else
				System.out.println(0);
		}
	}
}
