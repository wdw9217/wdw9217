
public class Test2 {

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub
		int var1 = 3000; // 정수 값_1 = 3000
		double var2 = 7e-2; // 소수점선언 값_2 = 앞에서 한자리 소수점
		float var3 = 7e3f; // 소수점선언 값_3 = 뒤에서 한자리 소수점 
		double var4 = 0.1234567890123; //소수점선언 값_4 = 0.123456780123
		double var5 = var2+var4; // 소수점선언 값_5 = 0.07+0.1234567890123
		
		
		System.out.println("var1: "+ var1); //로그출력
		System.out.println("var2: "+ var2); //로그출력
		System.out.println("var3: "+ var3); //로그출력
		System.out.println("var4: "+ var4); //로그출력
		System.out.println("var5: "+ var5); //로그출력
	}

}
