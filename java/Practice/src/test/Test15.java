package test;
import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in); 
	System.out.println("입력하세요"); 
	String score =sc.next(); 
	
	
	int b= score.length();
	System.out.println(b);
	
	String str_arry[]=new String [b];
	
	for (int i = 0; i <b; i++) {
		str_arry[i] =score.substring(i, i+1);
		System.out.println(str_arry[i]);
	}
	
	
	}
	
	

}