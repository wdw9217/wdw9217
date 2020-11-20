package test;
// 문제: Scanner로 문자를 입력받고 문자가 20개 이내이면 substring를 이용해 한글자씩 출력 20개이상이면 안됨

import java.util.Scanner; // 임폴트 자바 유틸 스캐너 실행
import java.io.IOException; // 인폴트 자바 아이오 아이오익스펜션 파일 실행 불러오기

public class Test14 {

	public static void main(String[] args) { //메인 메소드 처음 실행
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // 스캐너 sc = new 스캐너(시스템안)
		
		System.out.println("글자를 입력하세요"); //로그출력 ("글자를 입력하세요")
		String k = sc.next(); //문자열 k = sc.다음(),
		System.out.println(k); // 로그출력 (k);
		
		String l = "안녕하세요 반갑습니다 안녕히 가세요"; // 문자열 l = 안녕하세요
		
		String j = k.substring(1); // 문자열 j = 앞글자 제거 (3)->3글자
		
		System.out.println("1번째 있는 글자는 : "+j); //로그 출력 
		
		String f = l.substring(1);
		
		System.out.println("2번째 있는 글자는 : "+f);
		
		
		
		
		
		
		
		
		
	}

}
