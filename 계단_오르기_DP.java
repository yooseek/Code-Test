package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int[] stairs;
	static long[] answer;
	public long Solution() {
		if(n==1) return stairs[0];
		if(n==2) return stairs[0]+stairs[1];
		if(n==3) return Math.max(stairs[1],stairs[0]) + stairs[2];
		
		answer[0] = stairs[0];
		answer[1] = stairs[1]+stairs[0];
		answer[2] = Math.max(stairs[1],stairs[0]) + stairs[2];
		
		for(int i=3;i<n;i++) {
			answer[i] = stairs[i] + Math.max(answer[i-3]+stairs[i-1],answer[i-2]);
		}
		
		return answer[n-1];
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
		stairs = new int[n];
		answer = new long[n];
		for(int i=0;i<n;i++) {
			stairs[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(T.Solution());
	}
}
