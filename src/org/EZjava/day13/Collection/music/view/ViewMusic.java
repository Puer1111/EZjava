package org.EZjava.day13.Collection.music.view;

import java.util.List;
import java.util.Scanner;

import org.EZjava.day13.Collection.music.Music;

public class ViewMusic {
	private Scanner sc;

	public ViewMusic() {
		sc = new Scanner(System.in);
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 메인 메뉴 ===");
		System.out.println("1.마지막 위치에 곡 추가");
		System.out.println("2.처음 위치에 곡 추가");
		System.out.println("3.전체 곡 목록 출력");
		System.out.println("4.특정 곡 검색");
		System.out.println("5.특정 곡 삭제");
		System.out.println("6.특정 곡 정보수정");
		System.out.println("7.곡명 오름차순 정렬");
		System.out.println("8.곡명 내림차순 정렬");
		System.out.println("9.가수명 오름차순 정렬");
		System.out.println("10.가수명 내림차순 정렬");
		System.out.println("0.종료");
		System.out.println("메뉴 선택: ");
		int choice = sc.nextInt();
		return choice;
	}

	public Music addMusic(String category) {

		System.out.println(category + "에 추가 할 곡  ");
		System.out.println("곡명: ");
		String title = sc.nextLine();
		System.out.println("가수명: ");
		String singer = sc.nextLine();

		Music music = new Music(title, singer);
		return music;
	}

	public void displayMusic(List<Music> sList) {
		System.out.println("===음악 정보 출력===");
		for (Music music : sList) {
			System.out.println("곡: " + music.getTitle());
			System.out.println("가수: " + music.getSinger());
			System.out.println("===============");
		}
	}

	public void displayMusic(Music music) {
		System.out.println("===음악 정보 출력===");
		System.out.println("곡: " + music.getTitle());
		System.out.println("가수: " + music.getSinger());
		System.out.println("===============");
	}

	public String InputMusic(String category) {
		System.out.print("특정 곡" + category);
		String title = sc.nextLine();
//		Music music = new Music(title);
		return title;
	}

	public void displayMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	public Music modifyMusic(int index, Music music) {
		System.out.println("곡명 :");
		String title = sc.nextLine();
		System.out.println("가수명 :");
		String singer = sc.nextLine();
		music.setTitle(title);
		music.setSinger(singer);
		return music;
		return null;
	}
}
