package test; //Random �� �̿��� Ȧ�� ¦�� ���� 
import java.util.Random;
public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Random rd = new Random();
		i = rd.nextInt(100)+1;
		
		//nextInt(10); == 0~9 ������ ���� ������ ����
		//nextInt(10) + 1 == 1~10 ������ ���� �������� ����
		
		System.out.println("���� ���� " + i + "�Դϴ�.");
		if(i%2==0) {
			System.out.println(i + "�� ���� ¦���Դϴ�.");
		}else {
			System.out.println(i + "�� ���� Ȧ���Դϴ�.");
		}
	}

}