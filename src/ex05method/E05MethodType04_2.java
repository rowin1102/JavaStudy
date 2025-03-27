package ex05method;

import java.util.Scanner;

public class E05MethodType04_2 {
	
	/*
	 	main()에서 전달한 인수의 크기만큼 반복해서 정수를 입력받은 후 최대값을 찾아서
	 	반환해주는 메서드 정의
	 */
	
	static int returnMaxNumber(int numberCnt) {
		
		Scanner scanner = new Scanner(System.in);
		// 최댓값을 저장할 변수
		int maxVal = 0;
		// 매개변수로 전달된 인수의 크기만큼 반복
		for(int i=1; i<=numberCnt; i++) {
			System.out.println("정수 입력");
			int inputNum = scanner.nextInt();
			
			if(i==1) {
				/*
				 	입력받은 정수 중 최댓값을 찾아야 하므로,
				 	첫 번째 입력값 비교를 위한 기준값으로 설정한다.
				 */
				maxVal = inputNum;
			}else {
				/*
				 	두 번째 입력값부터는 기존의 최댓값과 비교해서
				 	더 큰 값이 발견되면 교체한다.
				 */
				if(maxVal < inputNum) {
					maxVal = inputNum;
				}
			}
		}
		scanner.close();
		/*
		 	즉 새로운 값이 입력되면 기존값과 비교해서 큰 경우 지속적으로 교체하여
		 	최댓값을 찾는다. 이 값을 호출한 지점으로 반환한다.
		 */
		return maxVal;
	}
	
	public static void main(String[] args) {
		
		// 정수 4개 중에서 최댓값 찾기
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최댓값1 : " + maxValue1);
		
//		int maxValue2 = returnMaxNumber(6);
//		System.out.println("최댓값2 : " + maxValue2);
		
		
	}

}
