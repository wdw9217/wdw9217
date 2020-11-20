
public class For_test2 { //시작과 종료 조건

	public static void main(String[] args) { //메인 메소드 처음 실행
		// TODO Auto-generated method stub
		int i ; //정수 i
		int j ; //정수 j
		for (i =2 ; i<=10; i++) { //시작과 종료조건 (정수i=2; 2 작거나 같다 10; 2++
			
				System.out.println("***" + "단 ****"); //로그출력 (*** + 단 ****)
				for (j =1; j <=10; j++) { //시작과 종료 조건 ( j=1; 정수j1 작거나 같다 10; 1++
					
				System.out.println((i+ " x " + j + "="+(i*j))); 
				//로그 출력 ((정수i=2 "곱하기" 정수j=10 "=" (2곱하기 10)
					
				}
		}
	}

}
