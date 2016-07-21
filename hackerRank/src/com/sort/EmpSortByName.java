/**
 * 
 */
package com.sort;

import java.util.Comparator;

/**
 * @author pkunwer
 * @param <T>
 *
 */
public class EmpSortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
