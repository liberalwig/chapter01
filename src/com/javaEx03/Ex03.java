package com.javaEx03;//Done

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
