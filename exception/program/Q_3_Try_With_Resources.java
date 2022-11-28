package com.yash.exception.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q_3_Try_With_Resources {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream input = new FileInputStream("file.txt");){
			int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
		}
	}
}
