package algolism;

import java.util.*;
import java.io.*;
public class Main {
	static int[] list;
	static int[] arr;
	static int n;
	static int answer;
	public void Solution(int index) {
		
		if(index==0) {
			arr[index] = 1;
			answer = Math.max(answer,arr[index]);
			return;
		}
		int max = 0;
		for(int i=0;i<index;i++) {
			if(list[i] < list[index]) {
				max = Math.max(max,arr[i]);
			}
		}
		
		arr[index] = max+1;
		answer = Math.max(answer,arr[index]);
		return;
	}
	
	public static void main(String[] args) throws IOException{
		Main T = new Main();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		list = new int[n];
		arr = new int[n];
		answer = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			list[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n;i++) {
			T.Solution(i);
		}
		System.out.println(answer);
	}
}
