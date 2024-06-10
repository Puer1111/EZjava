package org.EZjava.day15.Stream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/org/EZjava/day15/Stream/InputStream/reading.txt");
			byte[] readBytes = new byte[3];
			int readCount;
			String result = "";
			do {
				readCount = is.read(readBytes);
				if(readCount == -1) break; 
				//3바이트씩 끊어서 계속 축적
				result += new String(readBytes, 0, readCount); // 배열 readBytes 를 문자열로 변환
			}while(readCount != -1);
				System.out.println(result);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {

			e.printStackTrace();
		}

	}

}
