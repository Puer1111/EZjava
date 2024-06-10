package org.EZjava.day15.Stream.Exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_CodeRead {

	public static void main(String[] args) {
		// Exam_ImageCopy.java
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("src/org/EZjava/day15/Stream/Exercise/Exam_imageCopy.java");
			writer = new FileWriter("src/org/EZjava/day15/Stream/Exercise/Test.txt");
			char[] input = new char[3];
			int readData;
			while(true) {
			readData = reader.read(input);
			if(readData == -1)break;
			writer.write(input);
			writer.flush();
			}
			System.out.println("출력 완");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
