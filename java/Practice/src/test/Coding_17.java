package test;

public class Coding_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k = "ABCDE";
		int j = k.length();
		char l[] =new char[j];

		for(int i =0; i<j; i++) {
			l[i] = k.charAt(i);
			System.out.println("l :"+l[i]);
		}
		

	}

}
