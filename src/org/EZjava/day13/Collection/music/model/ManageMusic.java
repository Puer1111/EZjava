package org.EZjava.day13.Collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.EZjava.day13.Collection.music.Music;

public class ManageMusic implements ManageInterface {
	private List<Music> sList;

	public ManageMusic() {
		sList = new ArrayList<Music>();
	}

	public void registerMusic(Music music) {
		sList.add(music);
	}

	public void FirstregisterMusic(Music music) {
		sList.add(0, music);
	}

//	public Map<String,Object> searchModifyMusic(String title, String singer){
//		if(title != null) {
//			Map<String ,Object> result = new HashMap<String , Object>();
//			for(int i =0 ; i <sList.size(); i++) {
//				Music music = sList.get(i);
//				if(title.equals(music.getTitle())&& singer.equals(music.getSinger())) {
//					result.put("Title",music);
//					result.put("Singer",music);
//					return result;
//				}
//			}
//		}
//		return null;
//	}
	public Music SearchMusicbyTitle(String name) {
		if (name != null && name != "") {
			for (Music music : sList) {
				if (name.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}

	public Music deleteMusic(String name) {
		for (Music music : sList) {
			if (name.equals(music.getTitle())) {
				sList.remove(music);
			}
		}
		return null;
	}

	public void DeleteMusic(int index) {
		sList.remove(index);
	}

	public List<Music> SelectAllMusic() {
		// TODO Auto-generated method stub
		return sList;
	}

	public int SearchMusicbyName(String name) {
		if (name != null && name != "") {
			int index = 0;
			for (Music music : sList) {
				if (name.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}
		return 0;
	}

	public void modifyMusic(int index, Music music) {
		sList.set(index, music);

	}

	public void sortByTitleASC() {
//	List <String> strList=new ArrayList<String>();
//	strList.add("하이");
//	strList.add("바이");
//	strList.add("이하");
	Collections.sort(sList);
// Compare to 를 오버라이딩 해줘야함 , Music 상단에 Comparable 확인
		
		
		//		int nums[] = { 4, 3, 2, 1 };
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = 0; j < (nums.length - 1) - i; j++) {
//				Music music1 = sList.get(j);
//				Music music2 = sList.get(j + 1);
////				객체비교는 부등호 로는 무리.
////				비교 대상은 곡명.
////				title 을 비교하여 ㄱ 보다 늦은 순서인 경우 교체
//				if (music1.getTitle().compareTo(music2.getTitle()) > 0) {
////					Music temp = music1;
//					sList.set(j, music2);
//					sList.set(j + 1, music1);
//				}
//
//			}
//		}
//		for (int num : nums) {
//			System.out.println(num + "");
//		}
	}

	public void sortByTitleDESC() {
		Collections.sort(sList,new DescTitle());
		//		int nums[] = { 4, 3, 2, 1 };
//		for (int i = 0; i < nums.length - 1; i++) {
//			for (int j = 0; j < (nums.length - 1) - i; j++) {
//				Music music1 = sList.get(j);
//				Music music2 = sList.get(j + 1);
////				객체비교는 부등호 로는 무리.
////				비교 대상은 곡명.
////				title 을 비교하여 ㄱ 보다 늦은 순서인 경우 교체
//				if (music1.getTitle().compareTo(music2.getTitle()) < 0) {
////					Music temp = music1;
//					sList.set(j, music2);
//					sList.set(j + 1, music1);
//				}
//
//			}
//		}
//		for (int num : nums) {
//			System.out.println(num + "");
//		}
	}

	public void sortBySingerASC() {

		int nums[] = { 4, 3, 2, 1 };
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < (nums.length - 1) - i; i++) {
				Music music = sList.get(j);
				Music music1 = sList.get(j + 1);
				if (music.getSinger().compareTo(music1.getSinger()) > 0) {
					sList.set(j, music);
					sList.set(j + 1, music1);

				}

			}
		}
		for (int num : nums) {
			System.out.println(nums + "");
		}
	}

	public void sortBySingerDESC() {
		// TODO Auto-generated method stub

	}
}
