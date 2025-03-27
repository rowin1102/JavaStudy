package ex04controlstatement;

/*
 	if문 형식3
 		if(조건1){
 			조건1이 true일 때 실행;
 		} else if{
 			조건2가 true일 때 실행;
 		} else {
 			위 모든 조건에 만족하지 않는경우 실행;
 		}
 		단, else문에 조건식이 들어가면 에러 발생
 */
public class E01If03 {

	public static void main(String[] args) {
		
		// 점수는 정수타입으로 변수 및 초기값 할당
		int kor = 99, eng = 70, math = 64;
		/*
		 	평군값은 소수점이 될수 있으므로 실수형으로 선언하는 것이 좋음
		 	double형의 결과를 얻기 위해 3.0으로 나눠준다
		 */
		double avg = (kor + eng + math) / 3.0;
		
		System.out.println("평균(그대로)" + avg);
		// 서식문자를 이용해서 소수이하 2자리까지만 표현
		System.out.printf("평균(소수점 2자리) : %.2f \n", avg);
		
		if(avg >= 90) {
			System.out.println("A");
		} else if(avg >= 80) {
			System.out.println("B");			
		} else if(avg >= 70) {
			// 결과는 77.67이므로 C학점이 출력
			System.out.println("C");		
		} else if(avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("학사경고");
		}
		
		System.out.println("잘못된 조건식의 if문");
		/*
		 	높은 점수라 할지라도 60점 이상의 조건에 만족하므로 무조건 D학점이 출력
		 	따라서 논리적으로 문제가 있는 코드가 된다.
		 	이와 같이 구간이 필요한 경우에는 큰 숫자를 먼저 기술해야함
		 */
		if(avg >= 60) {
			System.out.println("D");
		} else if(avg >= 70) {
			System.out.println("C");			
		} else if(avg >= 80) {
			System.out.println("B");		
		} else if(avg >= 90) {
			System.out.println("A");
		} else {
			System.out.println("학사경고");
		}
		
		System.out.println("점수의 구간을 조건으로 사용");
		
		if(avg >= 60 && avg < 70) {
			System.out.println("D");
		} else if(avg >= 70 && avg < 80) {
			System.out.println("C");			
		} else if(avg >= 80 && avg < 90) {
			System.out.println("B");		
		} else if(avg >= 90) {
			System.out.println("A");
		} else {
			System.out.println("학사경고");
		}
		
	}	
		
}
