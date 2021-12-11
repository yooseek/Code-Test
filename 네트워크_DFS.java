package algolism;

import java.util.*;

public class test3 {
	static int n;
	static Queue<Integer> que;
	static boolean[] check;
	
	public static void main(String[] args) {
		n = 3;
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		check = new boolean[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			if(!check[i]) {
				dfs(i,computers);
				count +=1;
			}
		}
		System.out.println(count);
		
	}
	public static void dfs(int depth,int[][] computers) {
		if(depth == n) {
			return;
		}
		for(int i=0;i<n;i++) {
			if(depth!=i && computers[depth][i]==1 && computers[i][depth]==1) {
				if(!check[i]) {
					check[i]= true;
					dfs(i,computers);
				}
				
			}
		}
		
	}
}