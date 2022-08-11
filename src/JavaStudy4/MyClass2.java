package JavaStudy4;

public class MyClass2 {
	//메서드 오버로딩
	//반드시 타입이 모두 달라야 함
	public int plus(int x , int y) {
		return x + y;
	}
	public int plus(int x , int y , int z) {
		return x + y + z;
	}
	public String plus(String x , String y) {
		return x + y;
	}
	
	

}
