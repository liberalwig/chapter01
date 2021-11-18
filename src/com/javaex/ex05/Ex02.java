package com.javaex.ex05;//11.배열 중 배열의 선언과 생성//2021.11.18(목)17:44

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 2;
		intArray[4] = 55;

		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("===========");
		for(int i=0; i<5; i++) {
			System.out.println(intArray[i]);
		}
		
		
	}
}
