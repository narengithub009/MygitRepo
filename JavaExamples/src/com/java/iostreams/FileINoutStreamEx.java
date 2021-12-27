package com.java.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileINoutStreamEx {
	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fileInputStream=new FileInputStream("C:\\Users\\naren\\OneDrive\\Desktop\\Temp\\input.txt");
			int i=fileInputStream.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=fileInputStream.read();
			}
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
