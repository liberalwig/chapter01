package com.javaEx03; //09.조건문 중 swithch case문과 if문 비교(break없는 switch case)
					//다 ==라 할 지라도 열 두 달을 쓰는 건 아닐 것 같은데 그렇다고 짝홀 규칙이 있지도 않고 2월 예외달도 있음
					////2021.11.16(화)1:41PM수업 중. 그냥 다 ==일일이 하는 거였다;;;; 근데 switch안 쓰고 혼자 한 거 됨.
					//break 안 쓰면 다음 break 나올 때까지 넘어감. 강사님은 30일에 해당하는 거, 28일 쭉, 31일 쭉 써서 시작하심.
					//case는 순차적으로 쓸 필요가 없었음


import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
		int month = sc.nextInt();

			switch (month) {
				case 4:
				case 6:
				case 9:
				case 11:
					System.out.println("30일");
		
				case 2:
					System.out.println("28일");
					
				default :
					System.out.println("31일");
			
			}
			sc.close();
			
			
	}

}
		

		//수업 듣기 이전에 나 혼자서 성공했으나 swithc가 아님
		/*
		if (month<=7) {
			if (month==2) 
				System.out.println("28일");
			else if (month%2==1) 
				System.out.println("31일");
			else 
				System.out.println("30일");
		}
		
		else if (month>=8){
			if (month%2==0) 
				System.out.println("31일");
			else 
				System.out.println("30일");
		}
			*/
			
		
		
		//일일이 switch시도하다가 현자타임이 왔음
			/*
		switch (code) {
			case 1: 
				System.out.println("31");
				break;
				
			case 2:
				System.out.println("30");
				break;
				
			default:
				System.out.println("28");
			
		}
			*/
				
		
		
		
