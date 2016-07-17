import java.util.Scanner;


public class funnyStrings {
	private static Scanner in;

	public static void main (String args[]){
		in = new Scanner(System.in);
		int noOfString = in.nextInt();
		String[] strArray = new String[noOfString];
		for(int i=0; i<noOfString; i++){
			strArray[i] = in.next();
		}
		
		for (int i=0; i<strArray.length; i++){
			StringBuilder str = new StringBuilder(strArray[i]);
			int len = str.length()-1;
			boolean funny =false;
			for (int j = 0; j < str.length()-1; j++,len--) {
				if(Math.abs(str.charAt(j)-str.charAt(j+1)) == Math.abs(str.charAt(len)-str.charAt(len-1)))
					funny = true;
				else {
					funny=false;
					break;
				}
			}
			if(funny)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}
	}
}
