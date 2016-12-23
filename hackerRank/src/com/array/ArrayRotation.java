/**
 * 
 */
package com.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pkunwer
 *
 */
public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for (int rotation = 0; rotation < k ; rotation++){
            int data = a[a.length-1];
            for(int shift=a.length-1; shift >0; shift--){                    
                a[shift]=a[shift-1];                     
            }
            a[0]=data;
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }
    }
	
	//Another very optimized solution
	public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
    
    
       /** for (int rotation = 0; rotation < k ; rotation++){
            int data = a[a.length-1];
            for(int shift=a.length-1; shift >0; shift--){                    
                a[shift]=a[shift-1];                     
            }
            a[0]=data;
        }*/
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            int j= (n+m-k%n)%n;
            if (j>0)
                 System.out.println(a[j]);
            else
                System.out.println(a[-j]);
            
           
        }
    }

}
