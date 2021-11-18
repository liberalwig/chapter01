package com.javaex.ex04;//10. 반복문 중 반복문 continue//수업:2021.11.18(목)13:57
						//1찍기 직전에 질문을 하는 거야, 2의배수면서3의배수니?아니면 통과하고 밑에 println.맞으면 break걸려. 
						//break: for문이 아예 끝. 1부터 10까지 찍던 앤데 2의배수면서 3의배수인 6이면 아예 아웃.
						//continue: 조건에 해당하는 애가 있으면 그 회차만 안 할 뿐 다시 위로 올라가. 밑에서 출력 않고.

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		for(int i = 1; i<=10; i++) {
			if( (i%2==0) && (i%3==0) ) {
				continue;
			}
			System.out.println(i);	
		}
		
	}

}
