package org.EZjava.day15.Stream.file.exercise;

import java.io.File;

public class Exam_ShowFileList {

	public static void main(String[] args) {
	File file =new File("C:\\windows");
	System.out.println("-----"+ file.getPath()+ " 의 서브 리스트 ---------");
	File[] subFiles = file.listFiles();
	for(int i = 0; i< subFiles.length; i ++) {
		File fOne = subFiles[i];
		long time = fOne.lastModified();
		String filename = fOne.getName();
		long fileSize = fOne.length();
		System.out.printf("%-35s",filename);
		System.out.printf("파일 크기: "+ fileSize + "\t");
		System.out.printf("수정한 시간 : %tb %td %ta %tT \n" , time,time,time,time);
	}
	}

}
