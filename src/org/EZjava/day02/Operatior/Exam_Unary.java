package org.EZjava.day02.Operatior;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단항 연산자
//		a++ , ++a-> a=a+1;
		
		int a1=1;
		
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		
//		문제1

//		a=10  b=20 c = 30
//		a++
//		a= 11 b = 20 c= 30
//	 	b=(--a) + b;
//		a = 10 b =30 c = 30
//		c=(a++) + (--b);
//		 a= 11 b = 29 c = 39
//		a,b,c ???
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		b= (--a)+b;
		c = (a++) + (--b);
		System.out.println("a: " + a + ", b: "+b+", c:" + c  );
		
		
		
		
		boolean flag = true;
		flag = !!!!flag ;
		System.out.println(flag);
		
		int x=100; 
		int y= 33;
		int z =0;
		
		x--;
		z= (x--) + (--y);
		x= 99 + (x++) +x;
		y=(y--) + y + (++y);
	
		System.out.println("x:" + x + ", y : "+ y + ", z : " + z);
	}
	
}
