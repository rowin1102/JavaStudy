package ex05method;

public class QuFindPrimeNumber {

	public static boolean isPrimeNumbe(int num) {
		if(num == 1) return false;
		
		for(int i =2; i<num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println("1~100사이 소수");
		for(int i=1; i<=100; i++) {
			if(isPrimeNumbe(i))
				System.out.print(i + " ");
		}
	}

}
