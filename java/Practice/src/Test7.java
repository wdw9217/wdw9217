
public class Test7 {

	public static void main(String[] args) { //���θ޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		int i = 900; // ���� i = 900
		byte c = 'C'; // ����Ʈ c= 'C' ->24
		boolean b; // �������� b
		String k = "120"; // ���ڿ� k = "120"
		
		double result_1 = i / (double)c; //�Ҽ������� ���_1 = 900 / (�Ҽ�������)67 = 13.432835820895523
		System.out.println("���_1:" + result_1);
	
		
		int result_2 = Integer.parseInt(k); //���� ���_2 = ���(k)->120
		System.out.println("���_2:" + k);
		
		b = (result_1==result_2); // b= (���_1==���_2) ���� ������ ���� �ٸ��Ƿ� false / ������ True
		System.out.println(b);
		
		
		
		
		
		
		
		
		
				
		
	}

}
