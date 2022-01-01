package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int max;
	static List<lacture> arr;
	public int Solution() {
		// 내림차순으로 정렬
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		int answer =0;
		int j=0;
		for(int i = max; i>=1;i--) {
			for( ;j<n;j++) {
				if(arr.get(j).time < i) break;
				pq.offer(arr.get(j).money);
			}
			if(!pq.isEmpty()) answer += pq.poll();
		}
		
		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new ArrayList<>();
		max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(new lacture(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
			if(max < arr.get(i).time) max = arr.get(i).time;
		}
		Collections.sort(arr);
		
		System.out.println(T.Solution());
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