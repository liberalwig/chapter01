package com.javaEx03;//09.조건문 중 조건문 연습문제-2 /1.5를 곱하므로 double형 변수인데 int로 잡아서 실수함. 그런데 1.5할 필요 없었네

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("근무시간:");
			int hour = sc.nextInt();
			
			int outcomehour = 10000*hour;
			int outcomehourover8 = 15000*(hour-8)+80000;
			
			if (hour<=8) {
				System.out.println("임금은"+outcomehour+"원 입니다.");
				}
			
			
			else if (hour>8) {
				System.out.println("임금은"+outcomehourover8+"원 입니다");
				}	
	
			sc.close();
	}

}
