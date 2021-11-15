package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {

		
		//자동 형변환
		System.out.println(2+3.4);
		
		double var01 = 2+3.4; //정수 2를 실수2.0으로 자동 변환하여 3.4와 연산한다
		System.out.println(var01);
		
		//자동 형변환 예시: long(8byte)+float(4byte)
		long var02 = 12345L; //(int보다 작은 long 경우 마지막 L 안 써도 됨)
		float var03 = 1.1F;
		
		System.out.println(var02+var03);

		float result = var02+var03; //var03이 실수니까 앞에 float를 써주고 result를 보는 거야
		System.out.println(result);
		
		///////////////////////////////////////////////////
		
		//강제 형변환
		int i = (int)11112.3232322; 
		System.out.println(i);
		
		float f01 = 12.5F;
		
		int i01 = (int)f01;  //소수점이 망가지고 없어질 걸 감수하고라도 정수인int 그룹에 f01 넣고 싶을 때
		System.out.println(i01);
		System.out.println(f01);
		
		//예시1. 강제 형변환->확대 형변환: 망가질 일 없음
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v01);
		System.out.println(v02);
		
		//예시2. 강제 형변환->축소 형변환: 다행인 케이스
		int v03 = 10; //4byte=>32bit
		byte v04 = (byte)v03;
		System.out.println(v03);
		System.out.println(v04);
		
		//예시3. 강제 형변환->축소 형변환: 불행인 케이스
		int v05 = 343429770;
		byte v06 = (byte)v05;
		
		System.out.println(v05); //343429770 그대로 나올 것
		System.out.println(v06); //뭔가 잘릴 것. 그 결과 -118이 돼버림. 앞 두 자리만 남은 게 아니라 지금은 우연.
		
		//예시4. 실수를 정수로 강제 형변환
		double v07 = 6234.234;
		int v08 = (int)v07;
		
		System.out.println(v07);
		System.out.println(v08);
		
		//예시05. 정수를 실수로 강제 형변환
		int v09 = 7;
		double v10 = (double)v09;
		
		System.out.println(v09);
		System.out.println(v10);
		
		
	}

}
