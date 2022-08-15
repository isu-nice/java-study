package javaStudy2;

public class ForExam {

	public static void main(String[] args) {
		int total1 = 0;
		//for문을 이용하여 1부터 100까지의 합을 구하는 프로그램
		for(int i = 1; i <= 100; i++) {
			total1 = total1 + i;
		}
		
		System.out.println("total1 = "+total1);
		
		//for문을 이용하여 1부터 100까지의 짝수의 합을 구하는 프로그램
		int total2 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue; 
				//continue를 만나면 아래를 수행하지 않고 다음 for문 수행함
			}
			total2 = total2 + i;
//			if(i == 50) {
//				break; //50까지만 수행하고 반복문 빠져나옴
//			}
		}
		
		System.out.println("total2 = "+total2);
	}

}
