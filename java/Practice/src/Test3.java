
public class Test3 {

	public static void main(String[] args) { //메인 메소드 처음실행
		// TODO Auto-generated method stub
		int i = Integer.valueOf("56789"); // 정수 i = ("56789")
		char j = 'A'; //한 글자의 한글 or  영문 가능 'A' ※ A 10진수 65
		char k = 'B'; //한 글자의 한글 or  영문 가능 'B' ※ B 10진수 66
		char l = 'C'; //한 글자의 한글 or  영문 가능 'C' ※ C 10진수 67
		
		
		
		int result_1 = i + j + k +l; // 정수 결과_1 = 56789+65+66+67 = 569897
		int result_2= result_1 / 3; // 정수 결과_2 = 56987 나누기 3 = 18.995
		double m = (double)result_1 /3; //소수점선언 m = (소수점선언)569897 / 3 = 18.995.6666666668
		
		
		System.out.println("결과 :"+ result_1); //로그출력
		System.out.println("결과 :"+ result_2); //로그출력
		System.out.println("결과 :"+ m);	//로그출력
		
		
	}

}
