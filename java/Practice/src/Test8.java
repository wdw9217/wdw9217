import java.util.Scanner; // ����Ʈ �ڹ� ��ƿ ��ĳ��
import java.util.Random; // ����Ʈ �ڹ� ��ƿ ����

public class Test8 {

	public static void main(String[] args) { //���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // ��ĳ�� sc = new scanner(�ý��۾�)
		System.out.println("�Է��ϼ���"); //�α���� ("�Է��ϼ���")
		int score =sc.nextInt(); //���� ����= sc.��������()
		
		
		Random rd = new Random(); // ���� rd = new random()
		int dice = (int)(Math.random()*10)+1; //���� �ֻ��� = (����)(����.�����Լ�()���ϱ�10)+1
		
		double result_1 = score / (double)dice; //�Ҽ������� ���_1 = ���� / (�Ҽ�������)�ֻ���
		System.out.println("���_1:" + result_1); //�α���� (���_1 + 
		
		
		if(score >= 100) { //���࿡(���� �۰ų� ���� 100)
			System.out.println("�ſ� Ů�ϴ�.");
		}else if(score >= 90) { //�׹ۿ� ���࿡(���� �۰ų� ���� 90)
			System.out.println("Ů�ϴ�.");	
		}else if(score >= 80) { //�׹ۿ� ���࿡(���� �۰ų� ���� 80)
			System.out.println("�����Դϴ�.");	
		}else { //�׹ۿ� 
			System.out.println("�۽��ϴ�."); //�α����
		
		
		
		
				
	}

}
}	
	
	
	
	
	
	
