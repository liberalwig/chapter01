package com.javaex.ex04;//10.반복문 중 do~while반복문//2021.11.18(목)14:54-

import java.util.Scanner;

//강사님께 개념 확인차 질문 드리고 정원 씨께 말로 설명해보았는데 내 설명이 더 충분하면 좋겠다
						//즉, 받은num이 0일 지라도 이 변수에서는 합계를 반드시 출력해야 한다, 따라서 num이 0이기 이전에 사이클을 거치게 하는 것
						//do위에 int sum변수를 0초기화 하고 바로 int sum = sum+num;하면 왜 안되느냐 질문했고 답변 이해함
						//=> 그렇게 쓰면 sum이라는 변수를 이미 선언해줘놓고 똑같이 sum+num이라고 또 말하는 거니까 duplicate	
						//while의 조건문 안에 true를 넣으면 while앞에 변수가 없었다 하더라도 다 통과시키는 거야!!질문 후 이해함

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		
		
		//괄호 안에 최초로 써준 변수는 괄호 밖으로 가면 적용 안됨. 그래서 변수들은 밖에다 위에다 써줌
		int num;
		int sum = 0; //int sum이 do cycle 안에 있으면 계속 sum초기값이 0이라 앞에서 받은 num합들이 무화되니까
		
		do { //숫자를 입력받는다, 합을 구한다, 합계를 출력한다=> 조건이 맞든 안 맞든 꼭 실행돼야 할 사이클 제시
		
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계:" + sum);
		
		}while (/*숫자가 0이 아니면 계속 위에 가서 계산 사이클 돌고 오렴*/num!=0);
		
		System.out.println("종료");
			
		sc.close();
		}

}

/*do-while을 모르고 결과값 보고 우선 짜보기: 응, 실패

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자를 입력하세요. [0이면 종료]")
	int num = sc.nextInt();
	
	int sum = sum + num;
	
	
		if(num==0) {
			System.out.println("종료")
		}
		else {
			System.out.println(sum)
		}



	sc.close();
	}
*/

/*방법2. do-while을 안 쓰려면

	while(true) {//
		num = sc.nextInt();
		sum = sum + num;
		System.out.println("합계: "+sum);
		}
		if(num==0) //num이 0이면 끝=>num이 0이면 do-while문을 나가라}
			break;
		}

		System.out.println("종료")
		
		sc.close();
	}
}

*/
