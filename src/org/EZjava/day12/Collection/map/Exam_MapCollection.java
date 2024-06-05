package org.EZjava.day12.Collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.EZjava.day07.oop.Member;
import org.EZjava.day12.Collection.student.Student;

public class Exam_MapCollection {
	public static void main(String[] args) {
// Collcetion: 저장소
		/*
		 * 자료 구조의 특성따라 선택해서 사용 List , set ,Queue, map ,Stack etc... //Map 에는 Key 가 있다
		 * Key 는 고유하며 중복 x value 는 Key 에 매핑 되는 값. Map = key-value로 구성 02- 서울 031 - 경기도
		 * 032 - 인천 033- 강원도 041 - 충청남도 042 - 대전 , 043 - 충청북도 044 - 세종특별시 051- 부산 052 -
		 * 울산 053 - 대구 054 - 경북 055- 경남 061 -전남 062 - 광주 063 - 전북 064- 제주 int 기본형인데 참조형
		 * 쓸 수 있게 해주는 클래스 -> Wrapper class
		 */
		Map<Integer, Object> map = new HashMap<Integer, Object>();
		map.put(1, new Student("이오", 100, 50));
		map.put(2, new Student("오이", 200, 30));
		System.out.println("첫번째 학생: " + map.get(1).toString());
		System.out.println("첫번째 학생: " + map.get(2)); // to string 생략 가능
//  생략 가능한거 
// toString()
// 자동형변환
// extends object
		// this
// 기본생성자   - > 상속 시 super() 생략
/// void 메소드 return 
/// java .lang 패키지

	}

	public Map<String, Object> mapExercise() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("연봉: ");
		long Salary = sc.nextLong();
		System.out.print("재직 여부(true/false): ");
		boolean isWorking = sc.nextBoolean();

		Map<String, Object> memberInfo = new HashMap<String, Object>();
		memberInfo.put("name", "name");
		memberInfo.put("Salary", "salary");
		memberInfo.put("isWorking", "isWorking");
		return memberInfo;

	}

	public void megaSample() {

		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("name", "아샷추");
		objMap.put("price", "3500");
		objMap.put("isGood", "true");

		String name = (String) objMap.get("name");
		boolean result = (boolean) objMap.get("isGood");
		System.out.println(name);
		System.out.println("추천여부 : " + result);

	}

	public void MapSample() {
		String region;
		Map<String, String> map = new HashMap<String, String>();

		map.put("02", "서울");
		map.put("031", "경기도");
		map.put("032", "인천");
		map.put("033", "부산");
		map.put("064", "제주도");

		System.out.println("저장된 데이터 수 : " + map.size());
		System.out.println("02 를 누르면 서울이 나옵니다: " + map.get("02"));
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("지역 번호 입력: ");
			region = sc.next();
			String result1 = map.get(region);
			if (result1 != null)

				System.out.println("입력하신 지역 번호에 대한 지역은 : " + result1);

			else
				System.out.println("데이터가 존재하지 않습니다");
		} while (!"exit".equals(region));
	}
}