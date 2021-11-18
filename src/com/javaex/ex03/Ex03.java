package com.javaex.ex03;//twice Done//09.조건문 중 if-else if-else조건문
				//다시 2021.11.18(목)11:05, 깨달음: else에 괄호조건 쓰면 오류남.
				//대신 마지막에 둔 거면서 else대신 else if는 써도 오류 안 남.

/*
[문제]
숫자를 입력받아 숫자가 0보다 크면 “양수” 
0보다 작으면 “음수” 
0일때는 “0입니다.”
을 출력하세요
*/

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
		
		int point = sc.nextInt();
		
		if(point>0) {
			System.out.println("양수입니다");
			}
		else if(point<0){
			System.out.println("음수입니다");
			}
		else System.out.println("0입니다");
		
		sc.close();
		}
	
}

/*
package com.javaex.ex03;//2021.11.18(목)11:05, get to know: else에 괄호조건 쓰면 오류남.
//대신 마지막에 둔 거면서 else대신 else if는 써도 오류 안 남.

import java.util.Scanner;

public class Ex12forpractice {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("숫자를 입력하세요");
System.out.print("숫자: ");
int num = sc.nextInt();

if (num>0) {
System.out.println("양수입니다.");
}

else if (num==0) {
System.out.println("0입니다.");
}

else if (num<0) {
System.out.println("음수입니다.");
}

sc.close();		
}

}
*/