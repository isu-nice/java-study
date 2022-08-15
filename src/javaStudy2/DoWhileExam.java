package javaStudy2;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		int value = 0;
		Scanner scan = new Scanner(System.in);
		//키보드로부터 값을 입력받을 수 있는 클래스

		
		do {
			//반복할 문장들
			value = scan.nextInt();// Scanner클래스를 이용하여 키보드로 부터 숫자값을 입력받는다.
			System.out.println("입력받은 값:"+value);
			
		}while(value != 10); //10이 아니면 계속 반복

		System.out.println("반복문 종료! :");
	}

}
