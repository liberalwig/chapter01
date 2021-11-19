package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrA = new int[] {10,20,33};
		int[] arrB = new int[] {15,25,30};
		
		if(arrA.length == arrB.length) {//두 배열 크기가 같은지 질문
			//전체 방 갯수가 같으면 이제는 하나하나 들어가서 검사할 차례
			for(int i=0; i<arrA.length; i++) {
				if(arrA[i] != arrB[i]) { //둘이 같으면 아무 일도 안 일어나니까 공백으로 두는 게 어색해서 할 일 생기게 '둘이 다르면'으로 씀
					System.out.println(i+"번째가 다릅니다.");
				}
			}
		}
		else {//두 배열 크기가 같지 않은 경우
			System.out.println("배열의 크기가 다릅니다.");
		}

		
		
	}

}
