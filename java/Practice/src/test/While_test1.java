package test;

import java.util.Scanner; // ����Ʈ �ڹ� ��ƿ ��ĳ��

public class While_test1 { //~����

	public static void main(String[] args) { // ���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		boolean stop = false; // �������� ���� = �߸���
		int num; //���� ��ȣ
		while (!stop) { //~���� (!����)
		System.out.println("�ΰ��� ������ �Է��ϼž��մϴ�."); //�α���� ("�ΰ��� ������ �Է��ϼž� �մϴ�.")
		Scanner sc = new Scanner(System.in); // ��ĳ�� sc = new scanner(�ý��۾�)
		System.out.println("ù��° ���� �Է��ϼ���."); // �α���� ("ù��° ���� �Է��ϼ���")
		int num1 = sc.nextInt(); // ���� ��ȣ1 = sc.��������();
		System.out.println("�ι�° ���� �Է��ϼ���."); //�α���� ("�ι�° ���� �Է��ϼ���")
		int num2 = sc.nextInt(); // ���� ��ȣ2= sc.��������();
		System.out.println("� ������ �Ͻðھ��? + - x /"); //�α���� ("� ������ �Ͻðھ��? + - * /)
		String k = sc.next(); //���ڿ� k = sc.��������()
		//System.out.println("sc"+k);
		if(k.equals("X")) { //���࿡(k.����("X"))
		num = num1 * num2; //��ȣ = ��ȣ1 * ��ȣ2
		System.out.println(num1 + " X " + num2 + " = " + num);//�ΰ����(��ȣ1+ "X" +��ȣ2+ "=" +��ȣ)
		}
		if(k.equals("+")) { //���࿡(K.����("+"))
		num = num1 + num2; //��ȣ = ��ȣ1+��ȣ2
		System.out.println(num1 + " + " + num2 + " = " + num);//�ΰ����(��ȣ1+ "+" +��ȣ2+ "=" +��ȣ)
		}
		if(k.equals("-")) { //���࿡(k.����("-"))
		num = num1 + num2; //��ȣ = ��ȣ1+��ȣ2
		System.out.println(num1 + " - " + num2 + " = " + num);//�ΰ����(��ȣ1+ "-" +��ȣ2+ "=" +��ȣ)
		}
		if(k.equals("/")) { //���࿡(k.����("/"))
		num = num1 + num2; //��ȣ = ��ȣ1+��ȣ2 
		System.out.println(num1 + " / " + num2 + " = " + num);//�ΰ����(��ȣ1+ "/" +��ȣ2+ "=" +��ȣ)
		}
		System.out.println("��� Y, ���� N �Է�"); // �ΰ����("��� Y, ���� N �Է�")
		String yn = sc.next(); //���ڿ� yn = sc.����();
		if (yn.equals("Y") || yn.equals("y")) { //���࿡(���ڿ�yn.����("Y") || ���ڿ�yn.����("y")
		System.out.println("---------------------");
		continue; //���
		}
		if (yn.equals("N") || yn.equals("n")) { //���࿡(���ڿ�yn.����("N") || ���ڿ�yn.����(n)
		break; //����
		}
		}
		System.out.println("�ý����� ����Ǿ����ϴ�.");//�α����
		}
		}
			
			
			
			
		    
					
			
					
			
	