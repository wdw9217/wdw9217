package test;
// ����: Scanner�� ���ڸ� �Է¹ް� ���ڰ� 20�� �̳��̸� substring�� �̿��� �ѱ��ھ� ��� 20���̻��̸� �ȵ�

import java.util.Scanner; // ����Ʈ �ڹ� ��ƿ ��ĳ�� ����
import java.io.IOException; // ����Ʈ �ڹ� ���̿� ���̿��ͽ���� ���� ���� �ҷ�����

public class Test14 {

	public static void main(String[] args) { //���� �޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // ��ĳ�� sc = new ��ĳ��(�ý��۾�)
		
		System.out.println("���ڸ� �Է��ϼ���"); //�α���� ("���ڸ� �Է��ϼ���")
		String k = sc.next(); //���ڿ� k = sc.����(),
		System.out.println(k); // �α���� (k);
		
		String l = "�ȳ��ϼ��� �ݰ����ϴ� �ȳ��� ������"; // ���ڿ� l = �ȳ��ϼ���
		
		String j = k.substring(1); // ���ڿ� j = �ձ��� ���� (3)->3����
		
		System.out.println("1��° �ִ� ���ڴ� : "+j); //�α� ��� 
		
		String f = l.substring(1);
		
		System.out.println("2��° �ִ� ���ڴ� : "+f);
		
		
		
		
		
		
		
		
		
	}

}
