package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//표현방법1
		int[] intArray = new int[4];
		
		intArray[0] = 3;
		intArray[1] = 13;
		intArray[2] = 7;
		intArray[3] = 55;
		
		
		/*표현방법2
		int[] intArray = new int[] {3,13,7};
		*/
		
		/*표현방법3
		int[] intArray = {3,13,7};
		*/
		
		
		//System.out.println(intArray[1]);
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println("====================================");
		/*
		char[] charArray = new char[3];
	
		charArray[0] = 'A'; //char[]형에 1이라는 값을 넣으면 1에 해당하는 코드값이 나와겠네
		charArray[1] = '한';		
		charArray[2] = 'z';		
	
		for(int i=0; i<3; i++)
			System.out.println(charArray[i]);
		*/
	
		/*
		int A = 1;
		int B = 2;
		int C = 3; 은 int  A = 1, B = 2; C = 3;으로 선언해주어도 좋다
		 */
		
		
	
	}
	

}
