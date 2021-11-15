package com.javaEx03; //09.조건문 중 조건문 연습문제-1

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
				
			System.out.print("근무시간:");
			int hour = sc.nextInt();
			
			int outcomehour = 10000*hour;
			int outcomehourover8 = 12000*(hour-8)+80000;
			
			if (hour<=8) {System.out.println("임금은"+outcomehour+"원 입니다.");}
			else if (hour>8) {System.out.println("임금은"+outcomehourover8+"원 입니다");}	
			
		sc.close();
	}

}
