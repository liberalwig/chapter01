package com.javaex.ex03;//twice Done//09.조건문 중 if-else 조건문
				//2021.11.18(목)10:54 주어진 실습수업시간 중 돌아와서 복습

/*
[문제]
점수를 입력 받아
60점 이상이면 “합격입니다.”
60점 미만이면 “불합격입니다.”
를 출력하세요.
 */

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt();
		
		if(num>=60) {System.out.println("합격입니다.");} //입력한 값이 60점 "이상"이니? 중괄호는 대답이 true일 때만 실행되는 영역
		else {System.out.println("불합격입니다.");}
		
		System.out.println("프로그램 종료");
		sc.close();
	}
	
}

/*2021.11.18(목)10:54 주어진 실습수업시간 중 돌아와서 복습=>성공
앞에껀 60점 미만일 경우 무반응이고 뒤에껀 60점 미만일 경우 else붙여서 "불합격입니다"명시 


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("점수:");
	int num = sc.nextInt();
	
	if (num>=60) {
		System.out.println("합격입니다");
	}
		
	sc.close();
	
	
}

}


package com.javaex.ex03;

import java.util.Scanner;

public class Ex12forpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int num = sc.nextInt();
		
		if (num>=60) {
			System.out.println("합격입니다");
		}
		
		else {
			System.out.println("불합격입니다");
		}
		
		sc.close();
		
		
	}
*/