package javaStudy3;

public class ArrayWithFor {

	public static void main(String[] args) {
		int [] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
		//배열에 0번째 인덱스 부터 시작해서 1부터 100까지 넣기
		for(int i = 0; i < iarray.length ; i++) {
			iarray[i] = i + 1;
		}
		
		//배열에 저장된 값을 모두 더해주기
		int sum = 0;
		for(int i = 0; i < iarray.length; i++) {
			sum = sum + iarray[i];
		}
		
		System.out.println(sum);
	}

}
