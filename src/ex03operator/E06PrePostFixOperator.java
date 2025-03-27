package ex03operator;

public class E06PrePostFixOperator {
	
	/*
	 	증감연산자 : 변수를 +1 혹은 -1 한것과 같은 결과를 반환. 주로 반목문 내에서 사용
	 	Prefix(전위증가 혹은 감소) : 연산자가 변수 엎에 있는 경우
	 	1. 변수의 값이 먼저 변경
	 	2. 변경된 값이 좌측항으로 혹은 다른 코드에 반영
	 	Postfix(후위) : 연산자가 변수 뒤에 있는 경우
	 	1. 변수의 값이 다른 코드에 먼저 반영
	 	2. 반영된 이후 변수의 값이 변
	 */
	public static void main(String[] args) {
		
		int num1 = 7, num2, num3; // 현재상태 : 7, x, x
		num2 = ++num1; /*
						1. num1의 값이 먼저 1 증가
						2. 증가된 num1이 num2에 대입됨
						현자상태 : 8, 8, x
		*/
		num3 = --num1; /*
						1. num1의 값이 먼저 1 감소
						2. 감소된 값이 num3에 대입
						현재상태 : 7, 8, 7
		*/
		
		System.out.println("전위증가/감소시");
		System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);
		
		num1 = 7; // 현재상태 : 7, 8, 7
		num2 = num1++; /*
						1. num1의 값이 num2에 먼저 할당
						2. num1의 값이 나중에 증가
						현재상태 : 8, 7, 7
		*/
		num3 = num1--; /*
						1. num1의 값이 먼저 num3에 대입
						2. num1의 값이 감소
						현재상태 : 7, 7, 8
		*/
		
		System.out.println("후위증가/감소시");
		System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);

	}

}
