package skillup.project03;

public class Friend {
	
	String name;
	String phone;
	String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	
	public void showAllDate() {
		System.out.print("이름:" + name);
		System.out.print(", 전화번호:" + phone);
		System.out.print(", 주소:" + addr);
	}
	
	// 오버라이딩을 위한 메서드 정의
	public void showBasicInfo() {}
	
}
