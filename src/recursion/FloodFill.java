package recursion;

import java.util.Arrays;

public class FloodFill {
	static int N = 5;
	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,0,1,1},
				{0,0,0,1,0},
				{1,1,1,1,0},
				{0,0,0,0,0}};
		
		int startR = 1; int startC = 1;
		fill(board,startR,startC);
		
		System.out.println(Arrays.deepToString(board));
	}
	
	
	public static void fill(int[][] board, int r, int c) {
		// 탈출하는 경우 아무것도 하지 않고 리턴
		if (r < 0 || r > N-1 || c < 0 || c > N-1) return;
		
		// 만나는 블럭이 0이 아닌 경우 리턴
		if (board[r][c] != 0) return;
		
		// 나머지 경우는 1로 채워줌
		board[r][c] = 1;
		
		fill(board, r - 1, c); // 아래 탐색
		fill(board, r + 1, c); // 위 탐색
		fill(board, r, c - 1); // 왼쪽 탐색
		fill(board, r, c + 1); // 오른쪽 탐색
	}
	
}
