package JavaStudy4;

public class EnumExam {
	//final은 상수를 선언할 때 사용
	//상수를 선언할 때는 전체를 대문자로 사용
	public static final String MALE="MALE";
	public static final String FEMALE="FEMALE";
	
	public static void main(String[] args) {
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
	
		//gender2 = "boy";  -> male, female 이외는 불가능
	}

}
enum Gender{
	MALE, FEMALE;
}