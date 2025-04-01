package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		
		String[] result = Integer.toString(num1 * num2 * num3).split("");
		int[] arr = new int[10];
		
		for(int i=0; i<result.length; i++) {
			int change = Integer.parseInt(result[i]);
			for(int j=0; j<10; j++) {
				if(change == j) {
					arr[j]++;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
