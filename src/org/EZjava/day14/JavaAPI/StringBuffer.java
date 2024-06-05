package org.EZjava.day14.JavaAPI;

import java.io.PrintStream;

public class StringBuffer {
// 여러개 메모리를 하나로 합치는거
	public static void main(String[] args) {
		String data1="Hello";
		String data2="";
		String data3="Java";
// data1= data1+data2 +data3;
//		data1=data1.concat(data2).concat(data3);
		System.out.println("연결된 문자열: "+ data1);
		StringBuffer stb= new StringBuffer();
		stb.append(data1).append(data2).append(data3);
		System.out.println("연결된 문자열: " + data1);
	}

	private PrintStream append(String data1) {
		// TODO Auto-generated method stub
		return null;
	}

}
