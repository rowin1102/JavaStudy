package ex04controlstatement;

import java.io.IOException;

/*
 	if(조건문){
 		실행문장;
 	}
 	-if문의 조건문은 반드시 비교식 혹은 논리식
 	-조건의 결과로 true / false를 반환
 	-조건문에 산술식이 포함되면 에러 발생
 	-실행문장이 하나라면 중괄호 생략이 가능
 */
public class E01If01 {

	public static void main(String[] args) throws IOException { 
		
		int num = 10;
		// 아래 문장은 조건식이 아닌 술식이므로 에러 발생
//		if(num % 2) {
//			System.out.println("잘못된 조건식");
//		}
		
//		if(num) {
//			System.out.println("잘못된 조건식");
//		}
		
		// if문의 조건식은 아래와 같이 boolean 값을 반환, 비교식으로 처리
		if(num % 2 == 0) {
		System.out.println(num + "는 짝수");
		}
		
		// 논리식으로 처리
		if(num % 2 == 0 && num >= 10) {
			System.out.println(num + "은 짝수이고 10보다 크거나 같다");
		}
		
		// 경우에 따라 무조건 실행되는 조건문이 필요한 경우 사용
		if(true) {
			System.out.println("무조건 실행되는 if문");
		}
		
		/*
		 	if(조건식); => 세미콜론은 문장의 끝을 나타내므로 조건에 상관없이 중괄호에 있는 문장 실행
		 	사용에 주의
		 */
		if(num % 2 != 0); {
			System.out.println(num + "은 홀수");
		}
		
		/*
		 	if문의 실행문장이 1개인 경우 중괄호를 생략할 수 있음
		 	단, 실행문이 2개 이상이라면 첫번째 문장만 if문에 포함되므로 반드시 중괄호를 기술
		 */
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수");
		}
		
		if(num % 2 != 0) {
			System.out.println("num은 " + num + "이다");
			System.out.println(num + "은 홀수");
		}
		
		/*
			시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 이용해서 작성하시오.
			참조) System.in.read() : 키보드를 통해 입력한 문자의 아스키코드를 정수형으로 반환하는 메서드. 
			두글자 이상 입력하더라도 첫번째 문자만 입력된다.  
		 */
		
		System.out.println("하나의 문자를 입력");
		int asciiCode = System.in.read();
		// a는 97, 1은 49 출력
		System.out.println("입력한 문자 : " + asciiCode);
		
		/*
		 	아스키코드를 알고 있을 때의 구현방법. 문자 0과 9는 아스키코드 48, 57에 해당하므로
		 	구간내에 있는지 확인하면 됨.
		 */
		if(asciiCode >= 48 && asciiCode <= 57) {
			System.out.println("입력한 문자는 숫자 [2]");
		} else {
			System.out.println("입력한 문자는 숫자 X [2]");
		}
		
		/*
		 	아스키코드를 모를때 구현하는 방법으로 문자'0'과 '9'는 메모리에 저장시 아스키코드로 변환되므로
		 	아래와 같은 조건으로도 확인할 수 있음
		 */
		if(asciiCode >= '0' && asciiCode <= '9') {
			System.out.println("입력한 문자는 숫자");
		} else {
			System.out.println("입력한 문자는 숫자 X");
		}
		
	}

}
