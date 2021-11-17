package com.javaex.ex03;//Done//09.조건문 중 조건문 연습문제(중복if문)
					//2021.11.16(화)11:14AM 수업 중, if문은 if와 if else포괄
					//강사님은, num>0 먼저 묻고 num<0물어서 음수와 0을 가른다. num>0으로 돌아와서 양수인진 묻지 않았으므로 짝홀수판별
					//2021.11.16(화)11:45AM 수업 중, 최초 if 속에 if 넣기: tab과 줄 맞추기 제대로

					//앞 등급문제때처럼 두 조건 동시 충족해야 할 경우의 표기법 불확실
					//num>0삭제하니 돼/그런데-20보고 짝수라하면 안되고 음수 나와야 하니 맨앞에 num>0조건문 주긴 줘야 할 듯
					//음수 조건이 까다로우니 else를 "0입니다"에서 "음수입니다"로 바꿨는데 될 것 같다->안되네!-20보고 계속 짝수래
					//순서를 음수부터 쳐내자. 1st condition부터 순서를 음수-0-자연수 중 홀수-자연수 중 짝수로 변경. 될 것 같다->성공
					//나는 처음에 짝수,홀수->음수->0으로 좁혀감. 우선 음수부터 쳐냈어야 맞나봐.

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
	
		int num = sc.nextInt();

		
		//질문하면서 알게 된 건데, 해야될 일이 한 줄이면 {}이 괄호 생략 가능한데 두 개 이상일 시 항상 쳐야해. 내가 안 치고 우연히 된 경우임
		//2021.11.16(화)11:40AM수업 중, if 속에 if 넣는 걸로 다시 짜보자+tab이랑 줄맞추기 잘하기
		
		if (num>0) {
					if(num%2==0) {System.out.println("짝수");}
					else {System.out.println("홀수");}
					}
			
		else if (num<0) {System.out.println("음수");	}
		else {System.out.println("0");}
		
		
		
		
		/*if (num<0) { 
			System.out.println("음수입니다");
			}
		else if (num==0) {
			System.out.println("0입니다");
			}
		
		else if (num%2==1) {
			System.out.println("홀수입니다");
			}
		else if (num%2==0) {
			System.out.println("짝수입니다");
			}*/
		sc.close();
	}

}
