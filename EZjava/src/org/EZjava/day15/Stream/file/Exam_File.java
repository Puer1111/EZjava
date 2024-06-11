package org.EZjava.day15.Stream.file;

import java.io.File;
import java.io.IOException;

public class Exam_File {
public static void main(String[] args) throws IOException {
	File folderMake = new File("src/org/EZjava/day15/Stream/file/Sample.txt");
	if(!folderMake.exists()) {
		folderMake.mkdir();
		System.out.println("폴더가 만들어졌다");
	}else {
		System.out.println("이미 폴덕 존재한다");
	}
}
public void fileMake() throws IOException{
	File filemake = new File("src/org/EZjava/day15/Stream/file/Sample.txt");
	if(!filemake.exists()) {
		filemake.createNewFile();
		System.out.println("파일이 만들어 졌다");
	}else {
		System.out.println("이미 파일이 있다.");
	}
}
public void fileBasic() {	
	File file = new File("C:\\Temp\\copied.png");
	String filename = file.getName();
	String path = file.getPath();
	String parent = file.getParent();
	System.out.println("파일 이름: " + filename);
	System.out.println("파일 경로: " + path);
	System.out.println("부모 폴더: "  + parent);
	System.out.println("파일이 존재하는가? : " + file.exists());
	System.out.println("파일이 맞는가? : "+ file.isFile());
	System.out.println("폴더가 맞는가? : "+ file.isDirectory());
}
}