package com.javaex.ex03;//2021.11.18(목)11:23, 전과 달리 income변수 잡아주고 뒤 안 지저분하게 다시 함

import java.util.Scanner;

public class Ex12forpractice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int hour = sc.nextInt();
		
		int income;
		
		if (hour<=8) {
			income = 10000*hour;
		}
		
		else {
			income = 12000*(hour-8)+(10000*8);
		}
		
		System.out.println("임금은 "+income+"입니다.");
		
		sc.close();
	}

}
