
public class For_test3 { //시작과 종료 조건

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub
		
		int i = 0; // 정수 i = 0
		int j = 0; // 정수 j = 0
		for(j=1; j <=100; j++) { //시작과 종료 조건(정수j=1; 정수j=1 작거나 같다 100; 1++)
			i+=j;
		System.out.println("지금 i:"+i); //로그출력 (지금 정수i=0: +정수0)
		System.out.println("지금 j:"+j); //로그출력 (지금 정수j=0: +정수0)
		}
		System.out.println("1~" + (j-1)+ "합:"+i); //로그출력 (1~ + (정수j=0-1)+ "합:"+0);
	}

}
