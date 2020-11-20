	package test; //Scanner로 기호를 포함한 문자를 입력받고 split, indexOf, substring를 이용하여 기호를 정리한 문자를 출력
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
