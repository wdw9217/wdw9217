import java.util.Scanner; // 임폴트 자바 유틸 스캐너
import java.util.Random; // 임폴트 자바 유틸 랜덤

public class Test8 {

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // 스캐너 sc = new scanner(시스템안)
		System.out.println("입력하세요"); //로그출력 ("입력하세요")
		int score =sc.nextInt(); //정수 점수= sc.다음정수()
		
		
		Random rd = new Random(); // 랜덤 rd = new random()
		int dice = (int)(Math.random()*10)+1; //정수 주사위 = (정수)(수학.랜덤함수()곱하기10)+1
		
		double result_1 = score / (double)dice; //소수점선언 결과_1 = 점수 / (소수점선언)주사위
		System.out.println("결과_1:" + result_1); //로그출력 (결과_1 + 
		
		
		if(score >= 100) { //만약에(점수 작거나 같다 100)
			System.out.println("매우 큽니다.");
		}else if(score >= 90) { //그밖에 만약에(점수 작거나 같다 90)
			System.out.println("큽니다.");	
		}else if(score >= 80) { //그밖에 만약에(점수 작거나 같다 80)
			System.out.println("보통입니다.");	
		}else { //그밖에 
			System.out.println("작습니다."); //로그출력
		
		
		
		
				
	}

}
}	
	
	
	
	
	
	
