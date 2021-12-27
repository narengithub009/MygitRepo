package com.java.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutInStreamEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog dog = new Dog("xyz1","xyz");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\naren\\OneDrive\\Desktop\\Temp\\input.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(dog);
		
		FileInputStream fis=new FileInputStream("C:\\Users\\naren\\OneDrive\\Desktop\\Temp\\input.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d=(Dog) ois.readObject();
		System.out.println(d.getBreed()+" "+d.getName());
	}
}

class Dog implements Serializable
{
	String name;
	String Breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return Breed;
	}
	public void setBreed(String breed) {
		Breed = breed;
	}
	public Dog(String name, String breed) {
		super();
		this.name = name;
		Breed = breed;
	}
	
	
}