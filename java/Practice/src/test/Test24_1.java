package test; // 문자를 입력받고 입력받은 문자를 한글자 잘라서 배열에 담으시고 출력하세요
import java.util.Scanner;
public class Test24_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String txt = "";
		
		System.out.println("문자를 입력하세요.");
		txt = sc.next();
		
		int i = 0;
		int len = 0;
		
		len = txt.length();
		String [] array = new String[len]; 
		
		for(i=0; i<len; i++) {
			array[i] = txt.substring(i,i+1);
			System.out.println("한글자 : " + array[i]);
		}
	}

}
