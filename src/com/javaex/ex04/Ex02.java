package com.javaex.ex04;//2021.11.17(수)11:00, count세는 변수를 index의 abb인 i를 많이 씀.패인은 +였음

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan = sc.nextInt();
		
		int i = 1;
		
		while (i<=9) {
			System.out.println(dan+"*"+i+"="+(dan*i));
			i++; //i=i+1;도 가능한 표현
		}
		
		sc.close();
		}
	
}
		/*실패3
		int num = sc.nextInt();
		int i = 1;
		
		while (i<10) {
			System.out.println(num"*"i"="(num*i));
			i++;
		}
		*/
		
		/*실패2
		int num = sc.nextInt();
		int i = 1;
		
		while (i<10) {
			System.out.println(num "* i = (num*i)");
			i++;
		}
		*/
				
		/*실패1: num*k=(num*k)가 9개 나옴
		int num = sc.nextInt();

		int k = 1;
		while (k>=1 && k<10) {
			System.out.println("num*k=(num*k)");
			k++;	
		}
		
		sc.close();
		*/
		