package test; 
//스마트폰의 기능 3가지를 Class로 만들고 한번씩 호출하라 (실제 기능을 만들란 이야기가 아니라 main에서 사진기를 호출하면 사진기에서 "촬영되었습니다"를 리턴
import java.io.IOException;
import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		23_1 smart1 = new 23_1();
		23_2 smart2 = new 23_2();
		23_3 smart3 = new 23_3();

		
		int keycode = 0;
		int num = 0;
		
		//Class1
	    String txt = 23_1.23_1();
	    System.out.println(txt + " 문자를 입력하였습니다.");
	    
	
	    //Class2
	    keycode = 23_2.23_2();
		System.out.println("키코드 :" + keycode);
		
		
		//Class3
		System.out.println("다음 중 원하는 번호를 입력하세요.");
		System.out.println("1. 촬영 2. 출력 3. 중지");
		num = smart3.smart3();
		switch(num){
			case 1:
				System.out.println("촬영");
				break;
			
			case 2:
				System.out.println("출력");
				break;
			
			case 3:
				System.out.println("중지");
				break;
			default:
				System.out.println("잘못");
				break;
		}
		
		
	}

}
