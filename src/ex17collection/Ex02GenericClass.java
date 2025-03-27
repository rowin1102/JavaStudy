package ex17collection;

class Apple {
	int weight;

	public Apple(int weight) {
		this.weight = weight;
	}
	public void showInfo() {
		System.out.println("사과의 무게는 " + weight + "입니다");
	}
}

class Banana {
	int sugar;

	public Banana(int sugar) {
		this.sugar = sugar;
	}
	public void showInfo() {
		System.out.println("바나나의 당도는 " + sugar + "입니다");
	}
}

/*
class FruitBox {
	Object item;
	
	public FruitBox(Object item) {
		this.item = item;
	}
	
	public void store(Object item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}
*/

class GenericFruitBox<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
	
}

public class Ex02GenericClass {
	
	public static void main(String[] args) {
		
		/*
		 	Box 인스턴스를 생성할 때 T부분을 결정하므로 구현의 편의성이 보장된다.
		 	각각 Apple, Banana 인스턴스를 저장할 수 있는 Box 인스턴스가 생성되었다.
		*/
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();
		
		GenericFruitBox<Banana> bananaBox = new GenericFruitBox<Banana>();
		bananaBox.store(new Banana(20));
		Banana banana = bananaBox.pullOut();
		banana.showInfo();
		
		// Orange클래스는 동일한 패키지에 정의되어 있으므로 사용할 수 있다.
		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
		/*
		 	OrangeBox는 인스턴스 생성시 Orange를 저장할 수 있는 용도로 생성되었으므로
		 	다른 인스턴스는 저장할 수 없다. 아래와 같이 컴파일 에러가 발생되므로 자료형에도
		 	안전한 코드가 된다.
		*/
//		orangeBox.store("나는 오렌지");
//		orangeBox.store(apple);
//		orangeBox.store(banana);
	}
	
}
