package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int[][] map;
	static List<int[]> pizza;
	static List<int[]> people;
	static List<int[]> combi;
	static boolean[] check;
	static int n;
	static int m;
	static int min;
	public void Solution(int depth, int start) {
		if(check[depth]) return;
		if(depth == m) {
			int sum = 0;
			for(int[] k : people) {
				int answer = Integer.MAX_VALUE;
				for(int[] p : combi) {
					answer=Math.min(answer,Math.abs(k[0]-p[0]) + Math.abs(k[1]-p[1]));
				}
				sum += answer;
			}
			min= Math.min(min,sum);
			return;
		}else {
			for(int i=start;i<pizza.size();i++) {
				if(check[depth]== false) {
					check[depth] = true;
					combi.add(pizza.get(i));
					Solution(depth+1,i+1);
					check[depth] = false;
					combi.remove(pizza.get(i));
				}		
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		pizza = new ArrayList<int[]>();
		people = new ArrayList<int[]>();
		combi = new ArrayList<int[]>();
		min = Integer.MAX_VALUE;
		int temp = 0;
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());	
			for(int j=1;j<=n;j++) {
				temp = Integer.parseInt(st.nextToken());
				if(temp==2) {
					pizza.add(new int[] {i,j});
				}else if(temp==1) {
					people.add(new int[] {i,j});
				}
			}
		}
		check = new boolean[pizza.size()];
		T.Solution(0,0);
		System.out.println(min);
	}
}
