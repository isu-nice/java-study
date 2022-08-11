package JavaStudy5;

public class FerretExam {

	public static void main(String[] args) {
		Animal animal = new Ferret(); // 부모 타입으로 자식을 가리킬 수 있음
		animal.cute();
//		animal.say();   오류: 부모가 가지고 있는 것들만 사용 가능함
	
	
//		Ferret ferret = animal;   오류
		Ferret ferret = (Ferret)animal;  // 형변환
		ferret.cute();
		ferret.say();
		
	}

}
