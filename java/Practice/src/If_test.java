import java.util.Random; // ����Ʈ �ڹ� ��ƿ ���� ����
//TODO Auto-generated method stub

public class If_test { //���࿡

	public static void main(String[] args) { //���� �޼ҵ� ó�� ����
			Random rd = new Random(); //���� rd = new random 
			int dice = (int)(Math.random()*6)+1; // ���� �ֻ��� =(����)(����.�����Լ�()���ϱ�6)+1
			
			
			System.out.println(dice); //�α� ���(�ֻ���)
			
			if(dice ==1) { // ���࿡(�ֻ��� ==1 1�� ������);
				System.out.println("�ֻ����� 1 �� ���Խ��ϴ�."); //�α���� 
			}else if(dice ==2) { //�׹ۿ� ���࿡(�ֻ��� ==2 2��������)
				System.out.println("�ֻ����� 2 �� ���Խ��ϴ�."); //�α����
			}else if(dice ==3) { //�׹ۿ� ���࿡(�ֻ��� ==3 3�̳�����)
				System.out.println("�ֻ����� 3 �� ���Խ��ϴ�."); //�α����
			}else if(dice ==4) { //�׹ۿ� ���࿡(�ֻ��� ==4 4��������)
				System.out.println("�ֻ����� 4 �� ���Խ��ϴ�."); //�α����							
			}else if(dice ==5) { //�׹ۿ� ���࿡(�ֻ��� ==5 5��������)
				System.out.println("�ֻ����� 5 �� ���Խ��ϴ�."); //�α����
			}else if(dice ==6) { //�׹ۿ� ���࿡(�ֻ��� ==6 6�̳�����)
				System.out.println("�ֻ����� 6 �� ���Խ��ϴ�."); //�α����											
			}else{ //�׹ۿ�
				System.out.println("����ü ���� ���°Ŵ�?");	//�α�Ǯ��
				
			}
				
	}

}
