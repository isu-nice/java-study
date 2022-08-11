package JavaStudy2;

public class WhileTest{
    public static void main(String[] args){
        //i가 짝수일때만 i를 출력하는 코드를 짜보세요.
    	int i = 1;
        while(i < 11){
            
            if(i % 2 == 0){
            System.out.println(i);
            }
            i++;
        }
    }
}