import java.util.Arrays;

/**
 * 
 */

/**
 * @author pkunwer
 *
 */
public class FirstOddOcurrence {
	//[2, 4, 3, 2, 5, 5, 3, 4, 4] -> 4


	int findNum(int[] arr){
	    Arrays.sort(arr); // nlogn
	    
	    //Average case time will be nlogn or close to n, space complexity will be O(1)    
	    //better solution can be achieved using hashtables (O(n) time), but it will take extra space
	    //XOR might be the best solution O(n) with space complexity of O(1)
	    for (int i=0; i<arr.length; ){
	        int num = arr[i];
	        int count=0;
	        int j=i;
	        for (; j<arr.length; j++){
	            if (arr[i] == arr[j])
	                count++;
	        }
	        i=j;
	        if (count%2 !=0){
	            return arr[i];
	        }
	        
	    }
	    return -1;

	}

	//[5, 2, 2, 2, 2]


	//[2,2,2,2,5]

}
