package ex04controlstatement;

/*
 	if문 형식2
 		if(조건식) {
 			조건이 true일 때 실행문장;
 		} else {
 			조건이 false일 때 실행문장;
 		}
 */
public class E01If02 {

	public static void main(String[] args) {
		
		// 120을 2로 나누면 나머지가 0이므로 짝수로 판단
		int num = 120;
		// 중첩된 if문으로 여러 조건을 표현
		if(num % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		
		/*
		 	삼항연산자(조건연산자) : if ~ else문과 동일하지만 짧은 코드로 표현이 가능하므로 실무에서 자주 사용
		 	형식] 변수 = (조건식) ? true : false;
		 */
		String numberResult = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println("숫자" + num + "은 " + numberResult);
		
		int num2 = 120;
		if(num % 2 == 0) {
			if(num2 >= 100)
				System.out.println("짝수, 100이상");
			else	
				System.out.println("짝수, 100미만");
		} else {
			if(num2 >= 100)
				System.out.println("홀수, 100이상");
			else	
				System.out.println("홀수, 100미만");
		}
		
	}

}
