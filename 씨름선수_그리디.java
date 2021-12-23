package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static List<body> arr;
	static int max;
	public boolean Solution(int index) {
		
		if(arr.get(index).weight < max) {
			return false;
		}
		max = arr.get(index).weight;
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
			arr.add(new body(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		Collections.sort(arr);
		int answer = 1;
		max = arr.get(0).weight;
		for(int i = 1;i<n;i++) {
			if(T.Solution(i)) {
				answer +=1;
			}
		}
		System.out.println(answer);
	}
}
class body implements Comparable<body>{
	int height;
	int weight;
	public body(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	@Override
	public int compareTo(body o) {
		return o.height - this.height;
	}
}