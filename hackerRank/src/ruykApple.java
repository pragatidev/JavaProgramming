import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ruykApple {
	private static Scanner in;

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

//		in = new Scanner(System.in);
		File input = new File("C://input.txt");
		in = new Scanner(input);
		int first = in.nextInt();
		int sec = in.nextInt();
		// String[] numberA = in.nextLine().split("\\s");
		// String[] numberB = in.nextLine().split("\\s");

		int[] numberA = new int[first] ;
		int[] numberB = new int[sec];
		for (int i = 0; i < first; i++) {
			numberA[i] = in.nextInt();
		}
		for (int i = 0; i < sec; i++) {
			numberB[i] = in.nextInt();
		}
		//
		// for (int numA: numberA){
		//
		// }

		// List<Integer> common = new ArrayList<Integer>(numberA);
		// common.retainAll(numberB);
		// numberA.removeAll(common);
		// numberB.removeAll(common);
		int max = 0;
		for (int i=0; i<first; i++)
			for (int j=0; j<sec;j++){
				int xor = numberA[i] ^ numberB[j];
				if (max  < xor)
					max = xor;
			}
				

//		Arrays.sort(numberA);
//		Arrays.sort(numberB);
//		boolean foundA=false ,foundB=false;
//		int maxA=0,maxB=0;
//		
//			for (int i=numberA.length-1; i >=0 ; i--) {
//				if (Arrays.binarySearch(numberB, numberA[i]) < 0 && !foundA){
//					maxA = numberA[i];
//					System.out.println(maxA);
//					foundA=true;
//				}
//			}
//			for (int i=0; i <numberB.length ; i++) {
//				if (Arrays.binarySearch(numberA, numberB[i]) < 0 && !foundB){
//					maxB = numberB[i];
//					System.out.println(maxB);
//					foundB=true;
//				}
//			}
//		

		// Collections.sort(numberA);
		// Collections.sort(numberB);

		System.out.println(max);

		// Collections.max(numberA);
		// int maxSum = 0;
		// for (int i = 1; i <= numberA.size(); i++) {
		// maxSum = numberA.get(numberA.size() - i)
		// ^ numberB.get(numberB.size() - i);
		// if (maxSum != 0) {
		// System.out.println(maxSum);
		// break;
		// } else
		// i++;
		// }

		// for (Integer numA : numberA) {
		// for (Integer numB : numberB) {
		// int sum = numA + numB;
		// if (sum > maxSum)
		// maxSum = sum;
		// }
		// }
		// int maxSum = 0;
		// for (int i = 0; i < first; i++) {
		// for (int j = 0; j < sec; j++) {
		// if (numberA.get(i) != numberB.get(i)) {
		//
		// int sum = numberA.get(i) ^ numberB.get(j);
		// if (sum > maxSum)
		// maxSum = sum;
		// }
		// }
		//
		// }

		// System.out.println(numberA.get(numberA.size()-1));
		// System.out.println(numberB.get(numberB.size()-1));
		//
		// System.out.println(numberA.get(numberA.size() - 1)
		// ^ numberB.get(numberB.size() - 1));
	}

}
