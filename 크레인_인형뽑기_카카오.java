package algolism;

import java.util.*;

public class Main {
	public int Solution(int[][] board,int[] moves) {
		
		Stack<Integer> stack = new Stack<>();
		int count =0;
		
		for(int i : moves) {
			for(int j=0; j<board.length;j++) {
				if(board[j][i-1] != 0) {
					int pick = board[j][i-1];
					board[j][i-1] = 0;
					if(!stack.isEmpty() && pick==stack.peek()) {
						count += 2;
						stack.pop();
					}else {
						stack.add(pick);	
					}
					break;
				}
			}
		}		
		return count;
		
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n ;i++) {
			for(int j=0; j<n;j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m ;i++) {
			moves[i] = sc.nextInt();
		}System.out.println(T.Solution(board,moves));
	}
}