
public class Test6 {

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub
		int charCode = 90; // 정수 한글자코드 = 4
		System.out.println(charCode); //로그출력(한글자코드)
		
		if((charCode>=65)&&(charCode<=90)) { //만약에((한글자코드 크거나 같다 65) && (한글자코드 작거나 같다 90) 
			System.out.println("대문자"); // 로그출력("대문자")
		}
		if((charCode>=97)&&(charCode<=122)) { //만약에((한글자코드 크거나 같다 97) && (한글자코드 작거나 같다 122)
			System.out.println("소문자"); // 로그출력("소문자")
	    }
		if((charCode>=48)&&(charCode<=57)) { //만약에((한글자코드 크거나 같다 48) && (한글자코드 작거나 같다 57)
			System.out.println("숫자"); //로그출력("숫자")
		}
	}
}
