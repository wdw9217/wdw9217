package test;
import java.util.Scanner; //�ӽbƮ �ڹ� ��ƿ ��ĳ�� ����

public class Ex_test {

	public static void main(String[] args) { //���� �޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		String name; //���ڿ� �̸�
		int age; // ���� ����
		double height; // �Ҽ������� ����
		String intro; //���ڿ� �Ұ�
		String buffer; //���ڿ�
		
		Scanner sc = new Scanner(System.in); //��ĳ�� sc =  new scanner(�ý��۾�)
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next(); // �̸� sc.����()
		System.out.println("���̸� �Է��ϼ���");
		age = sc.nextInt(); // ���� sc.����()
		System.out.println("Ű�� �Է��ϼ���");
		height = sc.nextDouble(); // ���� sc.�����Ҽ�������()
		System.out.println("�ڱ�Ұ��� �Է��ϼ���");
		buffer = sc.nextLine();
		intro = sc.nextLine();
		
		System.out.println("�̸��� "+name+"���̴� "+age+",Ű�� "+height+"�Դϴ�.");
		System.out.println(intro);
	}

}
