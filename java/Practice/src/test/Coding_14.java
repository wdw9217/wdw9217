package test;
import java.util.Scanner;
public class Coding_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		
				int count = 5; 
				int danCount = 9; 
				int hangCount = 10; 
				for (int i = 2; i <= danCount; i += count) {
					for (int j = 1; j <= hangCount; j++) {
						for (int k = 0; k < count; k++) {
							if (i + k <= danCount) {
								if (flag) {
									for (int z = 0; z < count; z++) {
										if (i + z <= danCount)
											System.out.print("====" + (i + z) + "´Ü====\t");
									}
									System.out.println();
									flag = false;
								}
								System.out.print(i + k + " * " + j + " = " + (i + k) * j + "\t");
							} 
						} 
						System.out.println();
					} 
					flag = true;
					System.out.println();
				} 
			}
		}
		

		
		
		
		
		
		

