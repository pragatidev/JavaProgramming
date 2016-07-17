import java.util.Arrays;


public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"};
		Arrays.sort(fruits);
		int i=0;
		for (String temp: fruits){
			System.out.println("fruits "+i+": "+temp);
			i++;
		}
	}

}
