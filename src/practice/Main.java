package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0, max = 0;
		int[] arr = new int[9];
		for(int i=0; i<9; i++) {
			num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
		
	}
	
}
