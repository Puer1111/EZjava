package org.EZjava.day13.Collection.music.model;

import java.util.Comparator;

import org.EZjava.day13.Collection.music.Music;

public class DescTitle implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
	
		return o1.getTitle().compareTo(o2.getTitle()) * -1 ;
	}

}
