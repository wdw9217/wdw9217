
public class Test7 {

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub
		int i = 900; // 정수 i = 900
		byte c = 'C'; // 바이트 c= 'C' ->24
		boolean b; // 참과거짓 b
		String k = "120"; // 문자열 k = "120"
		
		double result_1 = i / (double)c; //소수점선언 결과_1 = 900 / (소수점선언)67 = 13.432835820895523
		System.out.println("결과_1:" + result_1);
	
		
		int result_2 = Integer.parseInt(k); //정수 결과_2 = 결과(k)->120
		System.out.println("결과_2:" + k);
		
		b = (result_1==result_2); // b= (결과_1==결과_2) 왼쪽 오른쪽 수가 다르므로 false / 같은면 True
		System.out.println(b);
		
		
		
		
		
		
		
		
		
				
		
	}

}
