/**
 * 
 */
package com.serialized;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author pkunwer
 *
 */
public class Person implements Externalizable {

	private int id;
	private String name;
	private String gender;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.io.Externalizable#writeExternal(java.io.ObjectOutput)
	 */
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeInt(id);
		out.writeObject(name + "xyz");
		out.writeObject("abc" + gender);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.io.Externalizable#readExternal(java.io.ObjectInput)
	 */
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	}

}
