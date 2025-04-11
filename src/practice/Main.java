package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int num1 = 2;
		int num2 = 7;
		int cnt = 1;
		
		while(true) {
			
			for(int i=1; i<N; i++) {
				if(N == 1) break;
				
				if(!(N >= num1 && N <= num2)) {
					cnt++;
				} else if(N >= num1 && N <= num2) {
					cnt++;
					break;
				}
				
				num1 += i * 6;
				if(i == 1) {
					num2 = 19;
				} else {
					num2 += i * 6;
				}
				
			}
			System.out.println(cnt);
			break;
		}
		
	}
	
}
