package javaStudy5;

public class Apple extends Fruit {
	public void juicy() {
		super.juicy(); // 부모가 가진 메서드도 호출할 수 있음
		System.out.println("Apple의 Juicy 메서드");
	}
}
