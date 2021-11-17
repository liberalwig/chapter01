package com.javaex.ex04;//10.반복문 중 for 반복문 연습문제(중첩 반복문)//출제의도: for안에 for개념 명확히
						//2021.11.17(수) 15:53신기하다, print로 하는 건 생각도 못했고 *모양의 char를 i개 반복해주고
						//그렇게 주문한 println을 여섯 번 쓰는 거라 생각했다.나는, 세로축은 for아예 적용 안 한 거
						//=>질문 후: 문자열에는 곱하기가 원래 불가. 파이썬만 가능. 더하기만 자바에서 허용해줌.
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