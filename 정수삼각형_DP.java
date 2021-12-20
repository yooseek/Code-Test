package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int[][] map;
	static int n;
	public void Solution() {
		
		for(int i= 1; i<n ;i++) {
			for(int j=0;j<n;j++) {
				if((j-1) >=0 ) {
					map[i][j] += Math.max(map[i-1][j-1],map[i-1][j]);
				}else {
					map[i][j] += map[i-1][j];
				}
			}
		}
		return;
	}
	
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
		map = new int[n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = 0;
			while(st.hasMoreTokens()) {
				map[i][k] =Integer.parseInt(st.nextToken());
				k++;
			}
		}
		
		T.Solution();
		int answer = Integer.MIN_VALUE;
		for(int i : map[n-1]) {
			answer = Math.max(answer,i);
		}
		System.out.println(answer);
	}
}
