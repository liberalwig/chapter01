package com.javaex.ex04;//10.반복문 중 반복문while break, for반복문 vs while반복문
						//시작하는 값으로는 최소14부터 해야 옳지. (6의배수 && 14의배수)중에서 가장 작은 수
						//다만 어디까지 한계를 정해줘야 할지 모르므로 여기선 while
						//while( )이 괄호 안에 true값이 들어와야 하는 게 핵심인데 while뒤 바로괄호에 조건&&을 넣음

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0; //비교할 정수 초기값의 목적으로 씀(의미를 모를까봐 주석 안에 써주기)
		
		while(true) {
			i= i+1;//i++
			
			if(i%6==0 && i%14==0) {//6의 배수이면서 14의 배수입니까?
			System.out.println(i);
			break;
			}
		}
		
		
		
		/*실패
		int x = 14;
		while (x%6==0 && x%14==0) {	
			x++;
		}
		
		System.out.println("x는 "+x);
		*/
	}

}
