package ex16exception;

public class Ex02PreDefineException1 {
	
	public static void main(String[] args) {
		
		// 배열의 인덱스를 벗어난 경우 발생됨
		System.out.println("### ArrayIndexOutOfBoundsException ###");
		// 크기가 2인 배열 생성
		int[] intArr = new int[2];
		/*
		 	예외가 발생할 수 있는 지역을 try로 먼저 묶어주고 예외가 발생되면
		 	JVM(자바가상머신)은 해당 예외에 관련된 인스턴스를 만들어 프로그램쪽으로 전달된다.
		 	이때 catch절에서 예외 인스턴스를 잡아주는것을 "예외처리"라고 한다.
		 	만약 이 예외가 catch되지 못 하면 프로그램은 비정상적인 종료로 이어지게 된다.
		*/
		try {
			intArr[0] = 100;
			System.out.println("0번방:" + intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방:" + intArr[0]);
			intArr[2] = 300;
			System.out.println("3번방:" + intArr[0]);
		} catch(ArrayIndexOutOfBoundsException e) {
			// 예외메세지1 : 개발자가 임의로 메세지를 출력
			System.out.println("에외발생");
			// 메세지2 : 간략한 설명을 출력
			System.out.println("예외메서지 : " + e.getMessage());
			// 메세지3 : 예외에 대한 디테일한 설명을 출력(가장 많이 사용됨)
			e.printStackTrace();
		}
		
		// 예외처리를 통해 실행의 흐름이 중단되지 않으므로 아래 문장은 정상적으로 출력된다.
		System.out.println("0번방 재출력:" + intArr[0]);
		System.out.println("### ArrayIndexOutOfBoundsException 발생 후 ###");
	}
	
}
