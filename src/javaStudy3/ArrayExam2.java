package javaStudy3;

public class ArrayExam2 {

	public static void main(String[] args) {
		int[][] array4 = new int[3][4];
		//array4[0] = 10;  -> 오류!
		array4[0][1] = 10;
		
		int [][] array5 = new int[3][];
		//array5[0][0] = 10;  -> 오류!
		//각 인덱스가 가리키는 배열을 만들어줘야 함
		array5[0] = new int[2]; //정수를 두개 담을 수 있는 배열을 생성 
		array5[0][1] = 10;
		System.out.println(array5[0][1]);
		
		//배열을 초기화함과 동시에 값 지정
		int[][] array6 = {{1},{2,3},{4,5,6}};

		System.out.println(array6[0][0]);
		
		System.out.println(array6[2][2]);
	}

}
