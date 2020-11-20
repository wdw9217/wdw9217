package test; //Random 을 이용한 홀수 짝수 구분 
import java.util.Random;
public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Random rd = new Random();
		i = rd.nextInt(100)+1;
		
		//nextInt(10); == 0~9 사이의 정수 랜덤값 추출
		//nextInt(10) + 1 == 1~10 사이의 정수 랜덤값을 추출
		
		System.out.println("랜덤 수는 " + i + "입니다.");
		if(i%2==0) {
			System.out.println(i + "의 값은 짝수입니다.");
		}else {
			System.out.println(i + "의 값은 홀수입니다.");
		}
	}

}