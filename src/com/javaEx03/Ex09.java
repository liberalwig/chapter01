package com.javaEx03;//Done// 09.조건문 중 if-else if else 연습문제(조건 ==)
					//강의실 번호를 특정하는 게 문제인걸까?//앞에서처럼 =아니라==
					//고민:복수 개 이상 조건이 올 경우를 대비해 대괄호를 쓰고 한 조건이어도 br하는 건 알겠는데 내 눈엔 가독성 낮은데 어쩌지.
					//모두 ==인 경우를 다음Ex에서 switch로 제시
					

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬 ");
		System.out.print("과목번호:");
		
		int code = sc.nextInt();
		
		if (code==1) //2개 이상일 경우를 대비해서 대괄호 꼭 넣어주기. 이 또한 우연히 된 경우
			System.out.println("R101호");

		else if (code==2)
			System.out.println("R102호");

		else if (code==3)
			System.out.println("R103호");
		
		else if (code==4)
			System.out.println("R104호");
		
		else
			System.out.println("상담원에게 문의하세요");
		
		
	}

}
