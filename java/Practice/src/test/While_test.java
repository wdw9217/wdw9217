package test;

public class While_test { // ~동안

	public static void main(String[] args) { // 메인메소드 처음 실행
		// TODO Auto-generated method stub
		int i = 0; // 정수 i = 0
		while (i<=10) { // ~동안 (정수i=0 보다 크거나 같다 10)
			System.out.println("현재i_1 값은:" + i); //로그출력 ("현재i_1 값은: + i)
			i++; // 0 ++; -> 1
			System.out.println("현재i_2 값은:" + i); //로그출력 ("현재i_2 값은: + i)
		}
	}

}
