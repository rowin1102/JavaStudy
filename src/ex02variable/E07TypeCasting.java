package ex02variable;

public class E07TypeCasting {

	public static void main(String[] args) {

		/*
		 * 자동형변환 : 작은 자료형의 데이터를 큰 자료형에 대입할 때 자동으로 형변환이 일어남 자료의 손실이 없을때만 적용
		 */
		byte b1 = 65;
		short s1 = b1;
		// byte가 short보다 작은 자료형이므로 자동형변환됨
		System.out.println("b1은 " + b1 + "s1은 " + s1);
		
		/*
		 	아래 코드는 자동형변환X, CPU는 int보다 작은 자료를 연산할 때 int로 간주하여 진행하고 결과로 int로 반환
		 	따라서 이부분은 int형에 최적화된 CPU의 특성으로 생각하면 됨
		 */
		int num1 = b1 + s1;
		System.out.println("num1은 " + num1);
		
		/*
		 	char형(문자타입)에 byte형(정수타입)을 바로 대입할 수 없음
		 	특성이 다르므로 강제형변환 후 대입헤야함
		 */
		// char ch1 = b1;
		char ch2 = (char) b1;
		System.out.println("b1 = " + b1 + ", ch2 = " + ch2);

		/*
		  	명시적(강제) 형변환 : 큰 상자의 자료를 작은 상자의 자료형에 할당해야할 때 사용. 단, 자료의 손실이 있을 수 있으므로
		  		필요한 경우에만 사용해야함
		 */
		// 만약 129를 대입하면 byte로 형변환 시 -127이 출력
		short s2 = 100;
		byte b2 = (byte) s2;
		System.out.println("데이터미손실 : b2=" + b2 + ", s2=" + s2);
		
		/*
		 소수점 아래부분이 버려지므로 데이터 손실이 발생하는 경우
		 흔히 원단위절삭과 같은 경우에 사용함
		 */
		double dl = 3.14159;
		int num3 = (int) dl;
		System.out.printf("데이터손실 : num3=%d, dl=%.2f %n", num3, dl);
		/*
		 	서식문자 사용시 %.2f는 정수부는 모두 출력하고, 소수 이하는 2자리까지만 표현
		 */
		
		/*
		 	문자는 메모리에 저장시 아스키코드로 저장되므로 int형과의 연산을 진행한 후 문자로 표현하고 싶다면 char형으로 강제형변환하면 됨
		 */
		char ch3 = 'A', ch4;
		int num4 = 2;
		// char + int => int이므로 char에 저장할 수 없어 에러발생
		//ch4 = ch3 + num4;
		ch4 = (char) (ch3 + num4);
		System.out.println("ch4 = " + ch4);

	}

}
