package test; // ���ڸ� �Է¹ް� �Է¹��� ���ڸ� �ѱ��� �߶� �迭�� �����ð� ����ϼ���
import java.util.Scanner;
public class Test24_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String txt = "";
		
		System.out.println("���ڸ� �Է��ϼ���.");
		txt = sc.next();
		
		int i = 0;
		int len = 0;
		
		len = txt.length();
		String [] array = new String[len]; 
		
		for(i=0; i<len; i++) {
			array[i] = txt.substring(i,i+1);
			System.out.println("�ѱ��� : " + array[i]);
		}
	}

}
