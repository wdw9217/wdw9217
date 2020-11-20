package test; // 스캔으로 정수를 받고 받은 숫자까지 합해준후  랜럼(30) 숫자 하나 뽑아서 나누기 결과는 정확하게~

import java.util.Scanner;
import java.util.Random;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		// String score =sc.next();
		int i = sc.nextInt();//스캐너 받은 값을 정수형 변수 i 에 담음
		int l = 0;   //정수형 변수 l 을 초기값 0을 입력
		System.out.println(i);
		for (int k = 0; k <= i; k++) { // 정수형 변수 k 에 0 을 입력하고  k 는 스캔 받은 값 i 보다 작을 때가지 루프를 돈다 k 는 한바퀴 돌때마다 1씩 늘어난다.
			l +=k;       /* i 값을 5 를 5번 돌것이고 첫번째 바퀴는 l = 0  k =0
			                                     두번째 바퀴는 l = 0 k =1
			                                     세번째 바퀴는 l= 1 k=2
			                                      네번째 바퀴는 l =3 k=3
			                                      다섯번째 바퀴는 l=6 k=4
			                                      여섯번째 바퀴는 l=10 k=5
			                                      일곱번째 바퀴는 l=15 k=6
			                                      여덟번째 바퀴는 l=21 k=7
											      아홉번째 바퀴는 l=28 k=28
											      */ 
			// 7을 입력했을 경우!!
			System.out.println(l);
		}
/*
		Random a = new Random();
		int k = a.nextInt(30) + 1;
		System.out.println(k);
*/
	}

}