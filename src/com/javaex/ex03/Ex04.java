package com.javaex.ex03; //twice Done, better//09.조건문 중 조건문 연습문제-1
						//2021.11.18(목)11:23, 전과 달리 income변수 잡아주고 뒤 안 지저분하게 다시 함
/*
[문제]
철수는 편의점에서 아르바이트를 하고 있다.
8시간까지는 시간당 10000원
8시간 초과시에는 시간당 12000원을 받는다.
근무시간을 입력받아 임금을 계산하세요.
(단 –시간은 고려하지 않는다)
 */

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int hour = sc.nextInt();
		
		int income;
		
		if (hour<=8) {
			income = 10000*hour;
		}
		
		else {
			income = 12000*(hour-8)+(10000*8);
		}
		
		System.out.println("임금은 "+income+"입니다.");
		
		sc.close();
	}
}		
		

/*옛 버전
 
package com.javaex.ex03;//2021.11.18(목)11:23, 전과 달리 income변수 잡아주고 뒤 안 지저분하게 다시 함


import java.util.Scanner;

public class Ex12forpractice {
	public static void main(String[] args) {
		
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
		
	}

}
*/