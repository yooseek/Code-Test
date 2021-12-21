package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int m;
	static List<problom> pb;
	static int[] limit;
	
	public int Solution() {
		Arrays.fill(limit,0);
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i< n;i++) {
			// 중복을 회피 할 때는 뒤에서부터 가면된다.
			for(int j=m;j>=pb.get(i).time;j--) {
				limit[j] = Math.max(limit[j],limit[j-pb.get(i).time] + pb.get(i).score);
				max = Math.max(max,limit[j]);
			}
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		limit = new int[m+1];
		pb = new ArrayList<problom>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			pb.add(new problom(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}
		// 사실 정렬할 필요없음
		Collections.sort(pb);
		
		System.out.println(T.Solution());
	}
}

class problom implements Comparable<problom> {

	public int score, time;

	public problom(int score, int time) {
		this.score = score;
		this.time = time;
	}
	// 오름차순
	@Override
	public int compareTo(problom o) {
		return this.time-o.time;
	}

}