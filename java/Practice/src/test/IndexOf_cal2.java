	package test;
	import java.util.Scanner;
	public class IndexOf_cal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String scn = sc.next();
		System.out.println("�Է°� :"+ scn);

		
		
		IndexOf_cal io = new IndexOf_cal();
		
		int output = io.cal(scn);
		
		System.out.println("�հ� :"+ output);
		
		}
	}
}

