import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.Scanner;

public class gemstones {
	private static Scanner in;

	public static void main(String args[]) {
		in = new Scanner(System.in);
		int noOfGems = in.nextInt();
		String[] strArr = new String[noOfGems];

		for (int i = 0; i < noOfGems; i++) {
			strArr[i] = in.next();
		}
		
		
		int countGems = 0;
		boolean isGems = false;
		for (char j = 'a'; j <= 'z'; j++) {
			for (int i = 0; i < strArr.length; i++) {
				char[] charArr = strArr[i].toCharArray();
				Arrays.sort(charArr);				
				if (Arrays.binarySearch(charArr, j) < 0) {					
					isGems = false;	
					break;
				}else 
					isGems=true;
			}
			if (isGems)
				countGems++;
		}

		System.out.println(countGems);

	}
}
