
public class Cal_test { //계산하다

	public static void main(String[] args) { // 메인 메소드 처음 실행
		// TODO Auto-generated method stub
		int i = 1; // 정수 i = 1
		int j = 1; // 정수 j = 1
		
		int result_1 = i-- +10; // 정수 결과_1 = i-- -> 정수10 + 1
		int result_2 = --j +10; // 정수 결과_2 = --j -> 정수10 - 1
		
		System.out.println("I 값 :"+result_1); //로그 출력 (I값 :정수10 +1)
		System.out.println("J 값 :"+result_2); //로그 출력 (J값 :정수10 -1)0
		
		--result_1; //  --  결과_1
		result_2--; // 결과_2 --
		
		System.out.println("=============="); //로그 출력 (========)라인
		System.out.println("I 값 :"+result_1); //로그 출력 (I값 :   )
		System.out.println("J 값 :"+result_2); //로그 출력 (J값 :   )
		
		--result_1; //  -- 결과_1
		result_2--; // 결과_2 --
		
		System.out.println("=============="); //로그 출력 (========)라인
		System.out.println("I 값 :"+result_1); //로그 출력 (I값 :   )
		System.out.println("J 값 :"+result_2); //로그 출력 (J값 :   )
		
	}

}
