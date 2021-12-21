package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int n;
	static int max;
	static int limit;
	public void Solution(problum[] pro) {	
		max = Integer.MIN_VALUE;
		dfs(0,0,pro,0);
	}
	public static void dfs(int depth,int sum,problum[] pro,int time) {
		if(time > limit) return;
		if(depth == n) {
			max = Math.max(sum,max);
			return;
		}
		dfs(depth+1,sum+pro[depth].getScore(),pro,time+pro[depth].getTime());
		dfs(depth+1,sum, pro,time);
	}
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		limit = Integer.parseInt(st.nextToken());
		problum[] pro = new problum[n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			pro[i] = new problum(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        T.Solution(pro);
        System.out.println(max);
	}
}
// ¹®Á¦
class problum{
	int score;
	int time;
	public int getScore() {
		return score;
	}
	public int getTime() {
		return time;
	}
	public problum(int score, int time) {
		this.score = score;
		this.time = time;
	}
	
}