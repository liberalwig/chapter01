package com.javaEx02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine(); //메모리에 name이라는 변수 만들어서 값 넣기
		
		System.out.println("나이를 입력해주세요"); //넣은 값 출력하기
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다");
		//숫자 받고 문자를 받으면 순서가 이상해진다는 버그가 있다고 한다
		
		sc.close();
		
		//github실험중

	}
}
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		String name = sc.nextLine(); //메모리에 name이라는 변수 만들어서 값 넣기
		
		System.out.println("나이를 입력해주세요"); //넣은 값 출력하기
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다");
		//숫자 받고 문자를 받으면 순서가 이상해진다는 버그가 있다고 한다.
		이에 대한 수정 보안 방법은 PPT다음 장에 상술돼 있음
		
		sc.close();
	}
		*/
		
		
		/*질문 드려서 답변 받음. 
		/*커서의 위치가 문자열이 시작되는 위치에 있지 않다고 해서 놀라지말자, 그냥 원래 그렇다*/
		
			
