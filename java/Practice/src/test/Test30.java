package test; //스마트폰 볼륨조절 int 기본값 0, 스캐너를 이옹하여 볼륨조절을 입력받은 +를 입력받음 +를 입력하면 볼륨이 올라갔습니다 메시지 기본값이 +1

import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 현재 volume 값 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("더하면 + , 빼면 - or 입력");
		String a = sc.next();
		int[] b = new int[a.length()];
		int i= 0;
		
		while(true) 
		{
		if(a.equals("+")) {	
	        System.out.println("볼륨 올라갔습니다");
	        b[i] += 1;
		}
		else if(a.equals("-")) {
			System.out.println("볼륨 내려갔습니다");
			b[i] -=1;
		}
		else
		{
			System.out.println("잘못 된 값 입력");
			break;
		}
		System.out.println("스마트폰 현재 volume 값 상태 :" + b[i]);
		System.out.println("더하면 +, 빼면 - 중 입력");
		a = sc.next();
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

		
		
		
		
		

