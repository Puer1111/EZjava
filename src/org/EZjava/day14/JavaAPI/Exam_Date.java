package org.EZjava.day14.JavaAPI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat trans1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String transDate1 = trans.format(date);
		System.out.println("형식 변환 : " + transDate1);
		String transDate2 = trans1.format(date);
		System.out.println("형식 변환2 : " + transDate2);

		Calendar calendar = new GregorianCalendar(); // 추상 클래스라 객체 생성 x
		System.out.println(calendar.getTime());
		String changed = trans.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 변환: " + changed);
	}

}
