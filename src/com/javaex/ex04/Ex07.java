package com.javaex.ex04;//10.반복문 중 for 반복문 연습문제(중첩 반복문)
						//print로 하는 건 생각도 못했고 *모양의 char를 i개 반복해주고
						//그렇게 주문한 println을 여섯 번 쓰는 거라 생각했다.나는, 세로축은 for아예 적용 안 한 거
						//=>질문 후: 문자열에는 곱하기가 원래 불가. 파이썬만 가능. 더하기만 자바에서 허용해줌
						//바깥 조건문을 x<=y 로 하면 어떨까?! 될 것 같은데
						//대박: x=y일때만 찍는 방법이었다. x가 어디까지 갈 거냐는 y에따라(몇 번째 줄이냐)결정

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int y = 1; y<=6; y++) {
			for (int x = 1; x<=y; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}	

	}

}


/*cf) 영림 씨 방법: 아, 이게 내가 처음에 생각했던 거랑 더 가깝다. 이렇게 하며 for안에 for를 넣을 필요 없이 하나면 돼
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String star = "*"
		sum = sum + "*"
		
		for(int y = 1; y<=6; y++){
			System.out.println(star);
			star = star + "*";
			}
			System.out.println("");
		}	

	}

}
*/