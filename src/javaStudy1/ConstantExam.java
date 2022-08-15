package javaStudy1;

public class ConstantExam {

	public static void main(String[] args) {
		int i ;
		i = 10;
		i = 5;
		
		final int J;
		J = 10;
		//J = 5; (상수명에는 값을 담을 수 있는 기회가 단 한 번만 허락됨) 
		
		double circleArea;
		final double PI = 3.14159; 
		circleArea = 3 * 3 * PI;
		System.out.println(circleArea);

		
		//대문자로만 구성된 명사로 정함
		//여러 단어로 구성된 이름의 경우 단어 사이에 '_'을 써서 구분함.
		final int OIL_PRICE = 1450;
		
		int totalPrice = 50 * OIL_PRICE;
		System.out.println(totalPrice);

		
		
		
	}

}
