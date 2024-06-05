package org.EZjava.day14.JavaAPI;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {

	public static void main(String[] args) {
		String query = "namejames&addr=seoul&age=22";
		String words[] = query.split("[&=]");
		for (String word : words) {
			System.out.println(word + "");
		}
		System.out.println();

		StringTokenizer st = new StringTokenizer(query, "&=");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}

}
