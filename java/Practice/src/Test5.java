
public class Test5 {

	public static void main(String[] args) { //���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		int i = 999; //���� i = 999
		int j = 40; //���� j = 40;
		String k = "65"; //���ڿ� k = "65"
		int result_2 = Integer.parseInt(k); // ���� ���_2 = ����.���(k)="65"
		System.out.println(k); //�α����(k)="65"
		
		int result_1 = i * j; //���� ���_1 = 999*40 =39,960
		System.out.println("result_1:"+ result_1); //�α����
		
		int result_3 = result_1 / result_2; //���� ���_3 = 39,960 / k=65 = 614
		System.out.println("result_3:"+ result_3);
		
		int result_4 = result_1 % result_2; //���� ���_4 = 39,960 % k=65 = 50
		System.out.println("result_4:"+ result_4);
		
		double result_5 = (double)result_1 % result_2; //�Ҽ������� ���_5 = (�Ҽ�������)39,960 % 65 =50.0
		System.out.println("result_5:"+ result_5);
		
		double result_6 = (double)(result_2 / result_1)*100; //�Ҽ������� ���_6 = (�Ҽ�������)(65/39,960)*100
		System.out.println("result_6:"+ result_6); //0.1626626626626627
		
		
	}

}
