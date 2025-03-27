package ex05method;

public class QuSymmetry {

	public static void rotationSymmetry() {
		System.out.println("for문 사용");
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=4; j++) {
				if(i == j) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		System.out.println("while문 사용");
		int i=4;
		while(i<=4) {
			int j = 1;
			while(j<=4) {
				if(i == j) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
				j++;
			}
			System.out.println();
			i--;
			if(i == 0) break;
		}
	}
	
	public static void main(String[] args) {
		
		rotationSymmetry();
		
	}

}
