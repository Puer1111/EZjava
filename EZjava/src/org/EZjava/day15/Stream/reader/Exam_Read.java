package org.EZjava.day15.Stream.reader;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		Reader reader = null;
		try {
			reader = new FileReader("src/org/EZjava/day15/Stream/reader/reading texting.txt");
			int readData;
			while((readData = reader.read()) != -1) { //한글자 씩 읽고 없으면 그만
			
			System.out.print((char)readData);
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}finally {
			try {
				reader.close();
				
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
