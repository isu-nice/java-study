package JavaStudy2;

public class WhileExam {

	public static void main(String[] args) {
		//while, do while, for
		
		//10번 반복하면서 0부터 9까지 출력하는 반복문
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++;
		}

		
		//1부터 100까지의 합 출력
		int total = 0;
		int j = 1;
		while(j<=100) {
			total = total + j;
			j++;
		}
		System.out.println(total);
		
		//조건문의 실행 결과가 true일 동안 반복해서 실행
		while(true) {
			System.out.println("hello");
			
		}
		
	}

}
