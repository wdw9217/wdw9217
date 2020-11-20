
public class Double_test2 { //소수점 선언

	public static void main(String[] args) { //메인 메소드 처음 실행
		// TODO Auto-generated method stub
		int i = 100; // 정수 i = 100
		int j = 3; // 정수 j = 3
		
		int result_1 = i / j; // 정수 결과_1 = 100 나누기 3
		int result_2 = i % j; // 정수 결과_2 = 100 
		double result_3 = (double)i / j; //소수점선언 결과_3 = (소수점선언)100 나누기 3
		float result_4 = (float)i % j; // 소수점 선언 후 f 결과_4 = (소수점선언f)100 3
		
		System.out.println("결과1 :" + result_1); //로그 출력
		System.out.println("결과2 :" + result_2); //로그 출력
		System.out.println("결과3 :" + result_3); //로그 출력
		System.out.println("결과4 :" + result_4);	 //로그 출력		
	}

}
