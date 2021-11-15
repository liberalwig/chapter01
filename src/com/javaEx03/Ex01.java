package com.javaEx03;// Done

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt();
		
		if(num>=60) {System.out.println("합격입니다.");} //입력한 값이 60점 "이상"이니? 괄호는 대답이 true일 때만 실행되는 영역
		else {System.out.println("불합격입니다.");}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
	
}