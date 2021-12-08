package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int[][] dy = new int[35][35];
	static int n;
	static int[] combi;
	static int[] combi2;
	static int limit;
	static boolean[] check;
	static boolean flag;
	public void Solution(int depth, int sum) {
		if(flag == true) return;
		if(depth==n){
			if(sum == limit){
				for(int x : combi2){
					System.out.print(x+" ");
				}
				flag = true;
			}
		}else{
			for(int i=1;i<=n;i++){
				if(!check[i]){
					check[i] = true;
					combi2[depth] = i;
					Solution(depth+1,sum + (combi[depth]*combi2[depth]));
					check[i] = false;
				}
			}
		}
	}
	public static int dfs(int n,int r){
		if(dy[n][r] >0 )return dy[n][r];
		if(n==r || r==0) return 1;
		else return dfs(n-1,r-1)+dfs(n-1,r);
	}
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		limit = Integer.parseInt(st.nextToken());
		combi = new int[n];
		combi2 = new int[n];
		for(int i=0; i<n;i++){
			combi[i]=dfs(n-1,i);
		}
		check = new boolean[n+1];
		T.Solution(0,0);
	}
}
