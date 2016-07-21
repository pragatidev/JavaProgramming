/**
 * 
 */
package com.sort;

import java.util.Collections;
import java.util.List;

/**
 * @author pkunwer
 *
 */
public class TestEmployeeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Employee> employees = Util.getEmployees();
		// Collections.sort(employees);
		Collections.sort(employees, new EmpSortByName());
		printList(employees);
	}

	private static void printList(List<Employee> list) {
		System.out.println("EmpId\tName\tAge");
		for (Employee e : list) {
			System.out.println(e.getEmpId() + "\t" + e.getName() + "\t" + e.getAge());
		}
	}

}
