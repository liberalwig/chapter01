//2021년 11월 12일 금 13:40

package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		
		//println과 print의 차이점
		System.out.println("println과 print 차이점");
		System.out.println("안녕");
		System.out.println("하세요");
		System.out.println("안녕하세요");
		
		//println() 사용법
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		String name = "최승은";

		System.out.println("안녕하세요"); //안녕하세요
		System.out.println(str); //굿모닝
		System.out.println(i); //2345
		System.out.println(d); //3.14
	
		System.out.println(str+str); //굿모닝굿모닝. 문자*문자는 해보니까 안 되네
		System.out.print(str+str); //굿모닝굿모닝
		System.out.println(str+i); //굿모닝2345
		System.out.println(d+str); //문자열이 하나라도 있으면 모두 문자 취급을 하는 것이다
		
		//'굿모닝 이랑 2345' 라고 생긴 결과를 출력하고 싶다면 어떻게 소스코드를 짜야 할까?
		System.out.println(str+" "+"이랑"+" "+i);
		System.out.println(str+" 이랑 "+i);
		
		System.out.println(i+i); //23452345가 아니고 계산 가능하므로 합쳐져 나온다
		System.out.println(i+d); //정수+실수형이므로 우선 약간 의심해봐야 해. 형변환이 된 상황.
		System.out.println(i-i);
		System.out.println(i*i);
		
		System.out.println(c);
		System.out.println(c+c); //이건 좀 조심하자
		System.out.println(c+s); //숫자+문자인 거니까 문자로 읽어줌. 그런데 '한'이라는 캐릭터도 string에 넣다보니 걱정 안 해도 됨
		
		
		
		//'제 이름은 최승은 입니다'출력하기
		System.out.println("제 이름은 "+name+"입니다.");
		
		//안녕'하'세요 출력하기
		System.out.println("안녕'하'세요"); //헷갈릴 게 없음. ''니까
		
		//안녕"하"세요 출력하기
		System.out.println("안녕\"하\"세요"); // \" 이게 그냥 한 글자. 주석처럼 앞뒤 균형 맞추려고 \" "\아냐
		
		//안녕\하\세요 출력하기
		System.out.println("안녕\\하\\세요"); // System.out.println("안녕\하\세요"); 이렇게 할 것 같은데 에러가 남

		//탭 키 끼워넣기: \t
		System.out.println("안녕\t하세요");
		
		//줄 바꿈 : \n
		System.out.println("안녕\n하세요");
		
		
		
		
	}
	
	
}
