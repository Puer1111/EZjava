package org.EZjava.day14.JavaAPI;

public class Exam_String {

	public static void main(String[] args) {
	String msg = "Hello Java";// 상수풀에 들어가서 재사용될 수 있음
	msg = new String ("Heelo Java"); // 주소가 새로이 생성
	
	String data1 = new String("C#");
	String data2 = new String("C++");
	System.out.println(data1+ "의 길이는 "  + data1.length());
	System.out.println(data2+ "의 길이는 "  + data2.length());
	
	//문자열 포함되어 있는지 체크 
	System.out.println("#이 있는가 ? :" + data1.contains("#"));
	//문자열 연결
	//C# , C++
	data1 = data1.concat(data2);
	System.out.println("연결된 문자열: "+ data1);
	//문자열 공백제거
	data1 = data1.trim(); // 공백 제거
	System.out.println("공백 제거 확인: "+ data1 );
		
	//문자열 교체 C# - > JAVA
	data1 = data1.replace("C#", "JAVA");
	System.out.println("문자열 교체 확인: "+ data1);
	//문자열 자르기1 - 기준잡고 자르기
	String[]words = data1.split(",");
	for(String word : words){
		System.out.println(word  + "/");
	}
	// 문자열 자라ㅡ기 2 - 인덱스로 자르기
	System.out.println("문자열 자르기 : "+ data1);
	data1 = data1.substring(0, 4);
	System.out.println("범위로 자르기: " + data1);
	//문자열 - > 문자
	char word = data1.charAt(0);
	System.out.println("문자로 자르기 : " + word);
	
	
	
	}
}
