package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {

		int i = 5;
		do {
			int k = 1;
			do {
				System.out.print("*");
				k++;
			} while(k <= i);
			System.out.println();
			i--;
		} while(i >= 1);
		
	}

}

