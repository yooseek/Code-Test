package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int n;
	static int limit;
	static int[] coin;
	static int answer;
	public void Solution() {	
		
		answer = Integer.MAX_VALUE;
		dfs(0,0);
		System.out.println(answer);
	}
	public static void dfs(int count,int sum) {
		if(sum > limit) return;
		if(count >= answer) return;
		if(sum == limit) {
			answer =Math.min(answer,count);
			return;
		}
		
		for(int i =coin.length-1; i>=0;i--) {
			dfs(count+1,sum+coin[i]);
		}
	}
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		coin = new int[n];
		for(int i=0;i<n;i++) {
			coin[i]= Integer.parseInt(st.nextToken());
        }
		limit = Integer.parseInt(br.readLine());
		
        T.Solution();
	}
}
