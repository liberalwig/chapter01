package com.javaEx03;//09.조건문 중 조건문 연습문제-3

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int point = sc.nextInt();
		
		if (point%3=0) {System.out.println(point+"는 3의 배수입니다.");}
		else {System.out.println(point+"는 3의 배수가 아닙니다.");} 
		
		sc.close();
	}

}
