package ex03operator;

public class E03BeekyoOperator {
	/*
 		비교연산자 : 두 개의 변수를 서로 비교하여 값이 크거나 같은지를 판단하는 연산자
 			!= : 부정연산자로 다른지를 판단(Not)
 			== : 같은지 판단
	 */
	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		
		/*
		 	num1이 클 때 true를 반환, 조건식은 false
		 	따라서 else 구문이 실행
		 */
		if(num1 > num2) {
			System.out.println("num1이 더 큼니다");
		} else {
			System.out.println("num2가 더 큼니다");
		}
		
		/*
		 	num1과 num2가 다를 때 true를 반환
		 	따라서 if 구문이 실행
		 */
		if(num1 != num2) {
			System.out.println("num1과 num2는 다르다");
		} else {
			System.out.println("num1과 num2는 같다");
		}		

		if(num1 == num2) {
			System.out.println("num1과 num2는 같다");
		} else {
			System.out.println("num1과 num2는 다르다");
		}		
		
	}
	
}
