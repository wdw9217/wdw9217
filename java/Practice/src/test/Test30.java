package test; //����Ʈ�� �������� int �⺻�� 0, ��ĳ�ʸ� �̿��Ͽ� ���������� �Է¹��� +�� �Է¹��� +�� �Է��ϸ� ������ �ö󰬽��ϴ� �޽��� �⺻���� +1

import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����Ʈ�� ���� volume �� 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϸ� + , ���� - or �Է�");
		String a = sc.next();
		int[] b = new int[a.length()];
		int i= 0;
		
		while(true) 
		{
		if(a.equals("+")) {	
	        System.out.println("���� �ö󰬽��ϴ�");
	        b[i] += 1;
		}
		else if(a.equals("-")) {
			System.out.println("���� ���������ϴ�");
			b[i] -=1;
		}
		else
		{
			System.out.println("�߸� �� �� �Է�");
			break;
		}
		System.out.println("����Ʈ�� ���� volume �� ���� :" + b[i]);
		System.out.println("���ϸ� +, ���� - �� �Է�");
		a = sc.next();
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

		
		
		
		
		

