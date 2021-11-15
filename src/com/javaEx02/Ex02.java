package com.javaEx02;

import java.util.Scanner; //ctrl+Shift+O 동시

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //키보드(이름:sc라 작명)가 입력한 값을 읽어낼 수 있게 함. 키보드 쓰려고 준비만 한 상태.
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		System.out.println("입력하신 숫자는 " + num + " 입니다");
		
		sc.close(); //Scanner는 꼭 중간코드 짜기 이전에 먼저 닫아놓고 중간코드 짜러 진입하자. 이건 키보드 연결 종료한다는 뜻.
		
	}
}
