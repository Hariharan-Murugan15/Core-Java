package com.java.Files.Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWrClass {
	public static void main(String[] args) throws IOException {
		String path = "src/com/java/Files/TextWr.fil";
		FileWriter fw = new FileWriter(path, StandardCharsets.UTF_8, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello, BufferedWriter makes writing efficiently");
//		fw.close(); bw.close();
		
//		FileReader fr = new FileReader(path);
//		BufferedReader br = new BufferedReader(fr);
//		
//		int op = br.read();
//		while(br.ready()) {
//			System.out.print((char) op);
//			br.read();
//		}
//		String op = br.readLine();
//		System.out.println(op);
		
	}
}
