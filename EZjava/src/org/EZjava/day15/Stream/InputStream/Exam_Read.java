package org.EZjava.day15.Stream.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		 //InputStream <<  입력 바이트 스트림의 최상위 추상 클래스
		
//		InputStream is = new InpustStream(); // << 이거 안됨 추상클래스는                    
	InputStream is = null;
	int readByte;
	try {
		is = new FileInputStream("src/org/EZjava/day15/Stream/InputStream/reading.txt"); // InputStream 으로 입력 받는거니까 파일 가져와야함, 예외처리 try catch 사용
	do {
		readByte = is.read(); // 한글자 씩 읽는 메소드 
		System.out.print((char)readByte); // System.out 자체가 PrintStream
	}while(readByte != -1);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}
}
