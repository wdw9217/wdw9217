package test;
import java.util.Random;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���� ��� 0~ 100���
	Random a = new Random();
	int k = a.nextInt(100)+1;
	System.out.println(k);
//Ȧ���� ���
	System.out.println("Ȧ��");
	for(int k=0; i<100; k++) {	
	if k%2==1 System.out.print(k + " ");
	}
//¦���� ���		
	System.out.println("¦��");
	for(int k=0; i<100; k++) {	
	if k%2==0 System.out.print(k + " ");
	}	
		
		
	}

}
