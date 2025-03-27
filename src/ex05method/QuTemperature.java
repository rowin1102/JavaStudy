package ex05method;

import java.util.Scanner;

public class QuTemperature {

	public static double celsiusToFahrenheit(double num) {
		
		double result = 1.8 * num + 32;
		return result;
	}
	
	public static double fahrenheitToCelsius(double num) {
		
		double result = (num - 32) / 1.8;
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("섭씨, 화씨 중 원하는 계산을 선택하세요");
		System.out.println("1. 섭씨 -> 화씨 변환");
		System.out.println("2. 화씨 -> 섭씨 변환");
		System.out.print("번호를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			System.out.print("섭씨 온도를 입력하세요 : ");
			double num = scanner.nextDouble();
			System.out.printf("섭씨 : %.1f -> 화씨 : %.1f", num, celsiusToFahrenheit(num));
		} else if(choice == 2) {
			System.out.print("화씨 온도를 입력하세요 : ");
			double num = scanner.nextDouble();
			System.out.printf("화씨 : %.1f -> 섭씨 : %.1f", num, fahrenheitToCelsius(num));
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		scanner.close();
		
	}

}
