package algolism;
import java.util.*;

public class Main {
	public int Solution(int num , int[][] map) {
		
		int answer = 0;
		for(int i=1; i<=num;i++) {
			for(int j=1;j<=num;j++) {
				int count = 0;
				for(int k=0; k<map.length;k++) {
					int pi = 0;
					int pj = 0;
					for(int s =0;s<map[k].length;s++) {
						if(map[k][s] == i) {
							pi = s;
						}
						if(map[k][s] == j) {
							pj = s;
						}
					}
					if(pi>pj) {
						count += 1;
					}
				}
				if(count == map.length) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] test = new int[M][N];
		
		for(int i =0;i<M;i++) {
			for(int j=0; j<N;j++) {
				test[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.Solution(N,test));
	}
}