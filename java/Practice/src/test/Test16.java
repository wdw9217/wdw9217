package test;
import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("입력하세요"); 
		String score =sc.next(); 
		
		int[] sub=new int[] {10,20};
		System.out.println("계산하기" +sub.length);
		int sum=0;
		
		int avg=0;
		
		for (int i=0; i<sub.length;i++)
		{
			sum+=sub[i];
		
	}
		avg=sum/(sub.length);
	System.out.println("교과목 점수의 합은 "+sum);	
	System.out.println("교과목 평균 점수"+avg);
		
		
	}	
		
		
}
