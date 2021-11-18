package com.javaex.ex03;//twice Done,better//09.조건문 중 조건문 연습문제-2/
						//1.5를 곱하므로 double형 변수인데 int로 잡아서 실수함. 그런데 1.5할 필요 없었네
						//2021.11.18(목)11:23, 전과 달리 income변수 잡아주고 뒤 안 지저분하게 다시 함
						//그런데 출력값이 double이 아닌걸로 설정됐기 때문에+1.5배의 10000원은 자동int되니까
						//변수의 자료형을 double말고 int로 재설정=>오 그런데 income을 int로 잡고나서 
					//else income에 1.5 넣으니까 오류로 뜸. ()를 넣으면 될까=>안되네.그냥int로 하고 15000

/*
[문제]
철수는 편의점에서 아르바이트를 하고 있다.
8시간까지는 시간당 10000원
8시간 초과시에는 시간당 1.5배를 받는다
근무시간을 입력받아 임금을 계산하세요.
(단 –시간은 고려하지 않는다)
*/


import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			System.out.print("근무시간: ");
			
			int hour = sc.nextInt();
			int income;
			
			if (hour<=8) {
			income = 10000*hour;
			}
			
			else {
			income = 15000*(hour-8)+(10000*8);
			}
			
			System.out.println("임금은 "+income+"입니다.");
		
		
		sc.close();
		
	}
		
}

	
/*	옛 버전
 	import java.util.Scanner;

	public class Ex04 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
					
				System.out.print("근무시간:");
				int hour = sc.nextInt();
				
				int outcomehour = 10000*hour;
				int outcomehourover8 = 12000*(hour-8)+80000;
				
				if (hour<=8) {System.out.println("임금은"+outcomehour+"원 입니다.");}
				else if (hour>8) {System.out.println("임금은"+outcomehourover8+"원 입니다");}	
				
			sc.close();
		}

	}
	
*/	