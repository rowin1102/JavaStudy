package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {

	static double circleArea(double num) {
		double result = 3.14 * num * num;
		System.out.printf("원의 넓이(%f) : %.3f\n ", num, result);
		return result;
	}
	
	static double circleRound(double num) {
		
		double result = 2 * 3.14 * num;
		System.out.printf("원의 둘레(%f) : %.2f\n", num, result);
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요 : ");
		double num = scanner.nextDouble();
		
		circleRound(num);
		circleArea(num);
		
		scanner.close();
		
		
	}

}
