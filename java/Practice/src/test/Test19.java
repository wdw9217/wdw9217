package test;

// 010-1234-5678  Class1 split���� �迭�� �ֱ�  Class2 indexOf�� �̿��ؼ� substring�� �ļ� �迭�� �ֱ�
public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "010-1234-5678";

		String[] �޴�����ȣ = str.split("-");
		String num1 = �޴�����ȣ[0];
		String num2 = �޴�����ȣ[1];
		String num3 = �޴�����ȣ[2];

		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("num3 = "+num3);
		
		System.out.println("�޴�����ȣ => "+num1+"-"+num2+"-"+num3);
		
	}

}
