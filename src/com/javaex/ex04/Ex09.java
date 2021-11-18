package com.javaex.ex04;//10.반복문 중 반복문 연습문제

import java.util.Scanner;

/*[문제]
 숫자를 입력받아 3의 배수인지 판별하는 프로그램을 작성하세요.
 0이 입력되면 프로그램이 종료됩니다.
 */

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//while뒤 괄호에 true를 넣는 게 어색하면 이 위애 boolean action = true;로 놓고 while(action)해
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num==0) {//0이면 바로 종료
				System.out.println("종료");
				break;
			}
			
			else if (num%3==0) {
				System.out.println("3의 배수입니다.");
			}	
			else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		sc.close();
		
		
		
	}

}
		
		
		
		/* 이렇게 if쓸 필요가 없는 게, 0이 아니면 모든 케이슨 else니까.
		if(num!=0) {//0이 아니면 num이 3의 배수인지 물어야 해
			{
		}
		*/
		
		
		
		

		
		/*실패
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		while (num==0) {
			System.out.println("종료");
		}
		
		while (num!=0) {
			if (num%3==0) {
				System.out.println("3의 배수입니다.");
			}
			
			else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
	}
	
		*/
		
		
		
		
		