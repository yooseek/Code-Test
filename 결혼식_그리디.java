package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static List<time> arr;
	public int Solution() {
		
		int count = 0;
		int answer = Integer.MIN_VALUE;
		for(time t : arr){
			if(t.state == 's') {
				count +=1;
			}else {
				count -=1;
			}
			answer = Math.max(answer,count);
		}

		return answer;
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(new time('s',Integer.parseInt(st.nextToken())));
			arr.add(new time('e',Integer.parseInt(st.nextToken())));
		}
		Collections.sort(arr);
		
		System.out.println(T.Solution());
	}
}
class time implements Comparable<time>{
	int time;
	char state;
	public time(char state, int time) {
		this.state = state;
		this.time = time;
	}
	// 오름차순
	@Override
	public int compareTo(time o) {
		if(this.time == o.time) return this.state - o.state;
		return this.time - o.time;
	}
}