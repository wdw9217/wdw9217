import java.util.Scanner; //����Ʈ �ڹ� ��ƿ ��ĳ�� ����
public class If_test2 {

	public static void main(String[] args) { // ���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //��ĳ�� sc = new scanner(�ý���.��)
		System.out.println("�Է��ϼ���"); //�α� ��� ("�Է��ϼ���")
		int score =sc.nextInt(); //���� ���� = sc=new scanner.��������()
		
		if(score >= 90) { //���࿡ (���� ũ�ų� ���� 90)
			System.out.println("������ 90������ �����ϴ�."); //�α����
			System.out.println("AŬ���� �Դϴ�."); //�α����
		}else { //�׹ۿ�
			System.out.println("������ 90������ �����ϴ�."); //�α����
			System.out.println("BŬ���� �Դϴ�."); //�α����
			}
		}
			
}
