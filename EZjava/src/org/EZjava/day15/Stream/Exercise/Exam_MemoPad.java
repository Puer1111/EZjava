package org.EZjava.day15.Stream.Exercise;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Writer writer = null;
		System.out.print("저장할 파일 입력: ");
		String Filename = sc.nextLine();
		String dest = "src/org/EZjava/day15/Stream/Exercise/" + Filename + ".txt";

		try {
			writer = new FileWriter(dest); // 파일 만들어지고 입력받을 준비 완
			System.out.println("종료는 exit ");
			for (int i = 1;; i++) {
				System.out.print(i + ": "); // 순서 출력
				String text = sc.nextLine(); // 데이터 입력
				if ("exit".equals(text)) //NULLforException 방지 
					break;
				writer.write(text + "\n");
				writer.flush();
			//		System.out.println("종료 되었습니다.");
				
			}

			System.out.println("파일 저장이 완료되었습니다 F5를 눌러 확인해보세요");
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
