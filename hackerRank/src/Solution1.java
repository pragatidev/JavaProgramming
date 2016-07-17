import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.reflect.Array;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int T = in.nextInt();
    	int pass =0;
    	int [][] sum = new int[2][2];
    	while (pass < T) {
    	int N = in.nextInt();
    	List<Integer> list = new ArrayList<>();
    	int count =0;
    	while (count < N){
    		list.add(in.nextInt());
    		count++;
    	}
    	int cSum = 0;
    	int ncSum = 0;
    	int bSum = 0;
    	for (int i=0; i<list.size(); i++){    		
    		cSum = list.get(i) + cSum;
    		if (cSum < list.get(i))
    			cSum = list.get(i);  
    		if (cSum > bSum)
    			bSum=cSum;
    		if(list.get(i) >0)
    			ncSum = ncSum + list.get(i);
    	}
    	sum[pass][0]=bSum;  
    	sum[pass][1]=ncSum;
    	pass++;
    	}
    	for (int i=0; i<sum.length; i++){
    		for (int j=0; j<sum[i].length; j++){
    			System.out.print(sum[i][j]);
    			System.out.print(" ");
    		}
    			System.out.println();
    	}
    			
    }
}