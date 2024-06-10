package org.EZjava.day15.Stream.Exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFile_Copy {
	public static void main(String[] args) {
	Reader reader = null;
	Writer writer = null;
		try {
			 reader = new FileReader("c:\\windows\\system.ini");
			 writer = new FileWriter("c:\\Temp\\system.txt");
			int Count;
			char[] data = new char[3];
			while ((Count = reader.read(data)) != -1) {
				writer.write(data, 0, Count);
				writer.flush();
			}
			System.out.println("복사 완");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
