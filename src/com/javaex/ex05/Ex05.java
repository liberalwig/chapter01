package com.javaex.ex05;//11.배열//2021.11.19(금)13:30

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = new int[3];
		
		arrB = arrA;
		
		arrB[3] = 100;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("===============================");
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		/*
		for(int i=0; i<arrA.length; i++)
		arrB[0] = arrA[0];
		arrB[1] = arrA[1];
		arrB[2] = arrA[2];
		*/
	}

}
