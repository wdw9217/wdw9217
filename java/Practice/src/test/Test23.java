package test; 
//����Ʈ���� ��� 3������ Class�� ����� �ѹ��� ȣ���϶� (���� ����� ����� �̾߱Ⱑ �ƴ϶� main���� �����⸦ ȣ���ϸ� �����⿡�� "�Կ��Ǿ����ϴ�"�� ����
import java.io.IOException;
import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		23_1 smart1 = new 23_1();
		23_2 smart2 = new 23_2();
		23_3 smart3 = new 23_3();

		
		int keycode = 0;
		int num = 0;
		
		//Class1
	    String txt = 23_1.23_1();
	    System.out.println(txt + " ���ڸ� �Է��Ͽ����ϴ�.");
	    
	
	    //Class2
	    keycode = 23_2.23_2();
		System.out.println("Ű�ڵ� :" + keycode);
		
		
		//Class3
		System.out.println("���� �� ���ϴ� ��ȣ�� �Է��ϼ���.");
		System.out.println("1. �Կ� 2. ��� 3. ����");
		num = smart3.smart3();
		switch(num){
			case 1:
				System.out.println("�Կ�");
				break;
			
			case 2:
				System.out.println("���");
				break;
			
			case 3:
				System.out.println("����");
				break;
			default:
				System.out.println("�߸�");
				break;
		}
		
		
	}

}
