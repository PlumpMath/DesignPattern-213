package com.arun.singletonPatternBreak;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.arun.singletonPattern.SerializedSingleton;

public class SerializedSingeTonTest {


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();

		FileOutputStream fos = new FileOutputStream(new File("abc.ser"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(instanceOne);
		oos.close();

		FileInputStream fis = new FileInputStream(new File("abc.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializedSingleton instanceTwo = (SerializedSingleton) ois.readObject();
		ois.close();

		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		
		/*o/p
		
		865113938
		245257410*/

	}


}
