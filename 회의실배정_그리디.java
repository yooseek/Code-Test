package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static List<meeting> arr;
	static int max;
	public boolean Solution(int index) {
		
		if(arr.get(index).start < max) {
			return false;
		}
		max = arr.get(index).end;
		return true;
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new ArrayList<>();
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(new meeting(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		Collections.sort(arr);
		int answer = 1;
		max = arr.get(0).end;
		for(int i = 1;i<n;i++) {
			if(T.Solution(i)) {
				answer +=1;
			}
		}
		System.out.println(answer);
	}
}
class meeting implements Comparable<meeting>{
	int start;
	int end;
	public meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}
	// 오름차순
	@Override
	public int compareTo(meeting o) {
		if(this.end==o.end) return this.start - o.start;
		return this.end - o.end;
	}
}