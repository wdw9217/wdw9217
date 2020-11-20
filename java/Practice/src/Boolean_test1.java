
public class Boolean_test1 { // 참과 거짓

	public static void main(String[] args) { //메인 메소드 처음 실행
		// TODO Auto-generated method stub
		String k = "123"; // 여러글자의 문자열 가능 k = 123
		char c = 'A'; // 한 글자의 한글 or  영문 가능 c =   ※ A 10진수 65
		int i = 0; // 정수 i = 0
		
		int result_1 = Integer.valueOf(k); //정수 결과_1 = (k) 123 문자열 표시
		int result_2 = (int)c; //정수 결과_2 = (정수)A-> 10진수 65    ※예)B ->66 C -> 67
		System.out.println(result_1); //로그 출력 결과_1
		System.out.println(result_2); //로그 출력 결과_2
		
		result_2 = result_2 + 58; //결과_2 = 결과_2 "65" + 58
		System.out.println(result_1); //로그 출력
		System.out.println(result_2); //로그 출력
		
		i = i+123; // i = 정수i 0 + 123
		System.out.println(result_1); //로그 출력
		System.out.println(result_2); //로그 출력
		System.out.println(i); //로그 출력(정수i)
		
		
	}

}
