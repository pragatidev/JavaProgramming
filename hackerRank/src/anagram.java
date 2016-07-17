import java.util.Arrays;
import java.util.Scanner;


public class anagram {
	private static Scanner in;

	public static void main(String args[]){
		in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str1.toCharArray();
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		for (int i=0, j=0; i<charArr1.length; i++){
			if (charArr1[i] != charArr2[i] && charArr1[i+1] > charArr1[i]){
				if(charArr2[i+1] ==charArr2[i] ){
					Arrays.
				}
			}
		}
		
	}
}
