package javaStudy1;

public class OperatorExam1 {

	public static void main(String[] args) {
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i2;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; //i3 = i3+1; i3에 1을 더하고 그 값을 i4에 넣어라
		System.out.println(i4);
		System.out.println(i3);
		int i5 = i3++; //i3 = i3 + 1; i3을 넣고 i3에 1을 더해라
		System.out.println(i5);
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / (double)j);
		System.out.println(i % j); //나머지값 출력
		
	}

}
