package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int maxValue = 0;
		int minValue = 0;
		
		for(int i=0; i<length; i++) {
			int N = Integer.parseInt(input[i]);
			if(i == 0) {
				maxValue = N;
				minValue = N;
			} else if(N > maxValue) {
				maxValue = N;
			} else if(N < minValue) {
				minValue = N;
			}
		}
		System.out.println(minValue + " " + maxValue);
		
	}
	
}
