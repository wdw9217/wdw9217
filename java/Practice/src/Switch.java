import java.util.Scanner; //����Ʈ �ڹ� ��ƿ ��ĳ�� ����
public class Switch { //����ġ 

	public static void main(String[] args) { //���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // ��ĳ�� sc = new scanner(�ý��� ��)
		
		System.out.println("���ĺ��� �Է��ϼ���"); //�α� ���
		
		String grade = sc.next(); //���ڿ� ��� = sc
		
		switch(grade) { //����ġ (���)
		case "A": // ���� "A"
		case "a": // ���� "a"
		System.out.println("���� ���� �Ⱦ��ּż� �����մϴ�"); //�α����
		break; // ����
	
		case "B": //���� "B"
		case "b": //���� "b"
			System.out.println("���ݸ� �� ���ּ���"); // �α����
			
		break; //����
		default: //�⺻
			System.out.println("��������"); //�α����
			
		}
		
	}

}
