package algolism;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int k;
	static int[][] dungeons;
	static int count;
	static int answer = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		k = 80;
		dungeons = new int[][] {{80,20},{50,40},{30,10}};
		
		int[] visit = new int[dungeons.length];
		
		dfs(0,k,visit);
		System.out.println(answer);
		
	}
	public static void dfs(int level, int cur,int[] visit) {
		for(int i=0;i<dungeons.length;i++) {
			if(visit[i] == 0 && cur >= dungeons[i][0] ) {
				visit[i] = 1;
				dfs(level+1, cur - dungeons[i][1], visit);
				visit[i] = 0;
			}
		}
		answer = Integer.max(answer,level);
		
	}
}