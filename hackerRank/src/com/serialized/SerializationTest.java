/**
 * 
 */
package com.serialized;

import java.io.IOException;

/**
 * @author pkunwer
 *
 */
public class SerializationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "employee.ser";
		Employee emp = new Employee();
		emp.setName("Pragati");
		emp.setId(100);
		emp.setSalary(5000);

		try {
			SerializatioUtil.serialize(emp, fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Employee empNew = null;
		try {
			empNew = (Employee) SerializatioUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("emp Object: " + emp.getName() + " " + emp.getId() + " " + emp.getSalary());
		System.out.println("empNew Object: " + empNew.getName() + " " + empNew.getId() + " " + empNew.getSalary());

	}

}
