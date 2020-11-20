package test;

import java.util.Scanner; // 임폴트 자바 유틸 스캐너

public class While_test1 { //~동안

	public static void main(String[] args) { // 메인메소드 처음 실행
		// TODO Auto-generated method stub
		boolean stop = false; // 참과거짓 멈춤 = 잘못된
		int num; //정수 번호
		while (!stop) { //~동안 (!멈춤)
		System.out.println("두개의 정수를 입력하셔야합니다."); //로그출력 ("두개의 정수를 입력하셔야 합니다.")
		Scanner sc = new Scanner(System.in); // 스캐너 sc = new scanner(시스템안)
		System.out.println("첫번째 수를 입력하세요."); // 로그출력 ("첫번째 수를 입력하세요")
		int num1 = sc.nextInt(); // 정수 번호1 = sc.다음정수();
		System.out.println("두번째 수를 입력하세요."); //로그출력 ("두번째 수를 입력하세요")
		int num2 = sc.nextInt(); // 정수 번호2= sc.다음정수();
		System.out.println("어떤 연산을 하시겠어요? + - x /"); //로그출력 ("어떤 연산을 하시겠어요? + - * /)
		String k = sc.next(); //문자열 k = sc.다음정수()
		//System.out.println("sc"+k);
		if(k.equals("X")) { //만약에(k.같음("X"))
		num = num1 * num2; //번호 = 번호1 * 번호2
		System.out.println(num1 + " X " + num2 + " = " + num);//로고출력(번호1+ "X" +번호2+ "=" +번호)
		}
		if(k.equals("+")) { //만약에(K.같음("+"))
		num = num1 + num2; //번호 = 번호1+번호2
		System.out.println(num1 + " + " + num2 + " = " + num);//로고출력(번호1+ "+" +번호2+ "=" +번호)
		}
		if(k.equals("-")) { //만약에(k.같음("-"))
		num = num1 + num2; //번호 = 번호1+번호2
		System.out.println(num1 + " - " + num2 + " = " + num);//로고출력(번호1+ "-" +번호2+ "=" +번호)
		}
		if(k.equals("/")) { //만약에(k.같음("/"))
		num = num1 + num2; //번호 = 번호1+번호2 
		System.out.println(num1 + " / " + num2 + " = " + num);//로고출력(번호1+ "/" +번호2+ "=" +번호)
		}
		System.out.println("계속 Y, 종료 N 입력"); // 로고출력("계속 Y, 종료 N 입력")
		String yn = sc.next(); //문자열 yn = sc.다음();
		if (yn.equals("Y") || yn.equals("y")) { //만약에(문자열yn.같음("Y") || 문자열yn.같음("y")
		System.out.println("---------------------");
		continue; //계속
		}
		if (yn.equals("N") || yn.equals("n")) { //만약에(문자열yn.같음("N") || 문자열yn.같음(n)
		break; //멈춤
		}
		}
		System.out.println("시스템이 종료되었습니다.");//로그출력
		}
		}
			
			
			
			
		    
					
			
					
			
	