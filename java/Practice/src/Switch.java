import java.util.Scanner; //임폴트 자바 유틸 스캐너 실행
public class Switch { //스위치 

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 스캐너 sc = new scanner(시스템 안)
		
		System.out.println("알파벳을 입력하세요"); //로그 출력
		
		String grade = sc.next(); //문자열 등급 = sc
		
		switch(grade) { //스위치 (등급)
		case "A": // 상자 "A"
		case "a": // 상자 "a"
		System.out.println("물건 많이 팔아주셔서 감사합니다"); //로그출력
		break; // 멈춤
	
		case "B": //상자 "B"
		case "b": //상자 "b"
			System.out.println("조금만 더 사주세요"); // 로그출력
			
		break; //멈춤
		default: //기본
			System.out.println("누구세요"); //로그출력
			
		}
		
	}

}
