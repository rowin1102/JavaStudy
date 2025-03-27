package ex03operator;

public class E05ShortCircuitEvaluation {
	
	/*
	 	SCE(short-Circuit Evaluation) : 하나의 조건검사만으로 결과를 알 수 있는 경우
	 		Java 컴파일러는 뒤의 조건을 수행하지 않고 건너뛰게 된다. 이 경우 변수의 값이
	 		변경되는 코드가 있다면 실행되지 않으므로 주의
	 */
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		boolean result;
		
		/*
		 	논리 And의 경우 둘중 하나만 false이면 false를 반환하므로 첫 번째 조건이
		 	false이면 두 번째 조건은 검사(실행)하지 않음
		 */
		result = (num1 += 10) < 0 && (num2 += 10) > 0;
		// false가 출력
		System.out.println("result = " + result);
		// num2는 초기값인 0을 유지
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		/*
		 	논리 Or의 경우 둘 중 하나만 true이면 true를 반환
		 	첫 번째 조건이 true이면 두 번째 조건은 검사X
		 */
		result = (num1 += 10) > 0 || (num2 += 10) > 0;
		// true가 출력
		System.out.println("result = " + result);
		// num2는 증가X
		System.out.println("num1 = " + num1 + ", num2 = " + num2);	
		/*
		 	num2의 값이 프로그램의 실행결과에 영향을 줄 수 있다면 주의
		 */
		
	}

}
