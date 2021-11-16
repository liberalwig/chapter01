package com.javaEx03;//Done//09.조건문 중 조건문 연습문제-4//2021.11.16(화)10:58AM 수업 중 &&연산자로 두 조건 동시에 표현하기 배움

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요:"); //2021.11.16(화)10:56AM 수업 중: ln 없애기
		
		int num = sc.nextInt();
		
		//수업 중 선생님 교정: java에서는 한 식에 두 연산자 동시 기입이 안된다. 그래서 첫 질문에 논리연산자를 써보자.
		//나처럼 '이상'만 만족해도 되지만 두 조건 모두 만족해야 하므로 원칙적으론 동시에 만족하는 &&을 썼어도 좋음
		if (num>=90) {System.out.println("A등급");}
		else if (90>num && num>=80){System.out.println("B등급");} /*(num>=80)도 됐지만 새 방법.다만 중복이니까 삭제 가능*/
		//2021.11.15(월)18:14실습 중, 89>=num>=80 이렇게는 오류난다. 2021.11.16(화)10:58AM수업 중, T&&T로 가보자
		else if (80>num && num>=70) System.out.println("C등급");
		else if (70>num && num>=60) System.out.println("D등급");
		else if (num<60) System.out.println("F등급");
			
		sc.close();
	}

}
