package com.javaex.ex03;//twice Done,slightly better//09.조건문 중 조건문 연습문제-3/
						//=가 아니라 ==로 했어야 한다. ==로 변경하니 바로 다 된다./값에 -21넣었더니 3의 배수
						//2021.11.18(목)12:08, 칸 들여쓰기가 나아짐
/*
[문제]
점수를 입력받아 입력된 수가
3의 배수인지 판별하는 프로그램을 작성하세요		
*/

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
		
		System.out.println("점수를 입력하세요");
		int num = sc.nextInt();
		
		if (num%3==0) {
			System.out.println(num+"은(는) 3의 배수입니다.");
		}
		
		else {
			System.out.println(num+"은(는) 3의 배수가 아닙니다.");	
		}
	
	sc.close();
	}

}


/*옛 버전
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("점수를 입력하세요");
	int point = sc.nextInt();
	
	if (point%3==0) {System.out.println(point+"는 3의 배수입니다.");}
	else {System.out.println(point+"는 3의 배수가 아닙니다.");} 
	
	sc.close();
*/