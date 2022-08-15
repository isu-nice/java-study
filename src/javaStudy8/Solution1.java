package javaStudy8;

// 자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

// 방법 1: 키보드로부터 입력받아서 확인 
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		Solution1 cal = new Solution1();
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		
		cal.solution(n);
		
		System.out.println(cal.solution(n));
		
	}
	public int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer = answer + i;
			}
		}
		return answer;
	}
}


// 방법 2
//public class Solution2 {
//	public static void main(String[] args) {
//		Solution2 cal = new Solution2();
//		
//		cal.solution(5);
//		
//		System.out.println(cal.solution(5));
//		
//	}
//	public int solution(int n) {
//		int answer = 0;
//		for(int i = 1; i <= n; i++) {
//			if(n % i == 0) {
//				answer = answer + i;
//			}
//		}
//		return answer;
//	}
//}


// 방법 3
class Solution3 {
public int solution(int n) {
int answer = 0;

  for(int i = 1; i <= n; i++){
      if(n % i == 0){
          answer += i;
      }
  }
  return answer;
}
}