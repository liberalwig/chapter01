package com.javaex.ex04;//10.반복문 중 반복문continue//2021.11.18(목)14:03//출제포인트:||, continue

/*
[문제]
1에서 20까지의 수에서 2의배수와 3의배수를 제외한
숫자를 출력하세요. (for문, continue문사용)
*/

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=20; i++) {
			if( (i%2==0) || (i%3==0) ) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
