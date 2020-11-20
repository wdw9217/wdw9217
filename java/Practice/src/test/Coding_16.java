package test;

import java.util.Scanner;

public class Coding_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TV 볼륨조절");
		Scanner sc = new Scanner(System.in);
		System.out.println("더하면 + , 빼면 - or 입력");
		String a = sc.next();
		Coding16_1 Math = new Coding16_1();
		int[] b = new int[a.length()];
		int i= 0;
		
		while(true) 
		{
		if(a.equals("+")) {	
	        System.out.println("볼륨 올라갔습니다");
	        b[i] += 1;
		}
		else if(a.equals("+")) {
			System.out.println("볼륨 올라갔습니다");
			b[i] += 1;
		}
		
		else if(a.equals("-")) {
			System.out.println("볼륨 내려갔습니다");
			b[i] -= 1;
		}
		else
		{
			System.out.println("잘못 된 값 입력");
			break;
		}
		System.out.println("TV 현재 volume 값 상태 :" + b[i]);
		System.out.println("더하면 +, 빼면 - 중 입력");
		a = sc.next();
	}
}

}