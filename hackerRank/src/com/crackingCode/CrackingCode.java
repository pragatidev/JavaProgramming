/**
 * 
 */
package com.crackingCode;

/**
 * @author pkunwer
 *
 */
public class CrackingCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//StringBuffer
	public String joinWords(String[] words){
		String sentence = "";
		for (String w:words){
			sentence = sentence + w;
		}
		return sentence;
	}

}
