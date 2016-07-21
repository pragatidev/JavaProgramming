/**
 * 
 */
package com.serialized;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * @author pkunwer
 *
 */
public class ObjectSerializationDemo {

	void writeData() {
		try {
			FileOutputStream outputFile = new FileOutputStream("obj-storage.dat");
			ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);
			String[] strArray = { "Seven", "Eight", "Six" };
			long num = 2008;
			int[] intArray = { 1, 3, 1949 };
			String commonStr = strArray[2];
			outputStream.writeObject(strArray);
			outputStream.writeLong(num);
			outputStream.writeObject(intArray);
			outputStream.writeObject(commonStr);
			outputStream.flush();
			outputStream.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e);
		} catch (IOException e) {
			System.err.println("Write error: " + e);
		}
	}

	void readData() {
		try {
			FileInputStream inputFile = new FileInputStream("obj-storage.dat");
			ObjectInputStream inputStream = new ObjectInputStream(inputFile);
			String[] strArray = (String[]) inputStream.readObject();
			long num = inputStream.readLong();
			int[] intArray = (int[]) inputStream.readObject();
			String commonStr = (String) inputStream.readObject();

			// Write data to the standard output stream:
			System.out.println(Arrays.toString(strArray));
			System.out.println(Arrays.toString(intArray));
			System.out.println(commonStr);
			// Close the stream:
			inputStream.close();

		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + e);
		} catch (IOException e) {
			System.err.println("Read error: " + e);
		} catch (ClassNotFoundException e) {
			System.err.println("Class not found: " + e);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ObjectSerializationDemo demo = new ObjectSerializationDemo();
		demo.writeData();
		demo.readData();
	}

}
