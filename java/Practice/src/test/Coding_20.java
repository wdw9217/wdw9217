package test;
import java.util.Scanner;
public class Coding_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü
			Scanner sc = new Scanner(System.in);
			Num1 num1 = new Num1(); //TV ON/OFF
			Num2 num2 = new Num2(); //TV ä��
			Num3 num3 = new Num3(); //TV ����
				
				//����
				int i = 0;
				int num = 0;
				int power = 0;
				int channel = 0;
				String volume = "";
				
				while(true) {
					System.out.println("��ȣ�� �Է��ϼ���. (1. TV ON/OFF 2. TV ä�� 3. TV ����)");
					System.out.println("------------------------------------------------");
					num = sc.nextInt();
					
					if(num==1) {
						System.out.println("'TV ON/OFF'�� �����Ͽ����ϴ�.");
						System.out.println("-------------------------");
						power = num1.num1();
						
						if(power==1) {
							System.out.println("TV�� �������ϴ�.");
							System.out.println("-------------");
						}else {
							System.out.println("TV�� �������ϴ�.");
							System.out.println("-------------");
						}
						
					}else if(num==2) {
						System.out.println("'TV ä��'�� �����Ͽ����ϴ�.");
						System.out.println("---------------------");
						System.out.println("1. ä�ι�ȣ �Է� 2. ä���̵�(��) 3. ä���̵�(��)");
						
						channel = num2.num2(channel);
						
						System.out.println(channel + "�� ä�η� �̵��Ǿ����ϴ�.");
						System.out.println("-----------------------------");
						
					}else if(num==3) {
						System.out.println("'TV ����'�� �����Ͽ����ϴ�.");
						System.out.println("---------------------");
						System.out.println("���� ������ �ϼ���. (+ or -)");
						
						while(true) {
							volume = num3.num3();
							if(volume.equals("+")) {
								System.out.println("������ �ö󰬽��ϴ�.");
								System.out.println("---------------");
								i++;
								System.out.println("���� ������ " + i + "�Դϴ�.");
								System.out.println("---------------");
								break;
							}else if(volume.equals("-")) {
								if(i<=0) {
									System.out.println("������ �ּ��Դϴ�.");
									System.out.println("--------------");
								}else {
									System.out.println("������ ���������ϴ�.");
									System.out.println("---------------");
									i--;
									System.out.println("���� ������ " + i + "�Դϴ�.");
									System.out.println("---------------");
								}
								break;
								
							}else {
								System.out.println("�߸� �ԷµǾ����ϴ�. �ٽ� �Է����ּ���. (+ or -)");
								System.out.println("--------------------------------------");
								continue;
							}
						}
						
					}else {
						System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���. (1. TV ���� �ѱ� 2. ä�μ��� 3. ��������)");
						System.out.println("-----------------------------------------------------------------");
					}
				}
			}

		}