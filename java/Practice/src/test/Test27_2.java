	package test;
	import java.util.Arrays;
	import java.util.Scanner;

	public class Test27_2 {
		public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				String a = sc.next();
				String[] b = new String[a.length()];
				int index;
				String c; // Array쓸거면 이거 지움됨
				for(int i =0; ; i++)
				{			
					index = a.indexOf("+");
					if(index == -1)
					{
						//b[i] = a;
						c = a; // Array쓸거면 이거 지움됨
						break;
					}
					b[i] = a.substring(0, index);
					a = a.substring(index+1);
					System.out.println(b[i]); //Array쓸거면 이거 지움됨
				}
				//System.out.println(Arrays.toString(b));
				System.out.println(c);
			}
		}
		
		
		
		
		
		
		
		
		
		

