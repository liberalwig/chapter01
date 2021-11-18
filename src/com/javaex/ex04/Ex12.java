package com.javaex.ex04;//10.반복문 중 do~while반복문//2021.11.18(목)14:54
						//강사님께 개념 확인차 질문 드리고 정원 씨한테 말로 설명해보았는데 내 설명이 더 충분하면 좋겠다

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. [0이면 종료]");
		
		int num = sc.nextInt();
		int sum = sum + num;
		
		do { /*숫자를 입력받는다, 합을 구한다, 합계를 출력한다.*/
			
		} while (/*숫자가 0이 아니면*/num!=0); 
			System.out.println("종료");
			
		sc.close();
}


/*do-while을 모르고 결과값 보고 우선 짜보기

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