package test; //숫자를 입력받고 입력받은 값까지의 홀수값만 더해라
import java.io.IOException;
public class Test22 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int keyCode = 0;
		
		System.out.println("숫자 입력하세요.");
		keyCode = System.in.read();
		
		
		System.out.println("입력한 키코드의 값은 " + keyCode + "이고");
		if(keyCode % 2 == 0) {
			System.out.println("값은 짝수 입니다.");
		}else {
			System.out.println("값은 홀수 입니다.");
		}
		
	}

}