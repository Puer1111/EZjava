package org.EZjava.day05.Exception.exercise;

public class Exercise_Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String word = null;
			try {
			if(word.equals("키위")) {
				System.out.println("맞");
			}
			
			else {
				System.out.println("틀");
			}
			}
			catch(NullPointerException e){
				System.out.println("NULL값을 참조 하였다");
			}
			
	}
}
