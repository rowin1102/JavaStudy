package ex05method;

import java.util.Scanner;

public class QuFibonacci {

	public static void fibonacciProgression(int num) {
		
		int num1 = 0, num2 = 1, num3 = 0;
		System.out.printf("%d, %d", num1, num2);
		for(int i=3; i<=num; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.printf(", %d", num3);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		fibonacciProgression(num);
		
		scanner.close();
	}
	
}
