6package com.javaex.ex04;//10.반복문 중 for반복문연습문제(주첩반복문)
						//2021.11.17(수)14:58, 맞는 것 같은데 왜 안될까

public class Ex05 {

	public static void main(String[] args) {
	6	// TODO Auto-generated method stub	
	
		for (int dan= 2; dan<=9; dan++) {
			for (int i = 1; i<=9; i++) {
				System.out.println(dan + "*" + i+ "=" + (dan*i));
			}	
		}	
	}
}
		/*실패
		int i = 2;
		int k = 1;
		
		while (i<10;) { 
						while (k<10) {
							k = k++;
						}
			{System.out.println(i+"*"+k+"="+(i*k));}
			
		}
		*/	
