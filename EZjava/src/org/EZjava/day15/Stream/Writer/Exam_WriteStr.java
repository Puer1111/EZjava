package org.EZjava.day15.Stream.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("src/org/EZjava/day15/Stream/Writer/writing3.txt");
			writer.write("Html/Css/Java");
			writer.flush();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
