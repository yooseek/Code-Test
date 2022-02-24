package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static ArrayList<Edge> arr2;
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
		//Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1];
		arr2 = new ArrayList<Edge>();
		for(int i=1;i<=n;i++) arr[i] = i;
		for(int i=1;i<=m;i++) {
			st = new StringTokenizer(br.readLine());
			arr2.add(new Edge(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
			//union(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		int answer = 0;
		int count = 0;
		Collections.sort(arr2);
		for(Edge e : arr2) {
			
			int fv1 = Find(e.f1);
			int fv2 = Find(e.f2);
			if(fv1 != fv2) {
				answer += e.cost;
				count +=1;
				union(e.f1,e.f2);
			}
			
		}
		
		System.out.println(answer);
	}
}
class Edge implements Comparable<Edge>{
	int f1;
	int f2;
	int cost;
	public Edge(int f1,int f2,int cost) {
		this.f1 = f1;
		this.f2 = f2;
		this.cost = cost;
	}
	// 내림차순
	@Override
	public int compareTo(Edge o) {
		return this.cost - o.cost;
	}
}