import java.util.Scanner;

public class bahubali {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		String[] nameStr = new String[n1];
		for (int pass=0; pass <n1; pass++){
			nameStr[pass]=in.next();
		}

		for (int i = 0; i < n1; i++) {
			char[] charArr = nameStr[i].toCharArray();
			StringBuilder str = new StringBuilder(nameStr[i]);
			int end = nameStr[i].length();
			for (int j = 0; j < end / 2; j++) {	
				if(j%2 ==0){
					char ch = charArr[j];
					charArr[j]=charArr[end-1-j];
					charArr[end-1-j]=ch;
				}				
//				str.replace(j, end - j, new StringBuilder(str.substring(j, end - j)).reverse().toString());
			}
			System.out.println(new String(charArr));
		}

	}

}