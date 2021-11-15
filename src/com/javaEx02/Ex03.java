package com.javaEx02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //메모리에 사용자가 키보드 통해 입력한 값이 들어가면 넣어라
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		
		String name  = sc.nextLine(); //기본자료형은 대체로 이름이 같은데 string은 nextString이 아니네!
		
		System.out.println("당신의 이름은 "+name+"입니다");
		
		sc.close();
	}
}
