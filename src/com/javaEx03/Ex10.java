package com.javaEx03;//09.조건문 중 switch-case 조건문
					//2021.11.16(화)12:04PM수업, 모든 조건문이 ==인 케이스를 위한 새 문법(switch)제시.

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		System.out.println("코드를 입력하세요");
		System.out.println("1.자바 2.C 3.C++ 4.파이썬");
		System.out.print("과목번호:");
		
		int code = sc.nextInt();
		
		switch(code) {
			case 1: 
				System.out.println("R101호입니다");
				break;
				
			case 2: 
				System.out.println("R202호입니다");
				break;
			
			case 3: 
				System.out.println("R303호입니다");
				break;
			
			case 4: 
				System.out.println("R404호입니다");
				break;
		
			default:
				System.out.println("상담실");
				break;
		}
		
		
		sc.close();
		
	}

}
