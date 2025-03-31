package quiz;

import java.util.Random;
import java.util.Scanner;

public class QuUpDownGame {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		
		while(isRunning) {
			
			System.out.println("실행결과]");
			int computer = random.nextInt(100) + 1;
			System.out.println("생성된 난수:" + computer);
			int cnt = 0;
			
			while(true) {
				
				System.out.print("1~100사이의 정수를 입력하세요:");
				int my = sc.nextInt();
				cnt++;
				
				if(my > computer) {
					System.out.println("Down입니다.");
				} else if(my < computer) {
					System.out.println("Up입니다.");
				} else {
					System.out.println("정답입니다.\n승리하셨습니다.");
					break;
				}
				
				if(cnt == 7) {
					System.out.println("실패했습니다.");
					break;
				}
				
			}
			
			System.out.println("게임을 다시 시작할까요?\n1.게임 재시작, 0.게임 종료");
			int restartNumber = sc.nextInt();
			
			if(restartNumber == 0) {
				System.out.println("감사합니다. 프로그램을 종료합니다.");
				isRunning = false;
			}
		}
		sc.close();
	}
	
}
