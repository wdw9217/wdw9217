package test; //���ڸ� �Է¹ް�   1000��¥�� 500��¥�� 100��¥�� �������� ���϶�
			// 1�� 10000���� �Է� 1000�� 10�� 500�� 20�� 100�� 100�� ������ ���
			// 2�� 10000���� �Է� 1000�� 10�� 500�� 0��  100�� 0�� ������ ��� 
            // 3�� 8540���� �Է� 1000�� 8�� 500�� 1�� ������ 40�� ������ ���
import java.util.Scanner;
public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int a = 0; //1000��
		int b = 0; //500��
		int c = 0; //100��
		int mod = 0; //������
		
		System.out.println("�ݾ��� �Է��ϼ���.");
		money = sc.nextInt();
		
		//1��
		a = money / 1000;
		System.out.println("1000�� : " + a + "��");
		b = money / 500;
		System.out.println("1000�� : " + b + "��");
		c = money / 100;
		System.out.println("1000�� : " + c + "��");
		
		
		//2��
		a = money /1000;
		b = (money % 1000) / 500;
		c = (money % 500) / 100;
		mod = money - (1000*a) - (500*b) - (100*c);
		
		System.out.println("1000�� : " + a + "��");
		System.out.println("500�� : " + b + "��");
		System.out.println("100�� : " + c + "��");
		System.out.println("������ : " + mod);
	}

}
