package test;
import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("�Է��ϼ���"); 
		String score =sc.next(); 
		
		int[] sub=new int[] {10,20};
		System.out.println("����ϱ�" +sub.length);
		int sum=0;
		
		int avg=0;
		
		for (int i=0; i<sub.length;i++)
		{
			sum+=sub[i];
		
	}
		avg=sum/(sub.length);
	System.out.println("������ ������ ���� "+sum);	
	System.out.println("������ ��� ����"+avg);
		
		
	}	
		
		
}
