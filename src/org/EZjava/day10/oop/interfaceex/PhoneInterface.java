package org.EZjava.day10.oop.interfaceex;

public interface PhoneInterface {
	/*인터페이스는 상수형 필드로만 가능
	 * 추상메소드로만 구성되어있따.*/
	
	public static final int TIMEOUT = 10000;
//	public String name = "일용자"; // 일반 필드는 사용 불가

	public  abstract void printLogo();
	// public void sendCall() {}; // 추상메소드이여야함 일반메소드 x
	void sendCall(); // public abstract 생략 가능
	public default void showLogo() {
		/*디폴트 메소드(기능 추가)
		 * 하위 호환성을 위해 작성하며
		 * 인터페이스의 보완 가능
		 * //
		 */	}
	
}
