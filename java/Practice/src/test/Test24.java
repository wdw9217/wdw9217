package test;
import java.util.Scanner;
public class Test24 { // 문자를 입력받고 입력받은 문자를 한글자 잘라서 배열에 담으시고 출력하세요

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("출력하세요"); 
		String score =sc.next(); 
		
		String str = "가-나-다";

		String[] 문자 = str.split("-");
		String str1 = 문자[0];
		String str2 = 문자[1];
		String str3 = 문자[2];

		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);
			
	}

}

//------------------------------------------------------------------------ 제대로 된 답은 24_1 참고 할것
