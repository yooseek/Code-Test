package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static boolean[] check;
	static int[] dis = {1,-1,5};
	public int Solution(int n,int r) {	
		//BFS
		Queue<Integer> que = new LinkedList<>();
		check = new boolean[10001];
		check[n] = true;
		int depth = 0;
		que.add(n);
		while(!que.isEmpty()) {
			int size = que.size();
			for(int i=0;i<size;i++) {
				int cur = que.poll();
				if(cur == r) return depth;
				for(int j=0;j<dis.length;j++) {
					int nx = cur+dis[j];
					if(0<nx && check[nx]==false) {
						que.add(nx);
						check[nx] = true;
					}
				}
			}
			depth += 1;
		}
		return depth;
	}
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        System.out.println(T.Solution(n,r));
	}
}