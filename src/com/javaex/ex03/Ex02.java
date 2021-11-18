package com.javaex.ex03;//twice Done//09.조건문 중 if조건문
						//2021.11.18(목)11:05

/*
[문제]
점수를 입력받아
점수가 60점 이상이면 “합격입니다.” 를 출력하세요
*/

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt();
		
		if (num>=60) {
			System.out.println("합격입니다.");
		}
		
		sc.close();
	}

}


