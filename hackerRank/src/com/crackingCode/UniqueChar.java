/**
 * 
 */
package com.crackingCode;

/**
 * @author pkunwer
 *
 */
public class UniqueChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String unqChar = "Helo";
		checkUniqueChar(unqChar);

	}
	
	static void checkUniqueChar(String word){
		int end = word.length();
		boolean isUnique = true;
		for (int i = 0; i < word.length(); i++) {			
			int index = word.substring(i+1, end).indexOf(word.charAt(i));
			if (index == 0){
				isUnique = false;
				break;
			} 
		}
		
		if(isUnique)
			System.out.println("String contains unique character!");
		else
			System.out.println("String doesn't contain unique character!");
	}

}
