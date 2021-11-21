package com.javaex.ex05;//twice Done//11.배열 중 math.random()을 이용하여 미니로또 만들기/2021.11.18(목)16:36
						//2021.11.21(일)19:46-20:55 한별과 디스코드 의논, 설명 듣기//

/*
[문제]
1~45 까지의 숫자중 임의의 6개의 숫자를 출력하세요.
(중복체크는 하지 말 것)
*/

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int n01 = (int)(Math.random()*45)+1;
		int n02 = (int)(Math.random()*45)+1;
		int n03 = (int)(Math.random()*45)+1;
		int n04 = (int)(Math.random()*45)+1;
		int n05 = (int)(Math.random()*45)+1;
		int n06 = (int)(Math.random()*45)+1;
		*/
		
		int[] dice = new int[6];
		
		for(int i = 0; i<dice.length; i++) {
			dice[i] = (int)(Math.random()*45)+1;
			System.out.println("dice["+(i+1)+"] 은(는)"+ dice[i]);
		}
		
	}

}


		/*
		int[] dice = new int[50];
   

      for(int i = 0; i < dice.length; i++) {
         dice[i] = (int)((Math.random()*45)+1);
         System.out.println("no" + (i+1) + "=" + dice[i]);
      
		 */
		
		/*수업 중
		int n01 = (int)(Math.random()*45)+1;  
		int n02 = (int)(Math.random()*45)+1;
		int n03 = (int)(Math.random()*45)+1;
		int n04 = (int)(Math.random()*45)+1;
		int n05 = (int)(Math.random()*45)+1;
		int n06 = (int)(Math.random()*45)+1;
		
		int[] ball = new int[6];
		
		for(int i = 0; i<6; i++) {
			ball[i] = ((int)Math.random()*45+1);
		}
		
		ball[0] = (int)(Math.random()*45)+1;
		ball[1] = (int)(Math.random()*45)+1;
		ball[2] = (int)(Math.random()*45)+1;
		ball[3] = (int)(Math.random()*45)+1;
		ball[4] = (int)(Math.random()*45)+1;
		ball[5] = (int)(Math.random()*45)+1;
		
		for(int i=0; i<6; i++) {
			System.out.println(ball[i]);
		
		*/
		
				
		/*
		for(int i = 0; i<6; i++) {
			System.out.println(n0 + (i+1)); //변수 이름은 인식하지 못하고 그냥 그림같이 받아들인다고 봐야 해
											//컴퓨터는 메모리 잡을 때도 n01옆에 n02를 잡지도 않아, 그냥 그림같이 봐
		}
		*/
		
		/*반복되고 있으며 6개니까 for문 시도해보자
		System.out.println(n01);
		System.out.println(n02);
		System.out.println(n03);
		System.out.println(n04);
		System.out.println(n05);
		System.out.println(n06);
		*/

