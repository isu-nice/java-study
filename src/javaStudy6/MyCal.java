package javaStudy6;

public class MyCal implements Calculator {

	@Override
	public int plus(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}

	@Override
	public int multiple(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}
	
	public int exec(int i, int j) {
		System.out.println("오버라이드");
		return i + j;
	}

}
