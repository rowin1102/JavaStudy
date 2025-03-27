package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		
		System.out.println("=====while 이용====");
		int total1 = 0, k = 1;
		
		while(k<=100) {
			if(k % 21 == 0) {
				total1 += 0;
				System.out.println("k = " + k + ", 합 = " + total1 + " => 공배수");
			}else if(k % 3 == 0 || k % 7 == 0) {
				total1 += k;
				System.out.println("k = " + k + ", 합 = " + total1);
			}
			k++;
		}
		
		System.out.println("====do-while 이용====");
		int total2 = 0, j = 1;
		
		do {
			if(j % 21 == 0) {
				total2 += 0;
				System.out.println("j = " + j + ", 합 = " + total2 + " => 공배수");
			}else if(j % 3 == 0 || j % 7 == 0) {
				total2 += j;
				System.out.println("j = " + j + ", 합 = " + total2);
			}
			j++;
		} while(j <= 100);
		
		System.out.println("====for 이용====");
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 21 == 0) {
				sum += 0;
				System.out.println("i = " + i + ", 합 = " + sum + " => 공배수");
			}else if (i % 3 == 0 || i % 7 == 0){
				sum += i;
				System.out.println("i = " + i + ", 합 = " + sum);
			}
		}
		
	}

}
