
public class Double_test { //소수점 선언

	public static void main(String[] args) { //메인 메소드 처음 실행
		// TODO Auto-generated method stub
		int i = 10; // 정수 i = 10
		int j = 20; // 정수 j = 20
		
		int result_1 = i * j; //정수 결과_1 = 10 곱하기 20 
		int result_2 = i / j; //정수 결과_2 = 10 나누기 20
		double resurt_3 = (double)i / j; //소수점선언 결과_3 = (소수점선언)10/20 
		double resurt_4 = (double)i / j; //소수점선언 결과_4 = (소수점선언)10/20
		double resurt_5 = (double)(i) / (double)(i); //소수점선언 결과_5 = (소수점선언)10 나누기 (소수점선언)20
		
				
		System.out.println("결과 1 : "+ result_1); //로그 출력
		System.out.println("결과 2 : "+ result_2); //로그 출력
		System.out.println("결과 3 : "+ resurt_3); //로그 출력
		System.out.println("결과 4 : "+ resurt_4); //로그 출력
		System.out.println("결과 5 : "+ resurt_5); //로그 출력
		
		
	}

}
