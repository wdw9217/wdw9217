package test; // A 8 B 7 C 9 D 를 모두 더하라

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String k = "A8B7C9D";
		int j = k.length();
		char l[] =new char[j];

		for(int i =0; i<j; i++) {
			l[i] = k.charAt(i);
			System.out.println("l :"+l[i]);
		}

	}

}
