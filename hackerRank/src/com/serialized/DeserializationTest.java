/**
 * 
 */
package com.serialized;

import java.io.IOException;

/**
 * @author pkunwer
 *
 */
public class DeserializationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String fileName = "employee.ser";
		Employee empNew = null;

		try {
			empNew = (Employee) SerializatioUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("empNew Object:: " + empNew.getId() + " " + empNew.getName() + " " + empNew.getSalary());
	}

}
