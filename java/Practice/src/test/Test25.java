package test; //숫자를 입력받고   1000원짜리 500원짜리 100원짜리 나머지를 구하라
			// 1차 10000원을 입력 1000원 10장 500원 20장 100원 100장 나오게 출력
			// 2차 10000원을 입력 1000원 10장 500원 0장  100원 0장 나오게 출력 
            // 3차 8540원을 입력 1000원 8장 500원 1장 나머지 40장 나오게 출력
import java.util.Scanner;
public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int a = 0; //1000원
		int b = 0; //500원
		int c = 0; //100원
		int mod = 0; //나머지
		
		System.out.println("금액을 입력하세요.");
		money = sc.nextInt();
		
		//1차
		a = money / 1000;
		System.out.println("1000원 : " + a + "장");
		b = money / 500;
		System.out.println("1000원 : " + b + "개");
		c = money / 100;
		System.out.println("1000원 : " + c + "개");
		
		
		//2차
		a = money /1000;
		b = (money % 1000) / 500;
		c = (money % 500) / 100;
		mod = money - (1000*a) - (500*b) - (100*c);
		
		System.out.println("1000원 : " + a + "장");
		System.out.println("500원 : " + b + "개");
		System.out.println("100원 : " + c + "개");
		System.out.println("나머지 : " + mod);
	}

}
