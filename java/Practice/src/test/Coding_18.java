package test;
import java.util.Scanner;
public class Coding_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
	        System.out.println("ù ��° Y ��: ");
	        Scanner s1 = new Scanner(System.in);
	        int a=s1.nextInt();
	        Coding18_1 Math = new Coding18_1();
	        System.out.println("������ (���ÿ�. + - * /): ");
	        Scanner s2 = new Scanner(System.in);
	        String b = s2.next();
	        System.out.println("�� ���� N ��: ");		
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


