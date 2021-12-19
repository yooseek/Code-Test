package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int[][] map;
	static boolean[][] check;
	static int n;
	static int[] dx = {0,-1,-1,-1,0,1,1,1};
	static int[] dy = {-1,-1,0,1,1,1,0,-1};
	public int Solution() {
		int count = 0;
		Queue<int[]> que = new LinkedList<int[]>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j] == 1 && check[i][j]==false) {
					count +=1;
					que.add(new int[] {i,j});
					check[i][j] = true;
					while(!que.isEmpty()) {
						int[] first = que.poll();
						for(int k=0;k<dx.length;k++) {
							int nx = first[0]+dx[k];
							int ny = first[1]+dy[k];
							if(0<=nx && nx<n && 0<=ny &&ny<n && map[nx][ny]==1 && check[nx][ny]==false) {
								que.add(new int[] {nx,ny});
								check[nx][ny] = true;
							}
						}
					}
					
				}
			}
		}
		return count;
	}
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		check = new boolean[n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());	
			for(int j=0;j<n;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(T.Solution());
		
	}
}
