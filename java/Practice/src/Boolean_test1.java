
public class Boolean_test1 { // ���� ����

	public static void main(String[] args) { //���� �޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		String k = "123"; // ���������� ���ڿ� ���� k = 123
		char c = 'A'; // �� ������ �ѱ� or  ���� ���� c =   �� A 10���� 65
		int i = 0; // ���� i = 0
		
		int result_1 = Integer.valueOf(k); //���� ���_1 = (k) 123 ���ڿ� ǥ��
		int result_2 = (int)c; //���� ���_2 = (����)A-> 10���� 65    �ؿ�)B ->66 C -> 67
		System.out.println(result_1); //�α� ��� ���_1
		System.out.println(result_2); //�α� ��� ���_2
		
		result_2 = result_2 + 58; //���_2 = ���_2 "65" + 58
		System.out.println(result_1); //�α� ���
		System.out.println(result_2); //�α� ���
		
		i = i+123; // i = ����i 0 + 123
		System.out.println(result_1); //�α� ���
		System.out.println(result_2); //�α� ���
		System.out.println(i); //�α� ���(����i)
		
		
	}

}
