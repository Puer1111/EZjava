package org.EZjava.day15.Stream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/org/EZjava/day15/OutputStream/writing.txt");
			byte[] input = "헬로우 입출력".getBytes(); // 문자열 배열 만드는 법
			for (int i = 0; i < input.length; i++) {
				os.write(input[i]); // 배열을 한 글자씩 입력

			}
			os.flush(); // 버퍼 비우기
			os.close(); // 자원 해제
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
