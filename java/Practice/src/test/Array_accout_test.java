package test;

public class Array_accout_test {

	public static void main(String[] args) {
		//int[] scores;

		//scores = new int[] { 75, 80, 90 };

	
		int [] scores = {83, 90,87};

		int sum1 = 0;

		for(int i=0; i<3; i++) {

		sum1 += scores[i];

		}

		System.out.println(scores);
		System.out.println("총합 : " + sum1);

		
		int sum2 = add(scores);

		// int sum2 = add( new int[] { 75, 80, 90 } );
			System.out.println("총합 : " + sum2);
			System.out.println();
		}​
	
	
		}
	


