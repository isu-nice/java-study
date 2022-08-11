package JavaStudy1;

public class TypeCastingExam {

	public static void main(String[] args) {
		//묵시적 형변환(암묵적 형변환) : 크기가 작은 타입을 큰 타입으로 바꿀 때
		int x = 50000;
		long y = x;
		
		//명시적 형변환(강제 형변환) : 크기가 큰 타입을 작은 타입으로 바꿀 때 
		long x2 = 5;
		int y2 = (int) x2;

	}

}
