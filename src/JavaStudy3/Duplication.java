package JavaStudy3;


// 중복 확인 (전수조사)
public class Duplication {
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 21};
		int[] win_nums = {31, 10, 45, 1, 6, 19};

		int count = 0; int zero = 0;
		for(int i = 0; i < lottos.length; i++) {
			for(int j = 0; j < lottos.length; j++) {
				if(lottos[i] == win_nums[j]) {
					count++;

				}
				System.out.println(count);
			}
			System.out.println(count);
			if (lottos[i] == 0) {
				zero++;
			}

		}
		System.out.println(zero);
	}
}
