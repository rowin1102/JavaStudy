package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static int arithmetic(int num1, char op, int num2) {
		
		int result = 0, remainder = 0;
		if(op == '+') {
			result = num1 + num2;
			System.out.println("덧셈결과 -> " + result);
		} else if(op == '-') {
			if(num1 > num2) {
				result = num1 - num2;
				System.out.println("뺄셈결과 -> " + result);
			}else {
				result = num2 - num1;
				System.out.println("뺄셈결과 -> " + result);
			}
		} else if(op == '*') {
			result = num1 * num2;
			System.out.println("곱셈결과 -> " + result);
		}else if(op == '/') {
			result = num1 / num2;
			remainder = num1 % num2;
			System.out.println("나눗셈 몫 -> " + result);
			System.out.println("나눗셈 나머지 -> " + remainder);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수1 입력 => ");
		int num1 = scanner.nextInt();
		
		while(num1 < 0) {
			System.out.println("양수를 다시 입력하세요");
			System.out.print("정수1 입력 => ");
			num1 = scanner.nextInt();
		}
		
		System.out.print("원하는 연산 입력 => ");
		char op = scanner.next().charAt(0);
		
		int num2;
		
		while(true) {
			System.out.print("정수2 입력 => ");
			num2 = scanner.nextInt();
			
			while(num2 < 0) {
				System.out.println("양수를 다시 입력하세요");
				System.out.print("정수2 입력 => ");
				num2 = scanner.nextInt();
				continue;
			}
			
			if(op == '/' && num2 == 0) {
				System.out.println("숫자를 다시 입력해주세요");
			}else {
				break;
			}
		}
		arithmetic(num1, op, num2);
		
		scanner.close();
	}

}
