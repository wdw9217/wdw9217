
public class Cal_test { //����ϴ�

	public static void main(String[] args) { // ���� �޼ҵ� ó�� ����
		// TODO Auto-generated method stub
		int i = 1; // ���� i = 1
		int j = 1; // ���� j = 1
		
		int result_1 = i-- +10; // ���� ���_1 = i-- -> ����10 + 1
		int result_2 = --j +10; // ���� ���_2 = --j -> ����10 - 1
		
		System.out.println("I �� :"+result_1); //�α� ��� (I�� :����10 +1)
		System.out.println("J �� :"+result_2); //�α� ��� (J�� :����10 -1)0
		
		--result_1; //  --  ���_1
		result_2--; // ���_2 --
		
		System.out.println("=============="); //�α� ��� (========)����
		System.out.println("I �� :"+result_1); //�α� ��� (I�� :   )
		System.out.println("J �� :"+result_2); //�α� ��� (J�� :   )
		
		--result_1; //  -- ���_1
		result_2--; // ���_2 --
		
		System.out.println("=============="); //�α� ��� (========)����
		System.out.println("I �� :"+result_1); //�α� ��� (I�� :   )
		System.out.println("J �� :"+result_2); //�α� ��� (J�� :   )
		
	}

}
