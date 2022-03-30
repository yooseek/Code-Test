package algolism;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int[] nums = {1,5,10,50};
	static HashSet<Integer> set = new HashSet<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int[] check = new int[4];
		dfs(0,r,check);
		System.out.println(set.size());
		
	}
	static void dfs (int level,int r, int[] check) {
		if(r == 0) {
			int count = 0;
			for(int i =0;i<4;i++) {
				count+= nums[i] * check[i];
			}
			set.add(count);
			return;
		}
		if(level == 4 )return;
		for(int i =0; i<=r; i++) {
			check[level] = i;
			dfs(level+1,r-i,check);
			check[level] = 0;
		}
	}
}