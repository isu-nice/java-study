package JavaStudy4;

public class Car {
	//타입 필드명
	String name;
	int number;

	// 오류
//	public Car(String name) {
//		name = name;
//	}
	
	
	//this 사용
	public Car(String name) {
		this.name = name;
	}
	
	//기본 생성자도 만들어 줄 수 있음
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0);  
		// 이렇게 자신의 생성자를 호출하는 방법으로 표현 가능
		// 코드가 중복되는 것을 방지해줌
	}
	
	//이름과 번호도 받아들이고 싶을 때 만들어 줌
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	
}
