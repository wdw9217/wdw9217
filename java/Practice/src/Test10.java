import java.util.Scanner; //����Ʈ �ڹ� ��ƿ ��ĳ��

public class Test10 {

	public static void main(String[] args) { // ���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // ��ĳ��  sc = new scanner(�ý��۾�)
		System.out.println("�Է����ּ���"); // �α����("�Է��ϼ���")
		int i =sc.nextInt(); //���� i = ac.��������();
		System.out.println("�Է°��� :"+i); //�α����("�Է°��� : +i)
		
		
		if(i >=900) { // ���࿡ (i ũ�ų� ���ٸ� 900�̻�)
			if(i>=1000) { //���࿡ (i ũ�ų� ���ٸ� 1000)
				System.out.println("���ָ���"); //�α���� ("���ָ���")
			}else { // �׹ۿ�
				System.out.println("����");
			}
		
	}
		else if(i >=800 ) {
			if(i >=850) {
				System.out.println("���ݸ���");
			}else {
				System.out.println("���ξ���");
			}
		}
		
		
		
		
		
}
}