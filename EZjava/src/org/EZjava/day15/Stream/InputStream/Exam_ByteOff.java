package org.EZjava.day15.Stream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ByteOff {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("src/org/EZjava/day15/Stream/InputStream/reading.txt");
			int readCount;
			byte[] readbytes = new byte[3];
			String result = "";

			while (true) {
				readCount = is.read(readbytes, 0, 2); // read() 커맨드로 시작점 과 길이 정하기 가능하다
				if (readCount == -1)
					break;
				result += new String(readbytes, 0, readCount);

			}
			is.close();
			System.out.println(result);
		} catch (IOException e) {

			e.printStackTrace();
		} finally { // 무조건 실행 , 예외가 생겨도 반드시 실행
			try {
				is.close(); // is.read에서 예외가 생기면 자원 반환이 안되어 close가 실행 안되기에 finally 안으로 작성
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
