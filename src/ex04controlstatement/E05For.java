package ex04controlstatement;

public class E05For {
	
	/*
	 	for문 : while문과 같은 반복문으로 초기값, 조건식, 증감식이 한줄에
	 		있어 반복의 횟수를 명확히 알 수 있는 반복문이다.
	 		따라서 반복의 횟수가 정해져 있는 경우에 주로 사용한다
	 		형식]
	 			for(초깃값; 조건식; 증감식) {
	 				실행문장;
	 			}
	 */
	public static void main(String[] args) {
		
		// 변수i가 1~5까지 1씩 증가해서 5번 반복
		for(int i = 1; i<=5; i++) {
			System.out.println("i = " + i);
		}
		
		// 누적합 저장용 변수 선언
		int sum = 0;
		// 초깃값 1부터 100이하까지 반복
		for(int j = 1; j<=100; j++) {
			// 증가하는 j의 값을 변수에 누적해서 더함
			sum += j;
		}
		System.out.println("1~100까지 합 : " + sum);
		
		/*
		 	방법1 : 1~10까지 10번 반복해서 if문을 통해 2의 배수를 찾은 후 누적해서 더한다
		 */
		int total = 0;
		for(int i=1; i<= 10; i++) {
			if(i % 2 == 0)
				total += i;
		}
		System.out.println("1~10사이 2의 배수의 합(방법1) : " + total);
		
		/*
		 	방법2 : if문 없이 초깃값을 0부터 시작하여 2씩 증가시킴
		 */
		total = 0;
		for(int i = 0; i <= 10; i += 2) {
			total += i;
		}
		System.out.println("1~10사이 2의 배수의 합(방법2) : " + total);
		
		// for문으로 무한루프를 만들때는 (;;)와 같이 표현
		int a = 1;
		for(;;) {
			System.out.println("나는 for문으로 만든 무한루프" + a);
			a++;
			/*
			 	무한루프는 기본적으로 에러가 발생. 그리고 해당 루프를 탈출하지 못한다면 아래에 있는
			 	코드는 실행될 수 없는 코드가 되므로 "Unreachable code"라는 에러가 발생하게 된다.
			 	따라서 아래와 같이 탈출 조건을 만들어 줘야 한다.
			 */
			if(a == 5) break;
		}
		
		/*
		 	for문의 끝에 ;을 사용하면 반복할 문장이 없는것으로 간주되어 for문과 상관 없이 한번만 실행
		 */
		for(int j=0; j<5; j++);
		{
			System.out.println("나는 누구?");
		}
		/*
		 	for문의 초기식에서 선언된 변수 j는 for문이 종료되는 순간 메모리에서 소멸
		 	여기서 사용된 변수 j는 지역변수(Local Variable)라고 한다.
		 	지역변수는 해당 지역을 벗어나면 즉시 소멸되는 특징을 가지고 있다.
		 */
//		System.out.println("위 for문에서 선언한 변수 j = " + j);
		System.out.println("위 main함수 지역에서 선언한 변수 total = " + total);		
		
		/*
		 	for문의 초기값은 외부(넓은 지역, 여기서는 main지역)에서 선언하면 해당 변수는
		 	for문 내부(좁은 지역)에서 사용할 수 있다.
		 	즉, 아래 선언한 변수 i는 main메서드의 지역변수로 선언되어 있다.
		 */
		int i = 0;
		for( ; i<=5; i++) {
			System.out.println("for문 앞에서의 i값 = " + i);
		}
		System.out.println("for문 밖에서의 i값 = " + i);
		/*
		 	Java에서는 중괄호가 나오면 하나의 지역이라 생각하면 된다.
		 	즉, if문, while문 등의 제어문도 지역을 가지게 된
		 */
		
		/*
		퀴즈1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		
		for(int k = 2; k<=9; k++) {
			for(int j = 1; j <= 9; j++) {
//				System.out.print(k + " X " + j + " = " + (k*j) + " ");
				System.out.printf("%d X %d = %2d ", k, j, k*j);
			}
			System.out.println();
		}
		
		/*
		퀴즈2] 다음의 출력결과를 보이는 for문을 작성하시오
		출력결과
			0 0 0 1
			0 0 1 0
			0 1 0 0
			1 0 0 0
		해법 : x와 y를 더해서 5가 될때 1을 출력한다.
		 */
		
		for(int x = 1; x<=4; x++) {
			for(int y = 4; y>=1; y--) {
				if(x == y) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	}

}
