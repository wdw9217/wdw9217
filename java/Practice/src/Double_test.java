
public class Double_test { //�Ҽ��� ����

	public static void main(String[] args) { //���� �޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		int i = 10; // ���� i = 10
		int j = 20; // ���� j = 20
		
		int result_1 = i * j; //���� ���_1 = 10 ���ϱ� 20 
		int result_2 = i / j; //���� ���_2 = 10 ������ 20
		double resurt_3 = (double)i / j; //�Ҽ������� ���_3 = (�Ҽ�������)10/20 
		double resurt_4 = (double)i / j; //�Ҽ������� ���_4 = (�Ҽ�������)10/20
		double resurt_5 = (double)(i) / (double)(i); //�Ҽ������� ���_5 = (�Ҽ�������)10 ������ (�Ҽ�������)20
		
				
		System.out.println("��� 1 : "+ result_1); //�α� ���
		System.out.println("��� 2 : "+ result_2); //�α� ���
		System.out.println("��� 3 : "+ resurt_3); //�α� ���
		System.out.println("��� 4 : "+ resurt_4); //�α� ���
		System.out.println("��� 5 : "+ resurt_5); //�α� ���
		
		
	}

}
