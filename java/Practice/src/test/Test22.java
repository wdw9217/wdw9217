package test; //���ڸ� �Է¹ް� �Է¹��� �������� Ȧ������ ���ض�
import java.io.IOException;
public class Test22 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int keyCode = 0;
		
		System.out.println("���� �Է��ϼ���.");
		keyCode = System.in.read();
		
		
		System.out.println("�Է��� Ű�ڵ��� ���� " + keyCode + "�̰�");
		if(keyCode % 2 == 0) {
			System.out.println("���� ¦�� �Դϴ�.");
		}else {
			System.out.println("���� Ȧ�� �Դϴ�.");
		}
		
	}

}