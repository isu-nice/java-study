package JavaStudy6;

public class MyCalExam {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(5, 6);
		System.out.println(i);
		
		int j = cal.exec(4, 7);
		
		Calculator.exec2(3, 4);
		//인터페이스에서 정의한 static메소드는 반드시 인터페이스명.메소드 형식으로 호출해야한다.  

	}

}
