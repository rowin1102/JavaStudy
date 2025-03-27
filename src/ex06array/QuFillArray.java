package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int cnt1 = 1 ,cnt2 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(i+1 + "번째 정수를 입력하세요 : ");
			int num = scanner.nextInt();
			arr1[i] = num;
			if(num % 2 == 0) {
				arr2[arr2.length - cnt1] = num;
				cnt1++;
			}else {
				arr2[cnt2] = num;
				cnt2++;
			}
		}
		
		System.out.println("순서대로 입력된 결과");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("홀수 / 짝수 구분 입력 결과");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		scanner.close();
	}

}
