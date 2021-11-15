package com.javaEx03;//09.조건문 중 조건문 연습문제(중복if문) /앞에서 등급문제때 처럼 두 가지 조건을 충족해야 할 경우의 표기법 불확실

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자");
	
		int num = sc.nextInt();
		
		if (num>0) (num%2=1)
			System.out.println("홀수입니다");
		else if (num>0) (num%2=0)
			System.out.println("짝수입니다");
			
		else if (num<0)
			System.out.println("음수입니다");
		
		else 
			System.out.println("0입니다");
	
	
		sc.close();
	}

}
