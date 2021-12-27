package com.java.iostreams;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		byte[] array=new byte[100];
		try {
			InputStream input=new FileInputStream("C:\\Users\\naren\\OneDrive\\Desktop\\Temp\\input.txt");
			input.read(array);
			
			String s=new String(array);
			System.out.println(s);
			input.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
