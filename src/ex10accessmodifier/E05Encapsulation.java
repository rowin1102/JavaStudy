package ex10accessmodifier;

/*
 	캡슐화(Encapsulation) : 여러가지 업무 로직을 하나로 묶는다는 의미와,
 		업무의 순서까지 고려한 형태의 로직을 구성한다는 의미를 가지고 있다.
 		즉, 관련있는 로직을 하나로 묶어주는 것을 말한다.
 */

// 아래 4가지 업무는 번호 순서대로 진행해야 한다고 가정한다.
class MemberRegist {
	void doMemberRegist() {
		System.out.println("1. 회원가입을 진행합니다.");
	}
}

class CongratulationPoint {
	void doCongratulationPoint() {
		System.out.println("3. 가입축하 10포인트를 지급합니다.");
	}
}

class AuyoLogin {
	void doAutoLogin() {
		System.out.println("2. 자동로그인");
	}
}

class FirstLoginEvent {
	void doFirstLoginEvent() {
		System.out.println("4. 첫 로그인 이벤트 페이지로 이동합니다");
	}
}

/*
 	업무의 순서를 고려하여 관련된 메서드를 하나의 클래스로 정의한다.
 	차후에는 별도의 분석 작업 없이 해당 클래스의 doProcess() 메서드만
 	호출하면 업무는 차질없이 진행될 것이다.
 */
class EncapsulLogic {
	
	// 각 업무를 담당할 클래스를 통해 인스턴스 생성
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
	AuyoLogin autoLogin = new AuyoLogin();
	CongratulationPoint congratulation = new CongratulationPoint();
	
	// 업무의 순서를 고려하여 캡슐화된 메서드를 정의
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulation.doCongratulationPoint();
		firstLoginEvent.doFirstLoginEvent();
	}
}

public class E05Encapsulation {

	public static void main(String[] args) {
		
		System.out.println("캡슐화 전 코드");
		
		/*
		 	업무의 진행순서가 중요하다고 가정했을 때 캡슐화 이전의 코드에서는 개발자가
		 	순서를 지키지 않은 상태에서도 실행이 간으한 코드가 된다.
		 	즉, 업무의 차직이 발생될 수 있다.
		 */
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
		AuyoLogin autoLogin = new AuyoLogin();
		CongratulationPoint congratulation = new CongratulationPoint();
		
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulation.doCongratulationPoint();
		firstLoginEvent.doFirstLoginEvent();
		
		System.out.println("==========================");
		
		// 아래 메서드 호출을 통해 업무를 순서에 맞게 진행할 수 있다.
		System.out.println("캡슐화 후 코드");
		new EncapsulLogic().doProcess();
	}
	
}