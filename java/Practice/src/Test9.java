import java.util.Scanner; //����Ʈ �ڹ� ��ƿ ��ĳ��
import java.util.Random; // ����Ʈ �ڹ� ��ƿ ����

public class Test9 {

	public static void main(String[] args) { //���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // ��ĳ�� sc=  new scanner(�ý��۾�)
		System.out.println("�Է��ϼ���"); //�α����("�Է��ϼ���")
		int score =sc.nextInt(); //���� ���� = sc.��������();
		
		Random rd = new Random(); //���� rd = new random();
		int dice = (int)(Math.random()*10)+1; //���� �ֻ��� = (����)(����.�����Լ�()���ϱ�10)+1;
		
		String grade; //���ڿ� ���
		
		if(score >= 95 && score<= 100) //���࿡(���� �۰ų� ���� 95 && ���� ũ�ų� ���� 100)
		{
			System.out.println("A+"); //�α���� ("A+")
		}else if(score >= 85 && score<=90) //�׹ۿ� ���࿡(���� �۰ų� ���� 85 && ���� ũ�ų� ���� 90)
		{
			System.out.println("A"); //�α���� ("A")
		}else if(score >=75 && score<=80) //�׹ۿ� ���࿡(���� �۰ų� ���� 75 && ���� ũ�ų� ���� 80)	  
	    {
	    	System.out.println("B+"); //�α���� ("B+")
	    }else if(score >= 65 && score<=70) //�׹ۿ� ���࿡(���� �۰ų� ���� 65 && ���� ũ�ų� ���� 70)	
	    {	
	    	System.out.println("C+"); //�α���� ("C+")
	    }else if(score >= 55 && score<=60) //�׹ۿ� ���࿡(���� �۰ų� ����	 55&& ���� ũ�ų� ���� 60)
	    { 
	    	System.out.println("C"); //�α���� ("C")
	    	 	
	   }else 
	   {		
			System.out.println("�߸��� ���Դϴ�.");	
		
	   }
		
		
		
		
		
	}

}
