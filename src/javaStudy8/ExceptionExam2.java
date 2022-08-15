package javaStudy8;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
		int k = divide(i, j);
		System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		
	}
	
	//이 메서드를 호출한 쪽에서 오류를 처리하도록 떠넘김
	public static int divide(int i, int j) throws ArithmeticException {
		int k = i/j;
		return k;
	}
}
