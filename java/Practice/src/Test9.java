import java.util.Scanner; //임폴트 자바 유틸 스캐너
import java.util.Random; // 임폴트 자바 유틸 랜덤

public class Test9 {

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // 스캐너 sc=  new scanner(시스템안)
		System.out.println("입력하세요"); //로그출력("입력하세요")
		int score =sc.nextInt(); //정수 점수 = sc.다음정수();
		
		Random rd = new Random(); //랜덤 rd = new random();
		int dice = (int)(Math.random()*10)+1; //정수 주사위 = (정수)(수학.랜덤함수()곱하기10)+1;
		
		String grade; //문자열 등급
		
		if(score >= 95 && score<= 100) //만약에(점수 작거나 같다 95 && 점수 크거나 같다 100)
		{
			System.out.println("A+"); //로그출력 ("A+")
		}else if(score >= 85 && score<=90) //그밖에 만약에(점수 작거나 같다 85 && 점수 크거나 같다 90)
		{
			System.out.println("A"); //로그출력 ("A")
		}else if(score >=75 && score<=80) //그밖에 만약에(점수 작거나 같다 75 && 점수 크거나 같다 80)	  
	    {
	    	System.out.println("B+"); //로그출력 ("B+")
	    }else if(score >= 65 && score<=70) //그밖에 만약에(점수 작거나 같다 65 && 점수 크거나 같다 70)	
	    {	
	    	System.out.println("C+"); //로그출력 ("C+")
	    }else if(score >= 55 && score<=60) //그밖에 만약에(점수 작거나 같다	 55&& 점수 크거나 같다 60)
	    { 
	    	System.out.println("C"); //로그출력 ("C")
	    	 	
	   }else 
	   {		
			System.out.println("잘못된 값입니다.");	
		
	   }
		
		
		
		
		
	}

}
