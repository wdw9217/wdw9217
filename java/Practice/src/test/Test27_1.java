	package test; //Scanner�� ��ȣ�� ������ ���ڸ� �Է¹ް� split, indexOf, substring�� �̿��Ͽ� ��ȣ�� ������ ���ڸ� ���
	import java.util.Scanner;
	public class Test27_1 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				String a = sc.next();
				String[] n = a.split("\\+");
				//split
				for(int i =0; i < n.length; i++)
				{
					System.out.println("split :" +n[i]);
				}
			}
		}
