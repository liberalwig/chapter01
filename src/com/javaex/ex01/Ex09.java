 package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args){
	
		//논리 연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 &&: 깐깐하다
		System.out.println("논리연산자&&");
		System.out.println(true&&true); //true
		System.out.println(true&&false);
		System.out.println(false&&true);
		System.out.println(false&&false);
		
		//논리연산자 && 응용
		System.out.println("논리연산자&& 응용");
		System.out.println( (a>b)&&(a<b) ); //F&&T= F
		System.out.println( (a>b)&&(a>b) ); //F&&F = F
		
		//논리연산자 ||: 느슨하다
		System.out.println("논리연산자 ||");
		System.out.println(true||true);
		System.out.println(true||false);
		System.out.println(false||true);
		System.out.println(false||false);
		
		//논리연산자 || 응용
		System.out.println("논리연산자}} 응용");
		System.out.println( (a>b)||(a<b) ); //true. 발견한 건, 서로 다른 a,b 크기 다르면 이 경우 무조건 한 쪽은 맞음
		System.out.println( (a>b)||(a>b) ); //false
		
		//논리연산자 !: 결과값의 반대
		System.out.println("논리연산자!");
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		System.out.println(a>b); //5>7이니? False
		System.out.println( !(a>b) ); //true
				
	}
}