import java.util.Random; // 임폴트 자바 유틸 랜덤 실행
//TODO Auto-generated method stub

public class If_test { //만약에

	public static void main(String[] args) { //메인 메소드 처음 실행
			Random rd = new Random(); //랜덤 rd = new random 
			int dice = (int)(Math.random()*6)+1; // 정수 주사위 =(정수)(수학.랜덤함수()곱하기6)+1
			
			
			System.out.println(dice); //로그 출력(주사위)
			
			if(dice ==1) { // 만약에(주사위 ==1 1이 나오면);
				System.out.println("주사위가 1 이 나왔습니다."); //로그출력 
			}else if(dice ==2) { //그밖에 만약에(주사위 ==2 2가나오면)
				System.out.println("주사위가 2 이 나왔습니다."); //로그출력
			}else if(dice ==3) { //그밖에 만약에(주사위 ==3 3이나오면)
				System.out.println("주사위가 3 이 나왔습니다."); //로그출력
			}else if(dice ==4) { //그밖에 만약에(주사위 ==4 4가나오면)
				System.out.println("주사위가 4 이 나왔습니다."); //로그출력							
			}else if(dice ==5) { //그밖에 만약에(주사위 ==5 5가나오면)
				System.out.println("주사위가 5 이 나왔습니다."); //로그출력
			}else if(dice ==6) { //그밖에 만약에(주사위 ==6 6이나오면)
				System.out.println("주사위가 6 이 나왔습니다."); //로그출력											
			}else{ //그밖에
				System.out.println("도대체 뭐가 나온거니?");	//로그풀력
				
			}
				
	}

}
