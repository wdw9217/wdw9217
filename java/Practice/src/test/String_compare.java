package test;

public class String_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "�������߼���";

		String str2 = new String("�������߼���");

		String str3 = "�������߼���";

		System.out.println("�ؽ��ڵ�1 :" + str1.hashCode());
		System.out.println("�ؽ��ڵ�2 :" + str2.hashCode());
		System.out.println("�ؽ��ڵ�3 :" + str3.hashCode());
		System.out.println("�����ּ�1 :" + System.identityHashCode(str1));
		System.out.println("�����ּ�2 :" + System.identityHashCode(str2)); // ���ڿ��� String ������ �����Ѵٴ� ���� Ʋ�� ǥ�� (�Ϲ������� int �� �ٸ� ��ü�̹Ƿ�)
		System.out.println("�����ּ�3 :" + System.identityHashCode(str3));  // ������ String ��ü�� �����Ѵ�.
		   
		  
		boolean compare1 = (str1 == str2);        // �ڹٴ� �⺻������ ���ڿ� ���ͷ��� �����ϴٸ� String ��ü�� �����ϵ��� �Ǿ��ִ�.
		boolean compare2 = (str1.equals(str2));   //������ String ��ü�� ���������Ƿ�,
		boolean compare3 = (str1 == str3);        // ������ ���ڿ� ���ͷ��� ������ �� ���� String ��ü�� ���� �ϹǷ� ��

	
		System.out.println("���ڿ� ��1 :" +compare1);   
		System.out.println("���ڿ� ��2 :" +compare2);
		System.out.println("���ڿ� ��3 :" +compare3);

		
		System.out.println(str1.hashCode());
		 
	}

}
