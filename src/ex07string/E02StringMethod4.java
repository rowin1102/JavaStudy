package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		String rNumber1 = "190419-3000000";
		String rNumber2 = "190419-4000000";
		if(rNumber1.charAt(7) == '1' || rNumber1.charAt(7) == '3') {
			System.out.println("남자");
		} else if(rNumber1.charAt(7) == '2' || rNumber1.charAt(7) == '4') {
			System.out.println("여자");
		} else {
			System.out.println("다시 입력");
		}
		
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
		String email = "hong@daum.net";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("이메일 형식임");
		} else {
			System.out.println("이메일 형식이 아님");
		}
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		
		int index1 = rNumber2.indexOf("-") + 1;
		if(rNumber2.charAt(index1) == '1' || rNumber2.charAt(index1) == '3') {
			System.out.println("남자");
		} else if(rNumber2.charAt(index1) == '2' || rNumber2.charAt(index1) == '4') {
			System.out.println("여자");
		} else {
			System.out.println("다시 입력");
		}

		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. last, subString
		파일명 : my.file.images.jpg
		*/
		
		String file = "my.file.images.jpg";
		int index2 = file.lastIndexOf(".") + 1;
		System.out.println(file.substring(index2));
		
	}

}
