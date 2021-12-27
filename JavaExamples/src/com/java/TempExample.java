package com.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TempExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		List<Student> list=new ArrayList<>();
		
		list.add(new Student("Naren",34));
		list.add(new Student("Funny",20));
		list.add(new Student("Anny",9));
		list.add(new Student("Sweety",18));
		list.add(new Student("Mittu",12));
		list.add(new Student("Billu",15));
		
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("C:\\Users\\naren\\OneDrive\\Desktop\\Temp\\input.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(list);
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("Serilization has been done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("**********************************************************");
		
		ArrayList<Student> list1 = new ArrayList<Student>();
		
		FileInputStream fis =new FileInputStream("C:\\Users\\naren\\OneDrive\\Desktop\\Temp\\input.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		list1=(ArrayList<Student>) ois.readObject();
		
		
		for(Student str: list1) {
			System.out.println(str);
		}
		
		list1.clear();
		
		System.out.println("List has been cleared");
		
		
			System.out.println("status "+list1.size());
		
		
	}
}

class Student implements Serializable{
	
	private String name;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	  @Override 
	  public String toString() { 
		  return "Student [name=" + name +	  ", age=" + age + "]"; }
	 
	
	
}