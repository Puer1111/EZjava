package org.EZjava.day15.Stream.Exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		int readCount;
		try {
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\Image20240610143445.png");
			os = new FileOutputStream("c:\\Temp\\copied.png");
			byte[] bt = new byte[1024];
			while(true) {
			readCount = is.read(bt);
			if(readCount == -1 )break;
			os.write(bt,0,readCount);
			os.flush();
			}
			System.out.println("이동 완");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				os.close();
				is.close();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}

