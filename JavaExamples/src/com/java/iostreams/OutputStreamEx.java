package com.java.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws Exception {
		
		String data="This is Narender";
		
		OutputStream os=new FileOutputStream("C:\\Users\\naren\\OneDrive\\Desktop\\Temp\\input.txt");
		byte[] byteArray=data.getBytes();
		os.write(byteArray);
		os.close();
	}
}
