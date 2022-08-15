package javaStudy4;

public class BusExam {
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		//Car2에서 물려받은 메서드 사용 가능
		bus.ppangppang();
		
		Car2 car = new Car2();
		car.run();
		
	}
	

}
