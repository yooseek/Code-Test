package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	public void Solution() {
		
	}
	public static void union(int a, int b) {
		int ua = Find(a);
		int ub = Find(b);
		if(ua!=ub) arr[ua] = ub;
	}
	public static int Find(int index) {
		if(arr[index] == index) return arr[index];
		// 압축하기
		else return arr[index] = Find(arr[index]);
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		for(int i=1;i<=n;i++) arr[i] = i;
		for(int i=1;i<=m;i++) {
			st = new StringTokenizer(br.readLine());
			union(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		int a =Find(Integer.parseInt(st.nextToken()));
		int b = Find(Integer.parseInt(st.nextToken()));
		if(a==b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		//System.out.println(T.Solution());
	}
}
class lacture implements Comparable<lacture>{
	int money;
	int time;
	public lacture(int money,int time) {
		this.money = money;
		this.time = time;
	}
	// 내림차순
	@Override
	public int compareTo(lacture o) {
		return o.time - this.time;
	}
}