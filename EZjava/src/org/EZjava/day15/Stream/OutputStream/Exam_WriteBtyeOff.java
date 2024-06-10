package org.EZjava.day15.Stream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteBtyeOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/org/EZjava/day15/OutputStream/writing3.txt");
			byte[] data = "헬로".getBytes();
			os.write(data, 0, 3);
			os.flush();
			os.close();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				os.close();

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

}
