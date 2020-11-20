package test;
import java.util.Scanner;
import java.util.Random;
public class Coding_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		int i = sc.nextInt();
		int l = 0;   
		System.out.println(i);
		for (int k = 0; k <= i; k++) { 
					l +=k;
					l *=k;
					
		System.out.println(l);
				}
	
			}

		}
	


