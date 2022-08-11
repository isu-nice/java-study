package JavaStudy2;

public class SwitchExam {

	public static void main(String[] args) {
		//switch, case, default, break
		
		int value = 2;
		
		switch(value) {
			//break를 제거하면 value가 1일 경우 
			//1이 출력되고 switch문장을 빠져나가는 것이 아니라
		    //1,2,3, 그외의숫자가 연속해서 실행된다. 
			//break문장이 있을 경우와 없을 경우를 확실하게 구분할 수 있어야 합니다.
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			default :
				System.out.println("그 외 다른 숫자");
		}
		
		//JDK7부터는 switch문에 문자열 타입의 변수도 올 수 있다.
		String str = "A";

	    switch(str){
	        case "A": 
	            System.out.println("1");
	        case "B":
	            System.out.println("2");
	        case "C" :
	            System.out.println("3");
	        default :
	            System.out.println("그 외의 숫자");
	    }

	}

}
