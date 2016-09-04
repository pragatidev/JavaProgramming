import java.util.Scanner;

public class altChar {
	private static Scanner in;
	private static int count=0;

	public static void main(String args[]) {
		
		f(8);
		
		System.out.println(count);
//		int retryCount=20;
//		Integer.parseInt("RETRY", retryCount);
//		in = new Scanner(System.in);
//		int pass = in.nextInt();
//		String[] arr = new String[pass];
//		for (int i = 0; i < pass; i++) {
//			arr[i] = in.next();
//		}
//
//		for (String str : arr) {
//			StringBuilder strb = new StringBuilder(str);
//			int noOfDel = 0;
//			for (int i = 0; i < strb.length() - 1; i++) {
//				if (strb.charAt(i) == strb.charAt(i + 1))
//					// strb.deleteCharAt(i++);
//					noOfDel++;
//			}
//			System.out.println(noOfDel);
//		}
	}
	
	
		  static int f(int x)
		  {
		    if (x < 1 ) return 1;
		    
		    else {
		    	count++;
		    	return f(x-1) + g(x);
		    }
		  }

		  static int g(int x)
		  {
		    if(x < 2) return 1;
		    else {
		    	count++;
		    }
		    	return f(x-1) + g(x/2);
		    }
		  
	static int Func( int n )
	{
	  if( n == 4 )
	    return 2;
	  else
	    return 2 * Func( n + 1 );
	}

}
