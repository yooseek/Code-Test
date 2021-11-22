package algolism;

import java.util.*;

public class Main {
	static int[] dx = {0,-1,0,1};
	static int[] dy = {1,0,-1,0};
	public int Solution(int[][] map) {
		int answer =0;
		// 3Áß for¹®
		for(int i=0; i<map.length;i++) {
			for(int j=0; j<map[i].length;j++) {
				boolean check = true;
				for(int k=0;k<dx.length;k++) {
					int nx = i+dx[k];
					int ny = j+dy[k];
					if(0<=nx&&nx<map.length && 0<=ny && ny<map[i].length) {
						if(map[nx][ny]>=map[i][j]) {
							check = false;
							break;
						}
					}
				}
				if(check) {
					answer += 1;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] m = new int[N][N];
		
		for(int i =0;i<N;i++) {
			for(int j=0; j<N;j++) {
				m[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.Solution(m));
	}
}