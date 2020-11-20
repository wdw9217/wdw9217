import java.util.Scanner; //임폴트 자바 유틸 스캐너

public class Test10 {

	public static void main(String[] args) { // 메인메소드 처음 실행
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 스캐너  sc = new scanner(시스템안)
		System.out.println("입력해주세요"); // 로그출력("입력하세요")
		int i =sc.nextInt(); //정수 i = ac.다음정수();
		System.out.println("입력값은 :"+i); //로그출력("입력값은 : +i)
		
		
		if(i >=900) { // 만약에 (i 크거나 같다면 900이상)
			if(i>=1000) { //만약에 (i 크거나 같다면 1000)
				System.out.println("아주많다"); //로그출력 ("아주많다")
			}else { // 그밖에
				System.out.println("많다");
			}
		
	}
		else if(i >=800 ) {
			if(i >=850) {
				System.out.println("조금많다");
			}else {
				System.out.println("별로없다");
			}
		}
		
		
		
		
		
}
}