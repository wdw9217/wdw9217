
public class If_test3 { //���࿡

	public static void main(String[] args) { //���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*20)+81; // ���� ���� = (����)(����.�����Լ�()���ϱ�20)+81
		System.out.println(score); //�α����
		
		String grade; //���ڿ� ���
		
		if(score >=90) { //���࿡(���� ũ�ų� ���� 90)
			if(score>=95) { //���࿡(���� ũ�ų� ���� 95)
				grade = "A+"; // ��� = "A";
			
		}else { //�׹ۿ�
			grade ="A"; // ��� = "A"
		}
		}else { //�׹ۿ�
			if(score >=85) { //���࿡(���� ũ�ų� ���� 85)
			grade = "B+"; //��� = "B+"
		}else { //�׹ۿ�
			grade ="B"; //��� = "B"
			
				
			}
		}
System.out.println("����� ������ :" + grade); //�α� ���("����� ������ : + ���)
	
	}

}
