package com.javaex.ex04;//10.반복문 중 for반복문 연습문제=>개인실습 후 2021.11.17(수)14:00수업하면서


public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum = 0;
		for (int i = 1; i<11 ; i++) {
			sum = sum + i;
			System.out.println(i+"까지의 합은 "+sum+"입니다.");
		}
		
		System.out.println("1부터 10까지의 정수의 합은 "+sum+"입니다.");
		
		/*while로 해보기
		
		int i = 1;
		int sum = 0;
		 
		while (i<11) {
		sum=sum+i;
		System.out.println(i+"까지의 합은 "+sum);
		i=i+1;
		}
		*/

		
			
		
	}

}
