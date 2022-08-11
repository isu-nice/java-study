package JavaStudy4;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		//str1 과 str2는 같은 인스턴스를 참조한다.
		//"hello"라는 문자열이 상수가 저장되는 영역에 저장되기 때문
		
		//new 연산사 사용 -> 인스턴스가 무조건 새로 만들어짐
		String str3 = new String ("hello");
		String str4 = new String ("hello");
		//str3 와 str4는 다른 인스턴스를 참조한다.
		
		if(str1 == str2){ // 같은 인스턴스를 참조하므로 결과는 true 
	        System.out.println("str1과 str2는 같은 레퍼런스입니다.");
	    }
	    if(str1 == str3){ // str1과 str3은 서로 다른 인스턴스를 참조하므로 결과는 false 
	        System.out.println("str1과 str3는 같은 레퍼런스입니다.");
	    }
	    if(str3 == str4){ // str3과 str4는 서로 다른 인스턴스를 참조하므로 결과는 false 
	        System.out.println("str3과 str4는 같은 레퍼런스입니다.");
	    }
	    
	    String str5 = "hello world";
	    String str6 = str5.substring(3);
	    //메소드를 호출해도 string내부 값이 변하지 않음
	    //str6은 str5가 가지고 있는 문자열 중 3번째 위치부터 자른, 새로운 String을 참조하게 된다
	    System.out.println(str6); 
	    
	    //변수의 레퍼런스가 아니라, 변수가 저장하는 문자열은 같다.
	    if( str3.equals(str4) ){
            System.out.println("str3과 str4는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str3과 str4는 다른 값을 가지고 있습니다.");
        }

	}

}
