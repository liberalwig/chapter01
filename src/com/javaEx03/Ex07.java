package com.javaEx03;//Done//09.조건문 중 조건문 연습문제-4

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("점수를 입력하세요:");
		
		int num = sc.nextInt();
		
		if (num>=90) System.out.println("A등급");
		else if (num>=80) System.out.println("B등급"); //2021.11.15(월)18:14실습 중, 89>=num>=80 이렇게는 오류난다
		else if (num>=70) System.out.println("C등급");
		else if (num>=60) System.out.println("D등급");
		else if (num<60) System.out.println("F등급");
			
		sc.close();
	}

}
