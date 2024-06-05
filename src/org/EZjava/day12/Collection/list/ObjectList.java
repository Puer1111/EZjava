package org.EZjava.day12.Collection.list;

public class ObjectList {
Object[] objects;
int size=0;

	public ObjectList() {
size = 0;
objects = new Object[3];
	}
	
	
	public void add(Object object) {
		objects[size]=object;
		size ++;
	}
	public Object get(int index) {
		return objects[index];
	}
	public int size() {
		return size;
	}
	

	public void clean() {
		objects = new Object[3];
		size = 0;
	}
	
}
