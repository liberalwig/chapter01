package com.javaex.ex01; 

public class Ex01 {

	public static void main(String[] args) {
		
		int myAge;
		myAge = 25;
		System.out.println(myAge); //화면에 찍어주는 기능
		
		myAge = 26;
		System.out.println(myAge);
		
		// -32,768 ~ 32,767
		//short bVar = 32768; 에러날 거야. int로 넘어가야 한다.
		
		//-2147483648 ~ 2147483647
		//int bVar = 2147483648; 에러날 거야. long으로 바꿔줘야 한다.
		
		//int보다 큰 long형은 맨 끝에 L을 붙여줘야 한다. 따라서 int 끝값 외우는 게 좋겠지만 불안하니 그냥 long형이면 붙여버려
		
		/*
		int var01;
		int var02;
		int var03;
		
		var01 = 10;
		var03 = 30;
		var02 = 20;
		
		System.out.println(var03);
		System.out.println(var02);
		System.out.println(var01);
		//"메모리에 var01이란 이름의 공간을 잡아라"라는 뜻
		*/
		
		
		int var01 = 10;
		int var02 = 20;
		int var03 = 30;
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		
		/*int var01 = 10, var02 = 20; var03 = 30;*/
		
	}
	
}
