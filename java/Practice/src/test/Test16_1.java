package test;
import java.util.Scanner;
public class Test16_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1��°");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("2��°");

		int b = sc.nextInt();
		System.out.println("+, -, x�� �� 1");

		String pp = sc.next();
		Test16_2 kk = new Test16_2();

		if(pp.equals("+"))
		{
		System.out.println(kk.Plus(a,b));
		}

		else if(pp.equals("-"))
		{
		System.out.println(kk.Mius(a,b));
		}
		else if(pp.equals("x")) {
		System.out.println(kk.Multi(a,b));
		}
		else
		{
		System.out.println("���� ��");
		}

		}

		
	}


