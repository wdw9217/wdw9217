
public class Double_test2 { //�Ҽ��� ����

	public static void main(String[] args) { //���� �޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		int i = 100; // ���� i = 100
		int j = 3; // ���� j = 3
		
		int result_1 = i / j; // ���� ���_1 = 100 ������ 3
		int result_2 = i % j; // ���� ���_2 = 100 
		double result_3 = (double)i / j; //�Ҽ������� ���_3 = (�Ҽ�������)100 ������ 3
		float result_4 = (float)i % j; // �Ҽ��� ���� �� f ���_4 = (�Ҽ�������f)100 3
		
		System.out.println("���1 :" + result_1); //�α� ���
		System.out.println("���2 :" + result_2); //�α� ���
		System.out.println("���3 :" + result_3); //�α� ���
		System.out.println("���4 :" + result_4);	 //�α� ���		
	}

}
