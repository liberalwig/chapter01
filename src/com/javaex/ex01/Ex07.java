package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		//대입 연산자
		int a = 7; //변수의 이름으로 숫자는 안된다. 3은 안되지만 a도 되고 a3같은 건 돼
		int b = 2;
		
		//산술 연산자
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
	
		//정수와 정수의 덧,뺄,곱은 정수가 나오지만 나눗은 정수가 나오리라는 보장 없음
		System.out.println(a / b); // 3.5인데 몫3 나머지1. 몫을 표시하므로 3
		System.out.println(a % b); // 3.5인데 몫3 나머지1. 나머질 표시하므로 1

		
		
		//산술 연산자 중 /와 % 상세히
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0); //실수 나누기 실수니까 실수인 3.5를 그대로 내보냄
		System.out.println(7.0%2.0); //난 0.5가 나올 줄 알았음. 근데 아냐. 7=2*3=1인데 나머지1이 실수니까 1.0으로 표시
		System.out.println(7%2.0);

		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(pVar); // +(-3)이라 -3 주의!!!!!!
		System.out.println(mVar); // -(-3)이라 3
		
		
		//2021년 11월 12일 금 10:38
		//증감 연산자
		System.out.println(a); //7
		System.out.println(++a); //(1)a를 1 올린다:7에서 8이 됨 (2)a를 출력한다: 8을 출력한다 
		System.out.println(a); //a가 7이면 원본 안 바꾸고 출력시에만 8보내는 거고 8이면 원본 바꾼다는 말
								//결론은 7이 진짜 8로 바뀌어서 7은 사라졌다는 뜻
		
		System.out.println(b);
		System.out.println(--b); //(1)b를 1 내린다 (2)b를 출력한다
		System.out.println(b);
		
		System.out.println(a); //8
		System.out.println(a++); //(1)a를 출력한다: 8그대로 (2)a를 1 올린다: 8에서 9가 됨. 8이 출력되고 메모리만 9로 바뀐다
		System.out.println(a); //보시다 시피 메모리에는 9가 잘 반영되어 있었다
		
		System.out.println(b); //
		System.out.println(b--); //(1)b를 출력한다 (2)b를 1내린다
		System.out.println(b);
		
		//5==3 //5하고 3하고 같니? false
		//5!=3 //5하고 3하고 안같니(=다르니)? true
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
