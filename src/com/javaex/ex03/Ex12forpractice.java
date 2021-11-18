package com.javaex.ex03;//2021.11.18(목)11:23, 전과 달리 income변수 잡아주고 뒤 안 지저분하게 다시 함
						//그런데 출력값이 double이 아닌걸로 설정됐기 때문에+1.5배의 10000원은 자동int되니까
						//변수의 자료형을 double말고 int로 재설정=>오 그런데 income을 int로 잡고나서 
						//else income에 1.5 넣으니까 오류로 뜸. ()를 넣으면 될까=>안되네.그냥int로 하고 15000

import java.util.Scanner;

public class Ex12forpractice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int hour = sc.nextInt();
		int income;
		
		if (hour<=8) {
			income = 10000*hour;
		}
		
		else {
			income = 15000*(hour-8)+(10000*8);
		}
		
		System.out.println("임금은 "+income+"입니다.");
		
		
		sc.close();

	}

}
