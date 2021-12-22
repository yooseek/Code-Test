package algolism;

import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int[] arr;
	static int[] answer;
	public int Solution() {
		
		if(n == 1) return arr[0];
		if(n == 2) return arr[1]+arr[0];
		if(n == 3) return Math.max(arr[1],arr[0]) + arr[2];
		
		answer[0] = arr[0];
		answer[1] = arr[1]+arr[0];
		answer[2] = Math.max(answer[1],Math.max(arr[1],arr[0]) + arr[2]);
		
		for(int i=3;i<n;i++) {
			answer[i] = Math.max(answer[i-1],Math.max(answer[i-2],answer[i-3]+arr[i-1]) + arr[i]);
		}
		
		return answer[n-1];
	}

	public static void main(String[] args) throws IOException {
		Main T = new Main();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		//StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		answer = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println(T.Solution());
	}
}
