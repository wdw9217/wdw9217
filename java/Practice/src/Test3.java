
public class Test3 {

	public static void main(String[] args) { //���� �޼ҵ� ó������
		// TODO Auto-generated method stub
		int i = Integer.valueOf("56789"); // ���� i = ("56789")
		char j = 'A'; //�� ������ �ѱ� or  ���� ���� 'A' �� A 10���� 65
		char k = 'B'; //�� ������ �ѱ� or  ���� ���� 'B' �� B 10���� 66
		char l = 'C'; //�� ������ �ѱ� or  ���� ���� 'C' �� C 10���� 67
		
		
		
		int result_1 = i + j + k +l; // ���� ���_1 = 56789+65+66+67 = 569897
		int result_2= result_1 / 3; // ���� ���_2 = 56987 ������ 3 = 18.995
		double m = (double)result_1 /3; //�Ҽ������� m = (�Ҽ�������)569897 / 3 = 18.995.6666666668
		
		
		System.out.println("��� :"+ result_1); //�α����
		System.out.println("��� :"+ result_2); //�α����
		System.out.println("��� :"+ m);	//�α����
		
		
	}

}
