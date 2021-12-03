package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static boolean[] check;
	static String answer;
	public String Solution(int n,int[] arr) {	
		answer = "NO";
		check = new boolean[n];
		dfs(0,n,arr);
		return answer;
	}
	public void dfs(int depth,int n,int[] arr) {
		if(depth == n) {
			int sum =0;
			int sum2 =0;
			for(int i=0;i<check.length;i++) {
				if(check[i]) {
					sum += arr[i];
				}else {
					sum2 += arr[i];
				}
			}
			if(sum==sum2) {
				answer= "YES";
			}
			return;
		}
		check[depth] = true;
		dfs(depth+1,n,arr);
		check[depth] = false;
		dfs(depth+1,n,arr);
	}
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr= new int[n];
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
		
        System.out.println(T.Solution(n,arr));
	}
}