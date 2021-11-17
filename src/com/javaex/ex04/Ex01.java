import java.util.Scanner;

//"while을 count세는 손에 잡는 기계 개념으로 이해해보세요"
						//그런데 tail변수를 잡고보니 똑같은 일을 하는 변수i가 있음을 발견=>tail없애고 해보기

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		
		while (i<5) {
			System.out.println("I Like Java" + (i+3));
			i++;
		}
		
		/*int tail = 0;
		int i = 3;
		
		while(i<8) {
			System.out.println("I Like Java" + i);
			i++;
			//tail++; 
		*/
		
		
		
	}

}
