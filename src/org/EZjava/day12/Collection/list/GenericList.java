package org.EZjava.day12.Collection.list;

public class GenericList<T> {

	Object[] objects;
	int size = 0;

	public GenericList() {
		size = 0;
		objects = new Object[3];
	}

	public void add(T object) {
		objects[size] = object;
		size++;
	}

	public T get(int index) {
		return (T)objects[index];
	}

	public int size() {
		return size;
	}

	public void clean() {
		objects = new Object[3];
		size = 0;
	}

}
