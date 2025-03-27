package ex07string;

import java.util.Scanner;

public class QuValidateId {

	public static boolean idValidate(String inputId) {
		
		if(inputId.length() < 8 || inputId.length() > 12) {
			return false;
		}
		
		for(int i=0; i<inputId.length(); i++) {
			char idChar = inputId.charAt(i);
			if(!((idChar >= 'a' && idChar <= 'Z') || 
					(idChar >= 'A' && idChar <= 'Z') || 
					(idChar >= '0' && idChar <= '9'))) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String str = scanner.nextLine();
		
		if(idValidate(str)) {
			System.out.println("사용할 수 있는 아이디입니다.");
		} else {
			System.out.println("사용할 수 없는 아이디입니다.");
		}
		
		scanner.close();
	}

}
