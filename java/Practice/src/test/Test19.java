package test;

// 010-1234-5678  Class1 split으로 배열에 넣기  Class2 indexOf를 이용해서 substring을 쳐서 배열에 넣기
public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "010-1234-5678";

		String[] 휴대폰번호 = str.split("-");
		String num1 = 휴대폰번호[0];
		String num2 = 휴대폰번호[1];
		String num3 = 휴대폰번호[2];

		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("num3 = "+num3);
		
		System.out.println("휴대폰번호 => "+num1+"-"+num2+"-"+num3);
		
	}

}
