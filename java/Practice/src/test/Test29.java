package test; // ��ĵ���� ������ �ް� ���� ���ڱ��� ��������  ����(30) ���� �ϳ� �̾Ƽ� ������ ����� ��Ȯ�ϰ�~

import java.util.Scanner;
import java.util.Random;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		// String score =sc.next();
		int i = sc.nextInt();//��ĳ�� ���� ���� ������ ���� i �� ����
		int l = 0;   //������ ���� l �� �ʱⰪ 0�� �Է�
		System.out.println(i);
		for (int k = 0; k <= i; k++) { // ������ ���� k �� 0 �� �Է��ϰ�  k �� ��ĵ ���� �� i ���� ���� ������ ������ ���� k �� �ѹ��� �������� 1�� �þ��.
			l +=k;       /* i ���� 5 �� 5�� �����̰� ù��° ������ l = 0  k =0
			                                     �ι�° ������ l = 0 k =1
			                                     ����° ������ l= 1 k=2
			                                      �׹�° ������ l =3 k=3
			                                      �ټ���° ������ l=6 k=4
			                                      ������° ������ l=10 k=5
			                                      �ϰ���° ������ l=15 k=6
			                                      ������° ������ l=21 k=7
											      ��ȩ��° ������ l=28 k=28
											      */ 
			// 7�� �Է����� ���!!
			System.out.println(l);
		}
/*
		Random a = new Random();
		int k = a.nextInt(30) + 1;
		System.out.println(k);
*/
	}

}