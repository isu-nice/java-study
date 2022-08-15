package javaStudy2;

public class OperatorExam5 {

	public static void main(String[] args) {
		//삼항연산자 5>4 가 true이면 50대입, 아니면 40대입
		int b1 = (5 > 4) ? 50 : 40;
		
		System.out.println(b1);
		
		//if문으로 만들어도 같은 결과가 나옴.
		 int b2 = 0;
         if(5 > 4){
             b2 = 50;
         }else{
             b2 = 40;
         }
         
         System.out.println(b2);
	}

}
