package org.EZjava.day13.Collection.music.controller;

import java.util.List;

import org.EZjava.day12.Collection.student.Student;
import org.EZjava.day13.Collection.music.Music;
import org.EZjava.day13.Collection.music.model.ManageMusic;
import org.EZjava.day13.Collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String[] args) {
		ViewMusic view = new ViewMusic();
		ManageMusic mng = new ManageMusic();
		end: while (true) {
			int input = view.printMenu();
			List<Music> sList = null;
			int index = 0;
			switch (input) {
			case 1:
				Music music = view.addMusic("마지막");
				mng.registerMusic(music);
//			mng.LastregisterMusic(music);
				break;
			case 2:
				music = view.addMusic("첫 위치");
				mng.FirstregisterMusic(music);
				break;
			case 3:
				sList = mng.SelectAllMusic();
				if (sList.size() > 0) {
					view.displayMusic(sList);
				} else {
					view.displayMsg("노래가 없습니다");
				}
				break;
			case 4:
				String name = view.InputMusic("검색 ");
				music = mng.SearchMusicbyTitle(name);
				if (music != null) {
					view.displayMusic(music);
				} else {
					view.displayMsg("NO result");
				}
				break;
			case 5:
//				내 코딩
//				name = view.InputMusic("삭제");
//				if(name != null) {
//				mng.deleteMusic(name);
//				}
				name = view.InputMusic("삭제");
				index = mng.SearchMusicbyName(name);
				mng.DeleteMusic(index);
				break;
			case 6:
				name = view.InputMusic("수정");
//				수정할 위치
				index = mng.SearchMusicbyName(name);
				music = mng.SearchMusicbyTitle(name);
//				수정할 정보
				music = view.modifyMusic(index, music);
				mng.modifyMusic(index, music);
				break;
			case 7:
				mng.sortByTitleASC();
				break;
			case 8:
				mng.sortByTitleDESC();
				break;
			case 9:
				mng.sortBySingerASC();
				break;
			case 10:
				mng.sortBySingerDESC();
				break;
			case 0:
				view.displayMsg("종료되었습니다");
				break end;
			default:
				view.displayMsg("잘못 선택 하셨습니다");
				break;
			}
		}
	}
}