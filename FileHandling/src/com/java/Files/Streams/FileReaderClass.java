package com.java.Files.Streams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("src/com/java/Files/hari.har");
		int ip = fr.read();
		while(fr.ready()) {
			System.out.print((char)ip);
			ip = fr.read();
		}
		
	fr.close();;
	}
}
