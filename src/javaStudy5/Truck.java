package javaStudy5;

public class Truck extends Car {
	public Truck() {
		super("소방차"); // 부모 생성자도 자동으로 호출됨
		System.out.println("Truck의 기본 생성자 입니다. ");
	}
}
