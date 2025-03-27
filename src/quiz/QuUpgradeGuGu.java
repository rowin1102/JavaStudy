package quiz;

public class QuUpgradeGuGu {
	
	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			System.out.println(i + " x 1 = " + i);
			int sum = i;
			
			for(int j=2; j<=9; j++) {
				sum *= i;
				System.out.print(i);
				
				for(int k=1; k<j; k++) {
					System.out.print(" x " + i);
				}
				
				System.out.println(" = " + sum);
			}
		}
	}
}

