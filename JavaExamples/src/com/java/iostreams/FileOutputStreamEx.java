package com.java.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamEx {
	public static void main(String[] args) throws Throwable {
		
		String s="This is Narender, FileOutputStream Example";
		
		FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\naren\\OneDrive\\Desktop\\Temp\\input.txt");
		byte[] bs=s.getBytes();
		fileOutputStream.write(bs);
		fileOutputStream.close();
	}
}
