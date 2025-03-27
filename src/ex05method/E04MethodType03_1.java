package ex05method;

import java.util.Scanner;

/*
 	메서드형태3] 매개변수 o, 반환값 x : 값을 전달받은 후 연산하고 해당 결과를 반환하지 않고 즉시 출력하는 경우 사용.
 		즉, 값을 소비하는 형태의 메서드
 */
public class E04MethodType03_1 {

	public static void main(String[] args) {

		// 입력값을 받기 위해 Scanner 인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		System.out.println("시작값 : ");
		int s = scanner.nextInt();
		System.out.println("종료값 : ");
		int e = scanner.nextInt();
		
		/*
		 	반환값이 없는 메서드이므로 단독적으로 호출한다.
		 	앞에서 받은 2개의 정수(Argument)로 전달
		 */
		myWantSum(s, e);
		scanner.close();
		
	}

	/*
	 	main() 메서드에서 호출시 전달한 2개의 인수를 매개변수가 순서대로 값을 받게 된다.
	 	매개변수는 해당 메서드에서 즉시 사용할 수 있는 지역변수가 된다.
	 */
	static void myWantSum(int startNum, int endNum) {
		/*
		 	1에서 10까지의 합을 구하는 수열 프로그램을 시작값과 종료값만 변수로 변경하여
		 	원하는 구간의 합을 구하는 프로그램으로 커스터마이징하여 재정의 함.
		 */
		int sum = 0;
		for(int i=startNum; i<=endNum; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의 합은 : %d", startNum, endNum, sum);
		
	}
	
}
