package com.javaex.ex04;//10.반복문 중 for 반복문 연습문제(중첩 반복문)//출제의도: for안에 for개념 명확히
						//2021.11.17(수) 15:53신기하다
						//강사님 설명 듣고 한번에 짜긴 했는데 가장 겉 for가 세로축을 위한 거라는 상상을 못함
						//y라는 변수는 가상의 개념이지 실질적으로 세로축의 의미를 가지려면 '행갈이'라는 action필요

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int y = 1; y<=6; y++) {
			
			for (int x = 1; x<=6; x++) {
				System.out.print("*");
		}
		System.out.println("");
		}

	}

}