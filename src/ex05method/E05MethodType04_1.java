package ex05method;

import java.util.Scanner;

/*
 	메서드형식4] 매개변수 o, 반환값 o : 4가지 형식 중 가장 많이 사용됨
 */

public class E05MethodType04_1 {

	static int getTotalAge(int personCnt) {
		Scanner scanner = new Scanner(System.in);
		// 나이의 합을 저장할 변수
		int sumAge = 0;
		// main에서 전달한 인수 3을 매개변수로 받아 사용
		for(int i=1; i<=personCnt; i++) {
			// 총 3명의 나이를 입력
			System.out.println(i + "번째 사람의 나이");
			int age = scanner.nextInt();
			// 입력값은 변수에 누적해서 합산
			sumAge += age;
		}
		scanner.close();
		// 나이의 합을 호출한 지점으로 반환
		return sumAge;
	}
	
	public static void main(String[] args) {
		
		/*
		 	3명의 나이를 입력받은 후 합을 반환받아 출력한다.
		 	반환값이 있는 메서드는 주로 좌측항이 있거나, 출력문 내부에 사용.
		 */
		
		int sumOfAge = getTotalAge(3);
		System.out.println("입력받은 나이의 합 : " + sumOfAge);
		
	}

}
