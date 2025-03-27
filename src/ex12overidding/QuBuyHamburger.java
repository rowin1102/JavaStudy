package ex12overidding;

class Burger {
	
	private String burgerName;
	private int price;
	private String patty;
	private String sauce;
	private String vegetable;
	
	
	public Burger(String burgerName, int price, String patty, String sauce, String vegetable) {
		this.burgerName = burgerName;
		this.price = price;
		this.patty = patty;
		this.sauce = sauce;
		this.vegetable = vegetable;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void burgerInfo() {
		System.out.printf("%s\n가격 : %d\n식재료 : %s, %s, %s\n", burgerName, price, patty, sauce, vegetable);
	}
	
}

class HamburgerPrice {
	
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;
	
	
	public HamburgerPrice(Burger burger) {
		this.burger = burger;
	}
	
	public int calculation() {
		return (burger.getPrice() + COKE + POTATO);
	}
	
	public void showPrice() {
		burger.burgerInfo();
		System.out.println("결제금액 : " + calculation());
		System.out.println("================================");
	}
}

class SetPrice extends HamburgerPrice {

	public SetPrice(Burger burger) {
		super(burger);
	}
	
	@Override
	public int calculation() {
		return super.calculation() - 500;
	}
	
	@Override
	public void showPrice() {
		burger.burgerInfo();
		System.out.println("세트금액 : " + calculation());
		System.out.println("================================");
	}
	
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		//치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	// 4500원
		
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	// 5000원
		
	}

}
