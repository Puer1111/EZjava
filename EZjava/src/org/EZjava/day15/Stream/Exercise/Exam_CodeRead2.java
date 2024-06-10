package org.EZjava.day15.Stream.Exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_CodeRead2 {

	public static void main(String[] args) {
		// Exam_ImageCopy.java
		Reader reader = null;
		//Writer writer = null;
		try {
			reader = new FileReader("src/org/EZjava/day15/Stream/Exercise/Exam_imageCopy.java");
			// writer = new FileWriter("src/org/EZjava/day15/Stream/Exercise/Test1.txt");
			int readData;
			char[] input = new char[1024];
			String result = "";
			while (true) {
				readData = reader.read(input);
				if (readData == -1)
					break;
				result += new String(input, 0, readData);
				// writer.write(input);
				// writer.flush();
			}
			System.out.print(result);

		} catch (IOException e) {
		
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				// writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
