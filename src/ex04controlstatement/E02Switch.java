package ex04controlstatement;

import java.util.Scanner;

/*
 	switch : if문처럼 조건에 따라 분기하는 제어문으로 정수식의 값과 동일한 부분을 찾아 실핼하는 형태를 가지고 있다.
 	형식]
 		switch(산순식 or 정수식){
 			case 값:
 				실행문; break;
 			default:
 				실행문;
 		}
 		-switch문 내부에서 break를 만나면 실행이 중지되고 문장을 탈출
 		-만약 break문이 없으면 그 아래의 모든 문장이 실행
 		-default문은 앞에서 모든 case와 일치되지 않을때 실행되는 부분으로
 			if문의 else와 동일한 역할을 한다.
 */
public class E02Switch {

	public static void main(String[] args) {
		
		/*
		 	Scanner 클래스 : 사용자로부터 입력값을 받기위한 클래스로, 
		 		해당 클래스의 메서드가 실행되면 잠깐 실행이 중지되고 입력을 기다린다.
		 	 nextInt() : 정수를 입력받음
		 	 nextLine() : 문자열(string)을 입력받음
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자 : " + iNum);
		
		// 정수를 3으로 나누면 나머지는 0, 1, 2만 생성
		int remain = iNum % 3;
		switch(remain) {
		case 0:
		System.out.println("나머지 1");
			break;
		default:
			System.out.println("나머지 2");
		}
		
		scanner.close();
		
		/*
		 	switch문 사용시 주의사항
		 	-long타입의 변수는 사용할 수 없다.
		 	-int, char, String을 사용할 수 있다.
		 	-논리식, 비교식을 사용할 수 없다.
		 */
//		long ln = 100;
//		switch(ln) {
//		case 100:
//			System.out.println("long타입 사용?");
//		default:
//			System.out.println("사용x");
//		}
		// 조건식은 사용할 수 없음 
//		switch(iNum % 3 == 0) {
//		System.out.println("논리식 X");
//		}
		
		// 문자열이나 문자는 사용할 수 있다.
		String title = "자바";
		switch(title) {
		case "자바": System.out.println("자바 좋아");
			break;
		case "JAVA": System.out.println("JAVA Good");
			break;
		}
		
		/*
		 	여러 case를 동시에 처리할때는 break문 없이 case를 나열하면 된다.
		 	if문에서 논리Or를 유사하게 사용할 수 있다.
		 */
		int season = 8;
		switch(season) {
		case 3:case 4:case 5:
			System.out.println("봄");
			break;
		case 6:case 7:case 8:case 9:
			System.out.println("여름");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11:case 12:case 1:case 2:
			System.out.println("계울");
		}
		
		/*
			시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
				프로그램을 작성하시오. 90점이상은 A학점...
				60점 미만은 F학점을 출력하면 된다. 
				단, switch문으로 작성하시오. 
		 */
		
		// 정수타입으로 점수를 할당
		int kor = 65, eng = 70, math = 75;
		/*
		 	Java에서는 switch문에 조건식을 사용할 수 없으므로 평균점수의 구간을 아래와 같이
		 	10으로 나눈 몫을 통해 구해야 한다.
		 */
		int avg = ((kor + eng + math) / 3) / 10;
		switch(avg) {
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");

		}
	}

}
