package test;
import java.util.Scanner;
public class Coding_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체
			Scanner sc = new Scanner(System.in);
			Num1 num1 = new Num1(); //TV ON/OFF
			Num2 num2 = new Num2(); //TV 채널
			Num3 num3 = new Num3(); //TV 볼륨
				
				//변수
				int i = 0;
				int num = 0;
				int power = 0;
				int channel = 0;
				String volume = "";
				
				while(true) {
					System.out.println("번호를 입력하세요. (1. TV ON/OFF 2. TV 채널 3. TV 볼륨)");
					System.out.println("------------------------------------------------");
					num = sc.nextInt();
					
					if(num==1) {
						System.out.println("'TV ON/OFF'를 선택하였습니다.");
						System.out.println("-------------------------");
						power = num1.num1();
						
						if(power==1) {
							System.out.println("TV가 켜졌습니다.");
							System.out.println("-------------");
						}else {
							System.out.println("TV가 꺼졌습니다.");
							System.out.println("-------------");
						}
						
					}else if(num==2) {
						System.out.println("'TV 채널'을 선택하였습니다.");
						System.out.println("---------------------");
						System.out.println("1. 채널번호 입력 2. 채널이동(↑) 3. 채널이동(↓)");
						
						channel = num2.num2(channel);
						
						System.out.println(channel + "번 채널로 이동되었습니다.");
						System.out.println("-----------------------------");
						
					}else if(num==3) {
						System.out.println("'TV 볼륨'을 선택하였습니다.");
						System.out.println("---------------------");
						System.out.println("볼륨 조절을 하세요. (+ or -)");
						
						while(true) {
							volume = num3.num3();
							if(volume.equals("+")) {
								System.out.println("볼륨이 올라갔습니다.");
								System.out.println("---------------");
								i++;
								System.out.println("현재 볼륨은 " + i + "입니다.");
								System.out.println("---------------");
								break;
							}else if(volume.equals("-")) {
								if(i<=0) {
									System.out.println("볼륨이 최소입니다.");
									System.out.println("--------------");
								}else {
									System.out.println("볼륨이 내려갔습니다.");
									System.out.println("---------------");
									i--;
									System.out.println("현재 볼륨은 " + i + "입니다.");
									System.out.println("---------------");
								}
								break;
								
							}else {
								System.out.println("잘못 입력되었습니다. 다시 입력해주세요. (+ or -)");
								System.out.println("--------------------------------------");
								continue;
							}
						}
						
					}else {
						System.out.println("잘못 입력하였습니다. 다시 입력해주세요. (1. TV 끄고 켜기 2. 채널선택 3. 볼륨선택)");
						System.out.println("-----------------------------------------------------------------");
					}
				}
			}

		}