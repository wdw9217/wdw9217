package test;

import java.util.Scanner;

public class Coding_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TV ��������");
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϸ� + , ���� - or �Է�");
		String a = sc.next();
		Coding16_1 Math = new Coding16_1();
		int[] b = new int[a.length()];
		int i= 0;
		
		while(true) 
		{
		if(a.equals("+")) {	
	        System.out.println("���� �ö󰬽��ϴ�");
	        b[i] += 1;
		}
		else if(a.equals("+")) {
			System.out.println("���� �ö󰬽��ϴ�");
			b[i] += 1;
		}
		
		else if(a.equals("-")) {
			System.out.println("���� ���������ϴ�");
			b[i] -= 1;
		}
		else
		{
			System.out.println("�߸� �� �� �Է�");
			break;
		}
		System.out.println("TV ���� volume �� ���� :" + b[i]);
		System.out.println("���ϸ� +, ���� - �� �Է�");
		a = sc.next();
	}
}

}