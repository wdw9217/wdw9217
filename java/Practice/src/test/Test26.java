package test; // while�� ���� ���� ������ ���ϱ�, ����, ���ϱ�, �����⸦ class�� �и��ϼ���
import java.util.Scanner;
public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		while(true) {
	        System.out.println("ù ��° �Է� ��: ");
	        Scanner s1 = new Scanner(System.in);
	        int a=s1.nextInt();
	        Test26_1 Math = new Test26_1();
	        System.out.println("������ (���ÿ�. + - * /): ");
	        Scanner s2 = new Scanner(System.in);
	        String b = s2.next();
	        System.out.println("�� ���� �Է� ��: ");		
	        Scanner s3 = new Scanner(System.in);
	        int c=s1.nextInt();
	        float result;
	   
	        
	        if(b.equals("+")){
	        	result=a+c;
	        }
	        else if(b.equals("-")){
	        	result=a-c;
	        }
	        else if(b.equals("/")){		
	        	result = (float) a/ c;	      
	        }
	        else {
	        	result=a*c;
	        }
	        
	        System.out.println(result);	 
			}
			
	}

}
