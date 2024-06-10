package org.EZjava.day15.Stream.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			OutputStream os = null;
			try {
				os = new FileOutputStream("src/org/EZjava/day15/OutputStream/Writing2.txt");
				byte[] input = "하이".getBytes();
				os.write(input); // Exam_Write파일 은 배열을 개수를 나눠서 반환 이건 한번에 반환
				os.flush();
				System.out.println("파일 쓰기 완료");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			finally {
				try {
					os.close();
				}catch (IOException e) {
					
					e.printStackTrace();
				}
				
			}
			
	}

}
