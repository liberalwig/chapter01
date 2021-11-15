package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		
		double v01 = 5/4; //현진 닙 답변: "이거 더블이 실수형인데 뒤에 숫자들이 정수라서 인식 안 돼서 그냥 정수로 나온거예요"
		System.out.println(v01);
		
		double v07 = 5.0/4; //만일 double v02 = 5.0/4였다면 1.25였을 것이다. 오잉 1.0으로 나옴!
		System.out.println(v07);
		
		double v02 = (double)5/4; 
		System.out.println(v02);
		

		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		
		int v05 = (int)1.3+(int)1.8;
		System.out.println(v05);
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		
	}

}
