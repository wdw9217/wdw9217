package test;
import java.util.Scanner; //임폹트 자바 유틸 스캐너 실행

public class Ex_test {

	public static void main(String[] args) { //메인 메소드 처음 실행
		// TODO Auto-generated method stub
		String name; //문자열 이름
		int age; // 정수 나이
		double height; // 소수점선언 신장
		String intro; //문자열 소개
		String buffer; //문자열
		
		Scanner sc = new Scanner(System.in); //스캐너 sc =  new scanner(시스템안)
		System.out.println("이름을 입력하세요");
		name = sc.next(); // 이름 sc.다음()
		System.out.println("나이를 입력하세요");
		age = sc.nextInt(); // 나이 sc.다음()
		System.out.println("키를 입력하세요");
		height = sc.nextDouble(); // 신장 sc.다음소수점선언()
		System.out.println("자기소개를 입력하세요");
		buffer = sc.nextLine();
		intro = sc.nextLine();
		
		System.out.println("이름은 "+name+"나이는 "+age+",키는 "+height+"입니다.");
		System.out.println(intro);
	}

}
