package test;
import java.util.Scanner;
public class Coding_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
	        System.out.println("첫 번째 Y 값: ");
	        Scanner s1 = new Scanner(System.in);
	        int a=s1.nextInt();
	        Coding18_1 Math = new Coding18_1();
	        System.out.println("연산자 (고르시오. + - * /): ");
	        Scanner s2 = new Scanner(System.in);
	        String b = s2.next();
	        System.out.println("두 번쨰 N 값: ");		
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


