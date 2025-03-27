package quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuRockPaperScissors {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int cnt = 0;
		boolean isRunning = true;
		
		while(isRunning) {
			
			try {
				int my = 0;
				while(true) {
					System.out.print("무엇을 내겠습니까?(1:가위, 2:바위, 3:보) : ");
					my = sc.nextInt();
					if(my >=1 && my <= 3) {
						break;
					}
					System.out.println("잘못된 입력입니다.");
				}
				
				int computer = random.nextInt(3) + 1;
				
				String[] choice = {"가위", "바위", "보"};
				System.out.println("사용자 : " + choice[my-1] + ", 컴퓨터 : " + choice[computer-1]);
				
				
				if(my == computer) {
					System.out.println("비겼습니다.");
				} else if((my == 1 && computer == 3) || 
						(my == 2 && computer == 1) || 
						(my == 3 && computer == 2)) {
					System.out.println("이겼습니다.");
				} else {
					System.out.println("졌습니다.");
				}
				
				cnt++;
				
				if(cnt == 5) {
					while(true) {
						System.out.println("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0)");
						int restart = sc.nextInt();
						if(restart == 1) {
							System.out.println("게임 재시작");
							cnt = 0;
							break;
						} else if(restart == 0) {
							System.out.println("게임이 종료되었습니다. 감사합니다.");
							isRunning = false;
							break;
						} else {
							System.out.println("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요");
						}
					}
				}	
			} 
			catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				sc.nextLine();
			}
			
		}
		sc.close();
	}
}
