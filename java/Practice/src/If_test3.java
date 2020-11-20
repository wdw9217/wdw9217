
public class If_test3 { //만약에

	public static void main(String[] args) { //메인메소드 처음 실행
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*20)+81; // 정수 점수 = (정수)(수학.랜덤함수()곱하기20)+81
		System.out.println(score); //로그출력
		
		String grade; //문자열 등급
		
		if(score >=90) { //만약에(점수 크거나 같다 90)
			if(score>=95) { //만약에(점수 크거나 같다 95)
				grade = "A+"; // 등급 = "A";
			
		}else { //그밖에
			grade ="A"; // 등급 = "A"
		}
		}else { //그밖에
			if(score >=85) { //만약에(점수 크거나 같다 85)
			grade = "B+"; //등급 = "B+"
		}else { //그밖에
			grade ="B"; //등급 = "B"
			
				
			}
		}
System.out.println("당신의 학점은 :" + grade); //로그 출력("당신의 학점은 : + 등급)
	
	}

}
