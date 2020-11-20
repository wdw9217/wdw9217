package test; // while로 만든 계산기 여제를 더하기, 빼기, 곱하기, 나누기를 class로 분리하세요
import java.util.Scanner;
public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		while(true) {
	        System.out.println("첫 번째 입력 값: ");
	        Scanner s1 = new Scanner(System.in);
	        int a=s1.nextInt();
	        Test26_1 Math = new Test26_1();
	        System.out.println("연산자 (고르시오. + - * /): ");
	        Scanner s2 = new Scanner(System.in);
	        String b = s2.next();
	        System.out.println("두 번쨰 입력 값: ");		
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
