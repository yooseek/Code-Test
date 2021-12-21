package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int[][] map;
	static int n;
	static int[] height;
	static int answer;
	static List<Bricks> brick;
	public void Solution(int index) {

		if (index == 0) {
			height[index] = brick.get(index).b;
			answer = Math.max(answer,height[index]);
			return;
		}
		int max = 0;
		for (int i = 0; i < index; i++) {
			if (brick.get(i).c > brick.get(index).c) {
				max = Math.max(max,height[i]);
			}
		}
		
		height[index] = max + brick.get(index).b;
		answer = Math.max(answer,height[index]);
		return;
	}
	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		// StringTokenizer st = new StringTokenizer(br.readLine());
		map = new int[n][3];
		height = new int[n];
		brick = new ArrayList<Bricks>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			brick.add(new Bricks(a,b,c));
		}
		Collections.sort(brick);
		for(int i=0;i<n;i++) {
			T.Solution(i);
			//System.out.println(i+"번째 : "+answer);
		}

		System.out.println(answer);
	}
}
class Bricks implements Comparable<Bricks>{
	public int a,b,c;
	
	public Bricks(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// 내림차순 정렬
	@Override
	public int compareTo(Bricks o) {
		return o.a-this.a;
	}
}