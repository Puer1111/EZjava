package org.EZjava.day14.JavaAPI;

import java.util.Calendar;

public class Exam_calendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);

		System.out.println(today.get(Calendar.YEAR) + "년");
		System.out.println(today.get(Calendar.MONTH) + 1 + "월");
		System.out.println(today.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println(today.get(Calendar.DATE) + "일");
		System.out.println(today.get(Calendar.HOUR) + "시");
		System.out.println(today.get(Calendar.HOUR_OF_DAY) + "시");
		System.out.println(today.get(Calendar.MINUTE) + "분");
		System.out.println(today.get(Calendar.MILLISECOND) + "초");
		System.out.println(today.get(Calendar.SECOND) + "초");
		System.out.println(today.get(Calendar.AM_PM)); // 1이 PM

		Calendar startDate = Calendar.getInstance();
		printDate("개강한 날은", startDate);
		System.out.print(startDate.get(Calendar.YEAR)+"년");
		System.out.print(startDate.get(Calendar.MONTH)+"월");
		System.out.print(startDate.get(Calendar.DAY_OF_MONTH)+2+"일");
		System.out.print(startDate.get(Calendar.HOUR)+5+"시");
		System.out.print(startDate.get(Calendar.MINUTE)-2+"분");
		System.out.print(startDate.get(Calendar.SECOND)+"초");
		System.out.print(startDate.get(Calendar.MILLISECOND)+"초");
		//개강 날은 24-05-07 화요일 (09시) 00분 0초 0밀리초
		
	}

	public static void printDate(String title, Calendar Date) {
	
	}
}
