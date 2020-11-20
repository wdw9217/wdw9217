import java.util.Scanner; //임폴트 자바 유틸 스캐너 실행
public class If_test2 {

	public static void main(String[] args) { // 메인메소드 처음 실행
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //스캐너 sc = new scanner(시스템.안)
		System.out.println("입력하세요"); //로그 출력 ("입력하세요")
		int score =sc.nextInt(); //정수 점수 = sc=new scanner.다음정수()
		
		if(score >= 90) { //만약에 (점수 크거나 같다 90)
			System.out.println("정수가 90점보다 높습니다."); //로그출력
			System.out.println("A클래스 입니다."); //로그출력
		}else { //그밖에
			System.out.println("점수가 90점보다 낮습니다."); //로그출력
			System.out.println("B클래스 입니다."); //로그출력
			}
		}
			
}
