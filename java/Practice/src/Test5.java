
public class Test5 {

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub
		int i = 999; //정수 i = 999
		int j = 40; //정수 j = 40;
		String k = "65"; //문자열 k = "65"
		int result_2 = Integer.parseInt(k); // 정수 결과_2 = 정수.산술(k)="65"
		System.out.println(k); //로그출력(k)="65"
		
		int result_1 = i * j; //정수 결과_1 = 999*40 =39,960
		System.out.println("result_1:"+ result_1); //로그출력
		
		int result_3 = result_1 / result_2; //정수 결과_3 = 39,960 / k=65 = 614
		System.out.println("result_3:"+ result_3);
		
		int result_4 = result_1 % result_2; //정수 결과_4 = 39,960 % k=65 = 50
		System.out.println("result_4:"+ result_4);
		
		double result_5 = (double)result_1 % result_2; //소수점선언 결과_5 = (소수점선언)39,960 % 65 =50.0
		System.out.println("result_5:"+ result_5);
		
		double result_6 = (double)(result_2 / result_1)*100; //소수점선언 결과_6 = (소수점선언)(65/39,960)*100
		System.out.println("result_6:"+ result_6); //0.1626626626626627
		
		
	}

}
